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
 * Define the ASN1 Type EUTRA_SIacquisitionResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_SIacquisitionResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_SIacquisitionResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_SIacquisitionResults(CgiInfo cgiInfo, 
		    CSG_Identity csgIdentity, 
		    CsgMemberIndication csgMemberIndication)
    {
	setCgiInfo(cgiInfo);
	setCsgIdentity(csgIdentity);
	setCsgMemberIndication(csgMemberIndication);
    }
    
    /**
     * Construct with required components.
     */
    public EUTRA_SIacquisitionResults(CgiInfo cgiInfo)
    {
	setCgiInfo(cgiInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CgiInfo();
	mComponents[1] = new CSG_Identity();
	mComponents[2] = CsgMemberIndication.member;
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
		return new CgiInfo();
	    case 1:
		return new CSG_Identity();
	    case 2:
		return CsgMemberIndication.member;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cgiInfo"
    public CgiInfo getCgiInfo()
    {
	return (CgiInfo)mComponents[0];
    }
    
    public void setCgiInfo(CgiInfo cgiInfo)
    {
	mComponents[0] = cgiInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type CgiInfo from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class CgiInfo extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public CgiInfo()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public CgiInfo(PLMN_Identity plmn_Identity, BitString cellIdentity, 
			BitString trackingAreaCode)
	{
	    setPlmn_Identity(plmn_Identity);
	    setCellIdentity(cellIdentity);
	    setTrackingAreaCode(trackingAreaCode);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PLMN_Identity();
	    mComponents[1] = new BitString();
	    mComponents[2] = new BitString();
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
		    return new PLMN_Identity();
		case 1:
		    return new BitString();
		case 2:
		    return new BitString();
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
	public BitString getCellIdentity()
	{
	    return (BitString)mComponents[1];
	}
	
	public void setCellIdentity(BitString cellIdentity)
	{
	    mComponents[1] = cellIdentity;
	}
	
	
	// Methods for field "trackingAreaCode"
	public BitString getTrackingAreaCode()
	{
	    return (BitString)mComponents[2];
	}
	
	public void setTrackingAreaCode(BitString trackingAreaCode)
	{
	    mComponents[2] = trackingAreaCode;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"EUTRA_SIacquisitionResults$CgiInfo"
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
				    "com.oss.asn1",
				    "BitString"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "BitString"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(16)
				    )
				),
				new Bounds (
				    new java.lang.Long(16),
				    new java.lang.Long(16)
				),
				null
			    )
			),
			"trackingAreaCode",
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
	 * Get the type descriptor (TypeInfo) of 'this' CgiInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CgiInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CgiInfo

    // Methods for field "csgIdentity"
    public CSG_Identity getCsgIdentity()
    {
	return (CSG_Identity)mComponents[1];
    }
    
    public void setCsgIdentity(CSG_Identity csgIdentity)
    {
	mComponents[1] = csgIdentity;
    }
    
    public boolean hasCsgIdentity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCsgIdentity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "csgMemberIndication"
    public CsgMemberIndication getCsgMemberIndication()
    {
	return (CsgMemberIndication)mComponents[2];
    }
    
    public void setCsgMemberIndication(CsgMemberIndication csgMemberIndication)
    {
	mComponents[2] = csgMemberIndication;
    }
    
    public boolean hasCsgMemberIndication()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCsgMemberIndication()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type CsgMemberIndication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class CsgMemberIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private CsgMemberIndication()
	{
	    super(cFirstNumber);
	}
	
	protected CsgMemberIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final CsgMemberIndication member =
	    new CsgMemberIndication(0);
	private final static CsgMemberIndication cNamedNumbers[] = {
	     member
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
	
	public static CsgMemberIndication valueOf(long value)
	{
	    return (CsgMemberIndication)member.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"EUTRA_SIacquisitionResults$CsgMemberIndication"
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
			"member",
			0
		    )
		}
	    ),
	    0,
	    member
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' CsgMemberIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CsgMemberIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CsgMemberIndication

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
	    "EUTRA_SIacquisitionResults"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-SIacquisitionResults"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "EUTRA_SIacquisitionResults$CgiInfo"
			)
		    ),
		    "cgiInfo",
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
				"CSG_Identity"
			    ),
			    new QName (
				"InformationElements",
				"CSG-Identity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(27)
				)
			    ),
			    new Bounds (
				new java.lang.Long(27),
				new java.lang.Long(27)
			    ),
			    null
			)
		    ),
		    "csgIdentity",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "EUTRA_SIacquisitionResults$CsgMemberIndication"
			)
		    ),
		    "csgMemberIndication",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_SIacquisitionResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_SIacquisitionResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_SIacquisitionResults
