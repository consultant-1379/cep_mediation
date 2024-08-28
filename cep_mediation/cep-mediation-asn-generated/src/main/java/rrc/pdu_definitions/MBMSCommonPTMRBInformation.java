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
 * Define the ASN1 Type MBMSCommonPTMRBInformation from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSCommonPTMRBInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSCommonPTMRBInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSCommonPTMRBInformation(rrc.informationelements.MBMS_CommonRBInformationList_r6 mbms_CommonRBInformationList, 
		    rrc.informationelements.MBMS_TranspChInfoForEachTrCh_r6 mbms_TranspChInfoForEachTrCh, 
		    rrc.informationelements.MBMS_TranspChInfoForEachCCTrCh_r6 mbms_TranspChInfoForEachCCTrCh, 
		    rrc.informationelements.MBMS_PhyChInformationList_r6 mbms_PhyChInformationList, 
		    V770NCEs v770NCEs)
    {
	setMbms_CommonRBInformationList(mbms_CommonRBInformationList);
	setMbms_TranspChInfoForEachTrCh(mbms_TranspChInfoForEachTrCh);
	setMbms_TranspChInfoForEachCCTrCh(mbms_TranspChInfoForEachCCTrCh);
	setMbms_PhyChInformationList(mbms_PhyChInformationList);
	setV770NCEs(v770NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public MBMSCommonPTMRBInformation(rrc.informationelements.MBMS_CommonRBInformationList_r6 mbms_CommonRBInformationList, 
		    rrc.informationelements.MBMS_TranspChInfoForEachTrCh_r6 mbms_TranspChInfoForEachTrCh, 
		    rrc.informationelements.MBMS_PhyChInformationList_r6 mbms_PhyChInformationList)
    {
	setMbms_CommonRBInformationList(mbms_CommonRBInformationList);
	setMbms_TranspChInfoForEachTrCh(mbms_TranspChInfoForEachTrCh);
	setMbms_PhyChInformationList(mbms_PhyChInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_CommonRBInformationList_r6();
	mComponents[1] = new rrc.informationelements.MBMS_TranspChInfoForEachTrCh_r6();
	mComponents[2] = new rrc.informationelements.MBMS_TranspChInfoForEachCCTrCh_r6();
	mComponents[3] = new rrc.informationelements.MBMS_PhyChInformationList_r6();
	mComponents[4] = new V770NCEs();
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
		return new rrc.informationelements.MBMS_CommonRBInformationList_r6();
	    case 1:
		return new rrc.informationelements.MBMS_TranspChInfoForEachTrCh_r6();
	    case 2:
		return new rrc.informationelements.MBMS_TranspChInfoForEachCCTrCh_r6();
	    case 3:
		return new rrc.informationelements.MBMS_PhyChInformationList_r6();
	    case 4:
		return new V770NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_CommonRBInformationList"
    public rrc.informationelements.MBMS_CommonRBInformationList_r6 getMbms_CommonRBInformationList()
    {
	return (rrc.informationelements.MBMS_CommonRBInformationList_r6)mComponents[0];
    }
    
    public void setMbms_CommonRBInformationList(rrc.informationelements.MBMS_CommonRBInformationList_r6 mbms_CommonRBInformationList)
    {
	mComponents[0] = mbms_CommonRBInformationList;
    }
    
    
    // Methods for field "mbms_TranspChInfoForEachTrCh"
    public rrc.informationelements.MBMS_TranspChInfoForEachTrCh_r6 getMbms_TranspChInfoForEachTrCh()
    {
	return (rrc.informationelements.MBMS_TranspChInfoForEachTrCh_r6)mComponents[1];
    }
    
    public void setMbms_TranspChInfoForEachTrCh(rrc.informationelements.MBMS_TranspChInfoForEachTrCh_r6 mbms_TranspChInfoForEachTrCh)
    {
	mComponents[1] = mbms_TranspChInfoForEachTrCh;
    }
    
    
    // Methods for field "mbms_TranspChInfoForEachCCTrCh"
    public rrc.informationelements.MBMS_TranspChInfoForEachCCTrCh_r6 getMbms_TranspChInfoForEachCCTrCh()
    {
	return (rrc.informationelements.MBMS_TranspChInfoForEachCCTrCh_r6)mComponents[2];
    }
    
    public void setMbms_TranspChInfoForEachCCTrCh(rrc.informationelements.MBMS_TranspChInfoForEachCCTrCh_r6 mbms_TranspChInfoForEachCCTrCh)
    {
	mComponents[2] = mbms_TranspChInfoForEachCCTrCh;
    }
    
    public boolean hasMbms_TranspChInfoForEachCCTrCh()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMbms_TranspChInfoForEachCCTrCh()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "mbms_PhyChInformationList"
    public rrc.informationelements.MBMS_PhyChInformationList_r6 getMbms_PhyChInformationList()
    {
	return (rrc.informationelements.MBMS_PhyChInformationList_r6)mComponents[3];
    }
    
    public void setMbms_PhyChInformationList(rrc.informationelements.MBMS_PhyChInformationList_r6 mbms_PhyChInformationList)
    {
	mComponents[3] = mbms_PhyChInformationList;
    }
    
    
    // Methods for field "v770NCEs"
    public V770NCEs getV770NCEs()
    {
	return (V770NCEs)mComponents[4];
    }
    
    public void setV770NCEs(V770NCEs v770NCEs)
    {
	mComponents[4] = v770NCEs;
    }
    
    public boolean hasV770NCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteV770NCEs()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type V770NCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V770NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V770NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V770NCEs(MBMSCommonPTMRBInformation_v770ext_IEs mbmsCommonPTMRBInformation_v770ext, 
			V780NCEs v780NCEs)
	{
	    setMbmsCommonPTMRBInformation_v770ext(mbmsCommonPTMRBInformation_v770ext);
	    setV780NCEs(v780NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V770NCEs(MBMSCommonPTMRBInformation_v770ext_IEs mbmsCommonPTMRBInformation_v770ext)
	{
	    setMbmsCommonPTMRBInformation_v770ext(mbmsCommonPTMRBInformation_v770ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMSCommonPTMRBInformation_v770ext_IEs();
	    mComponents[1] = new V780NCEs();
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
		    return new MBMSCommonPTMRBInformation_v770ext_IEs();
		case 1:
		    return new V780NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mbmsCommonPTMRBInformation_v770ext"
	public MBMSCommonPTMRBInformation_v770ext_IEs getMbmsCommonPTMRBInformation_v770ext()
	{
	    return (MBMSCommonPTMRBInformation_v770ext_IEs)mComponents[0];
	}
	
	public void setMbmsCommonPTMRBInformation_v770ext(MBMSCommonPTMRBInformation_v770ext_IEs mbmsCommonPTMRBInformation_v770ext)
	{
	    mComponents[0] = mbmsCommonPTMRBInformation_v770ext;
	}
	
	
	// Methods for field "v780NCEs"
	public V780NCEs getV780NCEs()
	{
	    return (V780NCEs)mComponents[1];
	}
	
	public void setV780NCEs(V780NCEs v780NCEs)
	{
	    mComponents[1] = v780NCEs;
	}
	
	public boolean hasV780NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV780NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V780NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V780NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V780NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V780NCEs(MBMSCommonPTMRBInformation_v780ext_IEs mbmsCommonPTMRBInformation_v780ext, 
			    V860NCEs v860NCEs)
	    {
		setMbmsCommonPTMRBInformation_v780ext(mbmsCommonPTMRBInformation_v780ext);
		setV860NCEs(v860NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V780NCEs(MBMSCommonPTMRBInformation_v780ext_IEs mbmsCommonPTMRBInformation_v780ext)
	    {
		setMbmsCommonPTMRBInformation_v780ext(mbmsCommonPTMRBInformation_v780ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MBMSCommonPTMRBInformation_v780ext_IEs();
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
			return new MBMSCommonPTMRBInformation_v780ext_IEs();
		    case 1:
			return new V860NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "mbmsCommonPTMRBInformation_v780ext"
	    public MBMSCommonPTMRBInformation_v780ext_IEs getMbmsCommonPTMRBInformation_v780ext()
	    {
		return (MBMSCommonPTMRBInformation_v780ext_IEs)mComponents[0];
	    }
	    
	    public void setMbmsCommonPTMRBInformation_v780ext(MBMSCommonPTMRBInformation_v780ext_IEs mbmsCommonPTMRBInformation_v780ext)
	    {
		mComponents[0] = mbmsCommonPTMRBInformation_v780ext;
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
		public V860NCEs(MBMSCommonPTMRBInformation_v860ext_IEs mbmsCommonPTMRBInformation_v860ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setMbmsCommonPTMRBInformation_v860ext(mbmsCommonPTMRBInformation_v860ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V860NCEs(MBMSCommonPTMRBInformation_v860ext_IEs mbmsCommonPTMRBInformation_v860ext)
		{
		    setMbmsCommonPTMRBInformation_v860ext(mbmsCommonPTMRBInformation_v860ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new MBMSCommonPTMRBInformation_v860ext_IEs();
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
			    return new MBMSCommonPTMRBInformation_v860ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "mbmsCommonPTMRBInformation_v860ext"
		public MBMSCommonPTMRBInformation_v860ext_IEs getMbmsCommonPTMRBInformation_v860ext()
		{
		    return (MBMSCommonPTMRBInformation_v860ext_IEs)mComponents[0];
		}
		
		public void setMbmsCommonPTMRBInformation_v860ext(MBMSCommonPTMRBInformation_v860ext_IEs mbmsCommonPTMRBInformation_v860ext)
		{
		    mComponents[0] = mbmsCommonPTMRBInformation_v860ext;
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
			    "MBMSCommonPTMRBInformation$V770NCEs$V780NCEs$V860NCEs$NonCriticalExtensions"
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
			"MBMSCommonPTMRBInformation$V770NCEs$V780NCEs$V860NCEs"
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
					    "MBMSCommonPTMRBInformation_v860ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "MBMSCommonPTMRBInformation-v860ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"MBMSCommonPTMRBInformation_v860ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"MBMSCommonPTMRBInformation_v860ext_IEs"
					    )
					),
					0
				    )
				),
				"mbmsCommonPTMRBInformation-v860ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSCommonPTMRBInformation$V770NCEs$V780NCEs$V860NCEs$NonCriticalExtensions"
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
		    "MBMSCommonPTMRBInformation$V770NCEs$V780NCEs"
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
					"MBMSCommonPTMRBInformation_v780ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"MBMSCommonPTMRBInformation-v780ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSCommonPTMRBInformation_v780ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSCommonPTMRBInformation_v780ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "mbmsCommonPTMRBInformation-v780ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSCommonPTMRBInformation$V770NCEs$V780NCEs$V860NCEs"
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
	     * Get the type descriptor (TypeInfo) of 'this' V780NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V780NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V780NCEs

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
		"MBMSCommonPTMRBInformation$V770NCEs"
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
				    "MBMSCommonPTMRBInformation_v770ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "MBMSCommonPTMRBInformation-v770ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSCommonPTMRBInformation_v770ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSCommonPTMRBInformation_v770ext_IEs"
				    )
				),
				0
			    )
			),
			"mbmsCommonPTMRBInformation-v770ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MBMSCommonPTMRBInformation$V770NCEs$V780NCEs"
			    )
			),
			"v780NCEs",
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
	 * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V770NCEs

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
	    "MBMSCommonPTMRBInformation"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSCommonPTMRBInformation"
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
				"rrc.informationelements",
				"MBMS_CommonRBInformationList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonRBInformationList-r6"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_CommonRBInformation_r6"
				)
			    )
			)
		    ),
		    "mbms-CommonRBInformationList",
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
				"rrc.informationelements",
				"MBMS_TranspChInfoForEachTrCh_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TranspChInfoForEachTrCh-r6"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TranspChInfoForTrCh_r6"
				)
			    )
			)
		    ),
		    "mbms-TranspChInfoForEachTrCh",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_TranspChInfoForEachCCTrCh_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TranspChInfoForEachCCTrCh-r6"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TranspChInfoForCCTrCh_r6"
				)
			    )
			)
		    ),
		    "mbms-TranspChInfoForEachCCTrCh",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_PhyChInformationList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PhyChInformationList-r6"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_PhyChInformation_r6"
				)
			    )
			)
		    ),
		    "mbms-PhyChInformationList",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSCommonPTMRBInformation$V770NCEs"
			)
		    ),
		    "v770NCEs",
		    4,
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSCommonPTMRBInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSCommonPTMRBInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSCommonPTMRBInformation
