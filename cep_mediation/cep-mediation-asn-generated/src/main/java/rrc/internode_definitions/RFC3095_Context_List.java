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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type RFC3095_Context_List from ASN1 Module Internode_definitions.
 * @see SequenceOf
 */

public class RFC3095_Context_List extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public RFC3095_Context_List()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public RFC3095_Context_List(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module Internode_definitions.
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
	public Sequence_(DL_RFC3095_Context dl_RFC3095_Context, 
			UL_RFC3095_Context ul_RFC3095_Context)
	{
	    setDl_RFC3095_Context(dl_RFC3095_Context);
	    setUl_RFC3095_Context(ul_RFC3095_Context);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_RFC3095_Context();
	    mComponents[1] = new UL_RFC3095_Context();
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
		    return new DL_RFC3095_Context();
		case 1:
		    return new UL_RFC3095_Context();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "dl_RFC3095_Context"
	public DL_RFC3095_Context getDl_RFC3095_Context()
	{
	    return (DL_RFC3095_Context)mComponents[0];
	}
	
	public void setDl_RFC3095_Context(DL_RFC3095_Context dl_RFC3095_Context)
	{
	    mComponents[0] = dl_RFC3095_Context;
	}
	
	public boolean hasDl_RFC3095_Context()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteDl_RFC3095_Context()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "ul_RFC3095_Context"
	public UL_RFC3095_Context getUl_RFC3095_Context()
	{
	    return (UL_RFC3095_Context)mComponents[1];
	}
	
	public void setUl_RFC3095_Context(UL_RFC3095_Context ul_RFC3095_Context)
	{
	    mComponents[1] = ul_RFC3095_Context;
	}
	
	public boolean hasUl_RFC3095_Context()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteUl_RFC3095_Context()
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
		"rrc.internode_definitions",
		"RFC3095_Context_List$Sequence_"
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
				    "rrc.internode_definitions",
				    "DL_RFC3095_Context"
				),
				new QName (
				    "Internode-definitions",
				    "DL-RFC3095-Context"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.internode_definitions",
					"DL_RFC3095_Context"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.internode_definitions",
					"DL_RFC3095_Context"
				    )
				),
				0
			    )
			),
			"dl-RFC3095-Context",
			0,
			3,
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
				    "rrc.internode_definitions",
				    "UL_RFC3095_Context"
				),
				new QName (
				    "Internode-definitions",
				    "UL-RFC3095-Context"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.internode_definitions",
					"UL_RFC3095_Context"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.internode_definitions",
					"UL_RFC3095_Context"
				    )
				),
				0
			    )
			),
			"ul-RFC3095-Context",
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
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1)
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
	    "rrc.internode_definitions",
	    "RFC3095_Context_List"
	),
	new QName (
	    "Internode-definitions",
	    "RFC3095-Context-List"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(16384),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(16384)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.internode_definitions",
		"RFC3095_Context_List$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RFC3095_Context_List object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RFC3095_Context_List object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RFC3095_Context_List
