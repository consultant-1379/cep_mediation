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
 * Define the ASN1 Type LoggedMeasIntrafreqNeighbourMeasList_TDD128 from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class LoggedMeasIntrafreqNeighbourMeasList_TDD128 extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public LoggedMeasIntrafreqNeighbourMeasList_TDD128()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public LoggedMeasIntrafreqNeighbourMeasList_TDD128(LoggedMeasNeighbourMeas_TDD128[] elements)
    {
	super(elements);
    }
    
    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(LoggedMeasNeighbourMeas_TDD128 element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(LoggedMeasNeighbourMeas_TDD128 element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized LoggedMeasNeighbourMeas_TDD128 get(int atIndex)
    {
	return (LoggedMeasNeighbourMeas_TDD128)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(LoggedMeasNeighbourMeas_TDD128 element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(LoggedMeasNeighbourMeas_TDD128 element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new LoggedMeasNeighbourMeas_TDD128();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
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
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasIntrafreqNeighbourMeasList_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasIntrafreqNeighbourMeasList_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasIntrafreqNeighbourMeasList_TDD128
