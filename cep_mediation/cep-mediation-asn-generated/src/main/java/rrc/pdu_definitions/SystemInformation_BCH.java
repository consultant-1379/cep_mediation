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
 * Define the ASN1 Type SystemInformation_BCH from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class SystemInformation_BCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public SystemInformation_BCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SystemInformation_BCH(rrc.informationelements.SFN_Prime sfn_Prime, 
		    Payload payload)
    {
	setSfn_Prime(sfn_Prime);
	setPayload(payload);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.SFN_Prime();
	mComponents[1] = new Payload();
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
		return new rrc.informationelements.SFN_Prime();
	    case 1:
		return new Payload();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sfn_Prime"
    public rrc.informationelements.SFN_Prime getSfn_Prime()
    {
	return (rrc.informationelements.SFN_Prime)mComponents[0];
    }
    
    public void setSfn_Prime(rrc.informationelements.SFN_Prime sfn_Prime)
    {
	mComponents[0] = sfn_Prime;
    }
    
    
    // Methods for field "payload"
    public Payload getPayload()
    {
	return (Payload)mComponents[1];
    }
    
    public void setPayload(Payload payload)
    {
	mComponents[1] = payload;
    }
    
    
    
    /**
     * Define the ASN1 Type Payload from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class Payload extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Payload()
	{
	}
	
	public static final  int  noSegment_chosen = 1;
	public static final  int  firstSegment_chosen = 2;
	public static final  int  subsequentSegment_chosen = 3;
	public static final  int  lastSegmentShort_chosen = 4;
	public static final  int  lastAndFirst_chosen = 5;
	public static final  int  lastAndComplete_chosen = 6;
	public static final  int  lastAndCompleteAndFirst_chosen = 7;
	public static final  int  completeSIB_List_chosen = 8;
	public static final  int  completeAndFirst_chosen = 9;
	public static final  int  completeSIB_chosen = 10;
	public static final  int  lastSegment_chosen = 11;
	public static final  int  spare5_chosen = 12;
	public static final  int  spare4_chosen = 13;
	public static final  int  spare3_chosen = 14;
	public static final  int  spare2_chosen = 15;
	public static final  int  spare1_chosen = 16;
	
	// Methods for field "noSegment"
	public static Payload createPayloadWithNoSegment(Null noSegment)
	{
	    Payload __object = new Payload();

	    __object.setNoSegment(noSegment);
	    return __object;
	}
	
	public boolean hasNoSegment()
	{
	    return getChosenFlag() == noSegment_chosen;
	}
	
	public void setNoSegment(Null noSegment)
	{
	    setChosenValue(noSegment);
	    setChosenFlag(noSegment_chosen);
	}
	
	
	// Methods for field "firstSegment"
	public static Payload createPayloadWithFirstSegment(FirstSegment firstSegment)
	{
	    Payload __object = new Payload();

	    __object.setFirstSegment(firstSegment);
	    return __object;
	}
	
	public boolean hasFirstSegment()
	{
	    return getChosenFlag() == firstSegment_chosen;
	}
	
	public void setFirstSegment(FirstSegment firstSegment)
	{
	    setChosenValue(firstSegment);
	    setChosenFlag(firstSegment_chosen);
	}
	
	
	// Methods for field "subsequentSegment"
	public static Payload createPayloadWithSubsequentSegment(SubsequentSegment subsequentSegment)
	{
	    Payload __object = new Payload();

	    __object.setSubsequentSegment(subsequentSegment);
	    return __object;
	}
	
	public boolean hasSubsequentSegment()
	{
	    return getChosenFlag() == subsequentSegment_chosen;
	}
	
	public void setSubsequentSegment(SubsequentSegment subsequentSegment)
	{
	    setChosenValue(subsequentSegment);
	    setChosenFlag(subsequentSegment_chosen);
	}
	
	
	// Methods for field "lastSegmentShort"
	public static Payload createPayloadWithLastSegmentShort(LastSegmentShort lastSegmentShort)
	{
	    Payload __object = new Payload();

	    __object.setLastSegmentShort(lastSegmentShort);
	    return __object;
	}
	
	public boolean hasLastSegmentShort()
	{
	    return getChosenFlag() == lastSegmentShort_chosen;
	}
	
	public void setLastSegmentShort(LastSegmentShort lastSegmentShort)
	{
	    setChosenValue(lastSegmentShort);
	    setChosenFlag(lastSegmentShort_chosen);
	}
	
	
	// Methods for field "lastAndFirst"
	public static Payload createPayloadWithLastAndFirst(LastAndFirst lastAndFirst)
	{
	    Payload __object = new Payload();

	    __object.setLastAndFirst(lastAndFirst);
	    return __object;
	}
	
	public boolean hasLastAndFirst()
	{
	    return getChosenFlag() == lastAndFirst_chosen;
	}
	
	public void setLastAndFirst(LastAndFirst lastAndFirst)
	{
	    setChosenValue(lastAndFirst);
	    setChosenFlag(lastAndFirst_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type LastAndFirst from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class LastAndFirst extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public LastAndFirst()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public LastAndFirst(LastSegmentShort lastSegmentShort, 
			    FirstSegmentShort firstSegment)
	    {
		setLastSegmentShort(lastSegmentShort);
		setFirstSegment(firstSegment);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new LastSegmentShort();
		mComponents[1] = new FirstSegmentShort();
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
			return new LastSegmentShort();
		    case 1:
			return new FirstSegmentShort();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "lastSegmentShort"
	    public LastSegmentShort getLastSegmentShort()
	    {
		return (LastSegmentShort)mComponents[0];
	    }
	    
	    public void setLastSegmentShort(LastSegmentShort lastSegmentShort)
	    {
		mComponents[0] = lastSegmentShort;
	    }
	    
	    
	    // Methods for field "firstSegment"
	    public FirstSegmentShort getFirstSegment()
	    {
		return (FirstSegmentShort)mComponents[1];
	    }
	    
	    public void setFirstSegment(FirstSegmentShort firstSegment)
	    {
		mComponents[1] = firstSegment;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8004
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "SystemInformation_BCH$Payload$LastAndFirst"
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
					"rrc.pdu_definitions",
					"LastSegmentShort"
				    ),
				    new QName (
					"PDU-definitions",
					"LastSegmentShort"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "LastSegmentShort"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "LastSegmentShort"
					)
				    ),
				    0
				)
			    ),
			    "lastSegmentShort",
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
					"rrc.pdu_definitions",
					"FirstSegmentShort"
				    ),
				    new QName (
					"PDU-definitions",
					"FirstSegmentShort"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "FirstSegmentShort"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "FirstSegmentShort"
					)
				    ),
				    0
				)
			    ),
			    "firstSegment",
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
	     * Get the type descriptor (TypeInfo) of 'this' LastAndFirst object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' LastAndFirst object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for LastAndFirst

	// Methods for field "lastAndComplete"
	public static Payload createPayloadWithLastAndComplete(LastAndComplete lastAndComplete)
	{
	    Payload __object = new Payload();

	    __object.setLastAndComplete(lastAndComplete);
	    return __object;
	}
	
	public boolean hasLastAndComplete()
	{
	    return getChosenFlag() == lastAndComplete_chosen;
	}
	
	public void setLastAndComplete(LastAndComplete lastAndComplete)
	{
	    setChosenValue(lastAndComplete);
	    setChosenFlag(lastAndComplete_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type LastAndComplete from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class LastAndComplete extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public LastAndComplete()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public LastAndComplete(LastSegmentShort lastSegmentShort, 
			    CompleteSIB_List completeSIB_List)
	    {
		setLastSegmentShort(lastSegmentShort);
		setCompleteSIB_List(completeSIB_List);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new LastSegmentShort();
		mComponents[1] = new CompleteSIB_List();
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
			return new LastSegmentShort();
		    case 1:
			return new CompleteSIB_List();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "lastSegmentShort"
	    public LastSegmentShort getLastSegmentShort()
	    {
		return (LastSegmentShort)mComponents[0];
	    }
	    
	    public void setLastSegmentShort(LastSegmentShort lastSegmentShort)
	    {
		mComponents[0] = lastSegmentShort;
	    }
	    
	    
	    // Methods for field "completeSIB_List"
	    public CompleteSIB_List getCompleteSIB_List()
	    {
		return (CompleteSIB_List)mComponents[1];
	    }
	    
	    public void setCompleteSIB_List(CompleteSIB_List completeSIB_List)
	    {
		mComponents[1] = completeSIB_List;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8005
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "SystemInformation_BCH$Payload$LastAndComplete"
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
					"rrc.pdu_definitions",
					"LastSegmentShort"
				    ),
				    new QName (
					"PDU-definitions",
					"LastSegmentShort"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "LastSegmentShort"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "LastSegmentShort"
					)
				    ),
				    0
				)
			    ),
			    "lastSegmentShort",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CompleteSIB_List"
				    ),
				    new QName (
					"PDU-definitions",
					"CompleteSIB-List"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(16),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CompleteSIBshort"
					)
				    )
				)
			    ),
			    "completeSIB-List",
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
	     * Get the type descriptor (TypeInfo) of 'this' LastAndComplete object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' LastAndComplete object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for LastAndComplete

	// Methods for field "lastAndCompleteAndFirst"
	public static Payload createPayloadWithLastAndCompleteAndFirst(LastAndCompleteAndFirst lastAndCompleteAndFirst)
	{
	    Payload __object = new Payload();

	    __object.setLastAndCompleteAndFirst(lastAndCompleteAndFirst);
	    return __object;
	}
	
	public boolean hasLastAndCompleteAndFirst()
	{
	    return getChosenFlag() == lastAndCompleteAndFirst_chosen;
	}
	
	public void setLastAndCompleteAndFirst(LastAndCompleteAndFirst lastAndCompleteAndFirst)
	{
	    setChosenValue(lastAndCompleteAndFirst);
	    setChosenFlag(lastAndCompleteAndFirst_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type LastAndCompleteAndFirst from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class LastAndCompleteAndFirst extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public LastAndCompleteAndFirst()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public LastAndCompleteAndFirst(LastSegmentShort lastSegmentShort, 
			    CompleteSIB_List completeSIB_List, 
			    FirstSegmentShort firstSegment)
	    {
		setLastSegmentShort(lastSegmentShort);
		setCompleteSIB_List(completeSIB_List);
		setFirstSegment(firstSegment);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new LastSegmentShort();
		mComponents[1] = new CompleteSIB_List();
		mComponents[2] = new FirstSegmentShort();
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
			return new LastSegmentShort();
		    case 1:
			return new CompleteSIB_List();
		    case 2:
			return new FirstSegmentShort();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "lastSegmentShort"
	    public LastSegmentShort getLastSegmentShort()
	    {
		return (LastSegmentShort)mComponents[0];
	    }
	    
	    public void setLastSegmentShort(LastSegmentShort lastSegmentShort)
	    {
		mComponents[0] = lastSegmentShort;
	    }
	    
	    
	    // Methods for field "completeSIB_List"
	    public CompleteSIB_List getCompleteSIB_List()
	    {
		return (CompleteSIB_List)mComponents[1];
	    }
	    
	    public void setCompleteSIB_List(CompleteSIB_List completeSIB_List)
	    {
		mComponents[1] = completeSIB_List;
	    }
	    
	    
	    // Methods for field "firstSegment"
	    public FirstSegmentShort getFirstSegment()
	    {
		return (FirstSegmentShort)mComponents[2];
	    }
	    
	    public void setFirstSegment(FirstSegmentShort firstSegment)
	    {
		mComponents[2] = firstSegment;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8006
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "SystemInformation_BCH$Payload$LastAndCompleteAndFirst"
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
					"rrc.pdu_definitions",
					"LastSegmentShort"
				    ),
				    new QName (
					"PDU-definitions",
					"LastSegmentShort"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "LastSegmentShort"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "LastSegmentShort"
					)
				    ),
				    0
				)
			    ),
			    "lastSegmentShort",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CompleteSIB_List"
				    ),
				    new QName (
					"PDU-definitions",
					"CompleteSIB-List"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(16),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CompleteSIBshort"
					)
				    )
				)
			    ),
			    "completeSIB-List",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"FirstSegmentShort"
				    ),
				    new QName (
					"PDU-definitions",
					"FirstSegmentShort"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "FirstSegmentShort"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "FirstSegmentShort"
					)
				    ),
				    0
				)
			    ),
			    "firstSegment",
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
	     * Get the type descriptor (TypeInfo) of 'this' LastAndCompleteAndFirst object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' LastAndCompleteAndFirst object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for LastAndCompleteAndFirst

	// Methods for field "completeSIB_List"
	public static Payload createPayloadWithCompleteSIB_List(CompleteSIB_List completeSIB_List)
	{
	    Payload __object = new Payload();

	    __object.setCompleteSIB_List(completeSIB_List);
	    return __object;
	}
	
	public boolean hasCompleteSIB_List()
	{
	    return getChosenFlag() == completeSIB_List_chosen;
	}
	
	public void setCompleteSIB_List(CompleteSIB_List completeSIB_List)
	{
	    setChosenValue(completeSIB_List);
	    setChosenFlag(completeSIB_List_chosen);
	}
	
	
	// Methods for field "completeAndFirst"
	public static Payload createPayloadWithCompleteAndFirst(CompleteAndFirst completeAndFirst)
	{
	    Payload __object = new Payload();

	    __object.setCompleteAndFirst(completeAndFirst);
	    return __object;
	}
	
	public boolean hasCompleteAndFirst()
	{
	    return getChosenFlag() == completeAndFirst_chosen;
	}
	
	public void setCompleteAndFirst(CompleteAndFirst completeAndFirst)
	{
	    setChosenValue(completeAndFirst);
	    setChosenFlag(completeAndFirst_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type CompleteAndFirst from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class CompleteAndFirst extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public CompleteAndFirst()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public CompleteAndFirst(CompleteSIB_List completeSIB_List, 
			    FirstSegmentShort firstSegment)
	    {
		setCompleteSIB_List(completeSIB_List);
		setFirstSegment(firstSegment);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CompleteSIB_List();
		mComponents[1] = new FirstSegmentShort();
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
			return new CompleteSIB_List();
		    case 1:
			return new FirstSegmentShort();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "completeSIB_List"
	    public CompleteSIB_List getCompleteSIB_List()
	    {
		return (CompleteSIB_List)mComponents[0];
	    }
	    
	    public void setCompleteSIB_List(CompleteSIB_List completeSIB_List)
	    {
		mComponents[0] = completeSIB_List;
	    }
	    
	    
	    // Methods for field "firstSegment"
	    public FirstSegmentShort getFirstSegment()
	    {
		return (FirstSegmentShort)mComponents[1];
	    }
	    
	    public void setFirstSegment(FirstSegmentShort firstSegment)
	    {
		mComponents[1] = firstSegment;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8008
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "SystemInformation_BCH$Payload$CompleteAndFirst"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CompleteSIB_List"
				    ),
				    new QName (
					"PDU-definitions",
					"CompleteSIB-List"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(16),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CompleteSIBshort"
					)
				    )
				)
			    ),
			    "completeSIB-List",
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
					"rrc.pdu_definitions",
					"FirstSegmentShort"
				    ),
				    new QName (
					"PDU-definitions",
					"FirstSegmentShort"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "FirstSegmentShort"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "FirstSegmentShort"
					)
				    ),
				    0
				)
			    ),
			    "firstSegment",
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
	     * Get the type descriptor (TypeInfo) of 'this' CompleteAndFirst object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' CompleteAndFirst object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for CompleteAndFirst

	// Methods for field "completeSIB"
	public static Payload createPayloadWithCompleteSIB(CompleteSIB completeSIB)
	{
	    Payload __object = new Payload();

	    __object.setCompleteSIB(completeSIB);
	    return __object;
	}
	
	public boolean hasCompleteSIB()
	{
	    return getChosenFlag() == completeSIB_chosen;
	}
	
	public void setCompleteSIB(CompleteSIB completeSIB)
	{
	    setChosenValue(completeSIB);
	    setChosenFlag(completeSIB_chosen);
	}
	
	
	// Methods for field "lastSegment"
	public static Payload createPayloadWithLastSegment(LastSegment lastSegment)
	{
	    Payload __object = new Payload();

	    __object.setLastSegment(lastSegment);
	    return __object;
	}
	
	public boolean hasLastSegment()
	{
	    return getChosenFlag() == lastSegment_chosen;
	}
	
	public void setLastSegment(LastSegment lastSegment)
	{
	    setChosenValue(lastSegment);
	    setChosenFlag(lastSegment_chosen);
	}
	
	
	// Methods for field "spare5"
	public static Payload createPayloadWithSpare5(Null spare5)
	{
	    Payload __object = new Payload();

	    __object.setSpare5(spare5);
	    return __object;
	}
	
	public boolean hasSpare5()
	{
	    return getChosenFlag() == spare5_chosen;
	}
	
	public void setSpare5(Null spare5)
	{
	    setChosenValue(spare5);
	    setChosenFlag(spare5_chosen);
	}
	
	
	// Methods for field "spare4"
	public static Payload createPayloadWithSpare4(Null spare4)
	{
	    Payload __object = new Payload();

	    __object.setSpare4(spare4);
	    return __object;
	}
	
	public boolean hasSpare4()
	{
	    return getChosenFlag() == spare4_chosen;
	}
	
	public void setSpare4(Null spare4)
	{
	    setChosenValue(spare4);
	    setChosenFlag(spare4_chosen);
	}
	
	
	// Methods for field "spare3"
	public static Payload createPayloadWithSpare3(Null spare3)
	{
	    Payload __object = new Payload();

	    __object.setSpare3(spare3);
	    return __object;
	}
	
	public boolean hasSpare3()
	{
	    return getChosenFlag() == spare3_chosen;
	}
	
	public void setSpare3(Null spare3)
	{
	    setChosenValue(spare3);
	    setChosenFlag(spare3_chosen);
	}
	
	
	// Methods for field "spare2"
	public static Payload createPayloadWithSpare2(Null spare2)
	{
	    Payload __object = new Payload();

	    __object.setSpare2(spare2);
	    return __object;
	}
	
	public boolean hasSpare2()
	{
	    return getChosenFlag() == spare2_chosen;
	}
	
	public void setSpare2(Null spare2)
	{
	    setChosenValue(spare2);
	    setChosenFlag(spare2_chosen);
	}
	
	
	// Methods for field "spare1"
	public static Payload createPayloadWithSpare1(Null spare1)
	{
	    Payload __object = new Payload();

	    __object.setSpare1(spare1);
	    return __object;
	}
	
	public boolean hasSpare1()
	{
	    return getChosenFlag() == spare1_chosen;
	}
	
	public void setSpare1(Null spare1)
	{
	    setChosenValue(spare1);
	    setChosenFlag(spare1_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case noSegment_chosen:
		    return new Null();
		case firstSegment_chosen:
		    return new FirstSegment();
		case subsequentSegment_chosen:
		    return new SubsequentSegment();
		case lastSegmentShort_chosen:
		    return new LastSegmentShort();
		case lastAndFirst_chosen:
		    return new LastAndFirst();
		case lastAndComplete_chosen:
		    return new LastAndComplete();
		case lastAndCompleteAndFirst_chosen:
		    return new LastAndCompleteAndFirst();
		case completeSIB_List_chosen:
		    return new CompleteSIB_List();
		case completeAndFirst_chosen:
		    return new CompleteAndFirst();
		case completeSIB_chosen:
		    return new CompleteSIB();
		case lastSegment_chosen:
		    return new LastSegment();
		case spare5_chosen:
		    return new Null();
		case spare4_chosen:
		    return new Null();
		case spare3_chosen:
		    return new Null();
		case spare2_chosen:
		    return new Null();
		case spare1_chosen:
		    return new Null();
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
		"rrc.pdu_definitions",
		"SystemInformation_BCH$Payload"
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
			"noSegment",
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
				    "rrc.pdu_definitions",
				    "FirstSegment"
				),
				new QName (
				    "PDU-definitions",
				    "FirstSegment"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"FirstSegment"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"FirstSegment"
				    )
				),
				0
			    )
			),
			"firstSegment",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "SubsequentSegment"
				),
				new QName (
				    "PDU-definitions",
				    "SubsequentSegment"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"SubsequentSegment"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"SubsequentSegment"
				    )
				),
				0
			    )
			),
			"subsequentSegment",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "LastSegmentShort"
				),
				new QName (
				    "PDU-definitions",
				    "LastSegmentShort"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"LastSegmentShort"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"LastSegmentShort"
				    )
				),
				0
			    )
			),
			"lastSegmentShort",
			3,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"SystemInformation_BCH$Payload$LastAndFirst"
			    )
			),
			"lastAndFirst",
			4,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"SystemInformation_BCH$Payload$LastAndComplete"
			    )
			),
			"lastAndComplete",
			5,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"SystemInformation_BCH$Payload$LastAndCompleteAndFirst"
			    )
			),
			"lastAndCompleteAndFirst",
			6,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8007
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "CompleteSIB_List"
				),
				new QName (
				    "PDU-definitions",
				    "CompleteSIB-List"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(16),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(16)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"CompleteSIBshort"
				    )
				)
			    )
			),
			"completeSIB-List",
			7,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"SystemInformation_BCH$Payload$CompleteAndFirst"
			    )
			),
			"completeAndFirst",
			8,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8009
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "CompleteSIB"
				),
				new QName (
				    "PDU-definitions",
				    "CompleteSIB"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"CompleteSIB"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"CompleteSIB"
				    )
				),
				0
			    )
			),
			"completeSIB",
			9,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x800a
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "LastSegment"
				),
				new QName (
				    "PDU-definitions",
				    "LastSegment"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"LastSegment"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"LastSegment"
				    )
				),
				0
			    )
			),
			"lastSegment",
			10,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x800b
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
			"spare5",
			11,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x800c
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
			"spare4",
			12,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x800d
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
			"spare3",
			13,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x800e
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
			"spare2",
			14,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x800f
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
			"spare1",
			15,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2),
		    new TagDecoderElement((short)0x8003, 3),
		    new TagDecoderElement((short)0x8004, 4),
		    new TagDecoderElement((short)0x8005, 5),
		    new TagDecoderElement((short)0x8006, 6),
		    new TagDecoderElement((short)0x8007, 7),
		    new TagDecoderElement((short)0x8008, 8),
		    new TagDecoderElement((short)0x8009, 9),
		    new TagDecoderElement((short)0x800a, 10),
		    new TagDecoderElement((short)0x800b, 11),
		    new TagDecoderElement((short)0x800c, 12),
		    new TagDecoderElement((short)0x800d, 13),
		    new TagDecoderElement((short)0x800e, 14),
		    new TagDecoderElement((short)0x800f, 15)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Payload object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Payload object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Payload

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
	    "SystemInformation_BCH"
	),
	new QName (
	    "PDU-definitions",
	    "SystemInformation-BCH"
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
				"rrc.informationelements",
				"SFN_Prime"
			    ),
			    new QName (
				"InformationElements",
				"SFN-Prime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.SFN_Prime(0), 
				    new rrc.informationelements.SFN_Prime(2047),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(2047)
			    ),
			    null
			)
		    ),
		    "sfn-Prime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "SystemInformation_BCH$Payload"
			)
		    ),
		    "payload",
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
     * Get the type descriptor (TypeInfo) of 'this' SystemInformation_BCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SystemInformation_BCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SystemInformation_BCH
