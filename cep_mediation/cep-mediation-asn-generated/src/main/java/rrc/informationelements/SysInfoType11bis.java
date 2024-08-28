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
 * Define the ASN1 Type SysInfoType11bis from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType11bis extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType11bis()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType11bis(MeasurementControlSysInfoExtension measurementControlSysInfo, 
		    MeasurementControlSysInfoExtension_LCR_r4 measurementControlSysInfo_LCR, 
		    MeasurementControlSysInfoExtensionAddon_r5 measurementControlSysInfoExtensionAddon_r5, 
		    V7b0NCEs v7b0NCEs)
    {
	setMeasurementControlSysInfo(measurementControlSysInfo);
	setMeasurementControlSysInfo_LCR(measurementControlSysInfo_LCR);
	setMeasurementControlSysInfoExtensionAddon_r5(measurementControlSysInfoExtensionAddon_r5);
	setV7b0NCEs(v7b0NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MeasurementControlSysInfoExtension();
	mComponents[1] = new MeasurementControlSysInfoExtension_LCR_r4();
	mComponents[2] = new MeasurementControlSysInfoExtensionAddon_r5();
	mComponents[3] = new V7b0NCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MeasurementControlSysInfoExtension();
	    case 1:
		return new MeasurementControlSysInfoExtension_LCR_r4();
	    case 2:
		return new MeasurementControlSysInfoExtensionAddon_r5();
	    case 3:
		return new V7b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementControlSysInfo"
    public MeasurementControlSysInfoExtension getMeasurementControlSysInfo()
    {
	return (MeasurementControlSysInfoExtension)mComponents[0];
    }
    
    public void setMeasurementControlSysInfo(MeasurementControlSysInfoExtension measurementControlSysInfo)
    {
	mComponents[0] = measurementControlSysInfo;
    }
    
    public boolean hasMeasurementControlSysInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMeasurementControlSysInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measurementControlSysInfo_LCR"
    public MeasurementControlSysInfoExtension_LCR_r4 getMeasurementControlSysInfo_LCR()
    {
	return (MeasurementControlSysInfoExtension_LCR_r4)mComponents[1];
    }
    
    public void setMeasurementControlSysInfo_LCR(MeasurementControlSysInfoExtension_LCR_r4 measurementControlSysInfo_LCR)
    {
	mComponents[1] = measurementControlSysInfo_LCR;
    }
    
    public boolean hasMeasurementControlSysInfo_LCR()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasurementControlSysInfo_LCR()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "measurementControlSysInfoExtensionAddon_r5"
    public MeasurementControlSysInfoExtensionAddon_r5 getMeasurementControlSysInfoExtensionAddon_r5()
    {
	return (MeasurementControlSysInfoExtensionAddon_r5)mComponents[2];
    }
    
    public void setMeasurementControlSysInfoExtensionAddon_r5(MeasurementControlSysInfoExtensionAddon_r5 measurementControlSysInfoExtensionAddon_r5)
    {
	mComponents[2] = measurementControlSysInfoExtensionAddon_r5;
    }
    
    public boolean hasMeasurementControlSysInfoExtensionAddon_r5()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasurementControlSysInfoExtensionAddon_r5()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "v7b0NCEs"
    public V7b0NCEs getV7b0NCEs()
    {
	return (V7b0NCEs)mComponents[3];
    }
    
    public void setV7b0NCEs(V7b0NCEs v7b0NCEs)
    {
	mComponents[3] = v7b0NCEs;
    }
    
    public boolean hasV7b0NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV7b0NCEs()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type V7b0NCEs from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class V7b0NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V7b0NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V7b0NCEs(SysInfoType11bis_v7b0ext_IEs sysInfoType11bis_v7b0ext, 
			V860NCEs v860NCEs)
	{
	    setSysInfoType11bis_v7b0ext(sysInfoType11bis_v7b0ext);
	    setV860NCEs(v860NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V7b0NCEs(SysInfoType11bis_v7b0ext_IEs sysInfoType11bis_v7b0ext)
	{
	    setSysInfoType11bis_v7b0ext(sysInfoType11bis_v7b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType11bis_v7b0ext_IEs();
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
		    return new SysInfoType11bis_v7b0ext_IEs();
		case 1:
		    return new V860NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType11bis_v7b0ext"
	public SysInfoType11bis_v7b0ext_IEs getSysInfoType11bis_v7b0ext()
	{
	    return (SysInfoType11bis_v7b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType11bis_v7b0ext(SysInfoType11bis_v7b0ext_IEs sysInfoType11bis_v7b0ext)
	{
	    mComponents[0] = sysInfoType11bis_v7b0ext;
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
	 * Define the ASN1 Type V860NCEs from ASN1 Module InformationElements.
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
	    public V860NCEs(SysInfoType11bis_v860ext_IEs sysInfoType11bis_v860ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSysInfoType11bis_v860ext(sysInfoType11bis_v860ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V860NCEs(SysInfoType11bis_v860ext_IEs sysInfoType11bis_v860ext)
	    {
		setSysInfoType11bis_v860ext(sysInfoType11bis_v860ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType11bis_v860ext_IEs();
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
			return new SysInfoType11bis_v860ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType11bis_v860ext"
	    public SysInfoType11bis_v860ext_IEs getSysInfoType11bis_v860ext()
	    {
		return (SysInfoType11bis_v860ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType11bis_v860ext(SysInfoType11bis_v860ext_IEs sysInfoType11bis_v860ext)
	    {
		mComponents[0] = sysInfoType11bis_v860ext;
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
	     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module InformationElements.
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
			"rrc.informationelements",
			"SysInfoType11bis$V7b0NCEs$V860NCEs$NonCriticalExtensions"
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
		    "rrc.informationelements",
		    "SysInfoType11bis$V7b0NCEs$V860NCEs"
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
					"SysInfoType11bis_v860ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType11bis-v860ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType11bis_v860ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType11bis_v860ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType11bis-v860ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType11bis$V7b0NCEs$V860NCEs$NonCriticalExtensions"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType11bis$V7b0NCEs"
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
				    "SysInfoType11bis_v7b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType11bis-v7b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType11bis_v7b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType11bis_v7b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType11bis-v7b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType11bis$V7b0NCEs$V860NCEs"
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
	 * Get the type descriptor (TypeInfo) of 'this' V7b0NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V7b0NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V7b0NCEs

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
	    "SysInfoType11bis"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType11bis"
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
				"MeasurementControlSysInfoExtension"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementControlSysInfoExtension"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfoExtension"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfoExtension"
				)
			    ),
			    0
			)
		    ),
		    "measurementControlSysInfo",
		    0,
		    3,
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
				"rrc.informationelements",
				"MeasurementControlSysInfoExtension_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementControlSysInfoExtension-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfoExtension_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfoExtension_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "measurementControlSysInfo-LCR",
		    1,
		    3,
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
				"rrc.informationelements",
				"MeasurementControlSysInfoExtensionAddon_r5"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementControlSysInfoExtensionAddon-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfoExtensionAddon_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfoExtensionAddon_r5"
				)
			    ),
			    0
			)
		    ),
		    "measurementControlSysInfoExtensionAddon-r5",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType11bis$V7b0NCEs"
			)
		    ),
		    "v7b0NCEs",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType11bis object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType11bis object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType11bis
