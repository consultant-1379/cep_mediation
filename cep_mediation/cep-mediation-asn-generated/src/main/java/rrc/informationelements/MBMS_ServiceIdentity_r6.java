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
 * Define the ASN1 Type MBMS_ServiceIdentity_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_ServiceIdentity_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_ServiceIdentity_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_ServiceIdentity_r6(OctetString serviceIdentity, 
		    Plmn_Identity plmn_Identity)
    {
	setServiceIdentity(serviceIdentity);
	setPlmn_Identity(plmn_Identity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OctetString();
	mComponents[1] = new Plmn_Identity();
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
		return new OctetString();
	    case 1:
		return new Plmn_Identity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "serviceIdentity"
    public OctetString getServiceIdentity()
    {
	return (OctetString)mComponents[0];
    }
    
    public void setServiceIdentity(OctetString serviceIdentity)
    {
	mComponents[0] = serviceIdentity;
    }
    
    
    // Methods for field "plmn_Identity"
    public Plmn_Identity getPlmn_Identity()
    {
	return (Plmn_Identity)mComponents[1];
    }
    
    public void setPlmn_Identity(Plmn_Identity plmn_Identity)
    {
	mComponents[1] = plmn_Identity;
    }
    
    
    
    /**
     * Define the ASN1 Type Plmn_Identity from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Plmn_Identity extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Plmn_Identity()
	{
	}
	
	public static final  int  sameAsMIB_PLMN_Id_chosen = 1;
	public static final  int  other_chosen = 2;
	
	// Methods for field "sameAsMIB_PLMN_Id"
	public static Plmn_Identity createPlmn_IdentityWithSameAsMIB_PLMN_Id(Null sameAsMIB_PLMN_Id)
	{
	    Plmn_Identity __object = new Plmn_Identity();

	    __object.setSameAsMIB_PLMN_Id(sameAsMIB_PLMN_Id);
	    return __object;
	}
	
	public boolean hasSameAsMIB_PLMN_Id()
	{
	    return getChosenFlag() == sameAsMIB_PLMN_Id_chosen;
	}
	
	public void setSameAsMIB_PLMN_Id(Null sameAsMIB_PLMN_Id)
	{
	    setChosenValue(sameAsMIB_PLMN_Id);
	    setChosenFlag(sameAsMIB_PLMN_Id_chosen);
	}
	
	
	// Methods for field "other"
	public static Plmn_Identity createPlmn_IdentityWithOther(Other other)
	{
	    Plmn_Identity __object = new Plmn_Identity();

	    __object.setOther(other);
	    return __object;
	}
	
	public boolean hasOther()
	{
	    return getChosenFlag() == other_chosen;
	}
	
	public void setOther(Other other)
	{
	    setChosenValue(other);
	    setChosenFlag(other_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Other from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class Other extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Other()
	    {
	    }
	    
	    public static final  int  sameAsMIB_MultiPLMN_Id_chosen = 1;
	    public static final  int  explicitPLMN_Id_chosen = 2;
	    
	    // Methods for field "sameAsMIB_MultiPLMN_Id"
	    public static Other createOtherWithSameAsMIB_MultiPLMN_Id(long sameAsMIB_MultiPLMN_Id)
	    {
		return createOtherWithSameAsMIB_MultiPLMN_Id(new INTEGER(sameAsMIB_MultiPLMN_Id));
	    }
	    
	    public static Other createOtherWithSameAsMIB_MultiPLMN_Id(INTEGER sameAsMIB_MultiPLMN_Id)
	    {
		Other __object = new Other();

		__object.setSameAsMIB_MultiPLMN_Id(sameAsMIB_MultiPLMN_Id);
		return __object;
	    }
	    
	    public boolean hasSameAsMIB_MultiPLMN_Id()
	    {
		return getChosenFlag() == sameAsMIB_MultiPLMN_Id_chosen;
	    }
	    
	    public void setSameAsMIB_MultiPLMN_Id(long sameAsMIB_MultiPLMN_Id)
	    {
		setSameAsMIB_MultiPLMN_Id(new INTEGER(sameAsMIB_MultiPLMN_Id));
	    }
	    
	    public void setSameAsMIB_MultiPLMN_Id(INTEGER sameAsMIB_MultiPLMN_Id)
	    {
		setChosenValue(sameAsMIB_MultiPLMN_Id);
		setChosenFlag(sameAsMIB_MultiPLMN_Id_chosen);
	    }
	    
	    
	    // Methods for field "explicitPLMN_Id"
	    public static Other createOtherWithExplicitPLMN_Id(PLMN_Identity explicitPLMN_Id)
	    {
		Other __object = new Other();

		__object.setExplicitPLMN_Id(explicitPLMN_Id);
		return __object;
	    }
	    
	    public boolean hasExplicitPLMN_Id()
	    {
		return getChosenFlag() == explicitPLMN_Id_chosen;
	    }
	    
	    public void setExplicitPLMN_Id(PLMN_Identity explicitPLMN_Id)
	    {
		setChosenValue(explicitPLMN_Id);
		setChosenFlag(explicitPLMN_Id_chosen);
	    }
	    
	    
	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case sameAsMIB_MultiPLMN_Id_chosen:
			return new INTEGER();
		    case explicitPLMN_Id_chosen:
			return new PLMN_Identity();
		    default:
			throw new InternalError("Choice.createInstance()");
		}
		
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "MBMS_ServiceIdentity_r6$Plmn_Identity$Other"
		),
		new QName (
		    "builtin",
		    "CHOICE"
		),
		12314,
		null,
		new Fields (
		    new FieldInfo[] {
			new FieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"INTEGER"
				    ),
				    new QName (
					"builtin",
					"INTEGER"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(5),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(5)
				    ),
				    null
				)
			    ),
			    "sameAsMIB-MultiPLMN-Id",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
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
			    "explicitPLMN-Id",
			    1,
			    2
			)
		    }
		),
		0,
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Other object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Other object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Other

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case sameAsMIB_PLMN_Id_chosen:
		    return new Null();
		case other_chosen:
		    return new Other();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MBMS_ServiceIdentity_r6$Plmn_Identity"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"sameAsMIB-PLMN-Id",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MBMS_ServiceIdentity_r6$Plmn_Identity$Other"
			    )
			),
			"other",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Plmn_Identity object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Plmn_Identity object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Plmn_Identity

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
	    "MBMS_ServiceIdentity_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-ServiceIdentity-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(3)
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    )
			)
		    ),
		    "serviceIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_ServiceIdentity_r6$Plmn_Identity"
			)
		    ),
		    "plmn-Identity",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_ServiceIdentity_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_ServiceIdentity_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_ServiceIdentity_r6
