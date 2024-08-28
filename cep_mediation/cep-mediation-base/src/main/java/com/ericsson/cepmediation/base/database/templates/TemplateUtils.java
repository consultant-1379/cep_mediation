/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.templates;

import java.io.StringWriter;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.context.Context;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

/**
 * @author eemecoy
 *
 */
public class TemplateUtils {

    private final Context context;

    public TemplateUtils() throws TemplateException {
        context = new VelocityContext();
        final Properties properties = new Properties();
        properties.setProperty("resource.loader", "class");
        properties.setProperty("class.resource.loader.description", "Classpath Loader");
        properties.setProperty("class.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        properties.setProperty("runtime.log.logsystem.class", "org.apache.velocity.runtime.log.NullLogSystem");
        try {
            Velocity.init(properties);
        } catch (final Exception e) {
            throw new TemplateException("Could not initialize velocity engine", e);
        }
    }

    public String getQueryFromTemplate(final String templateFile) throws TemplateException {
        return getQueryFromTemplate(templateFile, null);
    }

    public String getQueryFromTemplate(final String templateFile, final Map<String, ?> parameters)
            throws TemplateException {

        if (parameters != null && parameters.size() > 0) {
            final Set<String> keys = parameters.keySet();
            for (final String key : keys) {
                context.put(key, parameters.get(key));
            }
        }

        try {
            final Template template = Velocity.getTemplate(templateFile);
            final StringWriter sw = new StringWriter();
            template.merge(context, sw);
            return sw.toString();
        } catch (final ResourceNotFoundException e) {
            throw new TemplateException("Can not find query template", e);
        } catch (final ParseErrorException e) {
            throw new TemplateException("Error parsing query template", e);
        } catch (final Exception e) {
            throw new TemplateException("Error in template initialization", e);
        }
    }
}
