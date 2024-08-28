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
 * Define the ASN1 Type SIBSb_TypeAndTag from ASN1 Module InformationElements.
 * @see Choice
 */

public class SIBSb_TypeAndTag extends Choice {
    
    /**
     * The default constructor.
     */
    public SIBSb_TypeAndTag()
    {
    }
    
    public static final  int  sysInfoType1_chosen = 1;
    public static final  int  sysInfoType2_chosen = 2;
    public static final  int  sysInfoType3_chosen = 3;
    public static final  int  sysInfoType4_chosen = 4;
    public static final  int  sysInfoType5_chosen = 5;
    public static final  int  sysInfoType6_chosen = 6;
    public static final  int  sysInfoType7_chosen = 7;
    public static final  int  dummy_chosen = 8;
    public static final  int  dummy2_chosen = 9;
    public static final  int  dummy3_chosen = 10;
    public static final  int  sysInfoType11_chosen = 11;
    public static final  int  sysInfoType12_chosen = 12;
    public static final  int  sysInfoType13_chosen = 13;
    public static final  int  sysInfoType13_1_chosen = 14;
    public static final  int  sysInfoType13_2_chosen = 15;
    public static final  int  sysInfoType13_3_chosen = 16;
    public static final  int  sysInfoType13_4_chosen = 17;
    public static final  int  sysInfoType14_chosen = 18;
    public static final  int  sysInfoType15_chosen = 19;
    public static final  int  sysInfoType16_chosen = 20;
    public static final  int  sysInfoType17_chosen = 21;
    public static final  int  sysInfoTypeSB1_chosen = 22;
    public static final  int  sysInfoTypeSB2_chosen = 23;
    public static final  int  sysInfoType15_1_chosen = 24;
    public static final  int  sysInfoType15_2_chosen = 25;
    public static final  int  sysInfoType15_3_chosen = 26;
    public static final  int  sysInfoType15_4_chosen = 27;
    public static final  int  sysInfoType18_chosen = 28;
    public static final  int  sysInfoType15_5_chosen = 29;
    public static final  int  sysInfoType5bis_chosen = 30;
    public static final  int  spare2_chosen = 31;
    public static final  int  spare1_chosen = 32;
    
    // Methods for field "sysInfoType1"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType1(long sysInfoType1)
    {
	return createSIBSb_TypeAndTagWithSysInfoType1(new PLMN_ValueTag(sysInfoType1));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType1(PLMN_ValueTag sysInfoType1)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType1(sysInfoType1);
	return __object;
    }
    
    public boolean hasSysInfoType1()
    {
	return getChosenFlag() == sysInfoType1_chosen;
    }
    
    public void setSysInfoType1(long sysInfoType1)
    {
	setSysInfoType1(new PLMN_ValueTag(sysInfoType1));
    }
    
    public void setSysInfoType1(PLMN_ValueTag sysInfoType1)
    {
	setChosenValue(sysInfoType1);
	setChosenFlag(sysInfoType1_chosen);
    }
    
    
    // Methods for field "sysInfoType2"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType2(long sysInfoType2)
    {
	return createSIBSb_TypeAndTagWithSysInfoType2(new CellValueTag(sysInfoType2));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType2(CellValueTag sysInfoType2)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType2(sysInfoType2);
	return __object;
    }
    
    public boolean hasSysInfoType2()
    {
	return getChosenFlag() == sysInfoType2_chosen;
    }
    
    public void setSysInfoType2(long sysInfoType2)
    {
	setSysInfoType2(new CellValueTag(sysInfoType2));
    }
    
    public void setSysInfoType2(CellValueTag sysInfoType2)
    {
	setChosenValue(sysInfoType2);
	setChosenFlag(sysInfoType2_chosen);
    }
    
    
    // Methods for field "sysInfoType3"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType3(long sysInfoType3)
    {
	return createSIBSb_TypeAndTagWithSysInfoType3(new CellValueTag(sysInfoType3));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType3(CellValueTag sysInfoType3)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType3(sysInfoType3);
	return __object;
    }
    
    public boolean hasSysInfoType3()
    {
	return getChosenFlag() == sysInfoType3_chosen;
    }
    
    public void setSysInfoType3(long sysInfoType3)
    {
	setSysInfoType3(new CellValueTag(sysInfoType3));
    }
    
    public void setSysInfoType3(CellValueTag sysInfoType3)
    {
	setChosenValue(sysInfoType3);
	setChosenFlag(sysInfoType3_chosen);
    }
    
    
    // Methods for field "sysInfoType4"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType4(long sysInfoType4)
    {
	return createSIBSb_TypeAndTagWithSysInfoType4(new CellValueTag(sysInfoType4));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType4(CellValueTag sysInfoType4)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType4(sysInfoType4);
	return __object;
    }
    
    public boolean hasSysInfoType4()
    {
	return getChosenFlag() == sysInfoType4_chosen;
    }
    
    public void setSysInfoType4(long sysInfoType4)
    {
	setSysInfoType4(new CellValueTag(sysInfoType4));
    }
    
    public void setSysInfoType4(CellValueTag sysInfoType4)
    {
	setChosenValue(sysInfoType4);
	setChosenFlag(sysInfoType4_chosen);
    }
    
    
    // Methods for field "sysInfoType5"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType5(long sysInfoType5)
    {
	return createSIBSb_TypeAndTagWithSysInfoType5(new CellValueTag(sysInfoType5));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType5(CellValueTag sysInfoType5)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType5(sysInfoType5);
	return __object;
    }
    
    public boolean hasSysInfoType5()
    {
	return getChosenFlag() == sysInfoType5_chosen;
    }
    
    public void setSysInfoType5(long sysInfoType5)
    {
	setSysInfoType5(new CellValueTag(sysInfoType5));
    }
    
    public void setSysInfoType5(CellValueTag sysInfoType5)
    {
	setChosenValue(sysInfoType5);
	setChosenFlag(sysInfoType5_chosen);
    }
    
    
    // Methods for field "sysInfoType6"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType6(long sysInfoType6)
    {
	return createSIBSb_TypeAndTagWithSysInfoType6(new CellValueTag(sysInfoType6));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType6(CellValueTag sysInfoType6)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType6(sysInfoType6);
	return __object;
    }
    
    public boolean hasSysInfoType6()
    {
	return getChosenFlag() == sysInfoType6_chosen;
    }
    
    public void setSysInfoType6(long sysInfoType6)
    {
	setSysInfoType6(new CellValueTag(sysInfoType6));
    }
    
    public void setSysInfoType6(CellValueTag sysInfoType6)
    {
	setChosenValue(sysInfoType6);
	setChosenFlag(sysInfoType6_chosen);
    }
    
    
    // Methods for field "sysInfoType7"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType7(Null sysInfoType7)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType7(sysInfoType7);
	return __object;
    }
    
    public boolean hasSysInfoType7()
    {
	return getChosenFlag() == sysInfoType7_chosen;
    }
    
    public void setSysInfoType7(Null sysInfoType7)
    {
	setChosenValue(sysInfoType7);
	setChosenFlag(sysInfoType7_chosen);
    }
    
    
    // Methods for field "dummy"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithDummy(long dummy)
    {
	return createSIBSb_TypeAndTagWithDummy(new CellValueTag(dummy));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithDummy(CellValueTag dummy)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setDummy(dummy);
	return __object;
    }
    
    public boolean hasDummy()
    {
	return getChosenFlag() == dummy_chosen;
    }
    
    public void setDummy(long dummy)
    {
	setDummy(new CellValueTag(dummy));
    }
    
    public void setDummy(CellValueTag dummy)
    {
	setChosenValue(dummy);
	setChosenFlag(dummy_chosen);
    }
    
    
    // Methods for field "dummy2"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithDummy2(Null dummy2)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setDummy2(dummy2);
	return __object;
    }
    
    public boolean hasDummy2()
    {
	return getChosenFlag() == dummy2_chosen;
    }
    
    public void setDummy2(Null dummy2)
    {
	setChosenValue(dummy2);
	setChosenFlag(dummy2_chosen);
    }
    
    
    // Methods for field "dummy3"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithDummy3(Null dummy3)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setDummy3(dummy3);
	return __object;
    }
    
    public boolean hasDummy3()
    {
	return getChosenFlag() == dummy3_chosen;
    }
    
    public void setDummy3(Null dummy3)
    {
	setChosenValue(dummy3);
	setChosenFlag(dummy3_chosen);
    }
    
    
    // Methods for field "sysInfoType11"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType11(long sysInfoType11)
    {
	return createSIBSb_TypeAndTagWithSysInfoType11(new CellValueTag(sysInfoType11));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType11(CellValueTag sysInfoType11)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType11(sysInfoType11);
	return __object;
    }
    
    public boolean hasSysInfoType11()
    {
	return getChosenFlag() == sysInfoType11_chosen;
    }
    
    public void setSysInfoType11(long sysInfoType11)
    {
	setSysInfoType11(new CellValueTag(sysInfoType11));
    }
    
    public void setSysInfoType11(CellValueTag sysInfoType11)
    {
	setChosenValue(sysInfoType11);
	setChosenFlag(sysInfoType11_chosen);
    }
    
    
    // Methods for field "sysInfoType12"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType12(long sysInfoType12)
    {
	return createSIBSb_TypeAndTagWithSysInfoType12(new CellValueTag(sysInfoType12));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType12(CellValueTag sysInfoType12)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType12(sysInfoType12);
	return __object;
    }
    
    public boolean hasSysInfoType12()
    {
	return getChosenFlag() == sysInfoType12_chosen;
    }
    
    public void setSysInfoType12(long sysInfoType12)
    {
	setSysInfoType12(new CellValueTag(sysInfoType12));
    }
    
    public void setSysInfoType12(CellValueTag sysInfoType12)
    {
	setChosenValue(sysInfoType12);
	setChosenFlag(sysInfoType12_chosen);
    }
    
    
    // Methods for field "sysInfoType13"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13(long sysInfoType13)
    {
	return createSIBSb_TypeAndTagWithSysInfoType13(new CellValueTag(sysInfoType13));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13(CellValueTag sysInfoType13)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType13(sysInfoType13);
	return __object;
    }
    
    public boolean hasSysInfoType13()
    {
	return getChosenFlag() == sysInfoType13_chosen;
    }
    
    public void setSysInfoType13(long sysInfoType13)
    {
	setSysInfoType13(new CellValueTag(sysInfoType13));
    }
    
    public void setSysInfoType13(CellValueTag sysInfoType13)
    {
	setChosenValue(sysInfoType13);
	setChosenFlag(sysInfoType13_chosen);
    }
    
    
    // Methods for field "sysInfoType13_1"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_1(long sysInfoType13_1)
    {
	return createSIBSb_TypeAndTagWithSysInfoType13_1(new CellValueTag(sysInfoType13_1));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_1(CellValueTag sysInfoType13_1)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType13_1(sysInfoType13_1);
	return __object;
    }
    
    public boolean hasSysInfoType13_1()
    {
	return getChosenFlag() == sysInfoType13_1_chosen;
    }
    
    public void setSysInfoType13_1(long sysInfoType13_1)
    {
	setSysInfoType13_1(new CellValueTag(sysInfoType13_1));
    }
    
    public void setSysInfoType13_1(CellValueTag sysInfoType13_1)
    {
	setChosenValue(sysInfoType13_1);
	setChosenFlag(sysInfoType13_1_chosen);
    }
    
    
    // Methods for field "sysInfoType13_2"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_2(long sysInfoType13_2)
    {
	return createSIBSb_TypeAndTagWithSysInfoType13_2(new CellValueTag(sysInfoType13_2));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_2(CellValueTag sysInfoType13_2)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType13_2(sysInfoType13_2);
	return __object;
    }
    
    public boolean hasSysInfoType13_2()
    {
	return getChosenFlag() == sysInfoType13_2_chosen;
    }
    
    public void setSysInfoType13_2(long sysInfoType13_2)
    {
	setSysInfoType13_2(new CellValueTag(sysInfoType13_2));
    }
    
    public void setSysInfoType13_2(CellValueTag sysInfoType13_2)
    {
	setChosenValue(sysInfoType13_2);
	setChosenFlag(sysInfoType13_2_chosen);
    }
    
    
    // Methods for field "sysInfoType13_3"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_3(long sysInfoType13_3)
    {
	return createSIBSb_TypeAndTagWithSysInfoType13_3(new CellValueTag(sysInfoType13_3));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_3(CellValueTag sysInfoType13_3)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType13_3(sysInfoType13_3);
	return __object;
    }
    
    public boolean hasSysInfoType13_3()
    {
	return getChosenFlag() == sysInfoType13_3_chosen;
    }
    
    public void setSysInfoType13_3(long sysInfoType13_3)
    {
	setSysInfoType13_3(new CellValueTag(sysInfoType13_3));
    }
    
    public void setSysInfoType13_3(CellValueTag sysInfoType13_3)
    {
	setChosenValue(sysInfoType13_3);
	setChosenFlag(sysInfoType13_3_chosen);
    }
    
    
    // Methods for field "sysInfoType13_4"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_4(long sysInfoType13_4)
    {
	return createSIBSb_TypeAndTagWithSysInfoType13_4(new CellValueTag(sysInfoType13_4));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType13_4(CellValueTag sysInfoType13_4)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType13_4(sysInfoType13_4);
	return __object;
    }
    
    public boolean hasSysInfoType13_4()
    {
	return getChosenFlag() == sysInfoType13_4_chosen;
    }
    
    public void setSysInfoType13_4(long sysInfoType13_4)
    {
	setSysInfoType13_4(new CellValueTag(sysInfoType13_4));
    }
    
    public void setSysInfoType13_4(CellValueTag sysInfoType13_4)
    {
	setChosenValue(sysInfoType13_4);
	setChosenFlag(sysInfoType13_4_chosen);
    }
    
    
    // Methods for field "sysInfoType14"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType14(Null sysInfoType14)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType14(sysInfoType14);
	return __object;
    }
    
    public boolean hasSysInfoType14()
    {
	return getChosenFlag() == sysInfoType14_chosen;
    }
    
    public void setSysInfoType14(Null sysInfoType14)
    {
	setChosenValue(sysInfoType14);
	setChosenFlag(sysInfoType14_chosen);
    }
    
    
    // Methods for field "sysInfoType15"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15(long sysInfoType15)
    {
	return createSIBSb_TypeAndTagWithSysInfoType15(new CellValueTag(sysInfoType15));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15(CellValueTag sysInfoType15)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType15(sysInfoType15);
	return __object;
    }
    
    public boolean hasSysInfoType15()
    {
	return getChosenFlag() == sysInfoType15_chosen;
    }
    
    public void setSysInfoType15(long sysInfoType15)
    {
	setSysInfoType15(new CellValueTag(sysInfoType15));
    }
    
    public void setSysInfoType15(CellValueTag sysInfoType15)
    {
	setChosenValue(sysInfoType15);
	setChosenFlag(sysInfoType15_chosen);
    }
    
    
    // Methods for field "sysInfoType16"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType16(PredefinedConfigIdentityAndValueTag sysInfoType16)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType16(sysInfoType16);
	return __object;
    }
    
    public boolean hasSysInfoType16()
    {
	return getChosenFlag() == sysInfoType16_chosen;
    }
    
    public void setSysInfoType16(PredefinedConfigIdentityAndValueTag sysInfoType16)
    {
	setChosenValue(sysInfoType16);
	setChosenFlag(sysInfoType16_chosen);
    }
    
    
    // Methods for field "sysInfoType17"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType17(Null sysInfoType17)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType17(sysInfoType17);
	return __object;
    }
    
    public boolean hasSysInfoType17()
    {
	return getChosenFlag() == sysInfoType17_chosen;
    }
    
    public void setSysInfoType17(Null sysInfoType17)
    {
	setChosenValue(sysInfoType17);
	setChosenFlag(sysInfoType17_chosen);
    }
    
    
    // Methods for field "sysInfoTypeSB1"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoTypeSB1(long sysInfoTypeSB1)
    {
	return createSIBSb_TypeAndTagWithSysInfoTypeSB1(new CellValueTag(sysInfoTypeSB1));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoTypeSB1(CellValueTag sysInfoTypeSB1)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoTypeSB1(sysInfoTypeSB1);
	return __object;
    }
    
    public boolean hasSysInfoTypeSB1()
    {
	return getChosenFlag() == sysInfoTypeSB1_chosen;
    }
    
    public void setSysInfoTypeSB1(long sysInfoTypeSB1)
    {
	setSysInfoTypeSB1(new CellValueTag(sysInfoTypeSB1));
    }
    
    public void setSysInfoTypeSB1(CellValueTag sysInfoTypeSB1)
    {
	setChosenValue(sysInfoTypeSB1);
	setChosenFlag(sysInfoTypeSB1_chosen);
    }
    
    
    // Methods for field "sysInfoTypeSB2"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoTypeSB2(long sysInfoTypeSB2)
    {
	return createSIBSb_TypeAndTagWithSysInfoTypeSB2(new CellValueTag(sysInfoTypeSB2));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoTypeSB2(CellValueTag sysInfoTypeSB2)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoTypeSB2(sysInfoTypeSB2);
	return __object;
    }
    
    public boolean hasSysInfoTypeSB2()
    {
	return getChosenFlag() == sysInfoTypeSB2_chosen;
    }
    
    public void setSysInfoTypeSB2(long sysInfoTypeSB2)
    {
	setSysInfoTypeSB2(new CellValueTag(sysInfoTypeSB2));
    }
    
    public void setSysInfoTypeSB2(CellValueTag sysInfoTypeSB2)
    {
	setChosenValue(sysInfoTypeSB2);
	setChosenFlag(sysInfoTypeSB2_chosen);
    }
    
    
    // Methods for field "sysInfoType15_1"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_1(long sysInfoType15_1)
    {
	return createSIBSb_TypeAndTagWithSysInfoType15_1(new CellValueTag(sysInfoType15_1));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_1(CellValueTag sysInfoType15_1)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType15_1(sysInfoType15_1);
	return __object;
    }
    
    public boolean hasSysInfoType15_1()
    {
	return getChosenFlag() == sysInfoType15_1_chosen;
    }
    
    public void setSysInfoType15_1(long sysInfoType15_1)
    {
	setSysInfoType15_1(new CellValueTag(sysInfoType15_1));
    }
    
    public void setSysInfoType15_1(CellValueTag sysInfoType15_1)
    {
	setChosenValue(sysInfoType15_1);
	setChosenFlag(sysInfoType15_1_chosen);
    }
    
    
    // Methods for field "sysInfoType15_2"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_2(SIBOccurrenceIdentityAndValueTag sysInfoType15_2)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType15_2(sysInfoType15_2);
	return __object;
    }
    
    public boolean hasSysInfoType15_2()
    {
	return getChosenFlag() == sysInfoType15_2_chosen;
    }
    
    public void setSysInfoType15_2(SIBOccurrenceIdentityAndValueTag sysInfoType15_2)
    {
	setChosenValue(sysInfoType15_2);
	setChosenFlag(sysInfoType15_2_chosen);
    }
    
    
    // Methods for field "sysInfoType15_3"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_3(SIBOccurrenceIdentityAndValueTag sysInfoType15_3)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType15_3(sysInfoType15_3);
	return __object;
    }
    
    public boolean hasSysInfoType15_3()
    {
	return getChosenFlag() == sysInfoType15_3_chosen;
    }
    
    public void setSysInfoType15_3(SIBOccurrenceIdentityAndValueTag sysInfoType15_3)
    {
	setChosenValue(sysInfoType15_3);
	setChosenFlag(sysInfoType15_3_chosen);
    }
    
    
    // Methods for field "sysInfoType15_4"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_4(long sysInfoType15_4)
    {
	return createSIBSb_TypeAndTagWithSysInfoType15_4(new CellValueTag(sysInfoType15_4));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_4(CellValueTag sysInfoType15_4)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType15_4(sysInfoType15_4);
	return __object;
    }
    
    public boolean hasSysInfoType15_4()
    {
	return getChosenFlag() == sysInfoType15_4_chosen;
    }
    
    public void setSysInfoType15_4(long sysInfoType15_4)
    {
	setSysInfoType15_4(new CellValueTag(sysInfoType15_4));
    }
    
    public void setSysInfoType15_4(CellValueTag sysInfoType15_4)
    {
	setChosenValue(sysInfoType15_4);
	setChosenFlag(sysInfoType15_4_chosen);
    }
    
    
    // Methods for field "sysInfoType18"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType18(long sysInfoType18)
    {
	return createSIBSb_TypeAndTagWithSysInfoType18(new CellValueTag(sysInfoType18));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType18(CellValueTag sysInfoType18)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType18(sysInfoType18);
	return __object;
    }
    
    public boolean hasSysInfoType18()
    {
	return getChosenFlag() == sysInfoType18_chosen;
    }
    
    public void setSysInfoType18(long sysInfoType18)
    {
	setSysInfoType18(new CellValueTag(sysInfoType18));
    }
    
    public void setSysInfoType18(CellValueTag sysInfoType18)
    {
	setChosenValue(sysInfoType18);
	setChosenFlag(sysInfoType18_chosen);
    }
    
    
    // Methods for field "sysInfoType15_5"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_5(long sysInfoType15_5)
    {
	return createSIBSb_TypeAndTagWithSysInfoType15_5(new CellValueTag(sysInfoType15_5));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType15_5(CellValueTag sysInfoType15_5)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType15_5(sysInfoType15_5);
	return __object;
    }
    
    public boolean hasSysInfoType15_5()
    {
	return getChosenFlag() == sysInfoType15_5_chosen;
    }
    
    public void setSysInfoType15_5(long sysInfoType15_5)
    {
	setSysInfoType15_5(new CellValueTag(sysInfoType15_5));
    }
    
    public void setSysInfoType15_5(CellValueTag sysInfoType15_5)
    {
	setChosenValue(sysInfoType15_5);
	setChosenFlag(sysInfoType15_5_chosen);
    }
    
    
    // Methods for field "sysInfoType5bis"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType5bis(long sysInfoType5bis)
    {
	return createSIBSb_TypeAndTagWithSysInfoType5bis(new CellValueTag(sysInfoType5bis));
    }
    
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSysInfoType5bis(CellValueTag sysInfoType5bis)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

	__object.setSysInfoType5bis(sysInfoType5bis);
	return __object;
    }
    
    public boolean hasSysInfoType5bis()
    {
	return getChosenFlag() == sysInfoType5bis_chosen;
    }
    
    public void setSysInfoType5bis(long sysInfoType5bis)
    {
	setSysInfoType5bis(new CellValueTag(sysInfoType5bis));
    }
    
    public void setSysInfoType5bis(CellValueTag sysInfoType5bis)
    {
	setChosenValue(sysInfoType5bis);
	setChosenFlag(sysInfoType5bis_chosen);
    }
    
    
    // Methods for field "spare2"
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSpare2(Null spare2)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

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
    public static SIBSb_TypeAndTag createSIBSb_TypeAndTagWithSpare1(Null spare1)
    {
	SIBSb_TypeAndTag __object = new SIBSb_TypeAndTag();

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
	    case sysInfoType1_chosen:
		return new PLMN_ValueTag();
	    case sysInfoType2_chosen:
		return new CellValueTag();
	    case sysInfoType3_chosen:
		return new CellValueTag();
	    case sysInfoType4_chosen:
		return new CellValueTag();
	    case sysInfoType5_chosen:
		return new CellValueTag();
	    case sysInfoType6_chosen:
		return new CellValueTag();
	    case sysInfoType7_chosen:
		return new Null();
	    case dummy_chosen:
		return new CellValueTag();
	    case dummy2_chosen:
		return new Null();
	    case dummy3_chosen:
		return new Null();
	    case sysInfoType11_chosen:
		return new CellValueTag();
	    case sysInfoType12_chosen:
		return new CellValueTag();
	    case sysInfoType13_chosen:
		return new CellValueTag();
	    case sysInfoType13_1_chosen:
		return new CellValueTag();
	    case sysInfoType13_2_chosen:
		return new CellValueTag();
	    case sysInfoType13_3_chosen:
		return new CellValueTag();
	    case sysInfoType13_4_chosen:
		return new CellValueTag();
	    case sysInfoType14_chosen:
		return new Null();
	    case sysInfoType15_chosen:
		return new CellValueTag();
	    case sysInfoType16_chosen:
		return new PredefinedConfigIdentityAndValueTag();
	    case sysInfoType17_chosen:
		return new Null();
	    case sysInfoTypeSB1_chosen:
		return new CellValueTag();
	    case sysInfoTypeSB2_chosen:
		return new CellValueTag();
	    case sysInfoType15_1_chosen:
		return new CellValueTag();
	    case sysInfoType15_2_chosen:
		return new SIBOccurrenceIdentityAndValueTag();
	    case sysInfoType15_3_chosen:
		return new SIBOccurrenceIdentityAndValueTag();
	    case sysInfoType15_4_chosen:
		return new CellValueTag();
	    case sysInfoType18_chosen:
		return new CellValueTag();
	    case sysInfoType15_5_chosen:
		return new CellValueTag();
	    case sysInfoType5bis_chosen:
		return new CellValueTag();
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "SIBSb_TypeAndTag"
	),
	new QName (
	    "InformationElements",
	    "SIBSb-TypeAndTag"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PLMN_ValueTag"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-ValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PLMN_ValueTag(1), 
				    new PLMN_ValueTag(256),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(256)
			    ),
			    null
			)
		    ),
		    "sysInfoType1",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType2",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType3",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType4",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType5",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType6",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "sysInfoType7",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "dummy",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "dummy2",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "dummy3",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType11",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType12",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType13",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType13-1",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType13-2",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType13-3",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType13-4",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
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
		    "sysInfoType14",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType15",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PredefinedConfigIdentityAndValueTag"
			    ),
			    new QName (
				"InformationElements",
				"PredefinedConfigIdentityAndValueTag"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PredefinedConfigIdentityAndValueTag"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PredefinedConfigIdentityAndValueTag"
				)
			    ),
			    0
			)
		    ),
		    "sysInfoType16",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
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
		    "sysInfoType17",
		    20,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoTypeSB1",
		    21,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoTypeSB2",
		    22,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType15-1",
		    23,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SIBOccurrenceIdentityAndValueTag"
			    ),
			    new QName (
				"InformationElements",
				"SIBOccurrenceIdentityAndValueTag"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SIBOccurrenceIdentityAndValueTag"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SIBOccurrenceIdentityAndValueTag"
				)
			    ),
			    0
			)
		    ),
		    "sysInfoType15-2",
		    24,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SIBOccurrenceIdentityAndValueTag"
			    ),
			    new QName (
				"InformationElements",
				"SIBOccurrenceIdentityAndValueTag"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SIBOccurrenceIdentityAndValueTag"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SIBOccurrenceIdentityAndValueTag"
				)
			    ),
			    0
			)
		    ),
		    "sysInfoType15-3",
		    25,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType15-4",
		    26,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType18",
		    27,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType15-5",
		    28,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sysInfoType5bis",
		    29,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
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
		    30,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
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
		    31,
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
		new TagDecoderElement((short)0x800f, 15),
		new TagDecoderElement((short)0x8010, 16),
		new TagDecoderElement((short)0x8011, 17),
		new TagDecoderElement((short)0x8012, 18),
		new TagDecoderElement((short)0x8013, 19),
		new TagDecoderElement((short)0x8014, 20),
		new TagDecoderElement((short)0x8015, 21),
		new TagDecoderElement((short)0x8016, 22),
		new TagDecoderElement((short)0x8017, 23),
		new TagDecoderElement((short)0x8018, 24),
		new TagDecoderElement((short)0x8019, 25),
		new TagDecoderElement((short)0x801a, 26),
		new TagDecoderElement((short)0x801b, 27),
		new TagDecoderElement((short)0x801c, 28),
		new TagDecoderElement((short)0x801d, 29),
		new TagDecoderElement((short)0x801e, 30),
		new TagDecoderElement((short)0x801f, 31)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SIBSb_TypeAndTag object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SIBSb_TypeAndTag object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SIBSb_TypeAndTag
