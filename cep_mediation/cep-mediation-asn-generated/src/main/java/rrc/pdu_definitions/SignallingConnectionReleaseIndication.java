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
 * Define the ASN1 Type SignallingConnectionReleaseIndication from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class SignallingConnectionReleaseIndication extends Sequence {
    
    /**
     * The default constructor.
     */
    public SignallingConnectionReleaseIndication()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignallingConnectionReleaseIndication(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    LaterNCEs laterNCEs)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SignallingConnectionReleaseIndication(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.CN_DomainIdentity.cs_domain;
	mComponents[1] = new LaterNCEs();
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
		return rrc.informationelements.CN_DomainIdentity.cs_domain;
	    case 1:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public rrc.informationelements.CN_DomainIdentity getCn_DomainIdentity()
    {
	return (rrc.informationelements.CN_DomainIdentity)mComponents[0];
    }
    
    public void setCn_DomainIdentity(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[0] = cn_DomainIdentity;
    }
    
    
    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[1];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[1] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type LaterNCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class LaterNCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public LaterNCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public LaterNCEs(BitString signallingConnectionReleaseIndication_r3_add_ext, 
			V860nonCriticalExtentions v860nonCriticalExtentions)
	{
	    setSignallingConnectionReleaseIndication_r3_add_ext(signallingConnectionReleaseIndication_r3_add_ext);
	    setV860nonCriticalExtentions(v860nonCriticalExtentions);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new V860nonCriticalExtentions();
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
		    return new BitString();
		case 1:
		    return new V860nonCriticalExtentions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "signallingConnectionReleaseIndication_r3_add_ext"
	public BitString getSignallingConnectionReleaseIndication_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setSignallingConnectionReleaseIndication_r3_add_ext(BitString signallingConnectionReleaseIndication_r3_add_ext)
	{
	    mComponents[0] = signallingConnectionReleaseIndication_r3_add_ext;
	}
	
	public boolean hasSignallingConnectionReleaseIndication_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSignallingConnectionReleaseIndication_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v860nonCriticalExtentions"
	public V860nonCriticalExtentions getV860nonCriticalExtentions()
	{
	    return (V860nonCriticalExtentions)mComponents[1];
	}
	
	public void setV860nonCriticalExtentions(V860nonCriticalExtentions v860nonCriticalExtentions)
	{
	    mComponents[1] = v860nonCriticalExtentions;
	}
	
	public boolean hasV860nonCriticalExtentions()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV860nonCriticalExtentions()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V860nonCriticalExtentions from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V860nonCriticalExtentions extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V860nonCriticalExtentions()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V860nonCriticalExtentions(SignallingConnectionReleaseIndication_v860ext signallingConnectionReleaseIndication_v860ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSignallingConnectionReleaseIndication_v860ext(signallingConnectionReleaseIndication_v860ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V860nonCriticalExtentions(SignallingConnectionReleaseIndication_v860ext signallingConnectionReleaseIndication_v860ext)
	    {
		setSignallingConnectionReleaseIndication_v860ext(signallingConnectionReleaseIndication_v860ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SignallingConnectionReleaseIndication_v860ext();
		mComponents[1] = new NonCriticalExtensions();
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
			return new SignallingConnectionReleaseIndication_v860ext();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "signallingConnectionReleaseIndication_v860ext"
	    public SignallingConnectionReleaseIndication_v860ext getSignallingConnectionReleaseIndication_v860ext()
	    {
		return (SignallingConnectionReleaseIndication_v860ext)mComponents[0];
	    }
	    
	    public void setSignallingConnectionReleaseIndication_v860ext(SignallingConnectionReleaseIndication_v860ext signallingConnectionReleaseIndication_v860ext)
	    {
		mComponents[0] = signallingConnectionReleaseIndication_v860ext;
	    }
	    
	    
	    // Methods for field "nonCriticalExtensions"
	    public NonCriticalExtensions getNonCriticalExtensions()
	    {
		return (NonCriticalExtensions)mComponents[1];
	    }
	    
	    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
	    {
		mComponents[1] = nonCriticalExtensions;
	    }
	    
	    public boolean hasNonCriticalExtensions()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteNonCriticalExtensions()
	    {
		setComponentAbsent(1);
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"SignallingConnectionReleaseIndication$LaterNCEs$V860nonCriticalExtentions$NonCriticalExtensions"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "SignallingConnectionReleaseIndication$LaterNCEs$V860nonCriticalExtentions"
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
					"SignallingConnectionReleaseIndication_v860ext"
				    ),
				    new QName (
					"PDU-definitions",
					"SignallingConnectionReleaseIndication-v860ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "SignallingConnectionReleaseIndication_v860ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "SignallingConnectionReleaseIndication_v860ext"
					)
				    ),
				    0
				)
			    ),
			    "signallingConnectionReleaseIndication-v860ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SignallingConnectionReleaseIndication$LaterNCEs$V860nonCriticalExtentions$NonCriticalExtensions"
				)
			    ),
			    "nonCriticalExtensions",
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
	     * Get the type descriptor (TypeInfo) of 'this' V860nonCriticalExtentions object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V860nonCriticalExtentions object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V860nonCriticalExtentions

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"SignallingConnectionReleaseIndication$LaterNCEs"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
				null,
				null,
				null
			    )
			),
			"signallingConnectionReleaseIndication-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"SignallingConnectionReleaseIndication$LaterNCEs$V860nonCriticalExtentions"
			    )
			),
			"v860nonCriticalExtentions",
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
	 * Get the type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LaterNCEs

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
	    "SignallingConnectionReleaseIndication"
	),
	new QName (
	    "PDU-definitions",
	    "SignallingConnectionReleaseIndication"
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
				"CN_DomainIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainIdentity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cs-domain",
					0
				    ),
				    new MemberListElement (
					"ps-domain",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "SignallingConnectionReleaseIndication$LaterNCEs"
			)
		    ),
		    "laterNCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' SignallingConnectionReleaseIndication object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SignallingConnectionReleaseIndication object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SignallingConnectionReleaseIndication
