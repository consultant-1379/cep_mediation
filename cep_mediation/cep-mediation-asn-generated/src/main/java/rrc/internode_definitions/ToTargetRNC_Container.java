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
 * Define the ASN1 Type ToTargetRNC_Container from ASN1 Module Internode_definitions.
 * @see Choice
 */

public class ToTargetRNC_Container extends Choice {
    
    /**
     * The default constructor.
     */
    public ToTargetRNC_Container()
    {
    }
    
    public static final  int  interRATHandoverInfo_chosen = 1;
    public static final  int  srncRelocation_chosen = 2;
    public static final  int  rfc3095_ContextInfo_chosen = 3;
    public static final  int  extension_chosen = 4;
    
    // Methods for field "interRATHandoverInfo"
    public static ToTargetRNC_Container createToTargetRNC_ContainerWithInterRATHandoverInfo(InterRATHandoverInfoWithInterRATCapabilities_r3 interRATHandoverInfo)
    {
	ToTargetRNC_Container __object = new ToTargetRNC_Container();

	__object.setInterRATHandoverInfo(interRATHandoverInfo);
	return __object;
    }
    
    public boolean hasInterRATHandoverInfo()
    {
	return getChosenFlag() == interRATHandoverInfo_chosen;
    }
    
    public void setInterRATHandoverInfo(InterRATHandoverInfoWithInterRATCapabilities_r3 interRATHandoverInfo)
    {
	setChosenValue(interRATHandoverInfo);
	setChosenFlag(interRATHandoverInfo_chosen);
    }
    
    
    // Methods for field "srncRelocation"
    public static ToTargetRNC_Container createToTargetRNC_ContainerWithSrncRelocation(SRNC_RelocationInfo_r3 srncRelocation)
    {
	ToTargetRNC_Container __object = new ToTargetRNC_Container();

	__object.setSrncRelocation(srncRelocation);
	return __object;
    }
    
    public boolean hasSrncRelocation()
    {
	return getChosenFlag() == srncRelocation_chosen;
    }
    
    public void setSrncRelocation(SRNC_RelocationInfo_r3 srncRelocation)
    {
	setChosenValue(srncRelocation);
	setChosenFlag(srncRelocation_chosen);
    }
    
    
    // Methods for field "rfc3095_ContextInfo"
    public static ToTargetRNC_Container createToTargetRNC_ContainerWithRfc3095_ContextInfo(RFC3095_ContextInfo_r5 rfc3095_ContextInfo)
    {
	ToTargetRNC_Container __object = new ToTargetRNC_Container();

	__object.setRfc3095_ContextInfo(rfc3095_ContextInfo);
	return __object;
    }
    
    public boolean hasRfc3095_ContextInfo()
    {
	return getChosenFlag() == rfc3095_ContextInfo_chosen;
    }
    
    public void setRfc3095_ContextInfo(RFC3095_ContextInfo_r5 rfc3095_ContextInfo)
    {
	setChosenValue(rfc3095_ContextInfo);
	setChosenFlag(rfc3095_ContextInfo_chosen);
    }
    
    
    // Methods for field "extension"
    public static ToTargetRNC_Container createToTargetRNC_ContainerWithExtension(Null extension)
    {
	ToTargetRNC_Container __object = new ToTargetRNC_Container();

	__object.setExtension(extension);
	return __object;
    }
    
    public boolean hasExtension()
    {
	return getChosenFlag() == extension_chosen;
    }
    
    public void setExtension(Null extension)
    {
	setChosenValue(extension);
	setChosenFlag(extension_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case interRATHandoverInfo_chosen:
		return new InterRATHandoverInfoWithInterRATCapabilities_r3();
	    case srncRelocation_chosen:
		return new SRNC_RelocationInfo_r3();
	    case rfc3095_ContextInfo_chosen:
		return new RFC3095_ContextInfo_r5();
	    case extension_chosen:
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
	    "rrc.internode_definitions",
	    "ToTargetRNC_Container"
	),
	new QName (
	    "Internode-definitions",
	    "ToTargetRNC-Container"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"InterRATHandoverInfoWithInterRATCapabilities_r3"
			    ),
			    new QName (
				"Internode-definitions",
				"InterRATHandoverInfoWithInterRATCapabilities-r3"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "InterRATHandoverInfoWithInterRATCapabilities_r3"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "interRATHandoverInfo",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3"
			    ),
			    new QName (
				"Internode-definitions",
				"SRNC-RelocationInfo-r3"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "srncRelocation",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"RFC3095_ContextInfo_r5"
			    ),
			    new QName (
				"Internode-definitions",
				"RFC3095-ContextInfo-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "RFC3095_ContextInfo_r5"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "rfc3095-ContextInfo",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "extension",
		    3,
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
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ToTargetRNC_Container object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ToTargetRNC_Container object.
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
    
} // End class definition for ToTargetRNC_Container
