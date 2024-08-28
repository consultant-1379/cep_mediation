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
 * Define the ASN1 Type CSGProximityDetection from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CSGProximityDetection extends Sequence {
    
    /**
     * The default constructor.
     */
    public CSGProximityDetection()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CSGProximityDetection(UTRACSGProximityDetec uTRACSGProximityDetec, 
		    E_UTRACSGProximityDetec e_UTRACSGProximityDetec)
    {
	setUTRACSGProximityDetec(uTRACSGProximityDetec);
	setE_UTRACSGProximityDetec(e_UTRACSGProximityDetec);
    }
    
    public void initComponents()
    {
	mComponents[0] = UTRACSGProximityDetec.enable;
	mComponents[1] = E_UTRACSGProximityDetec.enable;
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
		return UTRACSGProximityDetec.enable;
	    case 1:
		return E_UTRACSGProximityDetec.enable;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uTRACSGProximityDetec"
    public UTRACSGProximityDetec getUTRACSGProximityDetec()
    {
	return (UTRACSGProximityDetec)mComponents[0];
    }
    
    public void setUTRACSGProximityDetec(UTRACSGProximityDetec uTRACSGProximityDetec)
    {
	mComponents[0] = uTRACSGProximityDetec;
    }
    
    public boolean hasUTRACSGProximityDetec()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUTRACSGProximityDetec()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type UTRACSGProximityDetec from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class UTRACSGProximityDetec extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private UTRACSGProximityDetec()
	{
	    super(cFirstNumber);
	}
	
	protected UTRACSGProximityDetec(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final UTRACSGProximityDetec enable =
	    new UTRACSGProximityDetec(0);
	private final static UTRACSGProximityDetec cNamedNumbers[] = {
	     enable
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static UTRACSGProximityDetec valueOf(long value)
	{
	    return (UTRACSGProximityDetec)enable.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CSGProximityDetection$UTRACSGProximityDetec"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"enable",
			0
		    )
		}
	    ),
	    0,
	    enable
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UTRACSGProximityDetec object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UTRACSGProximityDetec object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UTRACSGProximityDetec

    // Methods for field "e_UTRACSGProximityDetec"
    public E_UTRACSGProximityDetec getE_UTRACSGProximityDetec()
    {
	return (E_UTRACSGProximityDetec)mComponents[1];
    }
    
    public void setE_UTRACSGProximityDetec(E_UTRACSGProximityDetec e_UTRACSGProximityDetec)
    {
	mComponents[1] = e_UTRACSGProximityDetec;
    }
    
    public boolean hasE_UTRACSGProximityDetec()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_UTRACSGProximityDetec()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type E_UTRACSGProximityDetec from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class E_UTRACSGProximityDetec extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private E_UTRACSGProximityDetec()
	{
	    super(cFirstNumber);
	}
	
	protected E_UTRACSGProximityDetec(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final E_UTRACSGProximityDetec enable =
	    new E_UTRACSGProximityDetec(0);
	private final static E_UTRACSGProximityDetec cNamedNumbers[] = {
	     enable
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static E_UTRACSGProximityDetec valueOf(long value)
	{
	    return (E_UTRACSGProximityDetec)enable.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CSGProximityDetection$E_UTRACSGProximityDetec"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"enable",
			0
		    )
		}
	    ),
	    0,
	    enable
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' E_UTRACSGProximityDetec object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_UTRACSGProximityDetec object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_UTRACSGProximityDetec

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
	    "CSGProximityDetection"
	),
	new QName (
	    "InformationElements",
	    "CSGProximityDetection"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSGProximityDetection$UTRACSGProximityDetec"
			)
		    ),
		    "uTRACSGProximityDetec",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSGProximityDetection$E_UTRACSGProximityDetec"
			)
		    ),
		    "e-UTRACSGProximityDetec",
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
     * Get the type descriptor (TypeInfo) of 'this' CSGProximityDetection object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CSGProximityDetection object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CSGProximityDetection
