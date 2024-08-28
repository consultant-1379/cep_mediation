/*************************************************************/
/* Copyright (C) 2012 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED. */

/* Generated for: LM Ericsson Ltd, Athlone, Ireland - License 11536 for Solaris x86 */
/* Abstract syntax: class-definitions */
/* ASN.1 Java project: rrc.Rrc */
/* Created: Wed Feb 15 12:27:03 2012 */
/* ASN.1 Compiler for Java version: 4.1 */
/* ASN.1 compiler options and file names specified:
 * -output rrc -uper -root constants.asn ie-definitions.asn internode.asn
 * pdu-definitions.asn class-definitions.asn
 */


package rrc;

import com.oss.asn1.*;
import com.oss.metadata.*;

public class Rrc extends ASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo (
	null,
	new byte[] {
	    (byte)0x0b, (byte)0x84, (byte)0xbd, (byte)0x24, (byte)0xb7,
	    (byte)0xb3, (byte)0x25, (byte)0x47, (byte)0x2f, (byte)0xb2,
	    (byte)0x25, (byte)0x47, (byte)0x2f, (byte)0x1e, (byte)0xa7,
	    (byte)0x6a, (byte)0x1d, (byte)0xbe, (byte)0xdf, (byte)0xf1,
	    (byte)0x02, (byte)0x62, (byte)0x13, (byte)0x26, (byte)0xb1,
	    (byte)0x7a, (byte)0x62, (byte)0xe1, (byte)0x33, (byte)0xd5,
	    (byte)0xdf, (byte)0x3a, (byte)0xe1, (byte)0x87, (byte)0x2f,
	    (byte)0x81, (byte)0x16, (byte)0xcb, (byte)0xb3, (byte)0xaf,
	    (byte)0xa7, (byte)0x7d, (byte)0xa4, (byte)0xbe, (byte)0x30,
	    (byte)0xe2, (byte)0xce, (byte)0xd0, (byte)0xdb, (byte)0x2b,
	    (byte)0xd7, (byte)0xf6, (byte)0x49, (byte)0x29, (byte)0xac,
	    (byte)0xc4, (byte)0xd9, (byte)0x74, (byte)0xc2, (byte)0x14,
	    (byte)0x19, (byte)0xbe, (byte)0xc3, (byte)0x93, (byte)0xb5,
	    (byte)0x11, (byte)0xb6, (byte)0x9e, (byte)0x27, (byte)0x75,
	    (byte)0xa1, (byte)0xae, (byte)0xbd, (byte)0xa6, (byte)0x40,
	    (byte)0x81, (byte)0xd7, (byte)0xc6, (byte)0xa3, (byte)0x87,
	    (byte)0x36, (byte)0x5b, (byte)0x24, (byte)0x6f, (byte)0x34,
	    (byte)0x77, (byte)0x6b, (byte)0x51, (byte)0x59, (byte)0xf6,
	    (byte)0xb1, (byte)0x4b, (byte)0x73, (byte)0xbd, (byte)0x69,
	    (byte)0x5e, (byte)0x37, (byte)0xc6, (byte)0x85, (byte)0x26,
	    (byte)0x47, (byte)0x09, (byte)0xfd, (byte)0x86, (byte)0x9c,
	    (byte)0x8b, (byte)0x5d, (byte)0xb3, (byte)0x2f, (byte)0xd4,
	    (byte)0xa1, (byte)0xb9
	}
    );
    
    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo()
    {
	return c_projectInfo;
    }
    
    private static final ASN1Project c_project = new Rrc();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
    public static PERAlignedCoder getPERAlignedCoder()
    {
	return createPERAlignedCoder(c_project);
    }
    
    public static PERUnalignedCoder getPERUnalignedCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
}
