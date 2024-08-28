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
 * Define the ASN1 Type LoggedMeasInfo_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasInfo_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasInfo_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasInfo_TDD128(INTEGER relativeTimeStamp, 
		    LoggedMeasServingCellMeas_TDD128 loggedMeasServingCellMeas, 
		    LoggedMeasIntrafreqNeighbourMeasList_TDD128 loggedMeasIntrafreqNeighbourList, 
		    LoggedMeasInterfreqList_TDD128 loggedMeasInterfreqList, 
		    LoggedMeasInterRATNeighbourMeas loggedMeasInterRATNeighbourMeas, 
		    LoggedMeasLocationInfo loggedMeasLocationInfo)
    {
	setRelativeTimeStamp(relativeTimeStamp);
	setLoggedMeasServingCellMeas(loggedMeasServingCellMeas);
	setLoggedMeasIntrafreqNeighbourList(loggedMeasIntrafreqNeighbourList);
	setLoggedMeasInterfreqList(loggedMeasInterfreqList);
	setLoggedMeasInterRATNeighbourMeas(loggedMeasInterRATNeighbourMeas);
	setLoggedMeasLocationInfo(loggedMeasLocationInfo);
    }
    
    /**
     * Construct with components.
     */
    public LoggedMeasInfo_TDD128(long relativeTimeStamp, 
		    LoggedMeasServingCellMeas_TDD128 loggedMeasServingCellMeas, 
		    LoggedMeasIntrafreqNeighbourMeasList_TDD128 loggedMeasIntrafreqNeighbourList, 
		    LoggedMeasInterfreqList_TDD128 loggedMeasInterfreqList, 
		    LoggedMeasInterRATNeighbourMeas loggedMeasInterRATNeighbourMeas, 
		    LoggedMeasLocationInfo loggedMeasLocationInfo)
    {
	this(new INTEGER(relativeTimeStamp), loggedMeasServingCellMeas, 
	     loggedMeasIntrafreqNeighbourList, loggedMeasInterfreqList, 
	     loggedMeasInterRATNeighbourMeas, loggedMeasLocationInfo);
    }
    
    /**
     * Construct with required components.
     */
    public LoggedMeasInfo_TDD128(long relativeTimeStamp, 
		    LoggedMeasServingCellMeas_TDD128 loggedMeasServingCellMeas)
    {
	setRelativeTimeStamp(relativeTimeStamp);
	setLoggedMeasServingCellMeas(loggedMeasServingCellMeas);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new LoggedMeasServingCellMeas_TDD128();
	mComponents[2] = new LoggedMeasIntrafreqNeighbourMeasList_TDD128();
	mComponents[3] = new LoggedMeasInterfreqList_TDD128();
	mComponents[4] = new LoggedMeasInterRATNeighbourMeas();
	mComponents[5] = new LoggedMeasLocationInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new LoggedMeasServingCellMeas_TDD128();
	    case 2:
		return new LoggedMeasIntrafreqNeighbourMeasList_TDD128();
	    case 3:
		return new LoggedMeasInterfreqList_TDD128();
	    case 4:
		return new LoggedMeasInterRATNeighbourMeas();
	    case 5:
		return new LoggedMeasLocationInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "relativeTimeStamp"
    public long getRelativeTimeStamp()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setRelativeTimeStamp(long relativeTimeStamp)
    {
	setRelativeTimeStamp(new INTEGER(relativeTimeStamp));
    }
    
    public void setRelativeTimeStamp(INTEGER relativeTimeStamp)
    {
	mComponents[0] = relativeTimeStamp;
    }
    
    
    // Methods for field "loggedMeasServingCellMeas"
    public LoggedMeasServingCellMeas_TDD128 getLoggedMeasServingCellMeas()
    {
	return (LoggedMeasServingCellMeas_TDD128)mComponents[1];
    }
    
    public void setLoggedMeasServingCellMeas(LoggedMeasServingCellMeas_TDD128 loggedMeasServingCellMeas)
    {
	mComponents[1] = loggedMeasServingCellMeas;
    }
    
    
    // Methods for field "loggedMeasIntrafreqNeighbourList"
    public LoggedMeasIntrafreqNeighbourMeasList_TDD128 getLoggedMeasIntrafreqNeighbourList()
    {
	return (LoggedMeasIntrafreqNeighbourMeasList_TDD128)mComponents[2];
    }
    
    public void setLoggedMeasIntrafreqNeighbourList(LoggedMeasIntrafreqNeighbourMeasList_TDD128 loggedMeasIntrafreqNeighbourList)
    {
	mComponents[2] = loggedMeasIntrafreqNeighbourList;
    }
    
    public boolean hasLoggedMeasIntrafreqNeighbourList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLoggedMeasIntrafreqNeighbourList()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "loggedMeasInterfreqList"
    public LoggedMeasInterfreqList_TDD128 getLoggedMeasInterfreqList()
    {
	return (LoggedMeasInterfreqList_TDD128)mComponents[3];
    }
    
    public void setLoggedMeasInterfreqList(LoggedMeasInterfreqList_TDD128 loggedMeasInterfreqList)
    {
	mComponents[3] = loggedMeasInterfreqList;
    }
    
    public boolean hasLoggedMeasInterfreqList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLoggedMeasInterfreqList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "loggedMeasInterRATNeighbourMeas"
    public LoggedMeasInterRATNeighbourMeas getLoggedMeasInterRATNeighbourMeas()
    {
	return (LoggedMeasInterRATNeighbourMeas)mComponents[4];
    }
    
    public void setLoggedMeasInterRATNeighbourMeas(LoggedMeasInterRATNeighbourMeas loggedMeasInterRATNeighbourMeas)
    {
	mComponents[4] = loggedMeasInterRATNeighbourMeas;
    }
    
    public boolean hasLoggedMeasInterRATNeighbourMeas()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLoggedMeasInterRATNeighbourMeas()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "loggedMeasLocationInfo"
    public LoggedMeasLocationInfo getLoggedMeasLocationInfo()
    {
	return (LoggedMeasLocationInfo)mComponents[5];
    }
    
    public void setLoggedMeasLocationInfo(LoggedMeasLocationInfo loggedMeasLocationInfo)
    {
	mComponents[5] = loggedMeasLocationInfo;
    }
    
    public boolean hasLoggedMeasLocationInfo()
    {
	return componentIsPresent(5);
    }
    
    public void deleteLoggedMeasLocationInfo()
    {
	setComponentAbsent(5);
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
	    "LoggedMeasInfo_TDD128"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasInfo-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7200),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7200)
			    ),
			    null
			)
		    ),
		    "relativeTimeStamp",
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
				"LoggedMeasServingCellMeas_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasServingCellMeas-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasServingCellMeas_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasServingCellMeas_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "loggedMeasServingCellMeas",
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
				"LoggedMeasIntrafreqNeighbourMeasList_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasIntrafreqNeighbourMeasList-TDD128"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasNeighbourMeas_TDD128"
				)
			    )
			)
		    ),
		    "loggedMeasIntrafreqNeighbourList",
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
				"LoggedMeasInterfreqList_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasInterfreqList-TDD128"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasInterfreqInfo_TDD128"
				)
			    )
			)
		    ),
		    "loggedMeasInterfreqList",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LoggedMeasInterRATNeighbourMeas"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasInterRATNeighbourMeas"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasInterRATNeighbourMeas"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasInterRATNeighbourMeas"
				)
			    ),
			    0
			)
		    ),
		    "loggedMeasInterRATNeighbourMeas",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LoggedMeasLocationInfo"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasLocationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasLocationInfo"
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
		    "loggedMeasLocationInfo",
		    5,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasInfo_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasInfo_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasInfo_TDD128
