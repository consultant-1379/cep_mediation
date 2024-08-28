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
 * Define the ASN1 Type RRC_ConnectionReleaseInformation from ASN1 Module InformationElements.
 * @see Choice
 */

public class RRC_ConnectionReleaseInformation extends Choice {
    
    /**
     * The default constructor.
     */
    public RRC_ConnectionReleaseInformation()
    {
    }
    
    public static final  int  noRelease_chosen = 1;
    public static final  int  release_chosen = 2;
    
    // Methods for field "noRelease"
    public static RRC_ConnectionReleaseInformation createRRC_ConnectionReleaseInformationWithNoRelease(Null noRelease)
    {
	RRC_ConnectionReleaseInformation __object = new RRC_ConnectionReleaseInformation();

	__object.setNoRelease(noRelease);
	return __object;
    }
    
    public boolean hasNoRelease()
    {
	return getChosenFlag() == noRelease_chosen;
    }
    
    public void setNoRelease(Null noRelease)
    {
	setChosenValue(noRelease);
	setChosenFlag(noRelease_chosen);
    }
    
    
    // Methods for field "release"
    public static RRC_ConnectionReleaseInformation createRRC_ConnectionReleaseInformationWithRelease(Release release)
    {
	RRC_ConnectionReleaseInformation __object = new RRC_ConnectionReleaseInformation();

	__object.setRelease(release);
	return __object;
    }
    
    public boolean hasRelease()
    {
	return getChosenFlag() == release_chosen;
    }
    
    public void setRelease(Release release)
    {
	setChosenValue(release);
	setChosenFlag(release_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Release from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Release extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Release()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Release(ReleaseCause releaseCause)
	{
	    setReleaseCause(releaseCause);
	}
	
	public void initComponents()
	{
	    mComponents[0] = ReleaseCause.normalEvent;
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
		    return ReleaseCause.normalEvent;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "releaseCause"
	public ReleaseCause getReleaseCause()
	{
	    return (ReleaseCause)mComponents[0];
	}
	
	public void setReleaseCause(ReleaseCause releaseCause)
	{
	    mComponents[0] = releaseCause;
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
		"RRC_ConnectionReleaseInformation$Release"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ReleaseCause"
				),
				new QName (
				    "InformationElements",
				    "ReleaseCause"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "normalEvent",
					    0
					),
					new MemberListElement (
					    "unspecified",
					    1
					),
					new MemberListElement (
					    "pre-emptiveRelease",
					    2
					),
					new MemberListElement (
					    "congestion",
					    3
					),
					new MemberListElement (
					    "re-establishmentReject",
					    4
					),
					new MemberListElement (
					    "directedsignallingconnectionre-establishment",
					    5
					),
					new MemberListElement (
					    "userInactivity",
					    6
					),
					new MemberListElement (
					    "spare",
					    7
					)
				    }
				),
				0,
				ReleaseCause.normalEvent
			    )
			),
			"releaseCause",
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
	 * Get the type descriptor (TypeInfo) of 'this' Release object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Release object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Release

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case noRelease_chosen:
		return new Null();
	    case release_chosen:
		return new Release();
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
	    "RRC_ConnectionReleaseInformation"
	),
	new QName (
	    "InformationElements",
	    "RRC-ConnectionReleaseInformation"
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
		    "noRelease",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RRC_ConnectionReleaseInformation$Release"
			)
		    ),
		    "release",
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
     * Get the type descriptor (TypeInfo) of 'this' RRC_ConnectionReleaseInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRC_ConnectionReleaseInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRC_ConnectionReleaseInformation
