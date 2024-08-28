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
 * Define the ASN1 Type MeasuredResultsOnRACH_v7g0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasuredResultsOnRACH_v7g0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasuredResultsOnRACH_v7g0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasuredResultsOnRACH_v7g0ext(DeltaRSCPPerCell currentCell_DeltaRSCP, 
		    MonitoredCellRACH_List_v7g0ext monitoredCellRACH_List_v7g0ext)
    {
	setCurrentCell_DeltaRSCP(currentCell_DeltaRSCP);
	setMonitoredCellRACH_List_v7g0ext(monitoredCellRACH_List_v7g0ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DeltaRSCPPerCell();
	mComponents[1] = new MonitoredCellRACH_List_v7g0ext();
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
		return new DeltaRSCPPerCell();
	    case 1:
		return new MonitoredCellRACH_List_v7g0ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "currentCell_DeltaRSCP"
    public DeltaRSCPPerCell getCurrentCell_DeltaRSCP()
    {
	return (DeltaRSCPPerCell)mComponents[0];
    }
    
    public void setCurrentCell_DeltaRSCP(DeltaRSCPPerCell currentCell_DeltaRSCP)
    {
	mComponents[0] = currentCell_DeltaRSCP;
    }
    
    public boolean hasCurrentCell_DeltaRSCP()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCurrentCell_DeltaRSCP()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "monitoredCellRACH_List_v7g0ext"
    public MonitoredCellRACH_List_v7g0ext getMonitoredCellRACH_List_v7g0ext()
    {
	return (MonitoredCellRACH_List_v7g0ext)mComponents[1];
    }
    
    public void setMonitoredCellRACH_List_v7g0ext(MonitoredCellRACH_List_v7g0ext monitoredCellRACH_List_v7g0ext)
    {
	mComponents[1] = monitoredCellRACH_List_v7g0ext;
    }
    
    public boolean hasMonitoredCellRACH_List_v7g0ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMonitoredCellRACH_List_v7g0ext()
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
	    "MeasuredResultsOnRACH_v7g0ext"
	),
	new QName (
	    "InformationElements",
	    "MeasuredResultsOnRACH-v7g0ext"
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
				"DeltaRSCPPerCell"
			    ),
			    new QName (
				"InformationElements",
				"DeltaRSCPPerCell"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DeltaRSCPPerCell"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DeltaRSCPPerCell"
				)
			    ),
			    0
			)
		    ),
		    "currentCell-DeltaRSCP",
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
				"MonitoredCellRACH_List_v7g0ext"
			    ),
			    new QName (
				"InformationElements",
				"MonitoredCellRACH-List-v7g0ext"
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
				    "DeltaRSCPPerCell"
				)
			    )
			)
		    ),
		    "monitoredCellRACH-List-v7g0ext",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasuredResultsOnRACH_v7g0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasuredResultsOnRACH_v7g0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasuredResultsOnRACH_v7g0ext
