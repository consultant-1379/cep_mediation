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
 * Define the ASN1 Type SYNC_UL_Info_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SYNC_UL_Info_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SYNC_UL_Info_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SYNC_UL_Info_r4(Sync_UL_Codes_Bitmap sync_UL_Codes_Bitmap, 
		    INTEGER prxUpPCHdes, INTEGER powerRampStep, 
		    Max_SYNC_UL_Transmissions max_SYNC_UL_Transmissions, 
		    INTEGER mmax)
    {
	setSync_UL_Codes_Bitmap(sync_UL_Codes_Bitmap);
	setPrxUpPCHdes(prxUpPCHdes);
	setPowerRampStep(powerRampStep);
	setMax_SYNC_UL_Transmissions(max_SYNC_UL_Transmissions);
	setMmax(mmax);
    }
    
    /**
     * Construct with components.
     */
    public SYNC_UL_Info_r4(Sync_UL_Codes_Bitmap sync_UL_Codes_Bitmap, 
		    long prxUpPCHdes, long powerRampStep, 
		    Max_SYNC_UL_Transmissions max_SYNC_UL_Transmissions, 
		    long mmax)
    {
	this(sync_UL_Codes_Bitmap, new INTEGER(prxUpPCHdes), 
	     new INTEGER(powerRampStep), max_SYNC_UL_Transmissions, 
	     new INTEGER(mmax));
    }
    
    public void initComponents()
    {
	mComponents[0] = new Sync_UL_Codes_Bitmap();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = Max_SYNC_UL_Transmissions.tr1;
	mComponents[4] = new INTEGER();
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
		return new Sync_UL_Codes_Bitmap();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return Max_SYNC_UL_Transmissions.tr1;
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sync_UL_Codes_Bitmap"
    public Sync_UL_Codes_Bitmap getSync_UL_Codes_Bitmap()
    {
	return (Sync_UL_Codes_Bitmap)mComponents[0];
    }
    
    public void setSync_UL_Codes_Bitmap(Sync_UL_Codes_Bitmap sync_UL_Codes_Bitmap)
    {
	mComponents[0] = sync_UL_Codes_Bitmap;
    }
    
    
    // Methods for field "prxUpPCHdes"
    public long getPrxUpPCHdes()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPrxUpPCHdes(long prxUpPCHdes)
    {
	setPrxUpPCHdes(new INTEGER(prxUpPCHdes));
    }
    
    public void setPrxUpPCHdes(INTEGER prxUpPCHdes)
    {
	mComponents[1] = prxUpPCHdes;
    }
    
    
    // Methods for field "powerRampStep"
    public long getPowerRampStep()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPowerRampStep(long powerRampStep)
    {
	setPowerRampStep(new INTEGER(powerRampStep));
    }
    
    public void setPowerRampStep(INTEGER powerRampStep)
    {
	mComponents[2] = powerRampStep;
    }
    
    
    // Methods for field "max_SYNC_UL_Transmissions"
    public Max_SYNC_UL_Transmissions getMax_SYNC_UL_Transmissions()
    {
	return (Max_SYNC_UL_Transmissions)mComponents[3];
    }
    
    public void setMax_SYNC_UL_Transmissions(Max_SYNC_UL_Transmissions max_SYNC_UL_Transmissions)
    {
	mComponents[3] = max_SYNC_UL_Transmissions;
    }
    
    
    
    /**
     * Define the ASN1 Type Max_SYNC_UL_Transmissions from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Max_SYNC_UL_Transmissions extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Max_SYNC_UL_Transmissions()
	{
	    super(cFirstNumber);
	}
	
	protected Max_SYNC_UL_Transmissions(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Max_SYNC_UL_Transmissions tr1 =
	    new Max_SYNC_UL_Transmissions(0);
	public static final Max_SYNC_UL_Transmissions tr2 =
	    new Max_SYNC_UL_Transmissions(1);
	public static final Max_SYNC_UL_Transmissions tr4 =
	    new Max_SYNC_UL_Transmissions(2);
	public static final Max_SYNC_UL_Transmissions tr8 =
	    new Max_SYNC_UL_Transmissions(3);
	private final static Max_SYNC_UL_Transmissions cNamedNumbers[] = {
	     tr1, 
	     tr2, 
	     tr4, 
	     tr8
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
	
	public static Max_SYNC_UL_Transmissions valueOf(long value)
	{
	    return (Max_SYNC_UL_Transmissions)tr1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SYNC_UL_Info_r4$Max_SYNC_UL_Transmissions"
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
			"tr1",
			0
		    ),
		    new MemberListElement (
			"tr2",
			1
		    ),
		    new MemberListElement (
			"tr4",
			2
		    ),
		    new MemberListElement (
			"tr8",
			3
		    )
		}
	    ),
	    0,
	    tr1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Max_SYNC_UL_Transmissions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Max_SYNC_UL_Transmissions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Max_SYNC_UL_Transmissions

    // Methods for field "mmax"
    public long getMmax()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setMmax(long mmax)
    {
	setMmax(new INTEGER(mmax));
    }
    
    public void setMmax(INTEGER mmax)
    {
	mComponents[4] = mmax;
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
	    "SYNC_UL_Info_r4"
	),
	new QName (
	    "InformationElements",
	    "SYNC-UL-Info-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Sync_UL_Codes_Bitmap"
			    ),
			    new QName (
				"InformationElements",
				"Sync-UL-Codes-Bitmap"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"code7",
					0
				    ),
				    new MemberListElement (
					"code6",
					1
				    ),
				    new MemberListElement (
					"code5",
					2
				    ),
				    new MemberListElement (
					"code4",
					3
				    ),
				    new MemberListElement (
					"code3",
					4
				    ),
				    new MemberListElement (
					"code2",
					5
				    ),
				    new MemberListElement (
					"code1",
					6
				    ),
				    new MemberListElement (
					"code0",
					7
				    )
				}
			    )
			)
		    ),
		    "sync-UL-Codes-Bitmap",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(62),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(62)
			    ),
			    null
			)
		    ),
		    "prxUpPCHdes",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "powerRampStep",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SYNC_UL_Info_r4$Max_SYNC_UL_Transmissions"
			)
		    ),
		    "max-SYNC-UL-Transmissions",
		    3,
		    2,
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
				    new com.oss.asn1.INTEGER(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "mmax",
		    4,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SYNC_UL_Info_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SYNC_UL_Info_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SYNC_UL_Info_r4
