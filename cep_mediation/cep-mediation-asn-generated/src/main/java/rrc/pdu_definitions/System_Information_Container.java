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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type System_Information_Container from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class System_Information_Container extends Sequence {
    
    /**
     * The default constructor.
     */
    public System_Information_Container()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public System_Information_Container(Mib mib, 
		    SysInfoTypeSB1 sysInfoTypeSB1, 
		    SysInfoTypeSB2 sysInfoTypeSB2, SysInfoType1 sysInfoType1, 
		    SysInfoType3 sysInfoType3, SysInfoType5 sysInfoType5, 
		    SysInfoType7 sysInfoType7, SysInfoType11 sysInfoType11, 
		    SysInfoType11bis sysInfoType11bis, 
		    SysInfoType12 sysInfoType12, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setMib(mib);
	setSysInfoTypeSB1(sysInfoTypeSB1);
	setSysInfoTypeSB2(sysInfoTypeSB2);
	setSysInfoType1(sysInfoType1);
	setSysInfoType3(sysInfoType3);
	setSysInfoType5(sysInfoType5);
	setSysInfoType7(sysInfoType7);
	setSysInfoType11(sysInfoType11);
	setSysInfoType11bis(sysInfoType11bis);
	setSysInfoType12(sysInfoType12);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public System_Information_Container(Mib mib, SysInfoType1 sysInfoType1, 
		    SysInfoType3 sysInfoType3, SysInfoType5 sysInfoType5, 
		    SysInfoType7 sysInfoType7)
    {
	setMib(mib);
	setSysInfoType1(sysInfoType1);
	setSysInfoType3(sysInfoType3);
	setSysInfoType5(sysInfoType5);
	setSysInfoType7(sysInfoType7);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Mib();
	mComponents[1] = new SysInfoTypeSB1();
	mComponents[2] = new SysInfoTypeSB2();
	mComponents[3] = new SysInfoType1();
	mComponents[4] = new SysInfoType3();
	mComponents[5] = new SysInfoType5();
	mComponents[6] = new SysInfoType7();
	mComponents[7] = new SysInfoType11();
	mComponents[8] = new SysInfoType11bis();
	mComponents[9] = new SysInfoType12();
	mComponents[10] = new NonCriticalExtensions();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[11];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Mib();
	    case 1:
		return new SysInfoTypeSB1();
	    case 2:
		return new SysInfoTypeSB2();
	    case 3:
		return new SysInfoType1();
	    case 4:
		return new SysInfoType3();
	    case 5:
		return new SysInfoType5();
	    case 6:
		return new SysInfoType7();
	    case 7:
		return new SysInfoType11();
	    case 8:
		return new SysInfoType11bis();
	    case 9:
		return new SysInfoType12();
	    case 10:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mib"
    public Mib getMib()
    {
	return (Mib)mComponents[0];
    }
    
    public void setMib(Mib mib)
    {
	mComponents[0] = mib;
    }
    
    
    
    /**
     * Define the ASN1 Type Mib from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class Mib extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public Mib()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public Mib(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public Mib(rrc.informationelements.MasterInformationBlock decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.MasterInformationBlock getContainedValue()
	{
	    return (rrc.informationelements.MasterInformationBlock)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.MasterInformationBlock value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$Mib"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "MasterInformationBlock"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mib object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mib object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mib

    // Methods for field "sysInfoTypeSB1"
    public SysInfoTypeSB1 getSysInfoTypeSB1()
    {
	return (SysInfoTypeSB1)mComponents[1];
    }
    
    public void setSysInfoTypeSB1(SysInfoTypeSB1 sysInfoTypeSB1)
    {
	mComponents[1] = sysInfoTypeSB1;
    }
    
    public boolean hasSysInfoTypeSB1()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSysInfoTypeSB1()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoTypeSB1 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoTypeSB1 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoTypeSB1()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoTypeSB1(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoTypeSB1(rrc.informationelements.SysInfoTypeSB1 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoTypeSB1 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoTypeSB1)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoTypeSB1 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoTypeSB1"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoTypeSB1"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoTypeSB1 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoTypeSB1 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoTypeSB1

    // Methods for field "sysInfoTypeSB2"
    public SysInfoTypeSB2 getSysInfoTypeSB2()
    {
	return (SysInfoTypeSB2)mComponents[2];
    }
    
    public void setSysInfoTypeSB2(SysInfoTypeSB2 sysInfoTypeSB2)
    {
	mComponents[2] = sysInfoTypeSB2;
    }
    
    public boolean hasSysInfoTypeSB2()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSysInfoTypeSB2()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoTypeSB2 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoTypeSB2 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoTypeSB2()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoTypeSB2(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoTypeSB2(rrc.informationelements.SysInfoTypeSB2 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoTypeSB2 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoTypeSB2)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoTypeSB2 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoTypeSB2"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoTypeSB2"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoTypeSB2 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoTypeSB2 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoTypeSB2

    // Methods for field "sysInfoType1"
    public SysInfoType1 getSysInfoType1()
    {
	return (SysInfoType1)mComponents[3];
    }
    
    public void setSysInfoType1(SysInfoType1 sysInfoType1)
    {
	mComponents[3] = sysInfoType1;
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoType1 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoType1 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoType1()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoType1(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoType1(rrc.informationelements.SysInfoType1 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoType1 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoType1)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoType1 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoType1"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoType1"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoType1 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoType1 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoType1

    // Methods for field "sysInfoType3"
    public SysInfoType3 getSysInfoType3()
    {
	return (SysInfoType3)mComponents[4];
    }
    
    public void setSysInfoType3(SysInfoType3 sysInfoType3)
    {
	mComponents[4] = sysInfoType3;
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoType3 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoType3 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoType3()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoType3(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoType3(rrc.informationelements.SysInfoType3 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoType3 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoType3)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoType3 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoType3"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoType3"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoType3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoType3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoType3

    // Methods for field "sysInfoType5"
    public SysInfoType5 getSysInfoType5()
    {
	return (SysInfoType5)mComponents[5];
    }
    
    public void setSysInfoType5(SysInfoType5 sysInfoType5)
    {
	mComponents[5] = sysInfoType5;
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoType5 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoType5 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoType5()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoType5(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoType5(rrc.informationelements.SysInfoType5 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoType5 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoType5)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoType5 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoType5"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoType5"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoType5 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoType5

    // Methods for field "sysInfoType7"
    public SysInfoType7 getSysInfoType7()
    {
	return (SysInfoType7)mComponents[6];
    }
    
    public void setSysInfoType7(SysInfoType7 sysInfoType7)
    {
	mComponents[6] = sysInfoType7;
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoType7 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoType7 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoType7()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoType7(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoType7(rrc.informationelements.SysInfoType7 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoType7 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoType7)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoType7 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoType7"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoType7"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoType7 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoType7 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoType7

    // Methods for field "sysInfoType11"
    public SysInfoType11 getSysInfoType11()
    {
	return (SysInfoType11)mComponents[7];
    }
    
    public void setSysInfoType11(SysInfoType11 sysInfoType11)
    {
	mComponents[7] = sysInfoType11;
    }
    
    public boolean hasSysInfoType11()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSysInfoType11()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoType11 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoType11 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoType11()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoType11(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoType11(rrc.informationelements.SysInfoType11 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoType11 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoType11)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoType11 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoType11"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoType11"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoType11 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoType11 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoType11

    // Methods for field "sysInfoType11bis"
    public SysInfoType11bis getSysInfoType11bis()
    {
	return (SysInfoType11bis)mComponents[8];
    }
    
    public void setSysInfoType11bis(SysInfoType11bis sysInfoType11bis)
    {
	mComponents[8] = sysInfoType11bis;
    }
    
    public boolean hasSysInfoType11bis()
    {
	return componentIsPresent(8);
    }
    
    public void deleteSysInfoType11bis()
    {
	setComponentAbsent(8);
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoType11bis from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoType11bis extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoType11bis()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoType11bis(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoType11bis(rrc.informationelements.SysInfoType11bis decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoType11bis getContainedValue()
	{
	    return (rrc.informationelements.SysInfoType11bis)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoType11bis value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8008
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoType11bis"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoType11bis"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoType11bis object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoType11bis object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoType11bis

    // Methods for field "sysInfoType12"
    public SysInfoType12 getSysInfoType12()
    {
	return (SysInfoType12)mComponents[9];
    }
    
    public void setSysInfoType12(SysInfoType12 sysInfoType12)
    {
	mComponents[9] = sysInfoType12;
    }
    
    public boolean hasSysInfoType12()
    {
	return componentIsPresent(9);
    }
    
    public void deleteSysInfoType12()
    {
	setComponentAbsent(9);
    }
    
    
    
    /**
     * Define the ASN1 Type SysInfoType12 from ASN1 Module PDU_definitions.
     * @see ContainingOctetString
     */
    public static class SysInfoType12 extends ContainingOctetString {
	
	/**
	 * The default constructor.
	 */
	public SysInfoType12()
	{
	}
	
	/**
	 * Construct from a byte[] type.
	 * @param value the byte[] to set this object to.
	 */
	
	public SysInfoType12(byte[] value)
	{
	    super(value);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public SysInfoType12(rrc.informationelements.SysInfoType12 decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.SysInfoType12 getContainedValue()
	{
	    return (rrc.informationelements.SysInfoType12)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.SysInfoType12 value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingOctetStringInfo c_typeinfo = new ContainingOctetStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8009
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$SysInfoType12"
	    ),
	    new QName (
		"builtin",
		"OCTET STRING"
	    ),
	    12314,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "SysInfoType12"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SysInfoType12 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SysInfoType12 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SysInfoType12

    // Methods for field "nonCriticalExtensions"
    public NonCriticalExtensions getNonCriticalExtensions()
    {
	return (NonCriticalExtensions)mComponents[10];
    }
    
    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
    {
	mComponents[10] = nonCriticalExtensions;
    }
    
    public boolean hasNonCriticalExtensions()
    {
	return componentIsPresent(10);
    }
    
    public void deleteNonCriticalExtensions()
    {
	setComponentAbsent(10);
    }
    
    
    
    /**
     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class NonCriticalExtensions extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public NonCriticalExtensions()
	{
	}
	
	public void initComponents()
	{
	    
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[0];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    return null;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x800a
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"System_Information_Container$NonCriticalExtensions"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		}
	    ),
	    0,
	    null,
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NonCriticalExtensions

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
	    "rrc.pdu_definitions",
	    "System_Information_Container"
	),
	new QName (
	    "PDU-definitions",
	    "System-Information-Container"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$Mib"
			)
		    ),
		    "mib",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoTypeSB1"
			)
		    ),
		    "sysInfoTypeSB1",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoTypeSB2"
			)
		    ),
		    "sysInfoTypeSB2",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoType1"
			)
		    ),
		    "sysInfoType1",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoType3"
			)
		    ),
		    "sysInfoType3",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoType5"
			)
		    ),
		    "sysInfoType5",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoType7"
			)
		    ),
		    "sysInfoType7",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoType11"
			)
		    ),
		    "sysInfoType11",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoType11bis"
			)
		    ),
		    "sysInfoType11bis",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$SysInfoType12"
			)
		    ),
		    "sysInfoType12",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "System_Information_Container$NonCriticalExtensions"
			)
		    ),
		    "nonCriticalExtensions",
		    10,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' System_Information_Container object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' System_Information_Container object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for System_Information_Container
