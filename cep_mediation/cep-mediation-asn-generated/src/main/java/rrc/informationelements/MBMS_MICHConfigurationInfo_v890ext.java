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
 * Define the ASN1 Type MBMS_MICHConfigurationInfo_v890ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_MICHConfigurationInfo_v890ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_MICHConfigurationInfo_v890ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_MICHConfigurationInfo_v890ext(Mode mode)
    {
	setMode(mode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Mode();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Mode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mode"
    public Mode getMode()
    {
	return (Mode)mComponents[0];
    }
    
    public void setMode(Mode mode)
    {
	mComponents[0] = mode;
    }
    
    
    
    /**
     * Define the ASN1 Type Mode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Mode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Mode()
	{
	}
	
	public static final  int  imb384_chosen = 1;
	
	// Methods for field "imb384"
	public static Mode createModeWithImb384(Imb384 imb384)
	{
	    Mode __object = new Mode();

	    __object.setImb384(imb384);
	    return __object;
	}
	
	public boolean hasImb384()
	{
	    return getChosenFlag() == imb384_chosen;
	}
	
	public void setImb384(Imb384 imb384)
	{
	    setChosenValue(imb384);
	    setChosenFlag(imb384_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Imb384 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Imb384 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Imb384()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Imb384(ChannelisationCode256 channelisationCode256, 
			    MBMS_NI_CountPerFrame_IMB384 ni_CountPerFrame)
	    {
		setChannelisationCode256(channelisationCode256);
		setNi_CountPerFrame(ni_CountPerFrame);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new ChannelisationCode256();
		mComponents[1] = MBMS_NI_CountPerFrame_IMB384.ni16;
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
			return new ChannelisationCode256();
		    case 1:
			return MBMS_NI_CountPerFrame_IMB384.ni16;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "channelisationCode256"
	    public ChannelisationCode256 getChannelisationCode256()
	    {
		return (ChannelisationCode256)mComponents[0];
	    }
	    
	    public void setChannelisationCode256(ChannelisationCode256 channelisationCode256)
	    {
		mComponents[0] = channelisationCode256;
	    }
	    
	    
	    // Methods for field "ni_CountPerFrame"
	    public MBMS_NI_CountPerFrame_IMB384 getNi_CountPerFrame()
	    {
		return (MBMS_NI_CountPerFrame_IMB384)mComponents[1];
	    }
	    
	    public void setNi_CountPerFrame(MBMS_NI_CountPerFrame_IMB384 ni_CountPerFrame)
	    {
		mComponents[1] = ni_CountPerFrame;
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
		    "MBMS_MICHConfigurationInfo_v890ext$Mode$Imb384"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"ChannelisationCode256"
				    ),
				    new QName (
					"InformationElements",
					"ChannelisationCode256"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new ChannelisationCode256(0), 
					    new ChannelisationCode256(255),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(255)
				    ),
				    null
				)
			    ),
			    "channelisationCode256",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"MBMS_NI_CountPerFrame_IMB384"
				    ),
				    new QName (
					"InformationElements",
					"MBMS-NI-CountPerFrame-IMB384"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"ni16",
						0
					    ),
					    new MemberListElement (
						"ni32",
						1
					    ),
					    new MemberListElement (
						"ni64",
						2
					    ),
					    new MemberListElement (
						"ni128",
						3
					    )
					}
				    ),
				    0,
				    MBMS_NI_CountPerFrame_IMB384.ni16
				)
			    ),
			    "ni-CountPerFrame",
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
	     * Get the type descriptor (TypeInfo) of 'this' Imb384 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Imb384 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Imb384

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case imb384_chosen:
		    return new Imb384();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MBMS_MICHConfigurationInfo_v890ext$Mode"
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
			    new QName (
				"rrc.informationelements",
				"MBMS_MICHConfigurationInfo_v890ext$Mode$Imb384"
			    )
			),
			"imb384",
			0,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mode

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
	    "MBMS_MICHConfigurationInfo_v890ext"
	),
	new QName (
	    "InformationElements",
	    "MBMS-MICHConfigurationInfo-v890ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_MICHConfigurationInfo_v890ext$Mode"
			)
		    ),
		    "mode",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_MICHConfigurationInfo_v890ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_MICHConfigurationInfo_v890ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_MICHConfigurationInfo_v890ext
