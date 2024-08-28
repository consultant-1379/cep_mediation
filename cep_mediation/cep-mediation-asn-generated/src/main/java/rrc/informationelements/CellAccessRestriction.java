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
 * Define the ASN1 Type CellAccessRestriction from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellAccessRestriction extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellAccessRestriction()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellAccessRestriction(CellBarred cellBarred, 
		    ReservedIndicator cellReservedForOperatorUse, 
		    ReservedIndicator cellReservationExtension, 
		    AccessClassBarredList accessClassBarredList)
    {
	setCellBarred(cellBarred);
	setCellReservedForOperatorUse(cellReservedForOperatorUse);
	setCellReservationExtension(cellReservationExtension);
	setAccessClassBarredList(accessClassBarredList);
    }
    
    /**
     * Construct with required components.
     */
    public CellAccessRestriction(CellBarred cellBarred, 
		    ReservedIndicator cellReservedForOperatorUse, 
		    ReservedIndicator cellReservationExtension)
    {
	setCellBarred(cellBarred);
	setCellReservedForOperatorUse(cellReservedForOperatorUse);
	setCellReservationExtension(cellReservationExtension);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellBarred();
	mComponents[1] = ReservedIndicator.reserved;
	mComponents[2] = ReservedIndicator.reserved;
	mComponents[3] = new AccessClassBarredList();
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
		return new CellBarred();
	    case 1:
		return ReservedIndicator.reserved;
	    case 2:
		return ReservedIndicator.reserved;
	    case 3:
		return new AccessClassBarredList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellBarred"
    public CellBarred getCellBarred()
    {
	return (CellBarred)mComponents[0];
    }
    
    public void setCellBarred(CellBarred cellBarred)
    {
	mComponents[0] = cellBarred;
    }
    
    
    // Methods for field "cellReservedForOperatorUse"
    public ReservedIndicator getCellReservedForOperatorUse()
    {
	return (ReservedIndicator)mComponents[1];
    }
    
    public void setCellReservedForOperatorUse(ReservedIndicator cellReservedForOperatorUse)
    {
	mComponents[1] = cellReservedForOperatorUse;
    }
    
    
    // Methods for field "cellReservationExtension"
    public ReservedIndicator getCellReservationExtension()
    {
	return (ReservedIndicator)mComponents[2];
    }
    
    public void setCellReservationExtension(ReservedIndicator cellReservationExtension)
    {
	mComponents[2] = cellReservationExtension;
    }
    
    
    // Methods for field "accessClassBarredList"
    public AccessClassBarredList getAccessClassBarredList()
    {
	return (AccessClassBarredList)mComponents[3];
    }
    
    public void setAccessClassBarredList(AccessClassBarredList accessClassBarredList)
    {
	mComponents[3] = accessClassBarredList;
    }
    
    public boolean hasAccessClassBarredList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAccessClassBarredList()
    {
	setComponentAbsent(3);
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
	    "CellAccessRestriction"
	),
	new QName (
	    "InformationElements",
	    "CellAccessRestriction"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellBarred"
			    ),
			    new QName (
				"InformationElements",
				"CellBarred"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellBarred"
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
		    "cellBarred",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReservedIndicator"
			    ),
			    new QName (
				"InformationElements",
				"ReservedIndicator"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"reserved",
					0
				    ),
				    new MemberListElement (
					"notReserved",
					1
				    )
				}
			    ),
			    0,
			    ReservedIndicator.reserved
			)
		    ),
		    "cellReservedForOperatorUse",
		    1,
		    2,
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
				"ReservedIndicator"
			    ),
			    new QName (
				"InformationElements",
				"ReservedIndicator"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"reserved",
					0
				    ),
				    new MemberListElement (
					"notReserved",
					1
				    )
				}
			    ),
			    0,
			    ReservedIndicator.reserved
			)
		    ),
		    "cellReservationExtension",
		    2,
		    2,
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
				"AccessClassBarredList"
			    ),
			    new QName (
				"InformationElements",
				"AccessClassBarredList"
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
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AccessClassBarred"
				)
			    )
			)
		    ),
		    "accessClassBarredList",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellAccessRestriction object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellAccessRestriction object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellAccessRestriction
