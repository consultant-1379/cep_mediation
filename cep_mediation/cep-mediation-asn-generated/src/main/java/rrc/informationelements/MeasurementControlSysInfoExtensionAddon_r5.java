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
 * Define the ASN1 Type MeasurementControlSysInfoExtensionAddon_r5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementControlSysInfoExtensionAddon_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControlSysInfoExtensionAddon_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControlSysInfoExtensionAddon_r5(NewIntraFrequencyCellInfoListAddon_r5 newIntraFrequencyCellInfoListAddon_r5, 
		    NewInterFrequencyCellInfoListAddon_r5 newInterFrequencyCellInfoListAddon_r5, 
		    NewInterRATCellInfoListAddon_r5 newInterRATCellInfoListAddon_r5)
    {
	setNewIntraFrequencyCellInfoListAddon_r5(newIntraFrequencyCellInfoListAddon_r5);
	setNewInterFrequencyCellInfoListAddon_r5(newInterFrequencyCellInfoListAddon_r5);
	setNewInterRATCellInfoListAddon_r5(newInterRATCellInfoListAddon_r5);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NewIntraFrequencyCellInfoListAddon_r5();
	mComponents[1] = new NewInterFrequencyCellInfoListAddon_r5();
	mComponents[2] = new NewInterRATCellInfoListAddon_r5();
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
		return new NewIntraFrequencyCellInfoListAddon_r5();
	    case 1:
		return new NewInterFrequencyCellInfoListAddon_r5();
	    case 2:
		return new NewInterRATCellInfoListAddon_r5();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "newIntraFrequencyCellInfoListAddon_r5"
    public NewIntraFrequencyCellInfoListAddon_r5 getNewIntraFrequencyCellInfoListAddon_r5()
    {
	return (NewIntraFrequencyCellInfoListAddon_r5)mComponents[0];
    }
    
    public void setNewIntraFrequencyCellInfoListAddon_r5(NewIntraFrequencyCellInfoListAddon_r5 newIntraFrequencyCellInfoListAddon_r5)
    {
	mComponents[0] = newIntraFrequencyCellInfoListAddon_r5;
    }
    
    public boolean hasNewIntraFrequencyCellInfoListAddon_r5()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNewIntraFrequencyCellInfoListAddon_r5()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type NewIntraFrequencyCellInfoListAddon_r5 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class NewIntraFrequencyCellInfoListAddon_r5 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public NewIntraFrequencyCellInfoListAddon_r5()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public NewIntraFrequencyCellInfoListAddon_r5(CellSelectReselectInfo_v590ext[] elements)
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
		"MeasurementControlSysInfoExtensionAddon_r5$NewIntraFrequencyCellInfoListAddon_r5"
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
	 * Get the type descriptor (TypeInfo) of 'this' NewIntraFrequencyCellInfoListAddon_r5 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewIntraFrequencyCellInfoListAddon_r5 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewIntraFrequencyCellInfoListAddon_r5

    // Methods for field "newInterFrequencyCellInfoListAddon_r5"
    public NewInterFrequencyCellInfoListAddon_r5 getNewInterFrequencyCellInfoListAddon_r5()
    {
	return (NewInterFrequencyCellInfoListAddon_r5)mComponents[1];
    }
    
    public void setNewInterFrequencyCellInfoListAddon_r5(NewInterFrequencyCellInfoListAddon_r5 newInterFrequencyCellInfoListAddon_r5)
    {
	mComponents[1] = newInterFrequencyCellInfoListAddon_r5;
    }
    
    public boolean hasNewInterFrequencyCellInfoListAddon_r5()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNewInterFrequencyCellInfoListAddon_r5()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type NewInterFrequencyCellInfoListAddon_r5 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class NewInterFrequencyCellInfoListAddon_r5 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public NewInterFrequencyCellInfoListAddon_r5()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public NewInterFrequencyCellInfoListAddon_r5(CellSelectReselectInfo_v590ext[] elements)
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
		"MeasurementControlSysInfoExtensionAddon_r5$NewInterFrequencyCellInfoListAddon_r5"
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
	 * Get the type descriptor (TypeInfo) of 'this' NewInterFrequencyCellInfoListAddon_r5 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewInterFrequencyCellInfoListAddon_r5 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewInterFrequencyCellInfoListAddon_r5

    // Methods for field "newInterRATCellInfoListAddon_r5"
    public NewInterRATCellInfoListAddon_r5 getNewInterRATCellInfoListAddon_r5()
    {
	return (NewInterRATCellInfoListAddon_r5)mComponents[2];
    }
    
    public void setNewInterRATCellInfoListAddon_r5(NewInterRATCellInfoListAddon_r5 newInterRATCellInfoListAddon_r5)
    {
	mComponents[2] = newInterRATCellInfoListAddon_r5;
    }
    
    public boolean hasNewInterRATCellInfoListAddon_r5()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNewInterRATCellInfoListAddon_r5()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type NewInterRATCellInfoListAddon_r5 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class NewInterRATCellInfoListAddon_r5 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public NewInterRATCellInfoListAddon_r5()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public NewInterRATCellInfoListAddon_r5(CellSelectReselectInfo_v590ext[] elements)
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
		"MeasurementControlSysInfoExtensionAddon_r5$NewInterRATCellInfoListAddon_r5"
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
	 * Get the type descriptor (TypeInfo) of 'this' NewInterRATCellInfoListAddon_r5 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewInterRATCellInfoListAddon_r5 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewInterRATCellInfoListAddon_r5

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
	    "MeasurementControlSysInfoExtensionAddon_r5"
	),
	new QName (
	    "InformationElements",
	    "MeasurementControlSysInfoExtensionAddon-r5"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MeasurementControlSysInfoExtensionAddon_r5$NewIntraFrequencyCellInfoListAddon_r5"
			)
		    ),
		    "newIntraFrequencyCellInfoListAddon-r5",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MeasurementControlSysInfoExtensionAddon_r5$NewInterFrequencyCellInfoListAddon_r5"
			)
		    ),
		    "newInterFrequencyCellInfoListAddon-r5",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MeasurementControlSysInfoExtensionAddon_r5$NewInterRATCellInfoListAddon_r5"
			)
		    ),
		    "newInterRATCellInfoListAddon-r5",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControlSysInfoExtensionAddon_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControlSysInfoExtensionAddon_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControlSysInfoExtensionAddon_r5
