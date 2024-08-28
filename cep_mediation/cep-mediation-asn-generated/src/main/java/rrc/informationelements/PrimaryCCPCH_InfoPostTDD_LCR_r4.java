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
 * Define the ASN1 Type PrimaryCCPCH_InfoPostTDD_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PrimaryCCPCH_InfoPostTDD_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PrimaryCCPCH_InfoPostTDD_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PrimaryCCPCH_InfoPostTDD_LCR_r4(BOOLEAN tstd_Indicator, 
		    CellParametersID cellParametersID, BOOLEAN sctd_Indicator)
    {
	setTstd_Indicator(tstd_Indicator);
	setCellParametersID(cellParametersID);
	setSctd_Indicator(sctd_Indicator);
    }
    
    /**
     * Construct with components.
     */
    public PrimaryCCPCH_InfoPostTDD_LCR_r4(boolean tstd_Indicator, 
		    CellParametersID cellParametersID, boolean sctd_Indicator)
    {
	this(new BOOLEAN(tstd_Indicator), cellParametersID, 
	     new BOOLEAN(sctd_Indicator));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new CellParametersID();
	mComponents[2] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new CellParametersID();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tstd_Indicator"
    public boolean getTstd_Indicator()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setTstd_Indicator(boolean tstd_Indicator)
    {
	setTstd_Indicator(new BOOLEAN(tstd_Indicator));
    }
    
    public void setTstd_Indicator(BOOLEAN tstd_Indicator)
    {
	mComponents[0] = tstd_Indicator;
    }
    
    
    // Methods for field "cellParametersID"
    public CellParametersID getCellParametersID()
    {
	return (CellParametersID)mComponents[1];
    }
    
    public void setCellParametersID(CellParametersID cellParametersID)
    {
	mComponents[1] = cellParametersID;
    }
    
    
    // Methods for field "sctd_Indicator"
    public boolean getSctd_Indicator()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setSctd_Indicator(boolean sctd_Indicator)
    {
	setSctd_Indicator(new BOOLEAN(sctd_Indicator));
    }
    
    public void setSctd_Indicator(BOOLEAN sctd_Indicator)
    {
	mComponents[2] = sctd_Indicator;
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
	    "PrimaryCCPCH_InfoPostTDD_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "PrimaryCCPCH-InfoPostTDD-LCR-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "tstd-Indicator",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "sctd-Indicator",
		    2,
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PrimaryCCPCH_InfoPostTDD_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PrimaryCCPCH_InfoPostTDD_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PrimaryCCPCH_InfoPostTDD_LCR_r4
