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
 * Define the ASN1 Type TGPS_ConfigurationParams_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TGPS_ConfigurationParams_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public TGPS_ConfigurationParams_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TGPS_ConfigurationParams_r8(TGMP_r8 tgmp, TGPRC tgprc, TGSN tgsn, 
		    TGL tgl1, TGL tgl2, TGD tgd, TGPL tgpl1, RPP rpp, ITP itp, 
		    UL_DL_Mode ul_DL_Mode, DL_FrameType dl_FrameType, 
		    DeltaSIR deltaSIR1, DeltaSIR deltaSIRAfter1, 
		    DeltaSIR deltaSIR2, DeltaSIR deltaSIRAfter2, 
		    NidentifyAbort nidentifyAbort, 
		    TreconfirmAbort treconfirmAbort)
    {
	setTgmp(tgmp);
	setTgprc(tgprc);
	setTgsn(tgsn);
	setTgl1(tgl1);
	setTgl2(tgl2);
	setTgd(tgd);
	setTgpl1(tgpl1);
	setRpp(rpp);
	setItp(itp);
	setUl_DL_Mode(ul_DL_Mode);
	setDl_FrameType(dl_FrameType);
	setDeltaSIR1(deltaSIR1);
	setDeltaSIRAfter1(deltaSIRAfter1);
	setDeltaSIR2(deltaSIR2);
	setDeltaSIRAfter2(deltaSIRAfter2);
	setNidentifyAbort(nidentifyAbort);
	setTreconfirmAbort(treconfirmAbort);
    }
    
    /**
     * Construct with required components.
     */
    public TGPS_ConfigurationParams_r8(TGMP_r8 tgmp, TGPRC tgprc, TGSN tgsn, 
		    TGL tgl1, TGD tgd, TGPL tgpl1, RPP rpp, ITP itp, 
		    UL_DL_Mode ul_DL_Mode, DL_FrameType dl_FrameType, 
		    DeltaSIR deltaSIR1, DeltaSIR deltaSIRAfter1)
    {
	setTgmp(tgmp);
	setTgprc(tgprc);
	setTgsn(tgsn);
	setTgl1(tgl1);
	setTgd(tgd);
	setTgpl1(tgpl1);
	setRpp(rpp);
	setItp(itp);
	setUl_DL_Mode(ul_DL_Mode);
	setDl_FrameType(dl_FrameType);
	setDeltaSIR1(deltaSIR1);
	setDeltaSIRAfter1(deltaSIRAfter1);
    }
    
    public void initComponents()
    {
	mComponents[0] = TGMP_r8.tdd_Measurement;
	mComponents[1] = new TGPRC();
	mComponents[2] = new TGSN();
	mComponents[3] = new TGL();
	mComponents[4] = new TGL();
	mComponents[5] = new TGD();
	mComponents[6] = new TGPL();
	mComponents[7] = RPP.mode0;
	mComponents[8] = ITP.mode0;
	mComponents[9] = new UL_DL_Mode();
	mComponents[10] = DL_FrameType.dl_FrameTypeA;
	mComponents[11] = new DeltaSIR();
	mComponents[12] = new DeltaSIR();
	mComponents[13] = new DeltaSIR();
	mComponents[14] = new DeltaSIR();
	mComponents[15] = new NidentifyAbort();
	mComponents[16] = new TreconfirmAbort();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[17];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return TGMP_r8.tdd_Measurement;
	    case 1:
		return new TGPRC();
	    case 2:
		return new TGSN();
	    case 3:
		return new TGL();
	    case 4:
		return new TGL();
	    case 5:
		return new TGD();
	    case 6:
		return new TGPL();
	    case 7:
		return RPP.mode0;
	    case 8:
		return ITP.mode0;
	    case 9:
		return new UL_DL_Mode();
	    case 10:
		return DL_FrameType.dl_FrameTypeA;
	    case 11:
		return new DeltaSIR();
	    case 12:
		return new DeltaSIR();
	    case 13:
		return new DeltaSIR();
	    case 14:
		return new DeltaSIR();
	    case 15:
		return new NidentifyAbort();
	    case 16:
		return new TreconfirmAbort();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tgmp"
    public TGMP_r8 getTgmp()
    {
	return (TGMP_r8)mComponents[0];
    }
    
    public void setTgmp(TGMP_r8 tgmp)
    {
	mComponents[0] = tgmp;
    }
    
    
    // Methods for field "tgprc"
    public TGPRC getTgprc()
    {
	return (TGPRC)mComponents[1];
    }
    
    public void setTgprc(TGPRC tgprc)
    {
	mComponents[1] = tgprc;
    }
    
    
    // Methods for field "tgsn"
    public TGSN getTgsn()
    {
	return (TGSN)mComponents[2];
    }
    
    public void setTgsn(TGSN tgsn)
    {
	mComponents[2] = tgsn;
    }
    
    
    // Methods for field "tgl1"
    public TGL getTgl1()
    {
	return (TGL)mComponents[3];
    }
    
    public void setTgl1(TGL tgl1)
    {
	mComponents[3] = tgl1;
    }
    
    
    // Methods for field "tgl2"
    public TGL getTgl2()
    {
	return (TGL)mComponents[4];
    }
    
    public void setTgl2(TGL tgl2)
    {
	mComponents[4] = tgl2;
    }
    
    public boolean hasTgl2()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTgl2()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "tgd"
    public TGD getTgd()
    {
	return (TGD)mComponents[5];
    }
    
    public void setTgd(TGD tgd)
    {
	mComponents[5] = tgd;
    }
    
    
    // Methods for field "tgpl1"
    public TGPL getTgpl1()
    {
	return (TGPL)mComponents[6];
    }
    
    public void setTgpl1(TGPL tgpl1)
    {
	mComponents[6] = tgpl1;
    }
    
    
    // Methods for field "rpp"
    public RPP getRpp()
    {
	return (RPP)mComponents[7];
    }
    
    public void setRpp(RPP rpp)
    {
	mComponents[7] = rpp;
    }
    
    
    // Methods for field "itp"
    public ITP getItp()
    {
	return (ITP)mComponents[8];
    }
    
    public void setItp(ITP itp)
    {
	mComponents[8] = itp;
    }
    
    
    // Methods for field "ul_DL_Mode"
    public UL_DL_Mode getUl_DL_Mode()
    {
	return (UL_DL_Mode)mComponents[9];
    }
    
    public void setUl_DL_Mode(UL_DL_Mode ul_DL_Mode)
    {
	mComponents[9] = ul_DL_Mode;
    }
    
    
    // Methods for field "dl_FrameType"
    public DL_FrameType getDl_FrameType()
    {
	return (DL_FrameType)mComponents[10];
    }
    
    public void setDl_FrameType(DL_FrameType dl_FrameType)
    {
	mComponents[10] = dl_FrameType;
    }
    
    
    // Methods for field "deltaSIR1"
    public DeltaSIR getDeltaSIR1()
    {
	return (DeltaSIR)mComponents[11];
    }
    
    public void setDeltaSIR1(DeltaSIR deltaSIR1)
    {
	mComponents[11] = deltaSIR1;
    }
    
    
    // Methods for field "deltaSIRAfter1"
    public DeltaSIR getDeltaSIRAfter1()
    {
	return (DeltaSIR)mComponents[12];
    }
    
    public void setDeltaSIRAfter1(DeltaSIR deltaSIRAfter1)
    {
	mComponents[12] = deltaSIRAfter1;
    }
    
    
    // Methods for field "deltaSIR2"
    public DeltaSIR getDeltaSIR2()
    {
	return (DeltaSIR)mComponents[13];
    }
    
    public void setDeltaSIR2(DeltaSIR deltaSIR2)
    {
	mComponents[13] = deltaSIR2;
    }
    
    public boolean hasDeltaSIR2()
    {
	return componentIsPresent(13);
    }
    
    public void deleteDeltaSIR2()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "deltaSIRAfter2"
    public DeltaSIR getDeltaSIRAfter2()
    {
	return (DeltaSIR)mComponents[14];
    }
    
    public void setDeltaSIRAfter2(DeltaSIR deltaSIRAfter2)
    {
	mComponents[14] = deltaSIRAfter2;
    }
    
    public boolean hasDeltaSIRAfter2()
    {
	return componentIsPresent(14);
    }
    
    public void deleteDeltaSIRAfter2()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "nidentifyAbort"
    public NidentifyAbort getNidentifyAbort()
    {
	return (NidentifyAbort)mComponents[15];
    }
    
    public void setNidentifyAbort(NidentifyAbort nidentifyAbort)
    {
	mComponents[15] = nidentifyAbort;
    }
    
    public boolean hasNidentifyAbort()
    {
	return componentIsPresent(15);
    }
    
    public void deleteNidentifyAbort()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "treconfirmAbort"
    public TreconfirmAbort getTreconfirmAbort()
    {
	return (TreconfirmAbort)mComponents[16];
    }
    
    public void setTreconfirmAbort(TreconfirmAbort treconfirmAbort)
    {
	mComponents[16] = treconfirmAbort;
    }
    
    public boolean hasTreconfirmAbort()
    {
	return componentIsPresent(16);
    }
    
    public void deleteTreconfirmAbort()
    {
	setComponentAbsent(16);
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
	    "TGPS_ConfigurationParams_r8"
	),
	new QName (
	    "InformationElements",
	    "TGPS-ConfigurationParams-r8"
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
				"TGMP_r8"
			    ),
			    new QName (
				"InformationElements",
				"TGMP-r8"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tdd-Measurement",
					0
				    ),
				    new MemberListElement (
					"fdd-Measurement",
					1
				    ),
				    new MemberListElement (
					"gsm-CarrierRSSIMeasurement",
					2
				    ),
				    new MemberListElement (
					"gsm-initialBSICIdentification",
					3
				    ),
				    new MemberListElement (
					"gsmBSICReconfirmation",
					4
				    ),
				    new MemberListElement (
					"multi-carrier",
					5
				    ),
				    new MemberListElement (
					"e-UTRA",
					6
				    ),
				    new MemberListElement (
					"spare",
					7
				    )
				}
			    ),
			    0,
			    TGMP_r8.tdd_Measurement
			)
		    ),
		    "tgmp",
		    0,
		    2,
		    null
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
				"rrc.informationelements",
				"TGPRC"
			    ),
			    new QName (
				"InformationElements",
				"TGPRC"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGPRC(0), 
				    new TGPRC(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "tgprc",
		    1,
		    2,
		    null
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
				"rrc.informationelements",
				"TGSN"
			    ),
			    new QName (
				"InformationElements",
				"TGSN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGSN(0), 
				    new TGSN(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "tgsn",
		    2,
		    2,
		    null
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
				"rrc.informationelements",
				"TGL"
			    ),
			    new QName (
				"InformationElements",
				"TGL"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGL(1), 
				    new TGL(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "tgl1",
		    3,
		    2,
		    null
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
				"rrc.informationelements",
				"TGL"
			    ),
			    new QName (
				"InformationElements",
				"TGL"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGL(1), 
				    new TGL(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "tgl2",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TGD"
			    ),
			    new QName (
				"InformationElements",
				"TGD"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGD(15), 
				    new TGD(270),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(15),
				new java.lang.Long(270)
			    ),
			    null
			)
		    ),
		    "tgd",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TGPL"
			    ),
			    new QName (
				"InformationElements",
				"TGPL"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGPL(1), 
				    new TGPL(144),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(144)
			    ),
			    null
			)
		    ),
		    "tgpl1",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RPP"
			    ),
			    new QName (
				"InformationElements",
				"RPP"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mode0",
					0
				    ),
				    new MemberListElement (
					"mode1",
					1
				    )
				}
			    ),
			    0,
			    RPP.mode0
			)
		    ),
		    "rpp",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ITP"
			    ),
			    new QName (
				"InformationElements",
				"ITP"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mode0",
					0
				    ),
				    new MemberListElement (
					"mode1",
					1
				    )
				}
			    ),
			    0,
			    ITP.mode0
			)
		    ),
		    "itp",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_DL_Mode"
			    ),
			    new QName (
				"InformationElements",
				"UL-DL-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DL_Mode"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "ul-DL-Mode",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_FrameType"
			    ),
			    new QName (
				"InformationElements",
				"DL-FrameType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dl-FrameTypeA",
					0
				    ),
				    new MemberListElement (
					"dl-FrameTypeB",
					1
				    )
				}
			    ),
			    0,
			    DL_FrameType.dl_FrameTypeA
			)
		    ),
		    "dl-FrameType",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaSIR"
			    ),
			    new QName (
				"InformationElements",
				"DeltaSIR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaSIR(0), 
				    new DeltaSIR(30),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "deltaSIR1",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaSIR"
			    ),
			    new QName (
				"InformationElements",
				"DeltaSIR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaSIR(0), 
				    new DeltaSIR(30),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "deltaSIRAfter1",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaSIR"
			    ),
			    new QName (
				"InformationElements",
				"DeltaSIR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaSIR(0), 
				    new DeltaSIR(30),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "deltaSIR2",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaSIR"
			    ),
			    new QName (
				"InformationElements",
				"DeltaSIR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaSIR(0), 
				    new DeltaSIR(30),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "deltaSIRAfter2",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NidentifyAbort"
			    ),
			    new QName (
				"InformationElements",
				"NidentifyAbort"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NidentifyAbort(1), 
				    new NidentifyAbort(128),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(128)
			    ),
			    null
			)
		    ),
		    "nidentifyAbort",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TreconfirmAbort"
			    ),
			    new QName (
				"InformationElements",
				"TreconfirmAbort"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TreconfirmAbort(1), 
				    new TreconfirmAbort(20),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "treconfirmAbort",
		    16,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TGPS_ConfigurationParams_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TGPS_ConfigurationParams_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TGPS_ConfigurationParams_r8
