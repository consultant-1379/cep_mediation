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
 * Define the ASN1 Type SystemInformationChangeIndication from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class SystemInformationChangeIndication extends Sequence {
    
    /**
     * The default constructor.
     */
    public SystemInformationChangeIndication()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SystemInformationChangeIndication(rrc.informationelements.BCCH_ModificationInfo bcch_ModificationInfo, 
		    LaterNCEs laterNCEs)
    {
	setBcch_ModificationInfo(bcch_ModificationInfo);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SystemInformationChangeIndication(rrc.informationelements.BCCH_ModificationInfo bcch_ModificationInfo)
    {
	setBcch_ModificationInfo(bcch_ModificationInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.BCCH_ModificationInfo();
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
		return new rrc.informationelements.BCCH_ModificationInfo();
	    case 1:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "bcch_ModificationInfo"
    public rrc.informationelements.BCCH_ModificationInfo getBcch_ModificationInfo()
    {
	return (rrc.informationelements.BCCH_ModificationInfo)mComponents[0];
    }
    
    public void setBcch_ModificationInfo(rrc.informationelements.BCCH_ModificationInfo bcch_ModificationInfo)
    {
	mComponents[0] = bcch_ModificationInfo;
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
	public LaterNCEs(BitString systemInformationChangeIndication_r3_add_ext, 
			V860NCEs v860NCEs)
	{
	    setSystemInformationChangeIndication_r3_add_ext(systemInformationChangeIndication_r3_add_ext);
	    setV860NCEs(v860NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new V860NCEs();
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
		    return new V860NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "systemInformationChangeIndication_r3_add_ext"
	public BitString getSystemInformationChangeIndication_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setSystemInformationChangeIndication_r3_add_ext(BitString systemInformationChangeIndication_r3_add_ext)
	{
	    mComponents[0] = systemInformationChangeIndication_r3_add_ext;
	}
	
	public boolean hasSystemInformationChangeIndication_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSystemInformationChangeIndication_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v860NCEs"
	public V860NCEs getV860NCEs()
	{
	    return (V860NCEs)mComponents[1];
	}
	
	public void setV860NCEs(V860NCEs v860NCEs)
	{
	    mComponents[1] = v860NCEs;
	}
	
	public boolean hasV860NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV860NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V860NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V860NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V860NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V860NCEs(SystemInformationChangeIndication_v860ext_IEs systemInformationChangeIndication_v860ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSystemInformationChangeIndication_v860ext(systemInformationChangeIndication_v860ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V860NCEs(SystemInformationChangeIndication_v860ext_IEs systemInformationChangeIndication_v860ext)
	    {
		setSystemInformationChangeIndication_v860ext(systemInformationChangeIndication_v860ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SystemInformationChangeIndication_v860ext_IEs();
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
			return new SystemInformationChangeIndication_v860ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "systemInformationChangeIndication_v860ext"
	    public SystemInformationChangeIndication_v860ext_IEs getSystemInformationChangeIndication_v860ext()
	    {
		return (SystemInformationChangeIndication_v860ext_IEs)mComponents[0];
	    }
	    
	    public void setSystemInformationChangeIndication_v860ext(SystemInformationChangeIndication_v860ext_IEs systemInformationChangeIndication_v860ext)
	    {
		mComponents[0] = systemInformationChangeIndication_v860ext;
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
			"SystemInformationChangeIndication$LaterNCEs$V860NCEs$NonCriticalExtensions"
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
		    "SystemInformationChangeIndication$LaterNCEs$V860NCEs"
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
					"SystemInformationChangeIndication_v860ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"SystemInformationChangeIndication-v860ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "SystemInformationChangeIndication_v860ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "SystemInformationChangeIndication_v860ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "systemInformationChangeIndication-v860ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SystemInformationChangeIndication$LaterNCEs$V860NCEs$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' V860NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V860NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V860NCEs

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
		"SystemInformationChangeIndication$LaterNCEs"
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
			"systemInformationChangeIndication-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"SystemInformationChangeIndication$LaterNCEs$V860NCEs"
			    )
			),
			"v860NCEs",
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
	    "SystemInformationChangeIndication"
	),
	new QName (
	    "PDU-definitions",
	    "SystemInformationChangeIndication"
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
				"BCCH_ModificationInfo"
			    ),
			    new QName (
				"InformationElements",
				"BCCH-ModificationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BCCH_ModificationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "BCCH_ModificationInfo"
				)
			    ),
			    0
			)
		    ),
		    "bcch-ModificationInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "SystemInformationChangeIndication$LaterNCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' SystemInformationChangeIndication object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SystemInformationChangeIndication object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SystemInformationChangeIndication
