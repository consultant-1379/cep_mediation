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
 * Define the ASN1 Type U_RNTI_Group from ASN1 Module InformationElements.
 * @see Choice
 */

public class U_RNTI_Group extends Choice {
    
    /**
     * The default constructor.
     */
    public U_RNTI_Group()
    {
    }
    
    public static final  int  all_chosen = 1;
    public static final  int  u_RNTI_BitMaskIndex_b1_chosen = 2;
    public static final  int  u_RNTI_BitMaskIndex_b2_chosen = 3;
    public static final  int  u_RNTI_BitMaskIndex_b3_chosen = 4;
    public static final  int  u_RNTI_BitMaskIndex_b4_chosen = 5;
    public static final  int  u_RNTI_BitMaskIndex_b5_chosen = 6;
    public static final  int  u_RNTI_BitMaskIndex_b6_chosen = 7;
    public static final  int  u_RNTI_BitMaskIndex_b7_chosen = 8;
    public static final  int  u_RNTI_BitMaskIndex_b8_chosen = 9;
    public static final  int  u_RNTI_BitMaskIndex_b9_chosen = 10;
    public static final  int  u_RNTI_BitMaskIndex_b10_chosen = 11;
    public static final  int  u_RNTI_BitMaskIndex_b11_chosen = 12;
    public static final  int  u_RNTI_BitMaskIndex_b12_chosen = 13;
    public static final  int  u_RNTI_BitMaskIndex_b13_chosen = 14;
    public static final  int  u_RNTI_BitMaskIndex_b14_chosen = 15;
    public static final  int  u_RNTI_BitMaskIndex_b15_chosen = 16;
    public static final  int  u_RNTI_BitMaskIndex_b16_chosen = 17;
    public static final  int  u_RNTI_BitMaskIndex_b17_chosen = 18;
    public static final  int  u_RNTI_BitMaskIndex_b18_chosen = 19;
    public static final  int  u_RNTI_BitMaskIndex_b19_chosen = 20;
    public static final  int  u_RNTI_BitMaskIndex_b20_chosen = 21;
    public static final  int  u_RNTI_BitMaskIndex_b21_chosen = 22;
    public static final  int  u_RNTI_BitMaskIndex_b22_chosen = 23;
    public static final  int  u_RNTI_BitMaskIndex_b23_chosen = 24;
    public static final  int  u_RNTI_BitMaskIndex_b24_chosen = 25;
    public static final  int  u_RNTI_BitMaskIndex_b25_chosen = 26;
    public static final  int  u_RNTI_BitMaskIndex_b26_chosen = 27;
    public static final  int  u_RNTI_BitMaskIndex_b27_chosen = 28;
    public static final  int  u_RNTI_BitMaskIndex_b28_chosen = 29;
    public static final  int  u_RNTI_BitMaskIndex_b29_chosen = 30;
    public static final  int  u_RNTI_BitMaskIndex_b30_chosen = 31;
    public static final  int  u_RNTI_BitMaskIndex_b31_chosen = 32;
    
    // Methods for field "all"
    public static U_RNTI_Group createU_RNTI_GroupWithAll(Null all)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setAll(all);
	return __object;
    }
    
    public boolean hasAll()
    {
	return getChosenFlag() == all_chosen;
    }
    
    public void setAll(Null all)
    {
	setChosenValue(all);
	setChosenFlag(all_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b1"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b1(BitString u_RNTI_BitMaskIndex_b1)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b1(u_RNTI_BitMaskIndex_b1);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b1()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b1_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b1(BitString u_RNTI_BitMaskIndex_b1)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b1);
	setChosenFlag(u_RNTI_BitMaskIndex_b1_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b2"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b2(BitString u_RNTI_BitMaskIndex_b2)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b2(u_RNTI_BitMaskIndex_b2);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b2()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b2_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b2(BitString u_RNTI_BitMaskIndex_b2)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b2);
	setChosenFlag(u_RNTI_BitMaskIndex_b2_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b3"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b3(BitString u_RNTI_BitMaskIndex_b3)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b3(u_RNTI_BitMaskIndex_b3);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b3()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b3_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b3(BitString u_RNTI_BitMaskIndex_b3)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b3);
	setChosenFlag(u_RNTI_BitMaskIndex_b3_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b4"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b4(BitString u_RNTI_BitMaskIndex_b4)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b4(u_RNTI_BitMaskIndex_b4);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b4()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b4_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b4(BitString u_RNTI_BitMaskIndex_b4)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b4);
	setChosenFlag(u_RNTI_BitMaskIndex_b4_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b5"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b5(BitString u_RNTI_BitMaskIndex_b5)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b5(u_RNTI_BitMaskIndex_b5);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b5()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b5_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b5(BitString u_RNTI_BitMaskIndex_b5)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b5);
	setChosenFlag(u_RNTI_BitMaskIndex_b5_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b6"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b6(BitString u_RNTI_BitMaskIndex_b6)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b6(u_RNTI_BitMaskIndex_b6);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b6()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b6_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b6(BitString u_RNTI_BitMaskIndex_b6)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b6);
	setChosenFlag(u_RNTI_BitMaskIndex_b6_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b7"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b7(BitString u_RNTI_BitMaskIndex_b7)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b7(u_RNTI_BitMaskIndex_b7);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b7()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b7_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b7(BitString u_RNTI_BitMaskIndex_b7)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b7);
	setChosenFlag(u_RNTI_BitMaskIndex_b7_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b8"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b8(BitString u_RNTI_BitMaskIndex_b8)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b8(u_RNTI_BitMaskIndex_b8);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b8()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b8_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b8(BitString u_RNTI_BitMaskIndex_b8)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b8);
	setChosenFlag(u_RNTI_BitMaskIndex_b8_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b9"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b9(BitString u_RNTI_BitMaskIndex_b9)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b9(u_RNTI_BitMaskIndex_b9);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b9()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b9_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b9(BitString u_RNTI_BitMaskIndex_b9)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b9);
	setChosenFlag(u_RNTI_BitMaskIndex_b9_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b10"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b10(BitString u_RNTI_BitMaskIndex_b10)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b10(u_RNTI_BitMaskIndex_b10);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b10()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b10_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b10(BitString u_RNTI_BitMaskIndex_b10)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b10);
	setChosenFlag(u_RNTI_BitMaskIndex_b10_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b11"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b11(BitString u_RNTI_BitMaskIndex_b11)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b11(u_RNTI_BitMaskIndex_b11);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b11()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b11_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b11(BitString u_RNTI_BitMaskIndex_b11)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b11);
	setChosenFlag(u_RNTI_BitMaskIndex_b11_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b12"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b12(BitString u_RNTI_BitMaskIndex_b12)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b12(u_RNTI_BitMaskIndex_b12);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b12()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b12_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b12(BitString u_RNTI_BitMaskIndex_b12)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b12);
	setChosenFlag(u_RNTI_BitMaskIndex_b12_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b13"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b13(BitString u_RNTI_BitMaskIndex_b13)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b13(u_RNTI_BitMaskIndex_b13);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b13()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b13_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b13(BitString u_RNTI_BitMaskIndex_b13)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b13);
	setChosenFlag(u_RNTI_BitMaskIndex_b13_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b14"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b14(BitString u_RNTI_BitMaskIndex_b14)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b14(u_RNTI_BitMaskIndex_b14);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b14()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b14_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b14(BitString u_RNTI_BitMaskIndex_b14)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b14);
	setChosenFlag(u_RNTI_BitMaskIndex_b14_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b15"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b15(BitString u_RNTI_BitMaskIndex_b15)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b15(u_RNTI_BitMaskIndex_b15);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b15()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b15_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b15(BitString u_RNTI_BitMaskIndex_b15)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b15);
	setChosenFlag(u_RNTI_BitMaskIndex_b15_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b16"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b16(BitString u_RNTI_BitMaskIndex_b16)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b16(u_RNTI_BitMaskIndex_b16);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b16()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b16_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b16(BitString u_RNTI_BitMaskIndex_b16)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b16);
	setChosenFlag(u_RNTI_BitMaskIndex_b16_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b17"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b17(BitString u_RNTI_BitMaskIndex_b17)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b17(u_RNTI_BitMaskIndex_b17);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b17()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b17_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b17(BitString u_RNTI_BitMaskIndex_b17)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b17);
	setChosenFlag(u_RNTI_BitMaskIndex_b17_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b18"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b18(BitString u_RNTI_BitMaskIndex_b18)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b18(u_RNTI_BitMaskIndex_b18);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b18()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b18_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b18(BitString u_RNTI_BitMaskIndex_b18)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b18);
	setChosenFlag(u_RNTI_BitMaskIndex_b18_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b19"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b19(BitString u_RNTI_BitMaskIndex_b19)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b19(u_RNTI_BitMaskIndex_b19);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b19()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b19_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b19(BitString u_RNTI_BitMaskIndex_b19)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b19);
	setChosenFlag(u_RNTI_BitMaskIndex_b19_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b20"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b20(BitString u_RNTI_BitMaskIndex_b20)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b20(u_RNTI_BitMaskIndex_b20);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b20()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b20_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b20(BitString u_RNTI_BitMaskIndex_b20)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b20);
	setChosenFlag(u_RNTI_BitMaskIndex_b20_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b21"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b21(BitString u_RNTI_BitMaskIndex_b21)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b21(u_RNTI_BitMaskIndex_b21);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b21()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b21_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b21(BitString u_RNTI_BitMaskIndex_b21)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b21);
	setChosenFlag(u_RNTI_BitMaskIndex_b21_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b22"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b22(BitString u_RNTI_BitMaskIndex_b22)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b22(u_RNTI_BitMaskIndex_b22);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b22()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b22_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b22(BitString u_RNTI_BitMaskIndex_b22)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b22);
	setChosenFlag(u_RNTI_BitMaskIndex_b22_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b23"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b23(BitString u_RNTI_BitMaskIndex_b23)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b23(u_RNTI_BitMaskIndex_b23);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b23()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b23_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b23(BitString u_RNTI_BitMaskIndex_b23)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b23);
	setChosenFlag(u_RNTI_BitMaskIndex_b23_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b24"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b24(BitString u_RNTI_BitMaskIndex_b24)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b24(u_RNTI_BitMaskIndex_b24);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b24()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b24_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b24(BitString u_RNTI_BitMaskIndex_b24)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b24);
	setChosenFlag(u_RNTI_BitMaskIndex_b24_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b25"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b25(BitString u_RNTI_BitMaskIndex_b25)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b25(u_RNTI_BitMaskIndex_b25);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b25()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b25_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b25(BitString u_RNTI_BitMaskIndex_b25)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b25);
	setChosenFlag(u_RNTI_BitMaskIndex_b25_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b26"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b26(BitString u_RNTI_BitMaskIndex_b26)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b26(u_RNTI_BitMaskIndex_b26);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b26()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b26_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b26(BitString u_RNTI_BitMaskIndex_b26)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b26);
	setChosenFlag(u_RNTI_BitMaskIndex_b26_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b27"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b27(BitString u_RNTI_BitMaskIndex_b27)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b27(u_RNTI_BitMaskIndex_b27);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b27()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b27_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b27(BitString u_RNTI_BitMaskIndex_b27)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b27);
	setChosenFlag(u_RNTI_BitMaskIndex_b27_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b28"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b28(BitString u_RNTI_BitMaskIndex_b28)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b28(u_RNTI_BitMaskIndex_b28);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b28()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b28_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b28(BitString u_RNTI_BitMaskIndex_b28)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b28);
	setChosenFlag(u_RNTI_BitMaskIndex_b28_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b29"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b29(BitString u_RNTI_BitMaskIndex_b29)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b29(u_RNTI_BitMaskIndex_b29);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b29()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b29_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b29(BitString u_RNTI_BitMaskIndex_b29)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b29);
	setChosenFlag(u_RNTI_BitMaskIndex_b29_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b30"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b30(BitString u_RNTI_BitMaskIndex_b30)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b30(u_RNTI_BitMaskIndex_b30);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b30()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b30_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b30(BitString u_RNTI_BitMaskIndex_b30)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b30);
	setChosenFlag(u_RNTI_BitMaskIndex_b30_chosen);
    }
    
    
    // Methods for field "u_RNTI_BitMaskIndex_b31"
    public static U_RNTI_Group createU_RNTI_GroupWithU_RNTI_BitMaskIndex_b31(BitString u_RNTI_BitMaskIndex_b31)
    {
	U_RNTI_Group __object = new U_RNTI_Group();

	__object.setU_RNTI_BitMaskIndex_b31(u_RNTI_BitMaskIndex_b31);
	return __object;
    }
    
    public boolean hasU_RNTI_BitMaskIndex_b31()
    {
	return getChosenFlag() == u_RNTI_BitMaskIndex_b31_chosen;
    }
    
    public void setU_RNTI_BitMaskIndex_b31(BitString u_RNTI_BitMaskIndex_b31)
    {
	setChosenValue(u_RNTI_BitMaskIndex_b31);
	setChosenFlag(u_RNTI_BitMaskIndex_b31_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case all_chosen:
		return new Null();
	    case u_RNTI_BitMaskIndex_b1_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b2_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b3_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b4_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b5_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b6_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b7_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b8_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b9_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b10_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b11_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b12_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b13_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b14_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b15_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b16_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b17_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b18_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b19_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b20_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b21_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b22_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b23_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b24_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b25_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b26_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b27_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b28_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b29_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b30_chosen:
		return new BitString();
	    case u_RNTI_BitMaskIndex_b31_chosen:
		return new BitString();
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
	    "U_RNTI_Group"
	),
	new QName (
	    "InformationElements",
	    "U-RNTI-Group"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "all",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(31)
				)
			    ),
			    new Bounds (
				new java.lang.Long(31),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b1",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(30)
				)
			    ),
			    new Bounds (
				new java.lang.Long(30),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b2",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(29)
				)
			    ),
			    new Bounds (
				new java.lang.Long(29),
				new java.lang.Long(29)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b3",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b4",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(27)
				)
			    ),
			    new Bounds (
				new java.lang.Long(27),
				new java.lang.Long(27)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b5",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(26)
				)
			    ),
			    new Bounds (
				new java.lang.Long(26),
				new java.lang.Long(26)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b6",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(25)
				)
			    ),
			    new Bounds (
				new java.lang.Long(25),
				new java.lang.Long(25)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b7",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(24)
				)
			    ),
			    new Bounds (
				new java.lang.Long(24),
				new java.lang.Long(24)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b8",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(23)
				)
			    ),
			    new Bounds (
				new java.lang.Long(23),
				new java.lang.Long(23)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b9",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(22)
				)
			    ),
			    new Bounds (
				new java.lang.Long(22),
				new java.lang.Long(22)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b10",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(21)
				)
			    ),
			    new Bounds (
				new java.lang.Long(21),
				new java.lang.Long(21)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b11",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(20)
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b12",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(19)
				)
			    ),
			    new Bounds (
				new java.lang.Long(19),
				new java.lang.Long(19)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b13",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(18)
				)
			    ),
			    new Bounds (
				new java.lang.Long(18),
				new java.lang.Long(18)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b14",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(17)
				)
			    ),
			    new Bounds (
				new java.lang.Long(17),
				new java.lang.Long(17)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b15",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b16",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(15)
				)
			    ),
			    new Bounds (
				new java.lang.Long(15),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b17",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(14)
				)
			    ),
			    new Bounds (
				new java.lang.Long(14),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b18",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b19",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b20",
		    20,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(11)
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(11)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b21",
		    21,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(10)
				)
			    ),
			    new Bounds (
				new java.lang.Long(10),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b22",
		    22,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(9)
				)
			    ),
			    new Bounds (
				new java.lang.Long(9),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b23",
		    23,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b24",
		    24,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(7)
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b25",
		    25,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(6)
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b26",
		    26,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(5)
				)
			    ),
			    new Bounds (
				new java.lang.Long(5),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b27",
		    27,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b28",
		    28,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801d
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(3)
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b29",
		    29,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b30",
		    30,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(1)
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "u-RNTI-BitMaskIndex-b31",
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
     * Get the type descriptor (TypeInfo) of 'this' U_RNTI_Group object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' U_RNTI_Group object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for U_RNTI_Group
