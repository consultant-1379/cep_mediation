/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.correlation.support;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_INFO;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.ericsson.cepmediation.correlation.stubs.Util;

public class UtilTest {

    private static final String RNC09_TXT = "RNC09.txt";
    private static final String RNC09 = "RNC09";

    @Test
    public void testGettingMappedEcno_2() {
        final float mappedEcno = Util.getMappedEcno(2);
        assertEquals(-23.5, mappedEcno, 0.0);
    }

    @Test
    public void testGettingMappedEcno_12() {
        final float mappedEcno = Util.getMappedEcno(21);
        assertEquals(-14.0, mappedEcno, 0.0);
    }

    @Test
    public void testGettingMappedEcno_48() {
        final float mappedEcno = Util.getMappedEcno(48);
        assertEquals(-0.5, mappedEcno, 0.0);
    }

    @Test
    public void testGettingMappedEcno_ValueLessThanZeroIsLowestEcno() {
        final float mappedEcno = Util.getMappedEcno(-1);
        assertEquals(-24.5, mappedEcno, 0.0);
    }

    @Test
    public void testGettingMappedEcno_OutsideRangeIsHighestEcno() {
        final float mappedEcno = Util.getMappedEcno(50);
        assertEquals(0.0, mappedEcno, 0.0);
    }

    @Test
    public void gestGettingMappedRscp_4() {
        final float mappedRscp = Util.getMappedRscp(4);
        assertEquals(-112.0, mappedRscp, 0.0);
    }

    @Test
    public void gestGettingMappedRscp_84() {
        final float mappedRscp = Util.getMappedRscp(84);
        assertEquals(-32.0, mappedRscp, 0.0);
    }

    @Test
    public void gestGettingMappedRscp_0() {
        final float mappedRscp = Util.getMappedRscp(0);
        assertEquals(-116.0, mappedRscp, 0.0);
    }

    @Test
    public void gestGettingMappedRscp_91() {
        final float mappedRscp = Util.getMappedRscp(91);
        assertEquals(-25.0, mappedRscp, 0.0);
    }

    @Test
    public void testGettingMappedRscp_ValueLessThanMinusFiveIsLowestRscp() {
        final float mappedRscp = Util.getMappedRscp(-6);
        assertEquals(-121.0, mappedRscp, 0.0);
    }

    @Test
    public void testGettingMappedRscp_OutsideRangeIsHighestEcno() {
        final float mappedRscp = Util.getMappedRscp(92);
        assertEquals(-25.0, mappedRscp, 0.0);
    }

    @Test
    public void isfileCreated() throws Exception {
        try {
            Util.processtextFile(RNC09);
            File file = null;
            ClassLoader loader = Util.class.getClassLoader();
            file = new File(loader.getResource("").getPath() + RNC09_TXT);
            assertThat(file.exists(), is(true));
            file.delete();
            assertThat(file.exists(), is(false));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void isfilePathCorrect() throws Exception {
        try {
            Util.isFileExist(RNC09);
            File file = null;
            ClassLoader loader = Util.class.getClassLoader();
            file = new File(loader.getResource("").getPath() + RNC09_TXT);
            assertThat(file.getPath(), is(loader.getResource("").getPath()
                    + RNC09_TXT));
            file.delete();
            assertThat(file.exists(), is(false));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void isfileNameCorrect() throws Exception {
        try {
            Util.isFileExist(RNC09);
            File file = null;
            ClassLoader loader = Util.class.getClassLoader();
            file = new File(loader.getResource("").getPath() + RNC09_TXT);
            assertThat(file.getName(), is(RNC09_TXT));
            file.delete();
            assertThat(file.exists(), is(false));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Test
    public void isFilePermissionCorrect() throws Exception {
        Util.processtextFile(RNC09);
        File file = null;
        ClassLoader loader = Util.class.getClassLoader();
        file = new File(loader.getResource("").getPath() + RNC09_TXT);
        assertThat(file.getName(), is(RNC09_TXT));
        assertThat(file.canExecute(), is(false));
        assertThat(file.canRead(), is(true));
        assertThat(file.canWrite(), is(false));
        file.delete();
        assertThat(file.exists(), is(false));

    }
}
