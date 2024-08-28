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
 * Define the ASN1 Type UTRAN_GANSSReferenceTime from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UTRAN_GANSSReferenceTime extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRAN_GANSSReferenceTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRAN_GANSSReferenceTime(Ue_GANSSTimingOfCellFrames ue_GANSSTimingOfCellFrames, 
		    INTEGER gANSS_TimeId, INTEGER gANSS_TimeUncertainty, 
		    Mode mode, INTEGER referenceSfn)
    {
	setUe_GANSSTimingOfCellFrames(ue_GANSSTimingOfCellFrames);
	setGANSS_TimeId(gANSS_TimeId);
	setGANSS_TimeUncertainty(gANSS_TimeUncertainty);
	setMode(mode);
	setReferenceSfn(referenceSfn);
    }
    
    /**
     * Construct with components.
     */
    public UTRAN_GANSSReferenceTime(Ue_GANSSTimingOfCellFrames ue_GANSSTimingOfCellFrames, 
		    long gANSS_TimeId, long gANSS_TimeUncertainty, Mode mode, 
		    long referenceSfn)
    {
	this(ue_GANSSTimingOfCellFrames, new INTEGER(gANSS_TimeId), 
	     new INTEGER(gANSS_TimeUncertainty), mode, 
	     new INTEGER(referenceSfn));
    }
    
    /**
     * Construct with required components.
     */
    public UTRAN_GANSSReferenceTime(Ue_GANSSTimingOfCellFrames ue_GANSSTimingOfCellFrames, 
		    Mode mode, long referenceSfn)
    {
	setUe_GANSSTimingOfCellFrames(ue_GANSSTimingOfCellFrames);
	setMode(mode);
	setReferenceSfn(referenceSfn);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Ue_GANSSTimingOfCellFrames();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new Mode();
	mComponents[4] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Ue_GANSSTimingOfCellFrames();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new Mode();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_GANSSTimingOfCellFrames"
    public Ue_GANSSTimingOfCellFrames getUe_GANSSTimingOfCellFrames()
    {
	return (Ue_GANSSTimingOfCellFrames)mComponents[0];
    }
    
    public void setUe_GANSSTimingOfCellFrames(Ue_GANSSTimingOfCellFrames ue_GANSSTimingOfCellFrames)
    {
	mComponents[0] = ue_GANSSTimingOfCellFrames;
    }
    
    
    
    /**
     * Define the ASN1 Type Ue_GANSSTimingOfCellFrames from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Ue_GANSSTimingOfCellFrames extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Ue_GANSSTimingOfCellFrames()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Ue_GANSSTimingOfCellFrames(INTEGER ms_Part, INTEGER ls_Part)
	{
	    setMs_Part(ms_Part);
	    setLs_Part(ls_Part);
	}
	
	/**
	 * Construct with components.
	 */
	public Ue_GANSSTimingOfCellFrames(long ms_Part, long ls_Part)
	{
	    this(new INTEGER(ms_Part), new INTEGER(ls_Part));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
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
		    return new INTEGER();
		case 1:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ms_Part"
	public long getMs_Part()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setMs_Part(long ms_Part)
	{
	    setMs_Part(new INTEGER(ms_Part));
	}
	
	public void setMs_Part(INTEGER ms_Part)
	{
	    mComponents[0] = ms_Part;
	}
	
	
	// Methods for field "ls_Part"
	public long getLs_Part()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setLs_Part(long ls_Part)
	{
	    setLs_Part(new INTEGER(ls_Part));
	}
	
	public void setLs_Part(INTEGER ls_Part)
	{
	    mComponents[1] = ls_Part;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UTRAN_GANSSReferenceTime$Ue_GANSSTimingOfCellFrames"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
					new com.oss.asn1.INTEGER(80),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(80)
				),
				null
			    )
			),
			"ms-Part",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
					new com.oss.asn1.INTEGER(4294967295L),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(4294967295L)
				),
				null
			    )
			),
			"ls-Part",
			1,
			2,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Ue_GANSSTimingOfCellFrames object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ue_GANSSTimingOfCellFrames object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ue_GANSSTimingOfCellFrames

    // Methods for field "gANSS_TimeId"
    public long getGANSS_TimeId()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGANSS_TimeId(long gANSS_TimeId)
    {
	setGANSS_TimeId(new INTEGER(gANSS_TimeId));
    }
    
    public void setGANSS_TimeId(INTEGER gANSS_TimeId)
    {
	mComponents[1] = gANSS_TimeId;
    }
    
    public boolean hasGANSS_TimeId()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGANSS_TimeId()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "gANSS_TimeUncertainty"
    public long getGANSS_TimeUncertainty()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setGANSS_TimeUncertainty(long gANSS_TimeUncertainty)
    {
	setGANSS_TimeUncertainty(new INTEGER(gANSS_TimeUncertainty));
    }
    
    public void setGANSS_TimeUncertainty(INTEGER gANSS_TimeUncertainty)
    {
	mComponents[2] = gANSS_TimeUncertainty;
    }
    
    public boolean hasGANSS_TimeUncertainty()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGANSS_TimeUncertainty()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "mode"
    public Mode getMode()
    {
	return (Mode)mComponents[3];
    }
    
    public void setMode(Mode mode)
    {
	mComponents[3] = mode;
    }
    
    
    
    /**
     * Define the ASN1 Type Mode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Mode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Mode()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static Mode createModeWithFdd(Fdd fdd)
	{
	    Mode __object = new Mode();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(PrimaryCPICH_Info primary_CPICH_Info)
	    {
		setPrimary_CPICH_Info(primary_CPICH_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_Info();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new PrimaryCPICH_Info();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "primary_CPICH_Info"
	    public PrimaryCPICH_Info getPrimary_CPICH_Info()
	    {
		return (PrimaryCPICH_Info)mComponents[0];
	    }
	    
	    public void setPrimary_CPICH_Info(PrimaryCPICH_Info primary_CPICH_Info)
	    {
		mComponents[0] = primary_CPICH_Info;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "UTRAN_GANSSReferenceTime$Mode$Fdd"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
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
					"PrimaryCPICH_Info"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCPICH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0
				)
			    ),
			    "primary-CPICH-Info",
			    0,
			    2,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static Mode createModeWithTdd(Tdd tdd)
	{
	    Mode __object = new Mode();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(CellParametersID cellParameters)
	    {
		setCellParameters(cellParameters);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellParametersID();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new CellParametersID();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellParameters"
	    public CellParametersID getCellParameters()
	    {
		return (CellParametersID)mComponents[0];
	    }
	    
	    public void setCellParameters(CellParametersID cellParameters)
	    {
		mComponents[0] = cellParameters;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "UTRAN_GANSSReferenceTime$Mode$Tdd"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
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
					"rrc.informationelements",
					"CellParametersID"
				    ),
				    new QName (
					"InformationElements",
					"CellParametersID"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new CellParametersID(0), 
					    new CellParametersID(127),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(127)
				    ),
				    null
				)
			    ),
			    "cellParameters",
			    0,
			    2,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UTRAN_GANSSReferenceTime$Mode"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UTRAN_GANSSReferenceTime$Mode$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UTRAN_GANSSReferenceTime$Mode$Tdd"
			    )
			),
			"tdd",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mode

    // Methods for field "referenceSfn"
    public long getReferenceSfn()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setReferenceSfn(long referenceSfn)
    {
	setReferenceSfn(new INTEGER(referenceSfn));
    }
    
    public void setReferenceSfn(INTEGER referenceSfn)
    {
	mComponents[4] = referenceSfn;
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
	    "UTRAN_GANSSReferenceTime"
	),
	new QName (
	    "InformationElements",
	    "UTRAN-GANSSReferenceTime"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UTRAN_GANSSReferenceTime$Ue_GANSSTimingOfCellFrames"
			)
		    ),
		    "ue-GANSSTimingOfCellFrames",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "gANSS-TimeId",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "gANSS-TimeUncertainty",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UTRAN_GANSSReferenceTime$Mode"
			)
		    ),
		    "mode",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "referenceSfn",
		    4,
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UTRAN_GANSSReferenceTime object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRAN_GANSSReferenceTime object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRAN_GANSSReferenceTime
