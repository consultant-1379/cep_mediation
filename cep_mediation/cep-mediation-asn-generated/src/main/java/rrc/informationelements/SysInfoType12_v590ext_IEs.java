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
 * Define the ASN1 Type SysInfoType12_v590ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType12_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType12_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType12_v590ext_IEs(NewIntraFrequencyCellInfoList_v590ext newIntraFrequencyCellInfoList_v590ext, 
		    NewInterFrequencyCellInfoList_v590ext newInterFrequencyCellInfoList_v590ext, 
		    NewInterRATCellInfoList_v590ext newInterRATCellInfoList_v590ext, 
		    Intra_FreqEventCriteriaList_v590ext intraFreqEventCriteriaList_v590ext, 
		    IntraFreqReportingCriteria_1b_r5 intraFreqReportingCriteria_1b_r5, 
		    IntraFreqEvent_1d_r5 intraFreqEvent_1d_r5)
    {
	setNewIntraFrequencyCellInfoList_v590ext(newIntraFrequencyCellInfoList_v590ext);
	setNewInterFrequencyCellInfoList_v590ext(newInterFrequencyCellInfoList_v590ext);
	setNewInterRATCellInfoList_v590ext(newInterRATCellInfoList_v590ext);
	setIntraFreqEventCriteriaList_v590ext(intraFreqEventCriteriaList_v590ext);
	setIntraFreqReportingCriteria_1b_r5(intraFreqReportingCriteria_1b_r5);
	setIntraFreqEvent_1d_r5(intraFreqEvent_1d_r5);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NewIntraFrequencyCellInfoList_v590ext();
	mComponents[1] = new NewInterFrequencyCellInfoList_v590ext();
	mComponents[2] = new NewInterRATCellInfoList_v590ext();
	mComponents[3] = new Intra_FreqEventCriteriaList_v590ext();
	mComponents[4] = new IntraFreqReportingCriteria_1b_r5();
	mComponents[5] = new IntraFreqEvent_1d_r5();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new NewIntraFrequencyCellInfoList_v590ext();
	    case 1:
		return new NewInterFrequencyCellInfoList_v590ext();
	    case 2:
		return new NewInterRATCellInfoList_v590ext();
	    case 3:
		return new Intra_FreqEventCriteriaList_v590ext();
	    case 4:
		return new IntraFreqReportingCriteria_1b_r5();
	    case 5:
		return new IntraFreqEvent_1d_r5();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "newIntraFrequencyCellInfoList_v590ext"
    public NewIntraFrequencyCellInfoList_v590ext getNewIntraFrequencyCellInfoList_v590ext()
    {
	return (NewIntraFrequencyCellInfoList_v590ext)mComponents[0];
    }
    
    public void setNewIntraFrequencyCellInfoList_v590ext(NewIntraFrequencyCellInfoList_v590ext newIntraFrequencyCellInfoList_v590ext)
    {
	mComponents[0] = newIntraFrequencyCellInfoList_v590ext;
    }
    
    public boolean hasNewIntraFrequencyCellInfoList_v590ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNewIntraFrequencyCellInfoList_v590ext()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type NewIntraFrequencyCellInfoList_v590ext from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class NewIntraFrequencyCellInfoList_v590ext extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public NewIntraFrequencyCellInfoList_v590ext()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public NewIntraFrequencyCellInfoList_v590ext(CellSelectReselectInfo_v590ext[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(CellSelectReselectInfo_v590ext element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(CellSelectReselectInfo_v590ext element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized CellSelectReselectInfo_v590ext get(int atIndex)
	{
	    return (CellSelectReselectInfo_v590ext)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(CellSelectReselectInfo_v590ext element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(CellSelectReselectInfo_v590ext element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CellSelectReselectInfo_v590ext();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType12_v590ext_IEs$NewIntraFrequencyCellInfoList_v590ext"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "CellSelectReselectInfo_v590ext"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NewIntraFrequencyCellInfoList_v590ext object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewIntraFrequencyCellInfoList_v590ext object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewIntraFrequencyCellInfoList_v590ext

    // Methods for field "newInterFrequencyCellInfoList_v590ext"
    public NewInterFrequencyCellInfoList_v590ext getNewInterFrequencyCellInfoList_v590ext()
    {
	return (NewInterFrequencyCellInfoList_v590ext)mComponents[1];
    }
    
    public void setNewInterFrequencyCellInfoList_v590ext(NewInterFrequencyCellInfoList_v590ext newInterFrequencyCellInfoList_v590ext)
    {
	mComponents[1] = newInterFrequencyCellInfoList_v590ext;
    }
    
    public boolean hasNewInterFrequencyCellInfoList_v590ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNewInterFrequencyCellInfoList_v590ext()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type NewInterFrequencyCellInfoList_v590ext from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class NewInterFrequencyCellInfoList_v590ext extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public NewInterFrequencyCellInfoList_v590ext()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public NewInterFrequencyCellInfoList_v590ext(CellSelectReselectInfo_v590ext[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(CellSelectReselectInfo_v590ext element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(CellSelectReselectInfo_v590ext element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized CellSelectReselectInfo_v590ext get(int atIndex)
	{
	    return (CellSelectReselectInfo_v590ext)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(CellSelectReselectInfo_v590ext element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(CellSelectReselectInfo_v590ext element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CellSelectReselectInfo_v590ext();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType12_v590ext_IEs$NewInterFrequencyCellInfoList_v590ext"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "CellSelectReselectInfo_v590ext"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NewInterFrequencyCellInfoList_v590ext object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewInterFrequencyCellInfoList_v590ext object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewInterFrequencyCellInfoList_v590ext

    // Methods for field "newInterRATCellInfoList_v590ext"
    public NewInterRATCellInfoList_v590ext getNewInterRATCellInfoList_v590ext()
    {
	return (NewInterRATCellInfoList_v590ext)mComponents[2];
    }
    
    public void setNewInterRATCellInfoList_v590ext(NewInterRATCellInfoList_v590ext newInterRATCellInfoList_v590ext)
    {
	mComponents[2] = newInterRATCellInfoList_v590ext;
    }
    
    public boolean hasNewInterRATCellInfoList_v590ext()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNewInterRATCellInfoList_v590ext()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type NewInterRATCellInfoList_v590ext from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class NewInterRATCellInfoList_v590ext extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public NewInterRATCellInfoList_v590ext()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public NewInterRATCellInfoList_v590ext(CellSelectReselectInfo_v590ext[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(CellSelectReselectInfo_v590ext element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(CellSelectReselectInfo_v590ext element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized CellSelectReselectInfo_v590ext get(int atIndex)
	{
	    return (CellSelectReselectInfo_v590ext)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(CellSelectReselectInfo_v590ext element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(CellSelectReselectInfo_v590ext element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CellSelectReselectInfo_v590ext();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType12_v590ext_IEs$NewInterRATCellInfoList_v590ext"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "CellSelectReselectInfo_v590ext"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NewInterRATCellInfoList_v590ext object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewInterRATCellInfoList_v590ext object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewInterRATCellInfoList_v590ext

    // Methods for field "intraFreqEventCriteriaList_v590ext"
    public Intra_FreqEventCriteriaList_v590ext getIntraFreqEventCriteriaList_v590ext()
    {
	return (Intra_FreqEventCriteriaList_v590ext)mComponents[3];
    }
    
    public void setIntraFreqEventCriteriaList_v590ext(Intra_FreqEventCriteriaList_v590ext intraFreqEventCriteriaList_v590ext)
    {
	mComponents[3] = intraFreqEventCriteriaList_v590ext;
    }
    
    public boolean hasIntraFreqEventCriteriaList_v590ext()
    {
	return componentIsPresent(3);
    }
    
    public void deleteIntraFreqEventCriteriaList_v590ext()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "intraFreqReportingCriteria_1b_r5"
    public IntraFreqReportingCriteria_1b_r5 getIntraFreqReportingCriteria_1b_r5()
    {
	return (IntraFreqReportingCriteria_1b_r5)mComponents[4];
    }
    
    public void setIntraFreqReportingCriteria_1b_r5(IntraFreqReportingCriteria_1b_r5 intraFreqReportingCriteria_1b_r5)
    {
	mComponents[4] = intraFreqReportingCriteria_1b_r5;
    }
    
    public boolean hasIntraFreqReportingCriteria_1b_r5()
    {
	return componentIsPresent(4);
    }
    
    public void deleteIntraFreqReportingCriteria_1b_r5()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "intraFreqEvent_1d_r5"
    public IntraFreqEvent_1d_r5 getIntraFreqEvent_1d_r5()
    {
	return (IntraFreqEvent_1d_r5)mComponents[5];
    }
    
    public void setIntraFreqEvent_1d_r5(IntraFreqEvent_1d_r5 intraFreqEvent_1d_r5)
    {
	mComponents[5] = intraFreqEvent_1d_r5;
    }
    
    public boolean hasIntraFreqEvent_1d_r5()
    {
	return componentIsPresent(5);
    }
    
    public void deleteIntraFreqEvent_1d_r5()
    {
	setComponentAbsent(5);
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
	    "SysInfoType12_v590ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType12-v590ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType12_v590ext_IEs$NewIntraFrequencyCellInfoList_v590ext"
			)
		    ),
		    "newIntraFrequencyCellInfoList-v590ext",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType12_v590ext_IEs$NewInterFrequencyCellInfoList_v590ext"
			)
		    ),
		    "newInterFrequencyCellInfoList-v590ext",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType12_v590ext_IEs$NewInterRATCellInfoList_v590ext"
			)
		    ),
		    "newInterRATCellInfoList-v590ext",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Intra_FreqEventCriteriaList_v590ext"
			    ),
			    new QName (
				"InformationElements",
				"Intra-FreqEventCriteriaList-v590ext"
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
				    "DeltaRSCP"
				)
			    )
			)
		    ),
		    "intraFreqEventCriteriaList-v590ext",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqReportingCriteria_1b_r5"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingCriteria-1b-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_1b_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_1b_r5"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqReportingCriteria-1b-r5",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqEvent_1d_r5"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqEvent-1d-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEvent_1d_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEvent_1d_r5"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqEvent-1d-r5",
		    5,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType12_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType12_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType12_v590ext_IEs
