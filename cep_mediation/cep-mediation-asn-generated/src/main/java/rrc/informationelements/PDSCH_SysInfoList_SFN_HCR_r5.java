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
 * Define the ASN1 Type PDSCH_SysInfoList_SFN_HCR_r5 from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class PDSCH_SysInfoList_SFN_HCR_r5 extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public PDSCH_SysInfoList_SFN_HCR_r5()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public PDSCH_SysInfoList_SFN_HCR_r5(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(PDSCH_SysInfo_HCR_r5 pdsch_SysInfo, 
			SFN_TimeInfo sfn_TimeInfo)
	{
	    setPdsch_SysInfo(pdsch_SysInfo);
	    setSfn_TimeInfo(sfn_TimeInfo);
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(PDSCH_SysInfo_HCR_r5 pdsch_SysInfo)
	{
	    setPdsch_SysInfo(pdsch_SysInfo);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PDSCH_SysInfo_HCR_r5();
	    mComponents[1] = new SFN_TimeInfo();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[2];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new PDSCH_SysInfo_HCR_r5();
		case 1:
		    return new SFN_TimeInfo();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "pdsch_SysInfo"
	public PDSCH_SysInfo_HCR_r5 getPdsch_SysInfo()
	{
	    return (PDSCH_SysInfo_HCR_r5)mComponents[0];
	}
	
	public void setPdsch_SysInfo(PDSCH_SysInfo_HCR_r5 pdsch_SysInfo)
	{
	    mComponents[0] = pdsch_SysInfo;
	}
	
	
	// Methods for field "sfn_TimeInfo"
	public SFN_TimeInfo getSfn_TimeInfo()
	{
	    return (SFN_TimeInfo)mComponents[1];
	}
	
	public void setSfn_TimeInfo(SFN_TimeInfo sfn_TimeInfo)
	{
	    mComponents[1] = sfn_TimeInfo;
	}
	
	public boolean hasSfn_TimeInfo()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteSfn_TimeInfo()
	{
	    setComponentAbsent(1);
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
		"PDSCH_SysInfoList_SFN_HCR_r5$Sequence_"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "PDSCH_SysInfo_HCR_r5"
				),
				new QName (
				    "InformationElements",
				    "PDSCH-SysInfo-HCR-r5"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PDSCH_SysInfo_HCR_r5"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"PDSCH_SysInfo_HCR_r5"
				    )
				),
				0
			    )
			),
			"pdsch-SysInfo",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "SFN_TimeInfo"
				),
				new QName (
				    "InformationElements",
				    "SFN-TimeInfo"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SFN_TimeInfo"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SFN_TimeInfo"
				    )
				),
				0
			    )
			),
			"sfn-TimeInfo",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sequence_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Sequence_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Sequence_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Sequence_ get(int atIndex)
    {
	return (Sequence_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Sequence_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Sequence_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new Sequence_();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "PDSCH_SysInfoList_SFN_HCR_r5"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-SysInfoList-SFN-HCR-r5"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(8),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(8)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"PDSCH_SysInfoList_SFN_HCR_r5$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_SysInfoList_SFN_HCR_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_SysInfoList_SFN_HCR_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_SysInfoList_SFN_HCR_r5
