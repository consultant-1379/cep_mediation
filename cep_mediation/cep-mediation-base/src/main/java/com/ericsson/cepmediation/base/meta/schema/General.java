package com.ericsson.cepmediation.base.meta.schema;

import org.jdom.Element;
import org.jdom.Namespace;

/**
 * This class is used to hold a single general entry read from an event schema XML file
 * 
 * @author eeilfn
 */
public class General {
    // The member data read from the general XML tag
    private final String docNo;

    private final String revision;

    private final String date;

    private final String author;

    private final String fileFormatVersion;

    private final String fileInformationVersion;

    /**
     * Instantiate a general entry as an object
     * 
     * @param general the general XML element
     * @param namespace the name space to use for reading elements
     * @throws SchemaException 
     */
    protected General(final Element general, final Namespace namespace) throws SchemaException {
        try {
            // Instantiate mandatory data from the XML element
            docNo = general.getChild("docno", namespace).getText().trim();
            revision = general.getChild("revision", namespace).getText().trim();
            date = general.getChild("date", namespace).getText().trim();
            author = general.getChild("author", namespace).getText().trim();
            fileFormatVersion = general.getChild("ffv", namespace).getText().trim();

            // Instantiate optional data from the XML element
            if (general.getChild("fiv", namespace) != null) {
                fileInformationVersion = general.getChild("fiv", namespace).getText().trim();
            } else {
                fileInformationVersion = fileFormatVersion;
            }
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing event schema element [" + general.getName() + "] " + e);
        }
    }

    /** 
     * Return the document number
     * @return the document number
     */
    public String getDocNo() {
        return docNo;
    }

    /** 
     * Return the revision
     * @return the revision
     */
    public String getRevision() {
        return revision;
    }

    /** 
     * Return the date
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /** 
     * Return the author
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the file format version supported by this schema
     * @return the file format version
     */
    public String getFileFormatVersion() {
        return fileFormatVersion;
    }

    /**
     * Get the file information version supported by this schema
     * @return the file information version
     */
    public String getFileInformationVersion() {
        return fileInformationVersion;
    }

    /**
     * return a string representation of this General item
     * @return the string representation
     */
    @Override
    public String toString() {
        return "General [docNo=" + docNo + ", revision=" + revision + ", date=" + date + ", author=" + author + "]";
    }
}
