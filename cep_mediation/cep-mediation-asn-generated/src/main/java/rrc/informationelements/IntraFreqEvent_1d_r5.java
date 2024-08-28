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
 * Define the ASN1 Type IntraFreqEvent_1d_r5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFreqEvent_1d_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFreqEvent_1d_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFreqEvent_1d_r5(TriggeringCondition2 triggeringCondition, 
		    BOOLEAN useCIO)
    {
	setTriggeringCondition(triggeringCondition);
	setUseCIO(useCIO);
    }
    
    /**
     * Construct with components.
     */
    public IntraFreqEvent_1d_r5(TriggeringCondition2 triggeringCondition, 
		    boolean useCIO)
    {
	this(triggeringCondition, new BOOLEAN(useCIO));
    }
    
    public void initComponents()
    {
	mComponents[0] = TriggeringCondition2.activeSetCellsOnly;
	mComponents[1] = new BOOLEAN();
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
		return TriggeringCondition2.activeSetCellsOnly;
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "triggeringCondition"
    public TriggeringCondition2 getTriggeringCondition()
    {
	return (TriggeringCondition2)mComponents[0];
    }
    
    public void setTriggeringCondition(TriggeringCondition2 triggeringCondition)
    {
	mComponents[0] = triggeringCondition;
    }
    
    public boolean hasTriggeringCondition()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTriggeringCondition()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "useCIO"
    public boolean getUseCIO()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setUseCIO(boolean useCIO)
    {
	setUseCIO(new BOOLEAN(useCIO));
    }
    
    public void setUseCIO(BOOLEAN useCIO)
    {
	mComponents[1] = useCIO;
    }
    
    public boolean hasUseCIO()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUseCIO()
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
	    "rrc.informationelements",
	    "IntraFreqEvent_1d_r5"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqEvent-1d-r5"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TriggeringCondition2"
			    ),
			    new QName (
				"InformationElements",
				"TriggeringCondition2"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"activeSetCellsOnly",
					0
				    ),
				    new MemberListElement (
					"monitoredSetCellsOnly",
					1
				    ),
				    new MemberListElement (
					"activeSetAndMonitoredSetCells",
					2
				    ),
				    new MemberListElement (
					"detectedSetCellsOnly",
					3
				    ),
				    new MemberListElement (
					"detectedSetAndMonitoredSetCells",
					4
				    )
				}
			    ),
			    0,
			    TriggeringCondition2.activeSetCellsOnly
			)
		    ),
		    "triggeringCondition",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "useCIO",
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
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqEvent_1d_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqEvent_1d_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqEvent_1d_r5
