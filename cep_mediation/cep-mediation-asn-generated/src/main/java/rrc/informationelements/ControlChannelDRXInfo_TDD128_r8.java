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
 * Define the ASN1 Type ControlChannelDRXInfo_TDD128_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ControlChannelDRXInfo_TDD128_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public ControlChannelDRXInfo_TDD128_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ControlChannelDRXInfo_TDD128_r8(ControlChannelDrxOperation controlChannelDrxOperation)
    {
	setControlChannelDrxOperation(controlChannelDrxOperation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ControlChannelDrxOperation();
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
		return new ControlChannelDrxOperation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "controlChannelDrxOperation"
    public ControlChannelDrxOperation getControlChannelDrxOperation()
    {
	return (ControlChannelDrxOperation)mComponents[0];
    }
    
    public void setControlChannelDrxOperation(ControlChannelDrxOperation controlChannelDrxOperation)
    {
	mComponents[0] = controlChannelDrxOperation;
    }
    
    
    
    /**
     * Define the ASN1 Type ControlChannelDrxOperation from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ControlChannelDrxOperation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ControlChannelDrxOperation()
	{
	}
	
	public static final  int  _continue_chosen = 1;
	public static final  int  newOperation_chosen = 2;
	
	// Methods for field "_continue"
	public static ControlChannelDrxOperation createControlChannelDrxOperationWith_continue(Continue _continue)
	{
	    ControlChannelDrxOperation __object = new ControlChannelDrxOperation();

	    __object.set_continue(_continue);
	    return __object;
	}
	
	public boolean has_continue()
	{
	    return getChosenFlag() == _continue_chosen;
	}
	
	public void set_continue(Continue _continue)
	{
	    setChosenValue(_continue);
	    setChosenFlag(_continue_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Continue from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Continue extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Continue()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Continue(EnablingDelay_TDD128 enablingDelay)
	    {
		setEnablingDelay(enablingDelay);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = EnablingDelay_TDD128.radio_frames_0;
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
			return EnablingDelay_TDD128.radio_frames_0;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "enablingDelay"
	    public EnablingDelay_TDD128 getEnablingDelay()
	    {
		return (EnablingDelay_TDD128)mComponents[0];
	    }
	    
	    public void setEnablingDelay(EnablingDelay_TDD128 enablingDelay)
	    {
		mComponents[0] = enablingDelay;
	    }
	    
	    public boolean hasEnablingDelay()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteEnablingDelay()
	    {
		setComponentAbsent(0);
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
		    "ControlChannelDRXInfo_TDD128_r8$ControlChannelDrxOperation$Continue"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"EnablingDelay_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"EnablingDelay-TDD128"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"radio-frames-0",
						0
					    ),
					    new MemberListElement (
						"radio-frames-1",
						1
					    ),
					    new MemberListElement (
						"radio-frames-2",
						2
					    ),
					    new MemberListElement (
						"radio-frames-4",
						3
					    ),
					    new MemberListElement (
						"radio-frames-8",
						4
					    ),
					    new MemberListElement (
						"radio-frames-16",
						5
					    ),
					    new MemberListElement (
						"radio-frames-32",
						6
					    ),
					    new MemberListElement (
						"radio-frames-64",
						7
					    ),
					    new MemberListElement (
						"radio-frames-128",
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
						"infinity",
						15
					    )
					}
				    ),
				    0,
				    EnablingDelay_TDD128.radio_frames_0
				)
			    ),
			    "enablingDelay",
			    0,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Continue object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Continue object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Continue

	// Methods for field "newOperation"
	public static ControlChannelDrxOperation createControlChannelDrxOperationWithNewOperation(NewOperation newOperation)
	{
	    ControlChannelDrxOperation __object = new ControlChannelDrxOperation();

	    __object.setNewOperation(newOperation);
	    return __object;
	}
	
	public boolean hasNewOperation()
	{
	    return getChosenFlag() == newOperation_chosen;
	}
	
	public void setNewOperation(NewOperation newOperation)
	{
	    setChosenValue(newOperation);
	    setChosenFlag(newOperation_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type NewOperation from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class NewOperation extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public NewOperation()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public NewOperation(HS_SCCH_DRX_Info_TDD128 hS_SCCH_Drx_Info, 
			    E_AGCH_DRX_Info_TDD128 e_AGCH_Drx_Info, 
			    EnablingDelay_TDD128 enablingDelay)
	    {
		setHS_SCCH_Drx_Info(hS_SCCH_Drx_Info);
		setE_AGCH_Drx_Info(e_AGCH_Drx_Info);
		setEnablingDelay(enablingDelay);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public NewOperation(HS_SCCH_DRX_Info_TDD128 hS_SCCH_Drx_Info, 
			    EnablingDelay_TDD128 enablingDelay)
	    {
		setHS_SCCH_Drx_Info(hS_SCCH_Drx_Info);
		setEnablingDelay(enablingDelay);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HS_SCCH_DRX_Info_TDD128();
		mComponents[1] = new E_AGCH_DRX_Info_TDD128();
		mComponents[2] = EnablingDelay_TDD128.radio_frames_0;
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
			return new HS_SCCH_DRX_Info_TDD128();
		    case 1:
			return new E_AGCH_DRX_Info_TDD128();
		    case 2:
			return EnablingDelay_TDD128.radio_frames_0;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hS_SCCH_Drx_Info"
	    public HS_SCCH_DRX_Info_TDD128 getHS_SCCH_Drx_Info()
	    {
		return (HS_SCCH_DRX_Info_TDD128)mComponents[0];
	    }
	    
	    public void setHS_SCCH_Drx_Info(HS_SCCH_DRX_Info_TDD128 hS_SCCH_Drx_Info)
	    {
		mComponents[0] = hS_SCCH_Drx_Info;
	    }
	    
	    
	    // Methods for field "e_AGCH_Drx_Info"
	    public E_AGCH_DRX_Info_TDD128 getE_AGCH_Drx_Info()
	    {
		return (E_AGCH_DRX_Info_TDD128)mComponents[1];
	    }
	    
	    public void setE_AGCH_Drx_Info(E_AGCH_DRX_Info_TDD128 e_AGCH_Drx_Info)
	    {
		mComponents[1] = e_AGCH_Drx_Info;
	    }
	    
	    public boolean hasE_AGCH_Drx_Info()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteE_AGCH_Drx_Info()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "enablingDelay"
	    public EnablingDelay_TDD128 getEnablingDelay()
	    {
		return (EnablingDelay_TDD128)mComponents[2];
	    }
	    
	    public void setEnablingDelay(EnablingDelay_TDD128 enablingDelay)
	    {
		mComponents[2] = enablingDelay;
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
		    "ControlChannelDRXInfo_TDD128_r8$ControlChannelDrxOperation$NewOperation"
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
					"HS_SCCH_DRX_Info_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"HS-SCCH-DRX-Info-TDD128"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "HS_SCCH_DRX_Info_TDD128"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "HS_SCCH_DRX_Info_TDD128"
					)
				    ),
				    0
				)
			    ),
			    "hS-SCCH-Drx-Info",
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
					"rrc.informationelements",
					"E_AGCH_DRX_Info_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"E-AGCH-DRX-Info-TDD128"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "E_AGCH_DRX_Info_TDD128"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "E_AGCH_DRX_Info_TDD128"
					)
				    ),
				    0
				)
			    ),
			    "e-AGCH-Drx-Info",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"EnablingDelay_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"EnablingDelay-TDD128"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"radio-frames-0",
						0
					    ),
					    new MemberListElement (
						"radio-frames-1",
						1
					    ),
					    new MemberListElement (
						"radio-frames-2",
						2
					    ),
					    new MemberListElement (
						"radio-frames-4",
						3
					    ),
					    new MemberListElement (
						"radio-frames-8",
						4
					    ),
					    new MemberListElement (
						"radio-frames-16",
						5
					    ),
					    new MemberListElement (
						"radio-frames-32",
						6
					    ),
					    new MemberListElement (
						"radio-frames-64",
						7
					    ),
					    new MemberListElement (
						"radio-frames-128",
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
						"infinity",
						15
					    )
					}
				    ),
				    0,
				    EnablingDelay_TDD128.radio_frames_0
				)
			    ),
			    "enablingDelay",
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
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
	     * Get the type descriptor (TypeInfo) of 'this' NewOperation object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' NewOperation object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for NewOperation

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case _continue_chosen:
		    return new Continue();
		case newOperation_chosen:
		    return new NewOperation();
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
		"ControlChannelDRXInfo_TDD128_r8$ControlChannelDrxOperation"
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
				"ControlChannelDRXInfo_TDD128_r8$ControlChannelDrxOperation$Continue"
			    )
			),
			"continue",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"ControlChannelDRXInfo_TDD128_r8$ControlChannelDrxOperation$NewOperation"
			    )
			),
			"newOperation",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ControlChannelDrxOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ControlChannelDrxOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ControlChannelDrxOperation

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
	    "ControlChannelDRXInfo_TDD128_r8"
	),
	new QName (
	    "InformationElements",
	    "ControlChannelDRXInfo-TDD128-r8"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ControlChannelDRXInfo_TDD128_r8$ControlChannelDrxOperation"
			)
		    ),
		    "controlChannelDrxOperation",
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
     * Get the type descriptor (TypeInfo) of 'this' ControlChannelDRXInfo_TDD128_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ControlChannelDRXInfo_TDD128_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ControlChannelDRXInfo_TDD128_r8
