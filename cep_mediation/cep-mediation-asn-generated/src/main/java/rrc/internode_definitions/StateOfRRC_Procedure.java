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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type StateOfRRC_Procedure from ASN1 Module Internode_definitions.
 * @see Enumerated
 */

public final class StateOfRRC_Procedure extends Enumerated {
    
    /**
     * The default constructor.
     */
    private StateOfRRC_Procedure()
    {
	super(cFirstNumber);
    }
    
    protected StateOfRRC_Procedure(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final StateOfRRC_Procedure awaitNoRRC_Message =
	new StateOfRRC_Procedure(0);
    public static final StateOfRRC_Procedure awaitRB_ReleaseComplete =
	new StateOfRRC_Procedure(1);
    public static final StateOfRRC_Procedure awaitRB_SetupComplete =
	new StateOfRRC_Procedure(2);
    public static final StateOfRRC_Procedure awaitRB_ReconfigurationComplete =
	new StateOfRRC_Procedure(3);
    public static final StateOfRRC_Procedure awaitTransportCH_ReconfigurationComplete =
	new StateOfRRC_Procedure(4);
    public static final StateOfRRC_Procedure awaitPhysicalCH_ReconfigurationComplete =
	new StateOfRRC_Procedure(5);
    public static final StateOfRRC_Procedure awaitActiveSetUpdateComplete =
	new StateOfRRC_Procedure(6);
    public static final StateOfRRC_Procedure awaitHandoverComplete =
	new StateOfRRC_Procedure(7);
    public static final StateOfRRC_Procedure sendCellUpdateConfirm =
	new StateOfRRC_Procedure(8);
    public static final StateOfRRC_Procedure sendUraUpdateConfirm =
	new StateOfRRC_Procedure(9);
    public static final StateOfRRC_Procedure dummy =
	new StateOfRRC_Procedure(10);
    public static final StateOfRRC_Procedure otherStates =
	new StateOfRRC_Procedure(11);
    private final static StateOfRRC_Procedure cNamedNumbers[] = {
	 awaitNoRRC_Message, 
	 awaitRB_ReleaseComplete, 
	 awaitRB_SetupComplete, 
	 awaitRB_ReconfigurationComplete, 
	 awaitTransportCH_ReconfigurationComplete, 
	 awaitPhysicalCH_ReconfigurationComplete, 
	 awaitActiveSetUpdateComplete, 
	 awaitHandoverComplete, 
	 sendCellUpdateConfirm, 
	 sendUraUpdateConfirm, 
	 dummy, 
	 otherStates
    };
    protected final static long cFirstNumber = 0;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    public static StateOfRRC_Procedure valueOf(long value)
    {
	return (StateOfRRC_Procedure)awaitNoRRC_Message.lookupValue(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "rrc.internode_definitions",
	    "StateOfRRC_Procedure"
	),
	new QName (
	    "Internode-definitions",
	    "StateOfRRC-Procedure"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "awaitNoRRC-Message",
		    0
		),
		new MemberListElement (
		    "awaitRB-ReleaseComplete",
		    1
		),
		new MemberListElement (
		    "awaitRB-SetupComplete",
		    2
		),
		new MemberListElement (
		    "awaitRB-ReconfigurationComplete",
		    3
		),
		new MemberListElement (
		    "awaitTransportCH-ReconfigurationComplete",
		    4
		),
		new MemberListElement (
		    "awaitPhysicalCH-ReconfigurationComplete",
		    5
		),
		new MemberListElement (
		    "awaitActiveSetUpdateComplete",
		    6
		),
		new MemberListElement (
		    "awaitHandoverComplete",
		    7
		),
		new MemberListElement (
		    "sendCellUpdateConfirm",
		    8
		),
		new MemberListElement (
		    "sendUraUpdateConfirm",
		    9
		),
		new MemberListElement (
		    "dummy",
		    10
		),
		new MemberListElement (
		    "otherStates",
		    11
		)
	    }
	),
	0,
	awaitNoRRC_Message
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' StateOfRRC_Procedure object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' StateOfRRC_Procedure object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for StateOfRRC_Procedure
