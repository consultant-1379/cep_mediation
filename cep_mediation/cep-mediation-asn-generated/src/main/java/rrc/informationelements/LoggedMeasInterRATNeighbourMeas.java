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
 * Define the ASN1 Type LoggedMeasInterRATNeighbourMeas from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasInterRATNeighbourMeas extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasInterRATNeighbourMeas()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasInterRATNeighbourMeas(LoggedMeasEUTRAFreqList loggedMeasEUTRAFreqList, 
		    LoggedMeasGSMNeighbourCellsList loggedMeasGSMNeighbourCellsList)
    {
	setLoggedMeasEUTRAFreqList(loggedMeasEUTRAFreqList);
	setLoggedMeasGSMNeighbourCellsList(loggedMeasGSMNeighbourCellsList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LoggedMeasEUTRAFreqList();
	mComponents[1] = new LoggedMeasGSMNeighbourCellsList();
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
		return new LoggedMeasEUTRAFreqList();
	    case 1:
		return new LoggedMeasGSMNeighbourCellsList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "loggedMeasEUTRAFreqList"
    public LoggedMeasEUTRAFreqList getLoggedMeasEUTRAFreqList()
    {
	return (LoggedMeasEUTRAFreqList)mComponents[0];
    }
    
    public void setLoggedMeasEUTRAFreqList(LoggedMeasEUTRAFreqList loggedMeasEUTRAFreqList)
    {
	mComponents[0] = loggedMeasEUTRAFreqList;
    }
    
    public boolean hasLoggedMeasEUTRAFreqList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLoggedMeasEUTRAFreqList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "loggedMeasGSMNeighbourCellsList"
    public LoggedMeasGSMNeighbourCellsList getLoggedMeasGSMNeighbourCellsList()
    {
	return (LoggedMeasGSMNeighbourCellsList)mComponents[1];
    }
    
    public void setLoggedMeasGSMNeighbourCellsList(LoggedMeasGSMNeighbourCellsList loggedMeasGSMNeighbourCellsList)
    {
	mComponents[1] = loggedMeasGSMNeighbourCellsList;
    }
    
    public boolean hasLoggedMeasGSMNeighbourCellsList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLoggedMeasGSMNeighbourCellsList()
    {
	setComponentAbsent(1);
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
	    "LoggedMeasInterRATNeighbourMeas"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasInterRATNeighbourMeas"
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
				"LoggedMeasEUTRAFreqList"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasEUTRAFreqList"
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
				    "LoggedMeasEUTRAFreqInfo"
				)
			    )
			)
		    ),
		    "loggedMeasEUTRAFreqList",
		    0,
		    3,
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
				"LoggedMeasGSMNeighbourCellsList"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasGSMNeighbourCellsList"
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
				    "LoggedMeasGSMNeighbourCellsinfo"
				)
			    )
			)
		    ),
		    "loggedMeasGSMNeighbourCellsList",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasInterRATNeighbourMeas object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasInterRATNeighbourMeas object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasInterRATNeighbourMeas
