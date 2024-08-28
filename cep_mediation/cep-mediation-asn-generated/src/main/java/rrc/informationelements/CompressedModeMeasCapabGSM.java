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
 * Define the ASN1 Type CompressedModeMeasCapabGSM from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapabGSM extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapabGSM()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapabGSM(RadioFrequencyBandGSM radioFrequencyBandGSM, 
		    BOOLEAN dl_MeasurementsGSM, BOOLEAN ul_MeasurementsGSM)
    {
	setRadioFrequencyBandGSM(radioFrequencyBandGSM);
	setDl_MeasurementsGSM(dl_MeasurementsGSM);
	setUl_MeasurementsGSM(ul_MeasurementsGSM);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapabGSM(RadioFrequencyBandGSM radioFrequencyBandGSM, 
		    boolean dl_MeasurementsGSM, boolean ul_MeasurementsGSM)
    {
	this(radioFrequencyBandGSM, new BOOLEAN(dl_MeasurementsGSM), 
	     new BOOLEAN(ul_MeasurementsGSM));
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandGSM.gsm450;
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
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
		return RadioFrequencyBandGSM.gsm450;
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandGSM"
    public RadioFrequencyBandGSM getRadioFrequencyBandGSM()
    {
	return (RadioFrequencyBandGSM)mComponents[0];
    }
    
    public void setRadioFrequencyBandGSM(RadioFrequencyBandGSM radioFrequencyBandGSM)
    {
	mComponents[0] = radioFrequencyBandGSM;
    }
    
    
    // Methods for field "dl_MeasurementsGSM"
    public boolean getDl_MeasurementsGSM()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setDl_MeasurementsGSM(boolean dl_MeasurementsGSM)
    {
	setDl_MeasurementsGSM(new BOOLEAN(dl_MeasurementsGSM));
    }
    
    public void setDl_MeasurementsGSM(BOOLEAN dl_MeasurementsGSM)
    {
	mComponents[1] = dl_MeasurementsGSM;
    }
    
    
    // Methods for field "ul_MeasurementsGSM"
    public boolean getUl_MeasurementsGSM()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setUl_MeasurementsGSM(boolean ul_MeasurementsGSM)
    {
	setUl_MeasurementsGSM(new BOOLEAN(ul_MeasurementsGSM));
    }
    
    public void setUl_MeasurementsGSM(BOOLEAN ul_MeasurementsGSM)
    {
	mComponents[2] = ul_MeasurementsGSM;
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
	    "CompressedModeMeasCapabGSM"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapabGSM"
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
				"RadioFrequencyBandGSM"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandGSM"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"gsm450",
					0
				    ),
				    new MemberListElement (
					"gsm480",
					1
				    ),
				    new MemberListElement (
					"gsm850",
					2
				    ),
				    new MemberListElement (
					"gsm900P",
					3
				    ),
				    new MemberListElement (
					"gsm900E",
					4
				    ),
				    new MemberListElement (
					"gsm1800",
					5
				    ),
				    new MemberListElement (
					"gsm1900",
					6
				    ),
				    new MemberListElement (
					"spare9",
					7
				    ),
				    new MemberListElement (
					"spare8",
					8
				    ),
				    new MemberListElement (
					"spare7",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandGSM.gsm450
			)
		    ),
		    "radioFrequencyBandGSM",
		    0,
		    2,
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
		    "dl-MeasurementsGSM",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "ul-MeasurementsGSM",
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabGSM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabGSM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapabGSM
