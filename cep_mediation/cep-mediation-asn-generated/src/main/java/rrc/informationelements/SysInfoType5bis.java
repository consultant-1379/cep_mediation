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
 * Define the ASN1 Type SysInfoType5bis from ASN1 Module InformationElements.
 * @see SysInfoType5
 */

public class SysInfoType5bis extends SysInfoType5 {
    
    /**
     * The default constructor.
     */
    public SysInfoType5bis()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5bis(BOOLEAN sib6indicator, 
		    PICH_PowerOffset pich_PowerOffset, 
		    SysInfoType5.ModeSpecificInfo modeSpecificInfo, 
		    PrimaryCCPCH_Info primaryCCPCH_Info, 
		    PRACH_SystemInformationList prach_SystemInformationList, 
		    SCCPCH_SystemInformationList sCCPCH_SystemInformationList, 
		    CBS_DRX_Level1Information cbs_DRX_Level1Information, 
		    SysInfoType5.V4b0NCEs v4b0NCEs)
    {
	super(sib6indicator, pich_PowerOffset, modeSpecificInfo, 
	      primaryCCPCH_Info, prach_SystemInformationList, 
	      sCCPCH_SystemInformationList, cbs_DRX_Level1Information, 
	      v4b0NCEs);
    }
    
    /**
     * Construct with components.
     */
    public SysInfoType5bis(boolean sib6indicator, 
		    PICH_PowerOffset pich_PowerOffset, 
		    SysInfoType5.ModeSpecificInfo modeSpecificInfo, 
		    PrimaryCCPCH_Info primaryCCPCH_Info, 
		    PRACH_SystemInformationList prach_SystemInformationList, 
		    SCCPCH_SystemInformationList sCCPCH_SystemInformationList, 
		    CBS_DRX_Level1Information cbs_DRX_Level1Information, 
		    SysInfoType5.V4b0NCEs v4b0NCEs)
    {
	super(new BOOLEAN(sib6indicator), pich_PowerOffset, 
	      modeSpecificInfo, primaryCCPCH_Info, 
	      prach_SystemInformationList, sCCPCH_SystemInformationList, 
	      cbs_DRX_Level1Information, v4b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType5bis(boolean sib6indicator, 
		    PICH_PowerOffset pich_PowerOffset, 
		    SysInfoType5.ModeSpecificInfo modeSpecificInfo, 
		    PRACH_SystemInformationList prach_SystemInformationList, 
		    SCCPCH_SystemInformationList sCCPCH_SystemInformationList)
    {
	super(sib6indicator, pich_PowerOffset, modeSpecificInfo, 
	      prach_SystemInformationList, sCCPCH_SystemInformationList);
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
	    "SysInfoType5bis"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5bis"
	),
	12314,
	null,
	new FieldsRef (
	    new QName (
		"rrc.informationelements",
		"SysInfoType5"
	    )
	),
	0,
	new TagDecodersRef (
	    new QName (
		"rrc.informationelements",
		"SysInfoType5"
	    )
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5bis object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5bis object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for SysInfoType5bis
