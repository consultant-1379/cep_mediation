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


package rrc.informationelements;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type LoggedUTRACellInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedUTRACellInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedUTRACellInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedUTRACellInfo(PLMN_Identity plmn_Identity, 
		    CellIdentity cellIdentity, UARFCN uarfcn, 
		    CellParametersID cellParametersID, 
		    PrimaryScramblingCode primaryScramblingCode)
    {
	setPlmn_Identity(plmn_Identity);
	setCellIdentity(cellIdentity);
	setUarfcn(uarfcn);
	setCellParametersID(cellParametersID);
	setPrimaryScramblingCode(primaryScramblingCode);
    }
    
    /**
     * Construct with required components.
     */
    public LoggedUTRACellInfo(PLMN_Identity plmn_Identity, 
		    CellIdentity cellIdentity, UARFCN uarfcn)
    {
	setPlmn_Identity(plmn_Identity);
	setCellIdentity(cellIdentity);
	setUarfcn(uarfcn);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMN_Identity();
	mComponents[1] = new CellIdentity();
	mComponents[2] = new UARFCN();
	mComponents[3] = new CellParametersID();
	mComponents[4] = new PrimaryScramblingCode();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PLMN_Identity();
	    case 1:
		return new CellIdentity();
	    case 2:
		return new UARFCN();
	    case 3:
		return new CellParametersID();
	    case 4:
		return new PrimaryScramblingCode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "plmn_Identity"
    public PLMN_Identity getPlmn_Identity()
    {
	return (PLMN_Identity)mComponents[0];
    }
    
    public void setPlmn_Identity(PLMN_Identity plmn_Identity)
    {
	mComponents[0] = plmn_Identity;
    }
    
    
    // Methods for field "cellIdentity"
    public CellIdentity getCellIdentity()
    {
	return (CellIdentity)mComponents[1];
    }
    
    public void setCellIdentity(CellIdentity cellIdentity)
    {
	mComponents[1] = cellIdentity;
    }
    
    
    // Methods for field "uarfcn"
    public UARFCN getUarfcn()
    {
	return (UARFCN)mComponents[2];
    }
    
    public void setUarfcn(UARFCN uarfcn)
    {
	mComponents[2] = uarfcn;
    }
    
    
    // Methods for field "cellParametersID"
    public CellParametersID getCellParametersID()
    {
	return (CellParametersID)mComponents[3];
    }
    
    public void setCellParametersID(CellParametersID cellParametersID)
    {
	mComponents[3] = cellParametersID;
    }
    
    public boolean hasCellParametersID()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCellParametersID()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "primaryScramblingCode"
    public PrimaryScramblingCode getPrimaryScramblingCode()
    {
	return (PrimaryScramblingCode)mComponents[4];
    }
    
    public void setPrimaryScramblingCode(PrimaryScramblingCode primaryScramblingCode)
    {
	mComponents[4] = primaryScramblingCode;
    }
    
    public boolean hasPrimaryScramblingCode()
    {
	return componentIsPresent(4);
    }
    
    public void deletePrimaryScramblingCode()
    {
	setComponentAbsent(4);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "LoggedUTRACellInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedUTRACellInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PLMN_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0
			)
		    ),
		    "plmn-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cellIdentity",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UARFCN"
			    ),
			    new QName (
				"InformationElements",
				"UARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UARFCN(0), 
				    new UARFCN(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "uarfcn",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellParametersID"
			    ),
			    new QName (
				"InformationElements",
				"CellParametersID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellParametersID(0), 
				    new CellParametersID(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "cellParametersID",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PrimaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PrimaryScramblingCode(0), 
				    new PrimaryScramblingCode(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "primaryScramblingCode",
		    4,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggedUTRACellInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedUTRACellInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedUTRACellInfo
