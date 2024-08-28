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
 * Define the ASN1 Type RFC2507_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RFC2507_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public RFC2507_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RFC2507_Info(INTEGER f_MAX_PERIOD, INTEGER f_MAX_TIME, 
		    INTEGER max_HEADER, INTEGER tcp_SPACE, 
		    INTEGER non_TCP_SPACE, ExpectReordering expectReordering)
    {
	setF_MAX_PERIOD(f_MAX_PERIOD);
	setF_MAX_TIME(f_MAX_TIME);
	setMax_HEADER(max_HEADER);
	setTcp_SPACE(tcp_SPACE);
	setNon_TCP_SPACE(non_TCP_SPACE);
	setExpectReordering(expectReordering);
    }
    
    /**
     * Construct with components.
     */
    public RFC2507_Info(long f_MAX_PERIOD, long f_MAX_TIME, long max_HEADER, 
		    long tcp_SPACE, long non_TCP_SPACE, 
		    ExpectReordering expectReordering)
    {
	this(new INTEGER(f_MAX_PERIOD), new INTEGER(f_MAX_TIME), 
	     new INTEGER(max_HEADER), new INTEGER(tcp_SPACE), 
	     new INTEGER(non_TCP_SPACE), expectReordering);
    }
    
    /**
     * Construct with required components.
     */
    public RFC2507_Info(ExpectReordering expectReordering)
    {
	setExpectReordering(expectReordering);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = ExpectReordering.reorderingNotExpected;
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return ExpectReordering.reorderingNotExpected;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final com.oss.asn1.INTEGER f_MAX_PERIOD__default = 
	new com.oss.asn1.INTEGER(256);
    public static final com.oss.asn1.INTEGER f_MAX_TIME__default = 
	new com.oss.asn1.INTEGER(5);
    public static final com.oss.asn1.INTEGER max_HEADER__default = 
	new com.oss.asn1.INTEGER(168);
    public static final com.oss.asn1.INTEGER tcp_SPACE__default = 
	new com.oss.asn1.INTEGER(15);
    public static final com.oss.asn1.INTEGER non_TCP_SPACE__default = 
	new com.oss.asn1.INTEGER(15);
    
    // Methods for field "f_MAX_PERIOD"
    public long getF_MAX_PERIOD()
    {
	if (hasF_MAX_PERIOD())
	    return ((INTEGER)mComponents[0]).longValue();
	else
	    return f_MAX_PERIOD__default.longValue();
    }
    
    public void setF_MAX_PERIOD(long f_MAX_PERIOD)
    {
	setF_MAX_PERIOD(new INTEGER(f_MAX_PERIOD));
    }
    
    public void setF_MAX_PERIOD(INTEGER f_MAX_PERIOD)
    {
	mComponents[0] = f_MAX_PERIOD;
    }
    
    public void setF_MAX_PERIODToDefault()
    {
	setF_MAX_PERIOD(f_MAX_PERIOD__default);
    }
    
    public boolean hasDefaultF_MAX_PERIOD()
    {
	return true;
    }
    
    public boolean hasF_MAX_PERIOD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteF_MAX_PERIOD()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "f_MAX_TIME"
    public long getF_MAX_TIME()
    {
	if (hasF_MAX_TIME())
	    return ((INTEGER)mComponents[1]).longValue();
	else
	    return f_MAX_TIME__default.longValue();
    }
    
    public void setF_MAX_TIME(long f_MAX_TIME)
    {
	setF_MAX_TIME(new INTEGER(f_MAX_TIME));
    }
    
    public void setF_MAX_TIME(INTEGER f_MAX_TIME)
    {
	mComponents[1] = f_MAX_TIME;
    }
    
    public void setF_MAX_TIMEToDefault()
    {
	setF_MAX_TIME(f_MAX_TIME__default);
    }
    
    public boolean hasDefaultF_MAX_TIME()
    {
	return true;
    }
    
    public boolean hasF_MAX_TIME()
    {
	return componentIsPresent(1);
    }
    
    public void deleteF_MAX_TIME()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "max_HEADER"
    public long getMax_HEADER()
    {
	if (hasMax_HEADER())
	    return ((INTEGER)mComponents[2]).longValue();
	else
	    return max_HEADER__default.longValue();
    }
    
    public void setMax_HEADER(long max_HEADER)
    {
	setMax_HEADER(new INTEGER(max_HEADER));
    }
    
    public void setMax_HEADER(INTEGER max_HEADER)
    {
	mComponents[2] = max_HEADER;
    }
    
    public void setMax_HEADERToDefault()
    {
	setMax_HEADER(max_HEADER__default);
    }
    
    public boolean hasDefaultMax_HEADER()
    {
	return true;
    }
    
    public boolean hasMax_HEADER()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMax_HEADER()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "tcp_SPACE"
    public long getTcp_SPACE()
    {
	if (hasTcp_SPACE())
	    return ((INTEGER)mComponents[3]).longValue();
	else
	    return tcp_SPACE__default.longValue();
    }
    
    public void setTcp_SPACE(long tcp_SPACE)
    {
	setTcp_SPACE(new INTEGER(tcp_SPACE));
    }
    
    public void setTcp_SPACE(INTEGER tcp_SPACE)
    {
	mComponents[3] = tcp_SPACE;
    }
    
    public void setTcp_SPACEToDefault()
    {
	setTcp_SPACE(tcp_SPACE__default);
    }
    
    public boolean hasDefaultTcp_SPACE()
    {
	return true;
    }
    
    public boolean hasTcp_SPACE()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTcp_SPACE()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "non_TCP_SPACE"
    public long getNon_TCP_SPACE()
    {
	if (hasNon_TCP_SPACE())
	    return ((INTEGER)mComponents[4]).longValue();
	else
	    return non_TCP_SPACE__default.longValue();
    }
    
    public void setNon_TCP_SPACE(long non_TCP_SPACE)
    {
	setNon_TCP_SPACE(new INTEGER(non_TCP_SPACE));
    }
    
    public void setNon_TCP_SPACE(INTEGER non_TCP_SPACE)
    {
	mComponents[4] = non_TCP_SPACE;
    }
    
    public void setNon_TCP_SPACEToDefault()
    {
	setNon_TCP_SPACE(non_TCP_SPACE__default);
    }
    
    public boolean hasDefaultNon_TCP_SPACE()
    {
	return true;
    }
    
    public boolean hasNon_TCP_SPACE()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNon_TCP_SPACE()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "expectReordering"
    public ExpectReordering getExpectReordering()
    {
	return (ExpectReordering)mComponents[5];
    }
    
    public void setExpectReordering(ExpectReordering expectReordering)
    {
	mComponents[5] = expectReordering;
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
	    "RFC2507_Info"
	),
	new QName (
	    "InformationElements",
	    "RFC2507-Info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "f-MAX-PERIOD",
		    0,
		    3,
		    f_MAX_PERIOD__default
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "f-MAX-TIME",
		    1,
		    3,
		    f_MAX_TIME__default
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
				    new com.oss.asn1.INTEGER(60), 
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(60),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "max-HEADER",
		    2,
		    3,
		    max_HEADER__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new com.oss.asn1.INTEGER(3), 
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "tcp-SPACE",
		    3,
		    3,
		    tcp_SPACE__default
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
				    new com.oss.asn1.INTEGER(3), 
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "non-TCP-SPACE",
		    4,
		    3,
		    non_TCP_SPACE__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ExpectReordering"
			    ),
			    new QName (
				"InformationElements",
				"ExpectReordering"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"reorderingNotExpected",
					0
				    ),
				    new MemberListElement (
					"reorderingExpected",
					1
				    )
				}
			    ),
			    0,
			    ExpectReordering.reorderingNotExpected
			)
		    ),
		    "expectReordering",
		    5,
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
     * Get the type descriptor (TypeInfo) of 'this' RFC2507_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RFC2507_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RFC2507_Info
