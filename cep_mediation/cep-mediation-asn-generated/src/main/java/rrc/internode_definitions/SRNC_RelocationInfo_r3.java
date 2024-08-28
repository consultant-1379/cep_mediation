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
 * Define the ASN1 Type SRNC_RelocationInfo_r3 from ASN1 Module Internode_definitions.
 * @see Choice
 */

public class SRNC_RelocationInfo_r3 extends Choice {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_r3()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static SRNC_RelocationInfo_r3 createSRNC_RelocationInfo_r3WithR3(R3 r3)
    {
	SRNC_RelocationInfo_r3 __object = new SRNC_RelocationInfo_r3();

	__object.setR3(r3);
	return __object;
    }
    
    public boolean hasR3()
    {
	return getChosenFlag() == r3_chosen;
    }
    
    public void setR3(R3 r3)
    {
	setChosenValue(r3);
	setChosenFlag(r3_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type R3 from ASN1 Module Internode_definitions.
     * @see Sequence
     */
    public static class R3 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public R3()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public R3(SRNC_RelocationInfo_r3_IEs sRNC_RelocationInfo_r3, 
			V380NCEs v380NCEs)
	{
	    setSRNC_RelocationInfo_r3(sRNC_RelocationInfo_r3);
	    setV380NCEs(v380NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(SRNC_RelocationInfo_r3_IEs sRNC_RelocationInfo_r3)
	{
	    setSRNC_RelocationInfo_r3(sRNC_RelocationInfo_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SRNC_RelocationInfo_r3_IEs();
	    mComponents[1] = new V380NCEs();
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
		    return new SRNC_RelocationInfo_r3_IEs();
		case 1:
		    return new V380NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sRNC_RelocationInfo_r3"
	public SRNC_RelocationInfo_r3_IEs getSRNC_RelocationInfo_r3()
	{
	    return (SRNC_RelocationInfo_r3_IEs)mComponents[0];
	}
	
	public void setSRNC_RelocationInfo_r3(SRNC_RelocationInfo_r3_IEs sRNC_RelocationInfo_r3)
	{
	    mComponents[0] = sRNC_RelocationInfo_r3;
	}
	
	
	// Methods for field "v380NCEs"
	public V380NCEs getV380NCEs()
	{
	    return (V380NCEs)mComponents[1];
	}
	
	public void setV380NCEs(V380NCEs v380NCEs)
	{
	    mComponents[1] = v380NCEs;
	}
	
	public boolean hasV380NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV380NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V380NCEs from ASN1 Module Internode_definitions.
	 * @see Sequence
	 */
	public static class V380NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V380NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V380NCEs(SRNC_RelocationInfo_v380ext_IEs sRNC_RelocationInfo_v380ext, 
			    V390NCEs v390NCEs)
	    {
		setSRNC_RelocationInfo_v380ext(sRNC_RelocationInfo_v380ext);
		setV390NCEs(v390NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V380NCEs(SRNC_RelocationInfo_v380ext_IEs sRNC_RelocationInfo_v380ext)
	    {
		setSRNC_RelocationInfo_v380ext(sRNC_RelocationInfo_v380ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SRNC_RelocationInfo_v380ext_IEs();
		mComponents[1] = new V390NCEs();
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
			return new SRNC_RelocationInfo_v380ext_IEs();
		    case 1:
			return new V390NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sRNC_RelocationInfo_v380ext"
	    public SRNC_RelocationInfo_v380ext_IEs getSRNC_RelocationInfo_v380ext()
	    {
		return (SRNC_RelocationInfo_v380ext_IEs)mComponents[0];
	    }
	    
	    public void setSRNC_RelocationInfo_v380ext(SRNC_RelocationInfo_v380ext_IEs sRNC_RelocationInfo_v380ext)
	    {
		mComponents[0] = sRNC_RelocationInfo_v380ext;
	    }
	    
	    
	    // Methods for field "v390NCEs"
	    public V390NCEs getV390NCEs()
	    {
		return (V390NCEs)mComponents[1];
	    }
	    
	    public void setV390NCEs(V390NCEs v390NCEs)
	    {
		mComponents[1] = v390NCEs;
	    }
	    
	    public boolean hasV390NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV390NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V390NCEs from ASN1 Module Internode_definitions.
	     * @see Sequence
	     */
	    public static class V390NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V390NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V390NCEs(SRNC_RelocationInfo_v390ext_IEs sRNC_RelocationInfo_v390ext, 
				V3a0NCEs v3a0NCEs)
		{
		    setSRNC_RelocationInfo_v390ext(sRNC_RelocationInfo_v390ext);
		    setV3a0NCEs(v3a0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V390NCEs(SRNC_RelocationInfo_v390ext_IEs sRNC_RelocationInfo_v390ext)
		{
		    setSRNC_RelocationInfo_v390ext(sRNC_RelocationInfo_v390ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SRNC_RelocationInfo_v390ext_IEs();
		    mComponents[1] = new V3a0NCEs();
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
			    return new SRNC_RelocationInfo_v390ext_IEs();
			case 1:
			    return new V3a0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sRNC_RelocationInfo_v390ext"
		public SRNC_RelocationInfo_v390ext_IEs getSRNC_RelocationInfo_v390ext()
		{
		    return (SRNC_RelocationInfo_v390ext_IEs)mComponents[0];
		}
		
		public void setSRNC_RelocationInfo_v390ext(SRNC_RelocationInfo_v390ext_IEs sRNC_RelocationInfo_v390ext)
		{
		    mComponents[0] = sRNC_RelocationInfo_v390ext;
		}
		
		
		// Methods for field "v3a0NCEs"
		public V3a0NCEs getV3a0NCEs()
		{
		    return (V3a0NCEs)mComponents[1];
		}
		
		public void setV3a0NCEs(V3a0NCEs v3a0NCEs)
		{
		    mComponents[1] = v3a0NCEs;
		}
		
		public boolean hasV3a0NCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV3a0NCEs()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V3a0NCEs from ASN1 Module Internode_definitions.
		 * @see Sequence
		 */
		public static class V3a0NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V3a0NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V3a0NCEs(SRNC_RelocationInfo_v3a0ext_IEs sRNC_RelocationInfo_v3a0ext, 
				    V3b0NCEs v3b0NCEs)
		    {
			setSRNC_RelocationInfo_v3a0ext(sRNC_RelocationInfo_v3a0ext);
			setV3b0NCEs(v3b0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V3a0NCEs(SRNC_RelocationInfo_v3a0ext_IEs sRNC_RelocationInfo_v3a0ext)
		    {
			setSRNC_RelocationInfo_v3a0ext(sRNC_RelocationInfo_v3a0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SRNC_RelocationInfo_v3a0ext_IEs();
			mComponents[1] = new V3b0NCEs();
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
				return new SRNC_RelocationInfo_v3a0ext_IEs();
			    case 1:
				return new V3b0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sRNC_RelocationInfo_v3a0ext"
		    public SRNC_RelocationInfo_v3a0ext_IEs getSRNC_RelocationInfo_v3a0ext()
		    {
			return (SRNC_RelocationInfo_v3a0ext_IEs)mComponents[0];
		    }
		    
		    public void setSRNC_RelocationInfo_v3a0ext(SRNC_RelocationInfo_v3a0ext_IEs sRNC_RelocationInfo_v3a0ext)
		    {
			mComponents[0] = sRNC_RelocationInfo_v3a0ext;
		    }
		    
		    
		    // Methods for field "v3b0NCEs"
		    public V3b0NCEs getV3b0NCEs()
		    {
			return (V3b0NCEs)mComponents[1];
		    }
		    
		    public void setV3b0NCEs(V3b0NCEs v3b0NCEs)
		    {
			mComponents[1] = v3b0NCEs;
		    }
		    
		    public boolean hasV3b0NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV3b0NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V3b0NCEs from ASN1 Module Internode_definitions.
		     * @see Sequence
		     */
		    public static class V3b0NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V3b0NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V3b0NCEs(SRNC_RelocationInfo_v3b0ext_IEs sRNC_RelocationInfo_v3b0ext, 
					V3c0NCEs v3c0NCEs)
			{
			    setSRNC_RelocationInfo_v3b0ext(sRNC_RelocationInfo_v3b0ext);
			    setV3c0NCEs(v3c0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V3b0NCEs(SRNC_RelocationInfo_v3b0ext_IEs sRNC_RelocationInfo_v3b0ext)
			{
			    setSRNC_RelocationInfo_v3b0ext(sRNC_RelocationInfo_v3b0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SRNC_RelocationInfo_v3b0ext_IEs();
			    mComponents[1] = new V3c0NCEs();
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
				    return new SRNC_RelocationInfo_v3b0ext_IEs();
				case 1:
				    return new V3c0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sRNC_RelocationInfo_v3b0ext"
			public SRNC_RelocationInfo_v3b0ext_IEs getSRNC_RelocationInfo_v3b0ext()
			{
			    return (SRNC_RelocationInfo_v3b0ext_IEs)mComponents[0];
			}
			
			public void setSRNC_RelocationInfo_v3b0ext(SRNC_RelocationInfo_v3b0ext_IEs sRNC_RelocationInfo_v3b0ext)
			{
			    mComponents[0] = sRNC_RelocationInfo_v3b0ext;
			}
			
			
			// Methods for field "v3c0NCEs"
			public V3c0NCEs getV3c0NCEs()
			{
			    return (V3c0NCEs)mComponents[1];
			}
			
			public void setV3c0NCEs(V3c0NCEs v3c0NCEs)
			{
			    mComponents[1] = v3c0NCEs;
			}
			
			public boolean hasV3c0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV3c0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V3c0NCEs from ASN1 Module Internode_definitions.
			 * @see Sequence
			 */
			public static class V3c0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V3c0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V3c0NCEs(SRNC_RelocationInfo_v3c0ext_IEs sRNC_RelocationInfo_v3c0ext, 
					    LaterNCEs laterNCEs)
			    {
				setSRNC_RelocationInfo_v3c0ext(sRNC_RelocationInfo_v3c0ext);
				setLaterNCEs(laterNCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V3c0NCEs(SRNC_RelocationInfo_v3c0ext_IEs sRNC_RelocationInfo_v3c0ext)
			    {
				setSRNC_RelocationInfo_v3c0ext(sRNC_RelocationInfo_v3c0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SRNC_RelocationInfo_v3c0ext_IEs();
				mComponents[1] = new LaterNCEs();
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
					return new SRNC_RelocationInfo_v3c0ext_IEs();
				    case 1:
					return new LaterNCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sRNC_RelocationInfo_v3c0ext"
			    public SRNC_RelocationInfo_v3c0ext_IEs getSRNC_RelocationInfo_v3c0ext()
			    {
				return (SRNC_RelocationInfo_v3c0ext_IEs)mComponents[0];
			    }
			    
			    public void setSRNC_RelocationInfo_v3c0ext(SRNC_RelocationInfo_v3c0ext_IEs sRNC_RelocationInfo_v3c0ext)
			    {
				mComponents[0] = sRNC_RelocationInfo_v3c0ext;
			    }
			    
			    
			    // Methods for field "laterNCEs"
			    public LaterNCEs getLaterNCEs()
			    {
				return (LaterNCEs)mComponents[1];
			    }
			    
			    public void setLaterNCEs(LaterNCEs laterNCEs)
			    {
				mComponents[1] = laterNCEs;
			    }
			    
			    public boolean hasLaterNCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteLaterNCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type LaterNCEs from ASN1 Module Internode_definitions.
			     * @see Sequence
			     */
			    public static class LaterNCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public LaterNCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public LaterNCEs(SRNC_RelocationInfo_v3d0ext_IEs sRNC_RelocationInfo_v3d0ext, 
						SRNC_RelocationInfo_r3_add_ext sRNC_RelocationInfo_r3_add_ext, 
						V3g0NCEs v3g0NCEs)
				{
				    setSRNC_RelocationInfo_v3d0ext(sRNC_RelocationInfo_v3d0ext);
				    setSRNC_RelocationInfo_r3_add_ext(sRNC_RelocationInfo_r3_add_ext);
				    setV3g0NCEs(v3g0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public LaterNCEs(SRNC_RelocationInfo_v3d0ext_IEs sRNC_RelocationInfo_v3d0ext)
				{
				    setSRNC_RelocationInfo_v3d0ext(sRNC_RelocationInfo_v3d0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SRNC_RelocationInfo_v3d0ext_IEs();
				    mComponents[1] = new SRNC_RelocationInfo_r3_add_ext();
				    mComponents[2] = new V3g0NCEs();
				}
				
				// Instance initializer
				{
				    mComponents = new AbstractData[3];
				}
				
				// Method to create a specific component instance
				public AbstractData createInstance(int index)
				{
				    switch (index) {
					case 0:
					    return new SRNC_RelocationInfo_v3d0ext_IEs();
					case 1:
					    return new SRNC_RelocationInfo_r3_add_ext();
					case 2:
					    return new V3g0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sRNC_RelocationInfo_v3d0ext"
				public SRNC_RelocationInfo_v3d0ext_IEs getSRNC_RelocationInfo_v3d0ext()
				{
				    return (SRNC_RelocationInfo_v3d0ext_IEs)mComponents[0];
				}
				
				public void setSRNC_RelocationInfo_v3d0ext(SRNC_RelocationInfo_v3d0ext_IEs sRNC_RelocationInfo_v3d0ext)
				{
				    mComponents[0] = sRNC_RelocationInfo_v3d0ext;
				}
				
				
				// Methods for field "sRNC_RelocationInfo_r3_add_ext"
				public SRNC_RelocationInfo_r3_add_ext getSRNC_RelocationInfo_r3_add_ext()
				{
				    return (SRNC_RelocationInfo_r3_add_ext)mComponents[1];
				}
				
				public void setSRNC_RelocationInfo_r3_add_ext(SRNC_RelocationInfo_r3_add_ext sRNC_RelocationInfo_r3_add_ext)
				{
				    mComponents[1] = sRNC_RelocationInfo_r3_add_ext;
				}
				
				public boolean hasSRNC_RelocationInfo_r3_add_ext()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteSRNC_RelocationInfo_r3_add_ext()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type SRNC_RelocationInfo_r3_add_ext from ASN1 Module Internode_definitions.
				 * @see ContainingBitString
				 */
				public static class SRNC_RelocationInfo_r3_add_ext extends ContainingBitString {
				    
				    /**
				     * The default constructor.
				     */
				    public SRNC_RelocationInfo_r3_add_ext()
				    {
				    }
				    
				    /**
				     * Construct Bit String from a byte array.
				     * All bits considered significant.
				     * @param value the byte array to set this object to.
				     */
				    public SRNC_RelocationInfo_r3_add_ext(byte[] value)
				    {
					super(value);
				    }
				    
				    
				    /**
				     * Construct Bit String from a byte array and significant bits.
				     * @param value the byte array to set this object to.
				     * @param sigBits the number of significant bits.
				     */
				    public SRNC_RelocationInfo_r3_add_ext(byte[] value, int sigBits)
				    {
					super(value, sigBits);
				    }
				    
				    /**
				     * Construct from a contained type value.
				     */
				    public SRNC_RelocationInfo_r3_add_ext(SRNC_RelocationInfo_v3h0ext_IEs decoded)
				    {
					super(decoded);
				    }
				    
				    // Methods for getting and setting a contained value
				    public SRNC_RelocationInfo_v3h0ext_IEs getContainedValue()
				    {
					return (SRNC_RelocationInfo_v3h0ext_IEs)getDecodedValue();
				    }
				    
				    public void setContainedValue(SRNC_RelocationInfo_v3h0ext_IEs value)
				    {
					setDecodedValue(value);
				    }
				    
				    /**
				     * Initialize the type descriptor.
				     */
				    private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$SRNC_RelocationInfo_r3_add_ext"
					),
					new QName (
					    "builtin",
					    "BIT STRING"
					),
					12314,
					null,
					null,
					null,
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v3h0ext_IEs"
					    )
					),
					null
				    );
				    
				    /**
				     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r3_add_ext object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r3_add_ext object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for SRNC_RelocationInfo_r3_add_ext

				// Methods for field "v3g0NCEs"
				public V3g0NCEs getV3g0NCEs()
				{
				    return (V3g0NCEs)mComponents[2];
				}
				
				public void setV3g0NCEs(V3g0NCEs v3g0NCEs)
				{
				    mComponents[2] = v3g0NCEs;
				}
				
				public boolean hasV3g0NCEs()
				{
				    return componentIsPresent(2);
				}
				
				public void deleteV3g0NCEs()
				{
				    setComponentAbsent(2);
				}
				
				
				
				/**
				 * Define the ASN1 Type V3g0NCEs from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class V3g0NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V3g0NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V3g0NCEs(SRNC_RelocationInfo_v3g0ext_IEs sRNC_RelocationInfo_v3g0ext, 
						    V4b0NCEs v4b0NCEs)
				    {
					setSRNC_RelocationInfo_v3g0ext(sRNC_RelocationInfo_v3g0ext);
					setV4b0NCEs(v4b0NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V3g0NCEs(SRNC_RelocationInfo_v3g0ext_IEs sRNC_RelocationInfo_v3g0ext)
				    {
					setSRNC_RelocationInfo_v3g0ext(sRNC_RelocationInfo_v3g0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SRNC_RelocationInfo_v3g0ext_IEs();
					mComponents[1] = new V4b0NCEs();
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
						return new SRNC_RelocationInfo_v3g0ext_IEs();
					    case 1:
						return new V4b0NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_v3g0ext"
				    public SRNC_RelocationInfo_v3g0ext_IEs getSRNC_RelocationInfo_v3g0ext()
				    {
					return (SRNC_RelocationInfo_v3g0ext_IEs)mComponents[0];
				    }
				    
				    public void setSRNC_RelocationInfo_v3g0ext(SRNC_RelocationInfo_v3g0ext_IEs sRNC_RelocationInfo_v3g0ext)
				    {
					mComponents[0] = sRNC_RelocationInfo_v3g0ext;
				    }
				    
				    
				    // Methods for field "v4b0NCEs"
				    public V4b0NCEs getV4b0NCEs()
				    {
					return (V4b0NCEs)mComponents[1];
				    }
				    
				    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
				    {
					mComponents[1] = v4b0NCEs;
				    }
				    
				    public boolean hasV4b0NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV4b0NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V4b0NCEs from ASN1 Module Internode_definitions.
				     * @see Sequence
				     */
				    public static class V4b0NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V4b0NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V4b0NCEs(SRNC_RelocationInfo_v4b0ext_IEs sRNC_RelocationInfo_v4b0ext, 
							V590NCEs v590NCEs)
					{
					    setSRNC_RelocationInfo_v4b0ext(sRNC_RelocationInfo_v4b0ext);
					    setV590NCEs(v590NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V4b0NCEs(SRNC_RelocationInfo_v4b0ext_IEs sRNC_RelocationInfo_v4b0ext)
					{
					    setSRNC_RelocationInfo_v4b0ext(sRNC_RelocationInfo_v4b0ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new SRNC_RelocationInfo_v4b0ext_IEs();
					    mComponents[1] = new V590NCEs();
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
						    return new SRNC_RelocationInfo_v4b0ext_IEs();
						case 1:
						    return new V590NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "sRNC_RelocationInfo_v4b0ext"
					public SRNC_RelocationInfo_v4b0ext_IEs getSRNC_RelocationInfo_v4b0ext()
					{
					    return (SRNC_RelocationInfo_v4b0ext_IEs)mComponents[0];
					}
					
					public void setSRNC_RelocationInfo_v4b0ext(SRNC_RelocationInfo_v4b0ext_IEs sRNC_RelocationInfo_v4b0ext)
					{
					    mComponents[0] = sRNC_RelocationInfo_v4b0ext;
					}
					
					
					// Methods for field "v590NCEs"
					public V590NCEs getV590NCEs()
					{
					    return (V590NCEs)mComponents[1];
					}
					
					public void setV590NCEs(V590NCEs v590NCEs)
					{
					    mComponents[1] = v590NCEs;
					}
					
					public boolean hasV590NCEs()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteV590NCEs()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type V590NCEs from ASN1 Module Internode_definitions.
					 * @see Sequence
					 */
					public static class V590NCEs extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public V590NCEs()
					    {
					    }
					    
					    /**
					     * Construct with AbstractData components.
					     */
					    public V590NCEs(SRNC_RelocationInfo_v590ext_IEs sRNC_RelocationInfo_v590ext, 
							    V5a0NCEs v5a0NCEs)
					    {
						setSRNC_RelocationInfo_v590ext(sRNC_RelocationInfo_v590ext);
						setV5a0NCEs(v5a0NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V590NCEs(SRNC_RelocationInfo_v590ext_IEs sRNC_RelocationInfo_v590ext)
					    {
						setSRNC_RelocationInfo_v590ext(sRNC_RelocationInfo_v590ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new SRNC_RelocationInfo_v590ext_IEs();
						mComponents[1] = new V5a0NCEs();
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
							return new SRNC_RelocationInfo_v590ext_IEs();
						    case 1:
							return new V5a0NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "sRNC_RelocationInfo_v590ext"
					    public SRNC_RelocationInfo_v590ext_IEs getSRNC_RelocationInfo_v590ext()
					    {
						return (SRNC_RelocationInfo_v590ext_IEs)mComponents[0];
					    }
					    
					    public void setSRNC_RelocationInfo_v590ext(SRNC_RelocationInfo_v590ext_IEs sRNC_RelocationInfo_v590ext)
					    {
						mComponents[0] = sRNC_RelocationInfo_v590ext;
					    }
					    
					    
					    // Methods for field "v5a0NCEs"
					    public V5a0NCEs getV5a0NCEs()
					    {
						return (V5a0NCEs)mComponents[1];
					    }
					    
					    public void setV5a0NCEs(V5a0NCEs v5a0NCEs)
					    {
						mComponents[1] = v5a0NCEs;
					    }
					    
					    public boolean hasV5a0NCEs()
					    {
						return componentIsPresent(1);
					    }
					    
					    public void deleteV5a0NCEs()
					    {
						setComponentAbsent(1);
					    }
					    
					    
					    
					    /**
					     * Define the ASN1 Type V5a0NCEs from ASN1 Module Internode_definitions.
					     * @see Sequence
					     */
					    public static class V5a0NCEs extends Sequence {
						
						/**
						 * The default constructor.
						 */
						public V5a0NCEs()
						{
						}
						
						/**
						 * Construct with AbstractData components.
						 */
						public V5a0NCEs(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext, 
								V5b0NCEs v5b0NCEs)
						{
						    setSRNC_RelocationInfo_v5a0ext(sRNC_RelocationInfo_v5a0ext);
						    setV5b0NCEs(v5b0NCEs);
						}
						
						/**
						 * Construct with required components.
						 */
						public V5a0NCEs(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext)
						{
						    setSRNC_RelocationInfo_v5a0ext(sRNC_RelocationInfo_v5a0ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new SRNC_RelocationInfo_v5a0ext_IEs();
						    mComponents[1] = new V5b0NCEs();
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
							    return new SRNC_RelocationInfo_v5a0ext_IEs();
							case 1:
							    return new V5b0NCEs();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "sRNC_RelocationInfo_v5a0ext"
						public SRNC_RelocationInfo_v5a0ext_IEs getSRNC_RelocationInfo_v5a0ext()
						{
						    return (SRNC_RelocationInfo_v5a0ext_IEs)mComponents[0];
						}
						
						public void setSRNC_RelocationInfo_v5a0ext(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext)
						{
						    mComponents[0] = sRNC_RelocationInfo_v5a0ext;
						}
						
						
						// Methods for field "v5b0NCEs"
						public V5b0NCEs getV5b0NCEs()
						{
						    return (V5b0NCEs)mComponents[1];
						}
						
						public void setV5b0NCEs(V5b0NCEs v5b0NCEs)
						{
						    mComponents[1] = v5b0NCEs;
						}
						
						public boolean hasV5b0NCEs()
						{
						    return componentIsPresent(1);
						}
						
						public void deleteV5b0NCEs()
						{
						    setComponentAbsent(1);
						}
						
						
						
						/**
						 * Define the ASN1 Type V5b0NCEs from ASN1 Module Internode_definitions.
						 * @see Sequence
						 */
						public static class V5b0NCEs extends Sequence {
						    
						    /**
						     * The default constructor.
						     */
						    public V5b0NCEs()
						    {
						    }
						    
						    /**
						     * Construct with AbstractData components.
						     */
						    public V5b0NCEs(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext, 
								    V5c0NCEs v5c0NCEs)
						    {
							setSRNC_RelocationInfo_v5b0ext(sRNC_RelocationInfo_v5b0ext);
							setV5c0NCEs(v5c0NCEs);
						    }
						    
						    /**
						     * Construct with required components.
						     */
						    public V5b0NCEs(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext)
						    {
							setSRNC_RelocationInfo_v5b0ext(sRNC_RelocationInfo_v5b0ext);
						    }
						    
						    public void initComponents()
						    {
							mComponents[0] = new SRNC_RelocationInfo_v5b0ext_IEs();
							mComponents[1] = new V5c0NCEs();
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
								return new SRNC_RelocationInfo_v5b0ext_IEs();
							    case 1:
								return new V5c0NCEs();
							    default:
								throw new InternalError("AbstractCollection.createInstance()");
							}
							
						    }
						    
						    
						    // Methods for field "sRNC_RelocationInfo_v5b0ext"
						    public SRNC_RelocationInfo_v5b0ext_IEs getSRNC_RelocationInfo_v5b0ext()
						    {
							return (SRNC_RelocationInfo_v5b0ext_IEs)mComponents[0];
						    }
						    
						    public void setSRNC_RelocationInfo_v5b0ext(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext)
						    {
							mComponents[0] = sRNC_RelocationInfo_v5b0ext;
						    }
						    
						    
						    // Methods for field "v5c0NCEs"
						    public V5c0NCEs getV5c0NCEs()
						    {
							return (V5c0NCEs)mComponents[1];
						    }
						    
						    public void setV5c0NCEs(V5c0NCEs v5c0NCEs)
						    {
							mComponents[1] = v5c0NCEs;
						    }
						    
						    public boolean hasV5c0NCEs()
						    {
							return componentIsPresent(1);
						    }
						    
						    public void deleteV5c0NCEs()
						    {
							setComponentAbsent(1);
						    }
						    
						    
						    
						    /**
						     * Define the ASN1 Type V5c0NCEs from ASN1 Module Internode_definitions.
						     * @see Sequence
						     */
						    public static class V5c0NCEs extends Sequence {
							
							/**
							 * The default constructor.
							 */
							public V5c0NCEs()
							{
							}
							
							/**
							 * Construct with AbstractData components.
							 */
							public V5c0NCEs(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext, 
									V690NCEs v690NCEs)
							{
							    setSRNC_RelocationInfo_v5c0ext(sRNC_RelocationInfo_v5c0ext);
							    setV690NCEs(v690NCEs);
							}
							
							/**
							 * Construct with required components.
							 */
							public V5c0NCEs(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext)
							{
							    setSRNC_RelocationInfo_v5c0ext(sRNC_RelocationInfo_v5c0ext);
							}
							
							public void initComponents()
							{
							    mComponents[0] = new SRNC_RelocationInfo_v5c0ext_IEs();
							    mComponents[1] = new V690NCEs();
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
								    return new SRNC_RelocationInfo_v5c0ext_IEs();
								case 1:
								    return new V690NCEs();
								default:
								    throw new InternalError("AbstractCollection.createInstance()");
							    }
							    
							}
							
							
							// Methods for field "sRNC_RelocationInfo_v5c0ext"
							public SRNC_RelocationInfo_v5c0ext_IEs getSRNC_RelocationInfo_v5c0ext()
							{
							    return (SRNC_RelocationInfo_v5c0ext_IEs)mComponents[0];
							}
							
							public void setSRNC_RelocationInfo_v5c0ext(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext)
							{
							    mComponents[0] = sRNC_RelocationInfo_v5c0ext;
							}
							
							
							// Methods for field "v690NCEs"
							public V690NCEs getV690NCEs()
							{
							    return (V690NCEs)mComponents[1];
							}
							
							public void setV690NCEs(V690NCEs v690NCEs)
							{
							    mComponents[1] = v690NCEs;
							}
							
							public boolean hasV690NCEs()
							{
							    return componentIsPresent(1);
							}
							
							public void deleteV690NCEs()
							{
							    setComponentAbsent(1);
							}
							
							
							
							/**
							 * Define the ASN1 Type V690NCEs from ASN1 Module Internode_definitions.
							 * @see Sequence
							 */
							public static class V690NCEs extends Sequence {
							    
							    /**
							     * The default constructor.
							     */
							    public V690NCEs()
							    {
							    }
							    
							    /**
							     * Construct with AbstractData components.
							     */
							    public V690NCEs(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext, 
									    V6b0NCEs v6b0NCEs)
							    {
								setSRNC_RelocationInfo_v690ext(sRNC_RelocationInfo_v690ext);
								setV6b0NCEs(v6b0NCEs);
							    }
							    
							    /**
							     * Construct with required components.
							     */
							    public V690NCEs(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext)
							    {
								setSRNC_RelocationInfo_v690ext(sRNC_RelocationInfo_v690ext);
							    }
							    
							    public void initComponents()
							    {
								mComponents[0] = new SRNC_RelocationInfo_v690ext_IEs();
								mComponents[1] = new V6b0NCEs();
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
									return new SRNC_RelocationInfo_v690ext_IEs();
								    case 1:
									return new V6b0NCEs();
								    default:
									throw new InternalError("AbstractCollection.createInstance()");
								}
								
							    }
							    
							    
							    // Methods for field "sRNC_RelocationInfo_v690ext"
							    public SRNC_RelocationInfo_v690ext_IEs getSRNC_RelocationInfo_v690ext()
							    {
								return (SRNC_RelocationInfo_v690ext_IEs)mComponents[0];
							    }
							    
							    public void setSRNC_RelocationInfo_v690ext(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext)
							    {
								mComponents[0] = sRNC_RelocationInfo_v690ext;
							    }
							    
							    
							    // Methods for field "v6b0NCEs"
							    public V6b0NCEs getV6b0NCEs()
							    {
								return (V6b0NCEs)mComponents[1];
							    }
							    
							    public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
							    {
								mComponents[1] = v6b0NCEs;
							    }
							    
							    public boolean hasV6b0NCEs()
							    {
								return componentIsPresent(1);
							    }
							    
							    public void deleteV6b0NCEs()
							    {
								setComponentAbsent(1);
							    }
							    
							    
							    
							    /**
							     * Define the ASN1 Type V6b0NCEs from ASN1 Module Internode_definitions.
							     * @see Sequence
							     */
							    public static class V6b0NCEs extends Sequence {
								
								/**
								 * The default constructor.
								 */
								public V6b0NCEs()
								{
								}
								
								/**
								 * Construct with AbstractData components.
								 */
								public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext, 
										V770NCEs v770NCEs)
								{
								    setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
								    setV770NCEs(v770NCEs);
								}
								
								/**
								 * Construct with required components.
								 */
								public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
								{
								    setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
								}
								
								public void initComponents()
								{
								    mComponents[0] = new SRNC_RelocationInfo_v6b0ext_IEs();
								    mComponents[1] = new V770NCEs();
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
									    return new SRNC_RelocationInfo_v6b0ext_IEs();
									case 1:
									    return new V770NCEs();
									default:
									    throw new InternalError("AbstractCollection.createInstance()");
								    }
								    
								}
								
								
								// Methods for field "sRNC_RelocationInfo_v6b0ext"
								public SRNC_RelocationInfo_v6b0ext_IEs getSRNC_RelocationInfo_v6b0ext()
								{
								    return (SRNC_RelocationInfo_v6b0ext_IEs)mComponents[0];
								}
								
								public void setSRNC_RelocationInfo_v6b0ext(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
								{
								    mComponents[0] = sRNC_RelocationInfo_v6b0ext;
								}
								
								
								// Methods for field "v770NCEs"
								public V770NCEs getV770NCEs()
								{
								    return (V770NCEs)mComponents[1];
								}
								
								public void setV770NCEs(V770NCEs v770NCEs)
								{
								    mComponents[1] = v770NCEs;
								}
								
								public boolean hasV770NCEs()
								{
								    return componentIsPresent(1);
								}
								
								public void deleteV770NCEs()
								{
								    setComponentAbsent(1);
								}
								
								
								
								/**
								 * Define the ASN1 Type V770NCEs from ASN1 Module Internode_definitions.
								 * @see Sequence
								 */
								public static class V770NCEs extends Sequence {
								    
								    /**
								     * The default constructor.
								     */
								    public V770NCEs()
								    {
								    }
								    
								    /**
								     * Construct with AbstractData components.
								     */
								    public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext, 
										    V7e0NCEs v7e0NCEs)
								    {
									setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
									setV7e0NCEs(v7e0NCEs);
								    }
								    
								    /**
								     * Construct with required components.
								     */
								    public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
								    {
									setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
								    }
								    
								    public void initComponents()
								    {
									mComponents[0] = new SRNC_RelocationInfo_v770ext_IEs();
									mComponents[1] = new V7e0NCEs();
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
										return new SRNC_RelocationInfo_v770ext_IEs();
									    case 1:
										return new V7e0NCEs();
									    default:
										throw new InternalError("AbstractCollection.createInstance()");
									}
									
								    }
								    
								    
								    // Methods for field "sRNC_RelocationInfo_v770ext"
								    public SRNC_RelocationInfo_v770ext_IEs getSRNC_RelocationInfo_v770ext()
								    {
									return (SRNC_RelocationInfo_v770ext_IEs)mComponents[0];
								    }
								    
								    public void setSRNC_RelocationInfo_v770ext(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
								    {
									mComponents[0] = sRNC_RelocationInfo_v770ext;
								    }
								    
								    
								    // Methods for field "v7e0NCEs"
								    public V7e0NCEs getV7e0NCEs()
								    {
									return (V7e0NCEs)mComponents[1];
								    }
								    
								    public void setV7e0NCEs(V7e0NCEs v7e0NCEs)
								    {
									mComponents[1] = v7e0NCEs;
								    }
								    
								    public boolean hasV7e0NCEs()
								    {
									return componentIsPresent(1);
								    }
								    
								    public void deleteV7e0NCEs()
								    {
									setComponentAbsent(1);
								    }
								    
								    
								    
								    /**
								     * Define the ASN1 Type V7e0NCEs from ASN1 Module Internode_definitions.
								     * @see Sequence
								     */
								    public static class V7e0NCEs extends Sequence {
									
									/**
									 * The default constructor.
									 */
									public V7e0NCEs()
									{
									}
									
									/**
									 * Construct with AbstractData components.
									 */
									public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext, 
											V7f0NCEs v7f0NCEs)
									{
									    setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
									    setV7f0NCEs(v7f0NCEs);
									}
									
									/**
									 * Construct with required components.
									 */
									public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
									{
									    setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
									}
									
									public void initComponents()
									{
									    mComponents[0] = new SRNC_RelocationInfo_v7e0ext_IEs();
									    mComponents[1] = new V7f0NCEs();
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
										    return new SRNC_RelocationInfo_v7e0ext_IEs();
										case 1:
										    return new V7f0NCEs();
										default:
										    throw new InternalError("AbstractCollection.createInstance()");
									    }
									    
									}
									
									
									// Methods for field "sRNC_RelocationInfo_v7e0ext"
									public SRNC_RelocationInfo_v7e0ext_IEs getSRNC_RelocationInfo_v7e0ext()
									{
									    return (SRNC_RelocationInfo_v7e0ext_IEs)mComponents[0];
									}
									
									public void setSRNC_RelocationInfo_v7e0ext(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
									{
									    mComponents[0] = sRNC_RelocationInfo_v7e0ext;
									}
									
									
									// Methods for field "v7f0NCEs"
									public V7f0NCEs getV7f0NCEs()
									{
									    return (V7f0NCEs)mComponents[1];
									}
									
									public void setV7f0NCEs(V7f0NCEs v7f0NCEs)
									{
									    mComponents[1] = v7f0NCEs;
									}
									
									public boolean hasV7f0NCEs()
									{
									    return componentIsPresent(1);
									}
									
									public void deleteV7f0NCEs()
									{
									    setComponentAbsent(1);
									}
									
									
									
									/**
									 * Define the ASN1 Type V7f0NCEs from ASN1 Module Internode_definitions.
									 * @see Sequence
									 */
									public static class V7f0NCEs extends Sequence {
									    
									    /**
									     * The default constructor.
									     */
									    public V7f0NCEs()
									    {
									    }
									    
									    /**
									     * Construct with AbstractData components.
									     */
									    public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext, 
											    NonCriticalExtensions nonCriticalExtensions)
									    {
										setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
										setNonCriticalExtensions(nonCriticalExtensions);
									    }
									    
									    /**
									     * Construct with required components.
									     */
									    public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
									    {
										setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
									    }
									    
									    public void initComponents()
									    {
										mComponents[0] = new SRNC_RelocationInfo_v7f0ext_IEs();
										mComponents[1] = new NonCriticalExtensions();
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
											return new SRNC_RelocationInfo_v7f0ext_IEs();
										    case 1:
											return new NonCriticalExtensions();
										    default:
											throw new InternalError("AbstractCollection.createInstance()");
										}
										
									    }
									    
									    
									    // Methods for field "sRNC_RelocationInfo_v7f0ext"
									    public SRNC_RelocationInfo_v7f0ext_IEs getSRNC_RelocationInfo_v7f0ext()
									    {
										return (SRNC_RelocationInfo_v7f0ext_IEs)mComponents[0];
									    }
									    
									    public void setSRNC_RelocationInfo_v7f0ext(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
									    {
										mComponents[0] = sRNC_RelocationInfo_v7f0ext;
									    }
									    
									    
									    // Methods for field "nonCriticalExtensions"
									    public NonCriticalExtensions getNonCriticalExtensions()
									    {
										return (NonCriticalExtensions)mComponents[1];
									    }
									    
									    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
									    {
										mComponents[1] = nonCriticalExtensions;
									    }
									    
									    public boolean hasNonCriticalExtensions()
									    {
										return componentIsPresent(1);
									    }
									    
									    public void deleteNonCriticalExtensions()
									    {
										setComponentAbsent(1);
									    }
									    
									    
									    
									    /**
									     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
									     * @see Sequence
									     */
									    public static class NonCriticalExtensions extends Sequence {
										
										/**
										 * The default constructor.
										 */
										public NonCriticalExtensions()
										{
										}
										
										public void initComponents()
										{
										    
										}
										
										// Instance initializer
										{
										    mComponents = new AbstractData[0];
										}
										
										// Method to create a specific component instance
										public AbstractData createInstance(int index)
										{
										    return null;
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
											"rrc.internode_definitions",
											"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs$NonCriticalExtensions"
										    ),
										    new QName (
											"builtin",
											"SEQUENCE"
										    ),
										    12314,
										    null,
										    new Fields (
											new SequenceFieldInfo[] {
											}
										    ),
										    0,
										    null,
										    0
										);
										
										/**
										 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
										 */
										public TypeInfo getTypeInfo()
										{
										    return c_typeinfo;
										}
										
										/**
										 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
										 */
										public static TypeInfo getStaticTypeInfo()
										{
										    return c_typeinfo;
										}
										
									    } // End class definition for NonCriticalExtensions

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
										    "rrc.internode_definitions",
										    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs"
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
													"rrc.internode_definitions",
													"SRNC_RelocationInfo_v7f0ext_IEs"
												    ),
												    new QName (
													"Internode-definitions",
													"SRNC-RelocationInfo-v7f0ext-IEs"
												    ),
												    12314,
												    null,
												    new FieldsRef (
													new QName (
													    "rrc.internode_definitions",
													    "SRNC_RelocationInfo_v7f0ext_IEs"
													)
												    ),
												    0,
												    new TagDecodersRef (
													new QName (
													    "rrc.internode_definitions",
													    "SRNC_RelocationInfo_v7f0ext_IEs"
													)
												    ),
												    0
												)
											    ),
											    "sRNC-RelocationInfo-v7f0ext",
											    0,
											    2,
											    null
											),
											new SequenceFieldInfo (
											    new TypeInfoRef (
												new QName (
												    "rrc.internode_definitions",
												    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs$NonCriticalExtensions"
												)
											    ),
											    "nonCriticalExtensions",
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
									     * Get the type descriptor (TypeInfo) of 'this' V7f0NCEs object.
									     */
									    public TypeInfo getTypeInfo()
									    {
										return c_typeinfo;
									    }
									    
									    /**
									     * Get the static type descriptor (TypeInfo) of 'this' V7f0NCEs object.
									     */
									    public static TypeInfo getStaticTypeInfo()
									    {
										return c_typeinfo;
									    }
									    
									} // End class definition for V7f0NCEs

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
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs"
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
												    "rrc.internode_definitions",
												    "SRNC_RelocationInfo_v7e0ext_IEs"
												),
												new QName (
												    "Internode-definitions",
												    "SRNC-RelocationInfo-v7e0ext-IEs"
												),
												12314,
												null,
												new FieldsRef (
												    new QName (
													"rrc.internode_definitions",
													"SRNC_RelocationInfo_v7e0ext_IEs"
												    )
												),
												0,
												new TagDecodersRef (
												    new QName (
													"rrc.internode_definitions",
													"SRNC_RelocationInfo_v7e0ext_IEs"
												    )
												),
												0
											    )
											),
											"sRNC-RelocationInfo-v7e0ext",
											0,
											2,
											null
										    ),
										    new SequenceFieldInfo (
											new TypeInfoRef (
											    new QName (
												"rrc.internode_definitions",
												"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs"
											    )
											),
											"v7f0NCEs",
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
									 * Get the type descriptor (TypeInfo) of 'this' V7e0NCEs object.
									 */
									public TypeInfo getTypeInfo()
									{
									    return c_typeinfo;
									}
									
									/**
									 * Get the static type descriptor (TypeInfo) of 'this' V7e0NCEs object.
									 */
									public static TypeInfo getStaticTypeInfo()
									{
									    return c_typeinfo;
									}
									
								    } // End class definition for V7e0NCEs

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
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs"
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
												"rrc.internode_definitions",
												"SRNC_RelocationInfo_v770ext_IEs"
											    ),
											    new QName (
												"Internode-definitions",
												"SRNC-RelocationInfo-v770ext-IEs"
											    ),
											    12314,
											    null,
											    new FieldsRef (
												new QName (
												    "rrc.internode_definitions",
												    "SRNC_RelocationInfo_v770ext_IEs"
												)
											    ),
											    0,
											    new TagDecodersRef (
												new QName (
												    "rrc.internode_definitions",
												    "SRNC_RelocationInfo_v770ext_IEs"
												)
											    ),
											    0
											)
										    ),
										    "sRNC-RelocationInfo-v770ext",
										    0,
										    2,
										    null
										),
										new SequenceFieldInfo (
										    new TypeInfoRef (
											new QName (
											    "rrc.internode_definitions",
											    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs"
											)
										    ),
										    "v7e0NCEs",
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
								     * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
								     */
								    public TypeInfo getTypeInfo()
								    {
									return c_typeinfo;
								    }
								    
								    /**
								     * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
								     */
								    public static TypeInfo getStaticTypeInfo()
								    {
									return c_typeinfo;
								    }
								    
								} // End class definition for V770NCEs

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
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs"
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
											    "rrc.internode_definitions",
											    "SRNC_RelocationInfo_v6b0ext_IEs"
											),
											new QName (
											    "Internode-definitions",
											    "SRNC-RelocationInfo-v6b0ext-IEs"
											),
											12314,
											null,
											new FieldsRef (
											    new QName (
												"rrc.internode_definitions",
												"SRNC_RelocationInfo_v6b0ext_IEs"
											    )
											),
											0,
											new TagDecodersRef (
											    new QName (
												"rrc.internode_definitions",
												"SRNC_RelocationInfo_v6b0ext_IEs"
											    )
											),
											0
										    )
										),
										"sRNC-RelocationInfo-v6b0ext",
										0,
										2,
										null
									    ),
									    new SequenceFieldInfo (
										new TypeInfoRef (
										    new QName (
											"rrc.internode_definitions",
											"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs"
										    )
										),
										"v770NCEs",
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
								 * Get the type descriptor (TypeInfo) of 'this' V6b0NCEs object.
								 */
								public TypeInfo getTypeInfo()
								{
								    return c_typeinfo;
								}
								
								/**
								 * Get the static type descriptor (TypeInfo) of 'this' V6b0NCEs object.
								 */
								public static TypeInfo getStaticTypeInfo()
								{
								    return c_typeinfo;
								}
								
							    } // End class definition for V6b0NCEs

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
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs"
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
											"rrc.internode_definitions",
											"SRNC_RelocationInfo_v690ext_IEs"
										    ),
										    new QName (
											"Internode-definitions",
											"SRNC-RelocationInfo-v690ext-IEs"
										    ),
										    12314,
										    null,
										    new FieldsRef (
											new QName (
											    "rrc.internode_definitions",
											    "SRNC_RelocationInfo_v690ext_IEs"
											)
										    ),
										    0,
										    new TagDecodersRef (
											new QName (
											    "rrc.internode_definitions",
											    "SRNC_RelocationInfo_v690ext_IEs"
											)
										    ),
										    0
										)
									    ),
									    "sRNC-RelocationInfo-v690ext",
									    0,
									    2,
									    null
									),
									new SequenceFieldInfo (
									    new TypeInfoRef (
										new QName (
										    "rrc.internode_definitions",
										    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs"
										)
									    ),
									    "v6b0NCEs",
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
							     * Get the type descriptor (TypeInfo) of 'this' V690NCEs object.
							     */
							    public TypeInfo getTypeInfo()
							    {
								return c_typeinfo;
							    }
							    
							    /**
							     * Get the static type descriptor (TypeInfo) of 'this' V690NCEs object.
							     */
							    public static TypeInfo getStaticTypeInfo()
							    {
								return c_typeinfo;
							    }
							    
							} // End class definition for V690NCEs

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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs"
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
										    "rrc.internode_definitions",
										    "SRNC_RelocationInfo_v5c0ext_IEs"
										),
										new QName (
										    "Internode-definitions",
										    "SRNC-RelocationInfo-v5c0ext-IEs"
										),
										12314,
										null,
										new FieldsRef (
										    new QName (
											"rrc.internode_definitions",
											"SRNC_RelocationInfo_v5c0ext_IEs"
										    )
										),
										0,
										new TagDecodersRef (
										    new QName (
											"rrc.internode_definitions",
											"SRNC_RelocationInfo_v5c0ext_IEs"
										    )
										),
										0
									    )
									),
									"sRNC-RelocationInfo-v5c0ext",
									0,
									2,
									null
								    ),
								    new SequenceFieldInfo (
									new TypeInfoRef (
									    new QName (
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs"
									    )
									),
									"v690NCEs",
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
							 * Get the type descriptor (TypeInfo) of 'this' V5c0NCEs object.
							 */
							public TypeInfo getTypeInfo()
							{
							    return c_typeinfo;
							}
							
							/**
							 * Get the static type descriptor (TypeInfo) of 'this' V5c0NCEs object.
							 */
							public static TypeInfo getStaticTypeInfo()
							{
							    return c_typeinfo;
							}
							
						    } // End class definition for V5c0NCEs

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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs"
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
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v5b0ext_IEs"
									    ),
									    new QName (
										"Internode-definitions",
										"SRNC-RelocationInfo-v5b0ext-IEs"
									    ),
									    12314,
									    null,
									    new FieldsRef (
										new QName (
										    "rrc.internode_definitions",
										    "SRNC_RelocationInfo_v5b0ext_IEs"
										)
									    ),
									    0,
									    new TagDecodersRef (
										new QName (
										    "rrc.internode_definitions",
										    "SRNC_RelocationInfo_v5b0ext_IEs"
										)
									    ),
									    0
									)
								    ),
								    "sRNC-RelocationInfo-v5b0ext",
								    0,
								    2,
								    null
								),
								new SequenceFieldInfo (
								    new TypeInfoRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs"
									)
								    ),
								    "v5c0NCEs",
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
						     * Get the type descriptor (TypeInfo) of 'this' V5b0NCEs object.
						     */
						    public TypeInfo getTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						    /**
						     * Get the static type descriptor (TypeInfo) of 'this' V5b0NCEs object.
						     */
						    public static TypeInfo getStaticTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						} // End class definition for V5b0NCEs

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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs"
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
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v5a0ext_IEs"
									),
									new QName (
									    "Internode-definitions",
									    "SRNC-RelocationInfo-v5a0ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v5a0ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v5a0ext_IEs"
									    )
									),
									0
								    )
								),
								"sRNC-RelocationInfo-v5a0ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs"
								    )
								),
								"v5b0NCEs",
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
						 * Get the type descriptor (TypeInfo) of 'this' V5a0NCEs object.
						 */
						public TypeInfo getTypeInfo()
						{
						    return c_typeinfo;
						}
						
						/**
						 * Get the static type descriptor (TypeInfo) of 'this' V5a0NCEs object.
						 */
						public static TypeInfo getStaticTypeInfo()
						{
						    return c_typeinfo;
						}
						
					    } // End class definition for V5a0NCEs

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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs"
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
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v590ext_IEs"
								    ),
								    new QName (
									"Internode-definitions",
									"SRNC-RelocationInfo-v590ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v590ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v590ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "sRNC-RelocationInfo-v590ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5a0NCEs"
								)
							    ),
							    "v5a0NCEs",
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
					     * Get the type descriptor (TypeInfo) of 'this' V590NCEs object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' V590NCEs object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for V590NCEs

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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs"
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
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v4b0ext_IEs"
								),
								new QName (
								    "Internode-definitions",
								    "SRNC-RelocationInfo-v4b0ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v4b0ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v4b0ext_IEs"
								    )
								),
								0
							    )
							),
							"sRNC-RelocationInfo-v4b0ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs"
							    )
							),
							"v590NCEs",
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
					 * Get the type descriptor (TypeInfo) of 'this' V4b0NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V4b0NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V4b0NCEs

				    /**
				     * Initialize the type descriptor.
				     */
				    private static final SequenceInfo c_typeinfo = new SequenceInfo (
					new Tags (
					    new short[] {
						(short)0x8002
					    }
					),
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs"
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v3g0ext_IEs"
							    ),
							    new QName (
								"Internode-definitions",
								"SRNC-RelocationInfo-v3g0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v3g0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v3g0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sRNC-RelocationInfo-v3g0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs"
							)
						    ),
						    "v4b0NCEs",
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
				     * Get the type descriptor (TypeInfo) of 'this' V3g0NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V3g0NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V3g0NCEs

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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs"
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v3d0ext_IEs"
							),
							new QName (
							    "Internode-definitions",
							    "SRNC-RelocationInfo-v3d0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v3d0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v3d0ext_IEs"
							    )
							),
							0
						    )
						),
						"sRNC-RelocationInfo-v3d0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$SRNC_RelocationInfo_r3_add_ext"
						    )
						),
						"sRNC-RelocationInfo-r3-add-ext",
						1,
						3,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs$V3g0NCEs"
						    )
						),
						"v3g0NCEs",
						2,
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
						    new TagDecoderElement((short)0x8001, 1),
						    new TagDecoderElement((short)0x8002, 2)
						}
					    ),
					    new TagDecoder (
						new TagDecoderElement[] {
						    new TagDecoderElement((short)0x8002, 2)
						}
					    )
					}
				    ),
				    0
				);
				
				/**
				 * Get the type descriptor (TypeInfo) of 'this' LaterNCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' LaterNCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for LaterNCEs

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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs"
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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v3c0ext_IEs"
						    ),
						    new QName (
							"Internode-definitions",
							"SRNC-RelocationInfo-v3c0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v3c0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v3c0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sRNC-RelocationInfo-v3c0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs$LaterNCEs"
						)
					    ),
					    "laterNCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V3c0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V3c0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V3c0NCEs

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
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs"
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v3b0ext_IEs"
						),
						new QName (
						    "Internode-definitions",
						    "SRNC-RelocationInfo-v3b0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v3b0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v3b0ext_IEs"
						    )
						),
						0
					    )
					),
					"sRNC-RelocationInfo-v3b0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs$V3c0NCEs"
					    )
					),
					"v3c0NCEs",
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
			 * Get the type descriptor (TypeInfo) of 'this' V3b0NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V3b0NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V3b0NCEs

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
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs"
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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v3a0ext_IEs"
					    ),
					    new QName (
						"Internode-definitions",
						"SRNC-RelocationInfo-v3a0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v3a0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v3a0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sRNC-RelocationInfo-v3a0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs$V3b0NCEs"
					)
				    ),
				    "v3b0NCEs",
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
		     * Get the type descriptor (TypeInfo) of 'this' V3a0NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V3a0NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V3a0NCEs

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
			"rrc.internode_definitions",
			"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs"
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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_v390ext_IEs"
					),
					new QName (
					    "Internode-definitions",
					    "SRNC-RelocationInfo-v390ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v390ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v390ext_IEs"
					    )
					),
					0
				    )
				),
				"sRNC-RelocationInfo-v390ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs$V3a0NCEs"
				    )
				),
				"v3a0NCEs",
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
		 * Get the type descriptor (TypeInfo) of 'this' V390NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V390NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V390NCEs

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
		    "rrc.internode_definitions",
		    "SRNC_RelocationInfo_r3$R3$V380NCEs"
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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_v380ext_IEs"
				    ),
				    new QName (
					"Internode-definitions",
					"SRNC-RelocationInfo-v380ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_v380ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_v380ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sRNC-RelocationInfo-v380ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$R3$V380NCEs$V390NCEs"
				)
			    ),
			    "v390NCEs",
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
	     * Get the type descriptor (TypeInfo) of 'this' V380NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V380NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V380NCEs

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
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r3$R3"
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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3_IEs"
				),
				new QName (
				    "Internode-definitions",
				    "SRNC-RelocationInfo-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3_IEs"
				    )
				),
				0
			    )
			),
			"sRNC-RelocationInfo-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$R3$V380NCEs"
			    )
			),
			"v380NCEs",
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
	 * Get the type descriptor (TypeInfo) of 'this' R3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' R3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for R3

    // Methods for field "later_than_r3"
    public static SRNC_RelocationInfo_r3 createSRNC_RelocationInfo_r3WithLater_than_r3(Later_than_r3 later_than_r3)
    {
	SRNC_RelocationInfo_r3 __object = new SRNC_RelocationInfo_r3();

	__object.setLater_than_r3(later_than_r3);
	return __object;
    }
    
    public boolean hasLater_than_r3()
    {
	return getChosenFlag() == later_than_r3_chosen;
    }
    
    public void setLater_than_r3(Later_than_r3 later_than_r3)
    {
	setChosenValue(later_than_r3);
	setChosenFlag(later_than_r3_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Later_than_r3 from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class Later_than_r3 extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Later_than_r3()
	{
	}
	
	public static final  int  r4_chosen = 1;
	public static final  int  criticalExtensions_chosen = 2;
	
	// Methods for field "r4"
	public static Later_than_r3 createLater_than_r3WithR4(R4 r4)
	{
	    Later_than_r3 __object = new Later_than_r3();

	    __object.setR4(r4);
	    return __object;
	}
	
	public boolean hasR4()
	{
	    return getChosenFlag() == r4_chosen;
	}
	
	public void setR4(R4 r4)
	{
	    setChosenValue(r4);
	    setChosenFlag(r4_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type R4 from ASN1 Module Internode_definitions.
	 * @see Sequence
	 */
	public static class R4 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public R4()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public R4(SRNC_RelocationInfo_r4_IEs sRNC_RelocationInfo_r4, 
			    V4d0NCEs v4d0NCEs)
	    {
		setSRNC_RelocationInfo_r4(sRNC_RelocationInfo_r4);
		setV4d0NCEs(v4d0NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public R4(SRNC_RelocationInfo_r4_IEs sRNC_RelocationInfo_r4)
	    {
		setSRNC_RelocationInfo_r4(sRNC_RelocationInfo_r4);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SRNC_RelocationInfo_r4_IEs();
		mComponents[1] = new V4d0NCEs();
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
			return new SRNC_RelocationInfo_r4_IEs();
		    case 1:
			return new V4d0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sRNC_RelocationInfo_r4"
	    public SRNC_RelocationInfo_r4_IEs getSRNC_RelocationInfo_r4()
	    {
		return (SRNC_RelocationInfo_r4_IEs)mComponents[0];
	    }
	    
	    public void setSRNC_RelocationInfo_r4(SRNC_RelocationInfo_r4_IEs sRNC_RelocationInfo_r4)
	    {
		mComponents[0] = sRNC_RelocationInfo_r4;
	    }
	    
	    
	    // Methods for field "v4d0NCEs"
	    public V4d0NCEs getV4d0NCEs()
	    {
		return (V4d0NCEs)mComponents[1];
	    }
	    
	    public void setV4d0NCEs(V4d0NCEs v4d0NCEs)
	    {
		mComponents[1] = v4d0NCEs;
	    }
	    
	    public boolean hasV4d0NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV4d0NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V4d0NCEs from ASN1 Module Internode_definitions.
	     * @see Sequence
	     */
	    public static class V4d0NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V4d0NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V4d0NCEs(SRNC_RelocationInfo_v4d0ext_IEs sRNC_RelocationInfo_v4d0ext, 
				BitString sRNC_RelocationInfo_r4_add_ext, 
				V590NCEs v590NCEs)
		{
		    setSRNC_RelocationInfo_v4d0ext(sRNC_RelocationInfo_v4d0ext);
		    setSRNC_RelocationInfo_r4_add_ext(sRNC_RelocationInfo_r4_add_ext);
		    setV590NCEs(v590NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V4d0NCEs(SRNC_RelocationInfo_v4d0ext_IEs sRNC_RelocationInfo_v4d0ext)
		{
		    setSRNC_RelocationInfo_v4d0ext(sRNC_RelocationInfo_v4d0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SRNC_RelocationInfo_v4d0ext_IEs();
		    mComponents[1] = new BitString();
		    mComponents[2] = new V590NCEs();
		}
		
		// Instance initializer
		{
		    mComponents = new AbstractData[3];
		}
		
		// Method to create a specific component instance
		public AbstractData createInstance(int index)
		{
		    switch (index) {
			case 0:
			    return new SRNC_RelocationInfo_v4d0ext_IEs();
			case 1:
			    return new BitString();
			case 2:
			    return new V590NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sRNC_RelocationInfo_v4d0ext"
		public SRNC_RelocationInfo_v4d0ext_IEs getSRNC_RelocationInfo_v4d0ext()
		{
		    return (SRNC_RelocationInfo_v4d0ext_IEs)mComponents[0];
		}
		
		public void setSRNC_RelocationInfo_v4d0ext(SRNC_RelocationInfo_v4d0ext_IEs sRNC_RelocationInfo_v4d0ext)
		{
		    mComponents[0] = sRNC_RelocationInfo_v4d0ext;
		}
		
		
		// Methods for field "sRNC_RelocationInfo_r4_add_ext"
		public BitString getSRNC_RelocationInfo_r4_add_ext()
		{
		    return (BitString)mComponents[1];
		}
		
		public void setSRNC_RelocationInfo_r4_add_ext(BitString sRNC_RelocationInfo_r4_add_ext)
		{
		    mComponents[1] = sRNC_RelocationInfo_r4_add_ext;
		}
		
		public boolean hasSRNC_RelocationInfo_r4_add_ext()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteSRNC_RelocationInfo_r4_add_ext()
		{
		    setComponentAbsent(1);
		}
		
		
		// Methods for field "v590NCEs"
		public V590NCEs getV590NCEs()
		{
		    return (V590NCEs)mComponents[2];
		}
		
		public void setV590NCEs(V590NCEs v590NCEs)
		{
		    mComponents[2] = v590NCEs;
		}
		
		public boolean hasV590NCEs()
		{
		    return componentIsPresent(2);
		}
		
		public void deleteV590NCEs()
		{
		    setComponentAbsent(2);
		}
		
		
		
		/**
		 * Define the ASN1 Type V590NCEs from ASN1 Module Internode_definitions.
		 * @see Sequence
		 */
		public static class V590NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V590NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V590NCEs(SRNC_RelocationInfo_v590ext_IEs sRNC_RelocationInfo_v590ext, 
				    V5a0NCEs v5a0NCEs)
		    {
			setSRNC_RelocationInfo_v590ext(sRNC_RelocationInfo_v590ext);
			setV5a0NCEs(v5a0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V590NCEs(SRNC_RelocationInfo_v590ext_IEs sRNC_RelocationInfo_v590ext)
		    {
			setSRNC_RelocationInfo_v590ext(sRNC_RelocationInfo_v590ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SRNC_RelocationInfo_v590ext_IEs();
			mComponents[1] = new V5a0NCEs();
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
				return new SRNC_RelocationInfo_v590ext_IEs();
			    case 1:
				return new V5a0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sRNC_RelocationInfo_v590ext"
		    public SRNC_RelocationInfo_v590ext_IEs getSRNC_RelocationInfo_v590ext()
		    {
			return (SRNC_RelocationInfo_v590ext_IEs)mComponents[0];
		    }
		    
		    public void setSRNC_RelocationInfo_v590ext(SRNC_RelocationInfo_v590ext_IEs sRNC_RelocationInfo_v590ext)
		    {
			mComponents[0] = sRNC_RelocationInfo_v590ext;
		    }
		    
		    
		    // Methods for field "v5a0NCEs"
		    public V5a0NCEs getV5a0NCEs()
		    {
			return (V5a0NCEs)mComponents[1];
		    }
		    
		    public void setV5a0NCEs(V5a0NCEs v5a0NCEs)
		    {
			mComponents[1] = v5a0NCEs;
		    }
		    
		    public boolean hasV5a0NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV5a0NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V5a0NCEs from ASN1 Module Internode_definitions.
		     * @see Sequence
		     */
		    public static class V5a0NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V5a0NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V5a0NCEs(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext, 
					V5b0NCEs v5b0NCEs)
			{
			    setSRNC_RelocationInfo_v5a0ext(sRNC_RelocationInfo_v5a0ext);
			    setV5b0NCEs(v5b0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V5a0NCEs(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext)
			{
			    setSRNC_RelocationInfo_v5a0ext(sRNC_RelocationInfo_v5a0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SRNC_RelocationInfo_v5a0ext_IEs();
			    mComponents[1] = new V5b0NCEs();
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
				    return new SRNC_RelocationInfo_v5a0ext_IEs();
				case 1:
				    return new V5b0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sRNC_RelocationInfo_v5a0ext"
			public SRNC_RelocationInfo_v5a0ext_IEs getSRNC_RelocationInfo_v5a0ext()
			{
			    return (SRNC_RelocationInfo_v5a0ext_IEs)mComponents[0];
			}
			
			public void setSRNC_RelocationInfo_v5a0ext(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext)
			{
			    mComponents[0] = sRNC_RelocationInfo_v5a0ext;
			}
			
			
			// Methods for field "v5b0NCEs"
			public V5b0NCEs getV5b0NCEs()
			{
			    return (V5b0NCEs)mComponents[1];
			}
			
			public void setV5b0NCEs(V5b0NCEs v5b0NCEs)
			{
			    mComponents[1] = v5b0NCEs;
			}
			
			public boolean hasV5b0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV5b0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V5b0NCEs from ASN1 Module Internode_definitions.
			 * @see Sequence
			 */
			public static class V5b0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V5b0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V5b0NCEs(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext, 
					    V5c0NCEs v5c0NCEs)
			    {
				setSRNC_RelocationInfo_v5b0ext(sRNC_RelocationInfo_v5b0ext);
				setV5c0NCEs(v5c0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V5b0NCEs(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext)
			    {
				setSRNC_RelocationInfo_v5b0ext(sRNC_RelocationInfo_v5b0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SRNC_RelocationInfo_v5b0ext_IEs();
				mComponents[1] = new V5c0NCEs();
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
					return new SRNC_RelocationInfo_v5b0ext_IEs();
				    case 1:
					return new V5c0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sRNC_RelocationInfo_v5b0ext"
			    public SRNC_RelocationInfo_v5b0ext_IEs getSRNC_RelocationInfo_v5b0ext()
			    {
				return (SRNC_RelocationInfo_v5b0ext_IEs)mComponents[0];
			    }
			    
			    public void setSRNC_RelocationInfo_v5b0ext(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext)
			    {
				mComponents[0] = sRNC_RelocationInfo_v5b0ext;
			    }
			    
			    
			    // Methods for field "v5c0NCEs"
			    public V5c0NCEs getV5c0NCEs()
			    {
				return (V5c0NCEs)mComponents[1];
			    }
			    
			    public void setV5c0NCEs(V5c0NCEs v5c0NCEs)
			    {
				mComponents[1] = v5c0NCEs;
			    }
			    
			    public boolean hasV5c0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV5c0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V5c0NCEs from ASN1 Module Internode_definitions.
			     * @see Sequence
			     */
			    public static class V5c0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V5c0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V5c0NCEs(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext, 
						V690NCEs v690NCEs)
				{
				    setSRNC_RelocationInfo_v5c0ext(sRNC_RelocationInfo_v5c0ext);
				    setV690NCEs(v690NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V5c0NCEs(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext)
				{
				    setSRNC_RelocationInfo_v5c0ext(sRNC_RelocationInfo_v5c0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SRNC_RelocationInfo_v5c0ext_IEs();
				    mComponents[1] = new V690NCEs();
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
					    return new SRNC_RelocationInfo_v5c0ext_IEs();
					case 1:
					    return new V690NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sRNC_RelocationInfo_v5c0ext"
				public SRNC_RelocationInfo_v5c0ext_IEs getSRNC_RelocationInfo_v5c0ext()
				{
				    return (SRNC_RelocationInfo_v5c0ext_IEs)mComponents[0];
				}
				
				public void setSRNC_RelocationInfo_v5c0ext(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext)
				{
				    mComponents[0] = sRNC_RelocationInfo_v5c0ext;
				}
				
				
				// Methods for field "v690NCEs"
				public V690NCEs getV690NCEs()
				{
				    return (V690NCEs)mComponents[1];
				}
				
				public void setV690NCEs(V690NCEs v690NCEs)
				{
				    mComponents[1] = v690NCEs;
				}
				
				public boolean hasV690NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV690NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V690NCEs from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class V690NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V690NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V690NCEs(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext, 
						    V6b0NCEs v6b0NCEs)
				    {
					setSRNC_RelocationInfo_v690ext(sRNC_RelocationInfo_v690ext);
					setV6b0NCEs(v6b0NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V690NCEs(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext)
				    {
					setSRNC_RelocationInfo_v690ext(sRNC_RelocationInfo_v690ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SRNC_RelocationInfo_v690ext_IEs();
					mComponents[1] = new V6b0NCEs();
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
						return new SRNC_RelocationInfo_v690ext_IEs();
					    case 1:
						return new V6b0NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_v690ext"
				    public SRNC_RelocationInfo_v690ext_IEs getSRNC_RelocationInfo_v690ext()
				    {
					return (SRNC_RelocationInfo_v690ext_IEs)mComponents[0];
				    }
				    
				    public void setSRNC_RelocationInfo_v690ext(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext)
				    {
					mComponents[0] = sRNC_RelocationInfo_v690ext;
				    }
				    
				    
				    // Methods for field "v6b0NCEs"
				    public V6b0NCEs getV6b0NCEs()
				    {
					return (V6b0NCEs)mComponents[1];
				    }
				    
				    public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
				    {
					mComponents[1] = v6b0NCEs;
				    }
				    
				    public boolean hasV6b0NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV6b0NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V6b0NCEs from ASN1 Module Internode_definitions.
				     * @see Sequence
				     */
				    public static class V6b0NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V6b0NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext, 
							V770NCEs v770NCEs)
					{
					    setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
					    setV770NCEs(v770NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
					{
					    setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new SRNC_RelocationInfo_v6b0ext_IEs();
					    mComponents[1] = new V770NCEs();
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
						    return new SRNC_RelocationInfo_v6b0ext_IEs();
						case 1:
						    return new V770NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "sRNC_RelocationInfo_v6b0ext"
					public SRNC_RelocationInfo_v6b0ext_IEs getSRNC_RelocationInfo_v6b0ext()
					{
					    return (SRNC_RelocationInfo_v6b0ext_IEs)mComponents[0];
					}
					
					public void setSRNC_RelocationInfo_v6b0ext(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
					{
					    mComponents[0] = sRNC_RelocationInfo_v6b0ext;
					}
					
					
					// Methods for field "v770NCEs"
					public V770NCEs getV770NCEs()
					{
					    return (V770NCEs)mComponents[1];
					}
					
					public void setV770NCEs(V770NCEs v770NCEs)
					{
					    mComponents[1] = v770NCEs;
					}
					
					public boolean hasV770NCEs()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteV770NCEs()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type V770NCEs from ASN1 Module Internode_definitions.
					 * @see Sequence
					 */
					public static class V770NCEs extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public V770NCEs()
					    {
					    }
					    
					    /**
					     * Construct with AbstractData components.
					     */
					    public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext, 
							    V7e0NCEs v7e0NCEs)
					    {
						setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
						setV7e0NCEs(v7e0NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
					    {
						setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new SRNC_RelocationInfo_v770ext_IEs();
						mComponents[1] = new V7e0NCEs();
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
							return new SRNC_RelocationInfo_v770ext_IEs();
						    case 1:
							return new V7e0NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "sRNC_RelocationInfo_v770ext"
					    public SRNC_RelocationInfo_v770ext_IEs getSRNC_RelocationInfo_v770ext()
					    {
						return (SRNC_RelocationInfo_v770ext_IEs)mComponents[0];
					    }
					    
					    public void setSRNC_RelocationInfo_v770ext(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
					    {
						mComponents[0] = sRNC_RelocationInfo_v770ext;
					    }
					    
					    
					    // Methods for field "v7e0NCEs"
					    public V7e0NCEs getV7e0NCEs()
					    {
						return (V7e0NCEs)mComponents[1];
					    }
					    
					    public void setV7e0NCEs(V7e0NCEs v7e0NCEs)
					    {
						mComponents[1] = v7e0NCEs;
					    }
					    
					    public boolean hasV7e0NCEs()
					    {
						return componentIsPresent(1);
					    }
					    
					    public void deleteV7e0NCEs()
					    {
						setComponentAbsent(1);
					    }
					    
					    
					    
					    /**
					     * Define the ASN1 Type V7e0NCEs from ASN1 Module Internode_definitions.
					     * @see Sequence
					     */
					    public static class V7e0NCEs extends Sequence {
						
						/**
						 * The default constructor.
						 */
						public V7e0NCEs()
						{
						}
						
						/**
						 * Construct with AbstractData components.
						 */
						public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext, 
								V7f0NCEs v7f0NCEs)
						{
						    setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
						    setV7f0NCEs(v7f0NCEs);
						}
						
						/**
						 * Construct with required components.
						 */
						public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
						{
						    setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new SRNC_RelocationInfo_v7e0ext_IEs();
						    mComponents[1] = new V7f0NCEs();
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
							    return new SRNC_RelocationInfo_v7e0ext_IEs();
							case 1:
							    return new V7f0NCEs();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "sRNC_RelocationInfo_v7e0ext"
						public SRNC_RelocationInfo_v7e0ext_IEs getSRNC_RelocationInfo_v7e0ext()
						{
						    return (SRNC_RelocationInfo_v7e0ext_IEs)mComponents[0];
						}
						
						public void setSRNC_RelocationInfo_v7e0ext(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
						{
						    mComponents[0] = sRNC_RelocationInfo_v7e0ext;
						}
						
						
						// Methods for field "v7f0NCEs"
						public V7f0NCEs getV7f0NCEs()
						{
						    return (V7f0NCEs)mComponents[1];
						}
						
						public void setV7f0NCEs(V7f0NCEs v7f0NCEs)
						{
						    mComponents[1] = v7f0NCEs;
						}
						
						public boolean hasV7f0NCEs()
						{
						    return componentIsPresent(1);
						}
						
						public void deleteV7f0NCEs()
						{
						    setComponentAbsent(1);
						}
						
						
						
						/**
						 * Define the ASN1 Type V7f0NCEs from ASN1 Module Internode_definitions.
						 * @see Sequence
						 */
						public static class V7f0NCEs extends Sequence {
						    
						    /**
						     * The default constructor.
						     */
						    public V7f0NCEs()
						    {
						    }
						    
						    /**
						     * Construct with AbstractData components.
						     */
						    public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext, 
								    NonCriticalExtensions nonCriticalExtensions)
						    {
							setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
							setNonCriticalExtensions(nonCriticalExtensions);
						    }
						    
						    /**
						     * Construct with required components.
						     */
						    public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
						    {
							setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
						    }
						    
						    public void initComponents()
						    {
							mComponents[0] = new SRNC_RelocationInfo_v7f0ext_IEs();
							mComponents[1] = new NonCriticalExtensions();
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
								return new SRNC_RelocationInfo_v7f0ext_IEs();
							    case 1:
								return new NonCriticalExtensions();
							    default:
								throw new InternalError("AbstractCollection.createInstance()");
							}
							
						    }
						    
						    
						    // Methods for field "sRNC_RelocationInfo_v7f0ext"
						    public SRNC_RelocationInfo_v7f0ext_IEs getSRNC_RelocationInfo_v7f0ext()
						    {
							return (SRNC_RelocationInfo_v7f0ext_IEs)mComponents[0];
						    }
						    
						    public void setSRNC_RelocationInfo_v7f0ext(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
						    {
							mComponents[0] = sRNC_RelocationInfo_v7f0ext;
						    }
						    
						    
						    // Methods for field "nonCriticalExtensions"
						    public NonCriticalExtensions getNonCriticalExtensions()
						    {
							return (NonCriticalExtensions)mComponents[1];
						    }
						    
						    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
						    {
							mComponents[1] = nonCriticalExtensions;
						    }
						    
						    public boolean hasNonCriticalExtensions()
						    {
							return componentIsPresent(1);
						    }
						    
						    public void deleteNonCriticalExtensions()
						    {
							setComponentAbsent(1);
						    }
						    
						    
						    
						    /**
						     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
						     * @see Sequence
						     */
						    public static class NonCriticalExtensions extends Sequence {
							
							/**
							 * The default constructor.
							 */
							public NonCriticalExtensions()
							{
							}
							
							public void initComponents()
							{
							    
							}
							
							// Instance initializer
							{
							    mComponents = new AbstractData[0];
							}
							
							// Method to create a specific component instance
							public AbstractData createInstance(int index)
							{
							    return null;
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs$NonCriticalExtensions"
							    ),
							    new QName (
								"builtin",
								"SEQUENCE"
							    ),
							    12314,
							    null,
							    new Fields (
								new SequenceFieldInfo[] {
								}
							    ),
							    0,
							    null,
							    0
							);
							
							/**
							 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
							 */
							public TypeInfo getTypeInfo()
							{
							    return c_typeinfo;
							}
							
							/**
							 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
							 */
							public static TypeInfo getStaticTypeInfo()
							{
							    return c_typeinfo;
							}
							
						    } // End class definition for NonCriticalExtensions

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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs"
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
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v7f0ext_IEs"
									    ),
									    new QName (
										"Internode-definitions",
										"SRNC-RelocationInfo-v7f0ext-IEs"
									    ),
									    12314,
									    null,
									    new FieldsRef (
										new QName (
										    "rrc.internode_definitions",
										    "SRNC_RelocationInfo_v7f0ext_IEs"
										)
									    ),
									    0,
									    new TagDecodersRef (
										new QName (
										    "rrc.internode_definitions",
										    "SRNC_RelocationInfo_v7f0ext_IEs"
										)
									    ),
									    0
									)
								    ),
								    "sRNC-RelocationInfo-v7f0ext",
								    0,
								    2,
								    null
								),
								new SequenceFieldInfo (
								    new TypeInfoRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs$NonCriticalExtensions"
									)
								    ),
								    "nonCriticalExtensions",
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
						     * Get the type descriptor (TypeInfo) of 'this' V7f0NCEs object.
						     */
						    public TypeInfo getTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						    /**
						     * Get the static type descriptor (TypeInfo) of 'this' V7f0NCEs object.
						     */
						    public static TypeInfo getStaticTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						} // End class definition for V7f0NCEs

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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs"
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
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v7e0ext_IEs"
									),
									new QName (
									    "Internode-definitions",
									    "SRNC-RelocationInfo-v7e0ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v7e0ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v7e0ext_IEs"
									    )
									),
									0
								    )
								),
								"sRNC-RelocationInfo-v7e0ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs"
								    )
								),
								"v7f0NCEs",
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
						 * Get the type descriptor (TypeInfo) of 'this' V7e0NCEs object.
						 */
						public TypeInfo getTypeInfo()
						{
						    return c_typeinfo;
						}
						
						/**
						 * Get the static type descriptor (TypeInfo) of 'this' V7e0NCEs object.
						 */
						public static TypeInfo getStaticTypeInfo()
						{
						    return c_typeinfo;
						}
						
					    } // End class definition for V7e0NCEs

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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs"
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
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v770ext_IEs"
								    ),
								    new QName (
									"Internode-definitions",
									"SRNC-RelocationInfo-v770ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v770ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v770ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "sRNC-RelocationInfo-v770ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs"
								)
							    ),
							    "v7e0NCEs",
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
					     * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for V770NCEs

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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs"
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
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v6b0ext_IEs"
								),
								new QName (
								    "Internode-definitions",
								    "SRNC-RelocationInfo-v6b0ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v6b0ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v6b0ext_IEs"
								    )
								),
								0
							    )
							),
							"sRNC-RelocationInfo-v6b0ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs"
							    )
							),
							"v770NCEs",
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
					 * Get the type descriptor (TypeInfo) of 'this' V6b0NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V6b0NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V6b0NCEs

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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs"
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v690ext_IEs"
							    ),
							    new QName (
								"Internode-definitions",
								"SRNC-RelocationInfo-v690ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v690ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v690ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sRNC-RelocationInfo-v690ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs"
							)
						    ),
						    "v6b0NCEs",
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
				     * Get the type descriptor (TypeInfo) of 'this' V690NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V690NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V690NCEs

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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs"
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v5c0ext_IEs"
							),
							new QName (
							    "Internode-definitions",
							    "SRNC-RelocationInfo-v5c0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v5c0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v5c0ext_IEs"
							    )
							),
							0
						    )
						),
						"sRNC-RelocationInfo-v5c0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs"
						    )
						),
						"v690NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V5c0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V5c0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V5c0NCEs

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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs"
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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v5b0ext_IEs"
						    ),
						    new QName (
							"Internode-definitions",
							"SRNC-RelocationInfo-v5b0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v5b0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v5b0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sRNC-RelocationInfo-v5b0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs$V5c0NCEs"
						)
					    ),
					    "v5c0NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V5b0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V5b0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V5b0NCEs

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
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs"
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v5a0ext_IEs"
						),
						new QName (
						    "Internode-definitions",
						    "SRNC-RelocationInfo-v5a0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v5a0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v5a0ext_IEs"
						    )
						),
						0
					    )
					),
					"sRNC-RelocationInfo-v5a0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs$V5b0NCEs"
					    )
					),
					"v5b0NCEs",
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
			 * Get the type descriptor (TypeInfo) of 'this' V5a0NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V5a0NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V5a0NCEs

		    /**
		     * Initialize the type descriptor.
		     */
		    private static final SequenceInfo c_typeinfo = new SequenceInfo (
			new Tags (
			    new short[] {
				(short)0x8002
			    }
			),
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs"
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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v590ext_IEs"
					    ),
					    new QName (
						"Internode-definitions",
						"SRNC-RelocationInfo-v590ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v590ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v590ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sRNC-RelocationInfo-v590ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs$V5a0NCEs"
					)
				    ),
				    "v5a0NCEs",
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
		     * Get the type descriptor (TypeInfo) of 'this' V590NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V590NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V590NCEs

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
			"rrc.internode_definitions",
			"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs"
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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_v4d0ext_IEs"
					),
					new QName (
					    "Internode-definitions",
					    "SRNC-RelocationInfo-v4d0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v4d0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v4d0ext_IEs"
					    )
					),
					0
				    )
				),
				"sRNC-RelocationInfo-v4d0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new BitStringInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "com.oss.asn1",
					    "BitString"
					),
					new QName (
					    "builtin",
					    "BIT STRING"
					),
					12314,
					null,
					null,
					null
				    )
				),
				"sRNC-RelocationInfo-r4-add-ext",
				1,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs$V590NCEs"
				    )
				),
				"v590NCEs",
				2,
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
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			}
		    ),
		    0
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' V4d0NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V4d0NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V4d0NCEs

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
		    "rrc.internode_definitions",
		    "SRNC_RelocationInfo_r3$Later_than_r3$R4"
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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r4_IEs"
				    ),
				    new QName (
					"Internode-definitions",
					"SRNC-RelocationInfo-r4-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r4_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r4_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sRNC-RelocationInfo-r4",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$R4$V4d0NCEs"
				)
			    ),
			    "v4d0NCEs",
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
	     * Get the type descriptor (TypeInfo) of 'this' R4 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' R4 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for R4

	// Methods for field "criticalExtensions"
	public static Later_than_r3 createLater_than_r3WithCriticalExtensions(CriticalExtensions criticalExtensions)
	{
	    Later_than_r3 __object = new Later_than_r3();

	    __object.setCriticalExtensions(criticalExtensions);
	    return __object;
	}
	
	public boolean hasCriticalExtensions()
	{
	    return getChosenFlag() == criticalExtensions_chosen;
	}
	
	public void setCriticalExtensions(CriticalExtensions criticalExtensions)
	{
	    setChosenValue(criticalExtensions);
	    setChosenFlag(criticalExtensions_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type CriticalExtensions from ASN1 Module Internode_definitions.
	 * @see Choice
	 */
	public static class CriticalExtensions extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public CriticalExtensions()
	    {
	    }
	    
	    public static final  int  r5_chosen = 1;
	    public static final  int  criticalExtensions_chosen = 2;
	    
	    // Methods for field "r5"
	    public static CriticalExtensions createCriticalExtensionsWithR5(R5 r5)
	    {
		CriticalExtensions __object = new CriticalExtensions();

		__object.setR5(r5);
		return __object;
	    }
	    
	    public boolean hasR5()
	    {
		return getChosenFlag() == r5_chosen;
	    }
	    
	    public void setR5(R5 r5)
	    {
		setChosenValue(r5);
		setChosenFlag(r5_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type R5 from ASN1 Module Internode_definitions.
	     * @see Sequence
	     */
	    public static class R5 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public R5()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public R5(SRNC_RelocationInfo_r5_IEs sRNC_RelocationInfo_r5, 
				BitString sRNC_RelocationInfo_r5_add_ext, 
				V5a0NCEs v5a0NCEs)
		{
		    setSRNC_RelocationInfo_r5(sRNC_RelocationInfo_r5);
		    setSRNC_RelocationInfo_r5_add_ext(sRNC_RelocationInfo_r5_add_ext);
		    setV5a0NCEs(v5a0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R5(SRNC_RelocationInfo_r5_IEs sRNC_RelocationInfo_r5)
		{
		    setSRNC_RelocationInfo_r5(sRNC_RelocationInfo_r5);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SRNC_RelocationInfo_r5_IEs();
		    mComponents[1] = new BitString();
		    mComponents[2] = new V5a0NCEs();
		}
		
		// Instance initializer
		{
		    mComponents = new AbstractData[3];
		}
		
		// Method to create a specific component instance
		public AbstractData createInstance(int index)
		{
		    switch (index) {
			case 0:
			    return new SRNC_RelocationInfo_r5_IEs();
			case 1:
			    return new BitString();
			case 2:
			    return new V5a0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sRNC_RelocationInfo_r5"
		public SRNC_RelocationInfo_r5_IEs getSRNC_RelocationInfo_r5()
		{
		    return (SRNC_RelocationInfo_r5_IEs)mComponents[0];
		}
		
		public void setSRNC_RelocationInfo_r5(SRNC_RelocationInfo_r5_IEs sRNC_RelocationInfo_r5)
		{
		    mComponents[0] = sRNC_RelocationInfo_r5;
		}
		
		
		// Methods for field "sRNC_RelocationInfo_r5_add_ext"
		public BitString getSRNC_RelocationInfo_r5_add_ext()
		{
		    return (BitString)mComponents[1];
		}
		
		public void setSRNC_RelocationInfo_r5_add_ext(BitString sRNC_RelocationInfo_r5_add_ext)
		{
		    mComponents[1] = sRNC_RelocationInfo_r5_add_ext;
		}
		
		public boolean hasSRNC_RelocationInfo_r5_add_ext()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteSRNC_RelocationInfo_r5_add_ext()
		{
		    setComponentAbsent(1);
		}
		
		
		// Methods for field "v5a0NCEs"
		public V5a0NCEs getV5a0NCEs()
		{
		    return (V5a0NCEs)mComponents[2];
		}
		
		public void setV5a0NCEs(V5a0NCEs v5a0NCEs)
		{
		    mComponents[2] = v5a0NCEs;
		}
		
		public boolean hasV5a0NCEs()
		{
		    return componentIsPresent(2);
		}
		
		public void deleteV5a0NCEs()
		{
		    setComponentAbsent(2);
		}
		
		
		
		/**
		 * Define the ASN1 Type V5a0NCEs from ASN1 Module Internode_definitions.
		 * @see Sequence
		 */
		public static class V5a0NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V5a0NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V5a0NCEs(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext, 
				    V5b0NCEs v5b0NCEs)
		    {
			setSRNC_RelocationInfo_v5a0ext(sRNC_RelocationInfo_v5a0ext);
			setV5b0NCEs(v5b0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V5a0NCEs(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext)
		    {
			setSRNC_RelocationInfo_v5a0ext(sRNC_RelocationInfo_v5a0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SRNC_RelocationInfo_v5a0ext_IEs();
			mComponents[1] = new V5b0NCEs();
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
				return new SRNC_RelocationInfo_v5a0ext_IEs();
			    case 1:
				return new V5b0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sRNC_RelocationInfo_v5a0ext"
		    public SRNC_RelocationInfo_v5a0ext_IEs getSRNC_RelocationInfo_v5a0ext()
		    {
			return (SRNC_RelocationInfo_v5a0ext_IEs)mComponents[0];
		    }
		    
		    public void setSRNC_RelocationInfo_v5a0ext(SRNC_RelocationInfo_v5a0ext_IEs sRNC_RelocationInfo_v5a0ext)
		    {
			mComponents[0] = sRNC_RelocationInfo_v5a0ext;
		    }
		    
		    
		    // Methods for field "v5b0NCEs"
		    public V5b0NCEs getV5b0NCEs()
		    {
			return (V5b0NCEs)mComponents[1];
		    }
		    
		    public void setV5b0NCEs(V5b0NCEs v5b0NCEs)
		    {
			mComponents[1] = v5b0NCEs;
		    }
		    
		    public boolean hasV5b0NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV5b0NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V5b0NCEs from ASN1 Module Internode_definitions.
		     * @see Sequence
		     */
		    public static class V5b0NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V5b0NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V5b0NCEs(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext, 
					V5c0NCEs v5c0NCEs)
			{
			    setSRNC_RelocationInfo_v5b0ext(sRNC_RelocationInfo_v5b0ext);
			    setV5c0NCEs(v5c0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V5b0NCEs(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext)
			{
			    setSRNC_RelocationInfo_v5b0ext(sRNC_RelocationInfo_v5b0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SRNC_RelocationInfo_v5b0ext_IEs();
			    mComponents[1] = new V5c0NCEs();
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
				    return new SRNC_RelocationInfo_v5b0ext_IEs();
				case 1:
				    return new V5c0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sRNC_RelocationInfo_v5b0ext"
			public SRNC_RelocationInfo_v5b0ext_IEs getSRNC_RelocationInfo_v5b0ext()
			{
			    return (SRNC_RelocationInfo_v5b0ext_IEs)mComponents[0];
			}
			
			public void setSRNC_RelocationInfo_v5b0ext(SRNC_RelocationInfo_v5b0ext_IEs sRNC_RelocationInfo_v5b0ext)
			{
			    mComponents[0] = sRNC_RelocationInfo_v5b0ext;
			}
			
			
			// Methods for field "v5c0NCEs"
			public V5c0NCEs getV5c0NCEs()
			{
			    return (V5c0NCEs)mComponents[1];
			}
			
			public void setV5c0NCEs(V5c0NCEs v5c0NCEs)
			{
			    mComponents[1] = v5c0NCEs;
			}
			
			public boolean hasV5c0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV5c0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V5c0NCEs from ASN1 Module Internode_definitions.
			 * @see Sequence
			 */
			public static class V5c0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V5c0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V5c0NCEs(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext, 
					    V690NCEs v690NCEs)
			    {
				setSRNC_RelocationInfo_v5c0ext(sRNC_RelocationInfo_v5c0ext);
				setV690NCEs(v690NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V5c0NCEs(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext)
			    {
				setSRNC_RelocationInfo_v5c0ext(sRNC_RelocationInfo_v5c0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SRNC_RelocationInfo_v5c0ext_IEs();
				mComponents[1] = new V690NCEs();
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
					return new SRNC_RelocationInfo_v5c0ext_IEs();
				    case 1:
					return new V690NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sRNC_RelocationInfo_v5c0ext"
			    public SRNC_RelocationInfo_v5c0ext_IEs getSRNC_RelocationInfo_v5c0ext()
			    {
				return (SRNC_RelocationInfo_v5c0ext_IEs)mComponents[0];
			    }
			    
			    public void setSRNC_RelocationInfo_v5c0ext(SRNC_RelocationInfo_v5c0ext_IEs sRNC_RelocationInfo_v5c0ext)
			    {
				mComponents[0] = sRNC_RelocationInfo_v5c0ext;
			    }
			    
			    
			    // Methods for field "v690NCEs"
			    public V690NCEs getV690NCEs()
			    {
				return (V690NCEs)mComponents[1];
			    }
			    
			    public void setV690NCEs(V690NCEs v690NCEs)
			    {
				mComponents[1] = v690NCEs;
			    }
			    
			    public boolean hasV690NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV690NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V690NCEs from ASN1 Module Internode_definitions.
			     * @see Sequence
			     */
			    public static class V690NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V690NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V690NCEs(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext, 
						V6b0NCEs v6b0NCEs)
				{
				    setSRNC_RelocationInfo_v690ext(sRNC_RelocationInfo_v690ext);
				    setV6b0NCEs(v6b0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V690NCEs(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext)
				{
				    setSRNC_RelocationInfo_v690ext(sRNC_RelocationInfo_v690ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SRNC_RelocationInfo_v690ext_IEs();
				    mComponents[1] = new V6b0NCEs();
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
					    return new SRNC_RelocationInfo_v690ext_IEs();
					case 1:
					    return new V6b0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sRNC_RelocationInfo_v690ext"
				public SRNC_RelocationInfo_v690ext_IEs getSRNC_RelocationInfo_v690ext()
				{
				    return (SRNC_RelocationInfo_v690ext_IEs)mComponents[0];
				}
				
				public void setSRNC_RelocationInfo_v690ext(SRNC_RelocationInfo_v690ext_IEs sRNC_RelocationInfo_v690ext)
				{
				    mComponents[0] = sRNC_RelocationInfo_v690ext;
				}
				
				
				// Methods for field "v6b0NCEs"
				public V6b0NCEs getV6b0NCEs()
				{
				    return (V6b0NCEs)mComponents[1];
				}
				
				public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
				{
				    mComponents[1] = v6b0NCEs;
				}
				
				public boolean hasV6b0NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV6b0NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V6b0NCEs from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class V6b0NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V6b0NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext, 
						    V770NCEs v770NCEs)
				    {
					setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
					setV770NCEs(v770NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
				    {
					setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SRNC_RelocationInfo_v6b0ext_IEs();
					mComponents[1] = new V770NCEs();
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
						return new SRNC_RelocationInfo_v6b0ext_IEs();
					    case 1:
						return new V770NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_v6b0ext"
				    public SRNC_RelocationInfo_v6b0ext_IEs getSRNC_RelocationInfo_v6b0ext()
				    {
					return (SRNC_RelocationInfo_v6b0ext_IEs)mComponents[0];
				    }
				    
				    public void setSRNC_RelocationInfo_v6b0ext(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
				    {
					mComponents[0] = sRNC_RelocationInfo_v6b0ext;
				    }
				    
				    
				    // Methods for field "v770NCEs"
				    public V770NCEs getV770NCEs()
				    {
					return (V770NCEs)mComponents[1];
				    }
				    
				    public void setV770NCEs(V770NCEs v770NCEs)
				    {
					mComponents[1] = v770NCEs;
				    }
				    
				    public boolean hasV770NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV770NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V770NCEs from ASN1 Module Internode_definitions.
				     * @see Sequence
				     */
				    public static class V770NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V770NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext, 
							V7e0NCEs v7e0NCEs)
					{
					    setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
					    setV7e0NCEs(v7e0NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
					{
					    setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new SRNC_RelocationInfo_v770ext_IEs();
					    mComponents[1] = new V7e0NCEs();
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
						    return new SRNC_RelocationInfo_v770ext_IEs();
						case 1:
						    return new V7e0NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "sRNC_RelocationInfo_v770ext"
					public SRNC_RelocationInfo_v770ext_IEs getSRNC_RelocationInfo_v770ext()
					{
					    return (SRNC_RelocationInfo_v770ext_IEs)mComponents[0];
					}
					
					public void setSRNC_RelocationInfo_v770ext(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
					{
					    mComponents[0] = sRNC_RelocationInfo_v770ext;
					}
					
					
					// Methods for field "v7e0NCEs"
					public V7e0NCEs getV7e0NCEs()
					{
					    return (V7e0NCEs)mComponents[1];
					}
					
					public void setV7e0NCEs(V7e0NCEs v7e0NCEs)
					{
					    mComponents[1] = v7e0NCEs;
					}
					
					public boolean hasV7e0NCEs()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteV7e0NCEs()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type V7e0NCEs from ASN1 Module Internode_definitions.
					 * @see Sequence
					 */
					public static class V7e0NCEs extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public V7e0NCEs()
					    {
					    }
					    
					    /**
					     * Construct with AbstractData components.
					     */
					    public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext, 
							    V7f0NCEs v7f0NCEs)
					    {
						setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
						setV7f0NCEs(v7f0NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
					    {
						setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new SRNC_RelocationInfo_v7e0ext_IEs();
						mComponents[1] = new V7f0NCEs();
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
							return new SRNC_RelocationInfo_v7e0ext_IEs();
						    case 1:
							return new V7f0NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "sRNC_RelocationInfo_v7e0ext"
					    public SRNC_RelocationInfo_v7e0ext_IEs getSRNC_RelocationInfo_v7e0ext()
					    {
						return (SRNC_RelocationInfo_v7e0ext_IEs)mComponents[0];
					    }
					    
					    public void setSRNC_RelocationInfo_v7e0ext(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
					    {
						mComponents[0] = sRNC_RelocationInfo_v7e0ext;
					    }
					    
					    
					    // Methods for field "v7f0NCEs"
					    public V7f0NCEs getV7f0NCEs()
					    {
						return (V7f0NCEs)mComponents[1];
					    }
					    
					    public void setV7f0NCEs(V7f0NCEs v7f0NCEs)
					    {
						mComponents[1] = v7f0NCEs;
					    }
					    
					    public boolean hasV7f0NCEs()
					    {
						return componentIsPresent(1);
					    }
					    
					    public void deleteV7f0NCEs()
					    {
						setComponentAbsent(1);
					    }
					    
					    
					    
					    /**
					     * Define the ASN1 Type V7f0NCEs from ASN1 Module Internode_definitions.
					     * @see Sequence
					     */
					    public static class V7f0NCEs extends Sequence {
						
						/**
						 * The default constructor.
						 */
						public V7f0NCEs()
						{
						}
						
						/**
						 * Construct with AbstractData components.
						 */
						public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext, 
								NonCriticalExtensions nonCriticalExtensions)
						{
						    setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
						    setNonCriticalExtensions(nonCriticalExtensions);
						}
						
						/**
						 * Construct with required components.
						 */
						public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
						{
						    setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new SRNC_RelocationInfo_v7f0ext_IEs();
						    mComponents[1] = new NonCriticalExtensions();
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
							    return new SRNC_RelocationInfo_v7f0ext_IEs();
							case 1:
							    return new NonCriticalExtensions();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "sRNC_RelocationInfo_v7f0ext"
						public SRNC_RelocationInfo_v7f0ext_IEs getSRNC_RelocationInfo_v7f0ext()
						{
						    return (SRNC_RelocationInfo_v7f0ext_IEs)mComponents[0];
						}
						
						public void setSRNC_RelocationInfo_v7f0ext(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
						{
						    mComponents[0] = sRNC_RelocationInfo_v7f0ext;
						}
						
						
						// Methods for field "nonCriticalExtensions"
						public NonCriticalExtensions getNonCriticalExtensions()
						{
						    return (NonCriticalExtensions)mComponents[1];
						}
						
						public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
						{
						    mComponents[1] = nonCriticalExtensions;
						}
						
						public boolean hasNonCriticalExtensions()
						{
						    return componentIsPresent(1);
						}
						
						public void deleteNonCriticalExtensions()
						{
						    setComponentAbsent(1);
						}
						
						
						
						/**
						 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
						 * @see Sequence
						 */
						public static class NonCriticalExtensions extends Sequence {
						    
						    /**
						     * The default constructor.
						     */
						    public NonCriticalExtensions()
						    {
						    }
						    
						    public void initComponents()
						    {
							
						    }
						    
						    // Instance initializer
						    {
							mComponents = new AbstractData[0];
						    }
						    
						    // Method to create a specific component instance
						    public AbstractData createInstance(int index)
						    {
							return null;
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs$NonCriticalExtensions"
							),
							new QName (
							    "builtin",
							    "SEQUENCE"
							),
							12314,
							null,
							new Fields (
							    new SequenceFieldInfo[] {
							    }
							),
							0,
							null,
							0
						    );
						    
						    /**
						     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
						     */
						    public TypeInfo getTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						    /**
						     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
						     */
						    public static TypeInfo getStaticTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						} // End class definition for NonCriticalExtensions

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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs"
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
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v7f0ext_IEs"
									),
									new QName (
									    "Internode-definitions",
									    "SRNC-RelocationInfo-v7f0ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v7f0ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.internode_definitions",
										"SRNC_RelocationInfo_v7f0ext_IEs"
									    )
									),
									0
								    )
								),
								"sRNC-RelocationInfo-v7f0ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs$NonCriticalExtensions"
								    )
								),
								"nonCriticalExtensions",
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
						 * Get the type descriptor (TypeInfo) of 'this' V7f0NCEs object.
						 */
						public TypeInfo getTypeInfo()
						{
						    return c_typeinfo;
						}
						
						/**
						 * Get the static type descriptor (TypeInfo) of 'this' V7f0NCEs object.
						 */
						public static TypeInfo getStaticTypeInfo()
						{
						    return c_typeinfo;
						}
						
					    } // End class definition for V7f0NCEs

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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs"
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
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v7e0ext_IEs"
								    ),
								    new QName (
									"Internode-definitions",
									"SRNC-RelocationInfo-v7e0ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v7e0ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.internode_definitions",
									    "SRNC_RelocationInfo_v7e0ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "sRNC-RelocationInfo-v7e0ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs$V7f0NCEs"
								)
							    ),
							    "v7f0NCEs",
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
					     * Get the type descriptor (TypeInfo) of 'this' V7e0NCEs object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' V7e0NCEs object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for V7e0NCEs

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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs"
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
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v770ext_IEs"
								),
								new QName (
								    "Internode-definitions",
								    "SRNC-RelocationInfo-v770ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v770ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v770ext_IEs"
								    )
								),
								0
							    )
							),
							"sRNC-RelocationInfo-v770ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs$V7e0NCEs"
							    )
							),
							"v7e0NCEs",
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
					 * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V770NCEs

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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs"
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v6b0ext_IEs"
							    ),
							    new QName (
								"Internode-definitions",
								"SRNC-RelocationInfo-v6b0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v6b0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v6b0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sRNC-RelocationInfo-v6b0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs$V770NCEs"
							)
						    ),
						    "v770NCEs",
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
				     * Get the type descriptor (TypeInfo) of 'this' V6b0NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V6b0NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V6b0NCEs

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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs"
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v690ext_IEs"
							),
							new QName (
							    "Internode-definitions",
							    "SRNC-RelocationInfo-v690ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v690ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v690ext_IEs"
							    )
							),
							0
						    )
						),
						"sRNC-RelocationInfo-v690ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs$V6b0NCEs"
						    )
						),
						"v6b0NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V690NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V690NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V690NCEs

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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs"
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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v5c0ext_IEs"
						    ),
						    new QName (
							"Internode-definitions",
							"SRNC-RelocationInfo-v5c0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v5c0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v5c0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sRNC-RelocationInfo-v5c0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs$V690NCEs"
						)
					    ),
					    "v690NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V5c0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V5c0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V5c0NCEs

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
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs"
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v5b0ext_IEs"
						),
						new QName (
						    "Internode-definitions",
						    "SRNC-RelocationInfo-v5b0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v5b0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v5b0ext_IEs"
						    )
						),
						0
					    )
					),
					"sRNC-RelocationInfo-v5b0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs$V5c0NCEs"
					    )
					),
					"v5c0NCEs",
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
			 * Get the type descriptor (TypeInfo) of 'this' V5b0NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V5b0NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V5b0NCEs

		    /**
		     * Initialize the type descriptor.
		     */
		    private static final SequenceInfo c_typeinfo = new SequenceInfo (
			new Tags (
			    new short[] {
				(short)0x8002
			    }
			),
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs"
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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_v5a0ext_IEs"
					    ),
					    new QName (
						"Internode-definitions",
						"SRNC-RelocationInfo-v5a0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v5a0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v5a0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sRNC-RelocationInfo-v5a0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs$V5b0NCEs"
					)
				    ),
				    "v5b0NCEs",
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
		     * Get the type descriptor (TypeInfo) of 'this' V5a0NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V5a0NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V5a0NCEs

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
			"rrc.internode_definitions",
			"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5"
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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r5_IEs"
					),
					new QName (
					    "Internode-definitions",
					    "SRNC-RelocationInfo-r5-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r5_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r5_IEs"
					    )
					),
					0
				    )
				),
				"sRNC-RelocationInfo-r5",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new BitStringInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "com.oss.asn1",
					    "BitString"
					),
					new QName (
					    "builtin",
					    "BIT STRING"
					),
					12314,
					null,
					null,
					null
				    )
				),
				"sRNC-RelocationInfo-r5-add-ext",
				1,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5$V5a0NCEs"
				    )
				),
				"v5a0NCEs",
				2,
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
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			}
		    ),
		    0
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' R5 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' R5 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for R5

	    // Methods for field "criticalExtensions"
	    public static CriticalExtensions createCriticalExtensionsWithCriticalExtensions(CriticalExtensions1 criticalExtensions)
	    {
		CriticalExtensions __object = new CriticalExtensions();

		__object.setCriticalExtensions(criticalExtensions);
		return __object;
	    }
	    
	    public boolean hasCriticalExtensions()
	    {
		return getChosenFlag() == criticalExtensions_chosen;
	    }
	    
	    public void setCriticalExtensions(CriticalExtensions1 criticalExtensions)
	    {
		setChosenValue(criticalExtensions);
		setChosenFlag(criticalExtensions_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type CriticalExtensions1 from ASN1 Module Internode_definitions.
	     * @see Choice
	     */
	    public static class CriticalExtensions1 extends Choice {
		
		/**
		 * The default constructor.
		 */
		public CriticalExtensions1()
		{
		}
		
		public static final  int  r6_chosen = 1;
		public static final  int  criticalExtensions_chosen = 2;
		
		// Methods for field "r6"
		public static CriticalExtensions1 createCriticalExtensions1WithR6(R6 r6)
		{
		    CriticalExtensions1 __object = new CriticalExtensions1();

		    __object.setR6(r6);
		    return __object;
		}
		
		public boolean hasR6()
		{
		    return getChosenFlag() == r6_chosen;
		}
		
		public void setR6(R6 r6)
		{
		    setChosenValue(r6);
		    setChosenFlag(r6_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type R6 from ASN1 Module Internode_definitions.
		 * @see Sequence
		 */
		public static class R6 extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public R6()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public R6(SRNC_RelocationInfo_r6_IEs sRNC_RelocationInfo_r6, 
				    SRNC_RelocationInfo_r6_add_ext sRNC_RelocationInfo_r6_add_ext, 
				    V6b0NCEs v6b0NCEs)
		    {
			setSRNC_RelocationInfo_r6(sRNC_RelocationInfo_r6);
			setSRNC_RelocationInfo_r6_add_ext(sRNC_RelocationInfo_r6_add_ext);
			setV6b0NCEs(v6b0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public R6(SRNC_RelocationInfo_r6_IEs sRNC_RelocationInfo_r6)
		    {
			setSRNC_RelocationInfo_r6(sRNC_RelocationInfo_r6);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SRNC_RelocationInfo_r6_IEs();
			mComponents[1] = new SRNC_RelocationInfo_r6_add_ext();
			mComponents[2] = new V6b0NCEs();
		    }
		    
		    // Instance initializer
		    {
			mComponents = new AbstractData[3];
		    }
		    
		    // Method to create a specific component instance
		    public AbstractData createInstance(int index)
		    {
			switch (index) {
			    case 0:
				return new SRNC_RelocationInfo_r6_IEs();
			    case 1:
				return new SRNC_RelocationInfo_r6_add_ext();
			    case 2:
				return new V6b0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sRNC_RelocationInfo_r6"
		    public SRNC_RelocationInfo_r6_IEs getSRNC_RelocationInfo_r6()
		    {
			return (SRNC_RelocationInfo_r6_IEs)mComponents[0];
		    }
		    
		    public void setSRNC_RelocationInfo_r6(SRNC_RelocationInfo_r6_IEs sRNC_RelocationInfo_r6)
		    {
			mComponents[0] = sRNC_RelocationInfo_r6;
		    }
		    
		    
		    // Methods for field "sRNC_RelocationInfo_r6_add_ext"
		    public SRNC_RelocationInfo_r6_add_ext getSRNC_RelocationInfo_r6_add_ext()
		    {
			return (SRNC_RelocationInfo_r6_add_ext)mComponents[1];
		    }
		    
		    public void setSRNC_RelocationInfo_r6_add_ext(SRNC_RelocationInfo_r6_add_ext sRNC_RelocationInfo_r6_add_ext)
		    {
			mComponents[1] = sRNC_RelocationInfo_r6_add_ext;
		    }
		    
		    public boolean hasSRNC_RelocationInfo_r6_add_ext()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteSRNC_RelocationInfo_r6_add_ext()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type SRNC_RelocationInfo_r6_add_ext from ASN1 Module Internode_definitions.
		     * @see ContainingBitString
		     */
		    public static class SRNC_RelocationInfo_r6_add_ext extends ContainingBitString {
			
			/**
			 * The default constructor.
			 */
			public SRNC_RelocationInfo_r6_add_ext()
			{
			}
			
			/**
			 * Construct Bit String from a byte array.
			 * All bits considered significant.
			 * @param value the byte array to set this object to.
			 */
			public SRNC_RelocationInfo_r6_add_ext(byte[] value)
			{
			    super(value);
			}
			
			
			/**
			 * Construct Bit String from a byte array and significant bits.
			 * @param value the byte array to set this object to.
			 * @param sigBits the number of significant bits.
			 */
			public SRNC_RelocationInfo_r6_add_ext(byte[] value, int sigBits)
			{
			    super(value, sigBits);
			}
			
			/**
			 * Construct from a contained type value.
			 */
			public SRNC_RelocationInfo_r6_add_ext(SRNC_RelocationInfo_r6_add_ext_IEs decoded)
			{
			    super(decoded);
			}
			
			// Methods for getting and setting a contained value
			public SRNC_RelocationInfo_r6_add_ext_IEs getContainedValue()
			{
			    return (SRNC_RelocationInfo_r6_add_ext_IEs)getDecodedValue();
			}
			
			public void setContainedValue(SRNC_RelocationInfo_r6_add_ext_IEs value)
			{
			    setDecodedValue(value);
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$SRNC_RelocationInfo_r6_add_ext"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    null,
			    null,
			    null,
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r6_add_ext_IEs"
				)
			    ),
			    null
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r6_add_ext object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r6_add_ext object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for SRNC_RelocationInfo_r6_add_ext

		    // Methods for field "v6b0NCEs"
		    public V6b0NCEs getV6b0NCEs()
		    {
			return (V6b0NCEs)mComponents[2];
		    }
		    
		    public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
		    {
			mComponents[2] = v6b0NCEs;
		    }
		    
		    public boolean hasV6b0NCEs()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteV6b0NCEs()
		    {
			setComponentAbsent(2);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V6b0NCEs from ASN1 Module Internode_definitions.
		     * @see Sequence
		     */
		    public static class V6b0NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V6b0NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext, 
					V770NCEs v770NCEs)
			{
			    setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
			    setV770NCEs(v770NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V6b0NCEs(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
			{
			    setSRNC_RelocationInfo_v6b0ext(sRNC_RelocationInfo_v6b0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SRNC_RelocationInfo_v6b0ext_IEs();
			    mComponents[1] = new V770NCEs();
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
				    return new SRNC_RelocationInfo_v6b0ext_IEs();
				case 1:
				    return new V770NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sRNC_RelocationInfo_v6b0ext"
			public SRNC_RelocationInfo_v6b0ext_IEs getSRNC_RelocationInfo_v6b0ext()
			{
			    return (SRNC_RelocationInfo_v6b0ext_IEs)mComponents[0];
			}
			
			public void setSRNC_RelocationInfo_v6b0ext(SRNC_RelocationInfo_v6b0ext_IEs sRNC_RelocationInfo_v6b0ext)
			{
			    mComponents[0] = sRNC_RelocationInfo_v6b0ext;
			}
			
			
			// Methods for field "v770NCEs"
			public V770NCEs getV770NCEs()
			{
			    return (V770NCEs)mComponents[1];
			}
			
			public void setV770NCEs(V770NCEs v770NCEs)
			{
			    mComponents[1] = v770NCEs;
			}
			
			public boolean hasV770NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV770NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V770NCEs from ASN1 Module Internode_definitions.
			 * @see Sequence
			 */
			public static class V770NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V770NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext, 
					    V820NCEs v820NCEs)
			    {
				setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
				setV820NCEs(v820NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V770NCEs(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
			    {
				setSRNC_RelocationInfo_v770ext(sRNC_RelocationInfo_v770ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SRNC_RelocationInfo_v770ext_IEs();
				mComponents[1] = new V820NCEs();
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
					return new SRNC_RelocationInfo_v770ext_IEs();
				    case 1:
					return new V820NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sRNC_RelocationInfo_v770ext"
			    public SRNC_RelocationInfo_v770ext_IEs getSRNC_RelocationInfo_v770ext()
			    {
				return (SRNC_RelocationInfo_v770ext_IEs)mComponents[0];
			    }
			    
			    public void setSRNC_RelocationInfo_v770ext(SRNC_RelocationInfo_v770ext_IEs sRNC_RelocationInfo_v770ext)
			    {
				mComponents[0] = sRNC_RelocationInfo_v770ext;
			    }
			    
			    
			    // Methods for field "v820NCEs"
			    public V820NCEs getV820NCEs()
			    {
				return (V820NCEs)mComponents[1];
			    }
			    
			    public void setV820NCEs(V820NCEs v820NCEs)
			    {
				mComponents[1] = v820NCEs;
			    }
			    
			    public boolean hasV820NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV820NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V820NCEs from ASN1 Module Internode_definitions.
			     * @see Sequence
			     */
			    public static class V820NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V820NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V820NCEs(SRNC_RelocationInfo_v820ext_IEs srnc_RelocationInfo_v820ext, 
						V860NCEs v860NCEs)
				{
				    setSrnc_RelocationInfo_v820ext(srnc_RelocationInfo_v820ext);
				    setV860NCEs(v860NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V820NCEs(SRNC_RelocationInfo_v820ext_IEs srnc_RelocationInfo_v820ext)
				{
				    setSrnc_RelocationInfo_v820ext(srnc_RelocationInfo_v820ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SRNC_RelocationInfo_v820ext_IEs();
				    mComponents[1] = new V860NCEs();
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
					    return new SRNC_RelocationInfo_v820ext_IEs();
					case 1:
					    return new V860NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "srnc_RelocationInfo_v820ext"
				public SRNC_RelocationInfo_v820ext_IEs getSrnc_RelocationInfo_v820ext()
				{
				    return (SRNC_RelocationInfo_v820ext_IEs)mComponents[0];
				}
				
				public void setSrnc_RelocationInfo_v820ext(SRNC_RelocationInfo_v820ext_IEs srnc_RelocationInfo_v820ext)
				{
				    mComponents[0] = srnc_RelocationInfo_v820ext;
				}
				
				
				// Methods for field "v860NCEs"
				public V860NCEs getV860NCEs()
				{
				    return (V860NCEs)mComponents[1];
				}
				
				public void setV860NCEs(V860NCEs v860NCEs)
				{
				    mComponents[1] = v860NCEs;
				}
				
				public boolean hasV860NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV860NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V860NCEs from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class V860NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V860NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V860NCEs(SRNC_RelocationInfo_v860ext_IEs sRNC_RelocationInfo_v860ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setSRNC_RelocationInfo_v860ext(sRNC_RelocationInfo_v860ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V860NCEs(SRNC_RelocationInfo_v860ext_IEs sRNC_RelocationInfo_v860ext)
				    {
					setSRNC_RelocationInfo_v860ext(sRNC_RelocationInfo_v860ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SRNC_RelocationInfo_v860ext_IEs();
					mComponents[1] = new NonCriticalExtensions();
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
						return new SRNC_RelocationInfo_v860ext_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_v860ext"
				    public SRNC_RelocationInfo_v860ext_IEs getSRNC_RelocationInfo_v860ext()
				    {
					return (SRNC_RelocationInfo_v860ext_IEs)mComponents[0];
				    }
				    
				    public void setSRNC_RelocationInfo_v860ext(SRNC_RelocationInfo_v860ext_IEs sRNC_RelocationInfo_v860ext)
				    {
					mComponents[0] = sRNC_RelocationInfo_v860ext;
				    }
				    
				    
				    // Methods for field "nonCriticalExtensions"
				    public NonCriticalExtensions getNonCriticalExtensions()
				    {
					return (NonCriticalExtensions)mComponents[1];
				    }
				    
				    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
				    {
					mComponents[1] = nonCriticalExtensions;
				    }
				    
				    public boolean hasNonCriticalExtensions()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteNonCriticalExtensions()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
				     * @see Sequence
				     */
				    public static class NonCriticalExtensions extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public NonCriticalExtensions()
					{
					}
					
					public void initComponents()
					{
					    
					}
					
					// Instance initializer
					{
					    mComponents = new AbstractData[0];
					}
					
					// Method to create a specific component instance
					public AbstractData createInstance(int index)
					{
					    return null;
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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs$V820NCEs$V860NCEs$NonCriticalExtensions"
					    ),
					    new QName (
						"builtin",
						"SEQUENCE"
					    ),
					    12314,
					    null,
					    new Fields (
						new SequenceFieldInfo[] {
						}
					    ),
					    0,
					    null,
					    0
					);
					
					/**
					 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for NonCriticalExtensions

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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs$V820NCEs$V860NCEs"
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v860ext_IEs"
							    ),
							    new QName (
								"Internode-definitions",
								"SRNC-RelocationInfo-v860ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v860ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v860ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sRNC-RelocationInfo-v860ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs$V820NCEs$V860NCEs$NonCriticalExtensions"
							)
						    ),
						    "nonCriticalExtensions",
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
				     * Get the type descriptor (TypeInfo) of 'this' V860NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V860NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V860NCEs

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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs$V820NCEs"
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v820ext_IEs"
							),
							new QName (
							    "Internode-definitions",
							    "SRNC-RelocationInfo-v820ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v820ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v820ext_IEs"
							    )
							),
							0
						    )
						),
						"srnc-RelocationInfo-v820ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs$V820NCEs$V860NCEs"
						    )
						),
						"v860NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V820NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V820NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V820NCEs

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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs"
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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v770ext_IEs"
						    ),
						    new QName (
							"Internode-definitions",
							"SRNC-RelocationInfo-v770ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v770ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v770ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sRNC-RelocationInfo-v770ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs$V820NCEs"
						)
					    ),
					    "v820NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V770NCEs

			/**
			 * Initialize the type descriptor.
			 */
			private static final SequenceInfo c_typeinfo = new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs"
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_v6b0ext_IEs"
						),
						new QName (
						    "Internode-definitions",
						    "SRNC-RelocationInfo-v6b0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v6b0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v6b0ext_IEs"
						    )
						),
						0
					    )
					),
					"sRNC-RelocationInfo-v6b0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs$V770NCEs"
					    )
					),
					"v770NCEs",
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
			 * Get the type descriptor (TypeInfo) of 'this' V6b0NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V6b0NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V6b0NCEs

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
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6"
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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r6_IEs"
					    ),
					    new QName (
						"Internode-definitions",
						"SRNC-RelocationInfo-r6-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r6_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r6_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sRNC-RelocationInfo-r6",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$SRNC_RelocationInfo_r6_add_ext"
					)
				    ),
				    "sRNC-RelocationInfo-r6-add-ext",
				    1,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6$V6b0NCEs"
					)
				    ),
				    "v6b0NCEs",
				    2,
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
					new TagDecoderElement((short)0x8001, 1),
					new TagDecoderElement((short)0x8002, 2)
				    }
				),
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8002, 2)
				    }
				)
			    }
			),
			0
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' R6 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' R6 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for R6

		// Methods for field "criticalExtensions"
		public static CriticalExtensions1 createCriticalExtensions1WithCriticalExtensions(CriticalExtensions2 criticalExtensions)
		{
		    CriticalExtensions1 __object = new CriticalExtensions1();

		    __object.setCriticalExtensions(criticalExtensions);
		    return __object;
		}
		
		public boolean hasCriticalExtensions()
		{
		    return getChosenFlag() == criticalExtensions_chosen;
		}
		
		public void setCriticalExtensions(CriticalExtensions2 criticalExtensions)
		{
		    setChosenValue(criticalExtensions);
		    setChosenFlag(criticalExtensions_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type CriticalExtensions2 from ASN1 Module Internode_definitions.
		 * @see Choice
		 */
		public static class CriticalExtensions2 extends Choice {
		    
		    /**
		     * The default constructor.
		     */
		    public CriticalExtensions2()
		    {
		    }
		    
		    public static final  int  r7_chosen = 1;
		    public static final  int  criticalExtensions_chosen = 2;
		    
		    // Methods for field "r7"
		    public static CriticalExtensions2 createCriticalExtensions2WithR7(R7 r7)
		    {
			CriticalExtensions2 __object = new CriticalExtensions2();

			__object.setR7(r7);
			return __object;
		    }
		    
		    public boolean hasR7()
		    {
			return getChosenFlag() == r7_chosen;
		    }
		    
		    public void setR7(R7 r7)
		    {
			setChosenValue(r7);
			setChosenFlag(r7_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type R7 from ASN1 Module Internode_definitions.
		     * @see Sequence
		     */
		    public static class R7 extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public R7()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public R7(SRNC_RelocationInfo_r7_IEs sRNC_RelocationInfo_r7, 
					SRNC_RelocationInfo_r7_add_ext sRNC_RelocationInfo_r7_add_ext, 
					V820NCEs v820NCEs)
			{
			    setSRNC_RelocationInfo_r7(sRNC_RelocationInfo_r7);
			    setSRNC_RelocationInfo_r7_add_ext(sRNC_RelocationInfo_r7_add_ext);
			    setV820NCEs(v820NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public R7(SRNC_RelocationInfo_r7_IEs sRNC_RelocationInfo_r7)
			{
			    setSRNC_RelocationInfo_r7(sRNC_RelocationInfo_r7);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SRNC_RelocationInfo_r7_IEs();
			    mComponents[1] = new SRNC_RelocationInfo_r7_add_ext();
			    mComponents[2] = new V820NCEs();
			}
			
			// Instance initializer
			{
			    mComponents = new AbstractData[3];
			}
			
			// Method to create a specific component instance
			public AbstractData createInstance(int index)
			{
			    switch (index) {
				case 0:
				    return new SRNC_RelocationInfo_r7_IEs();
				case 1:
				    return new SRNC_RelocationInfo_r7_add_ext();
				case 2:
				    return new V820NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sRNC_RelocationInfo_r7"
			public SRNC_RelocationInfo_r7_IEs getSRNC_RelocationInfo_r7()
			{
			    return (SRNC_RelocationInfo_r7_IEs)mComponents[0];
			}
			
			public void setSRNC_RelocationInfo_r7(SRNC_RelocationInfo_r7_IEs sRNC_RelocationInfo_r7)
			{
			    mComponents[0] = sRNC_RelocationInfo_r7;
			}
			
			
			// Methods for field "sRNC_RelocationInfo_r7_add_ext"
			public SRNC_RelocationInfo_r7_add_ext getSRNC_RelocationInfo_r7_add_ext()
			{
			    return (SRNC_RelocationInfo_r7_add_ext)mComponents[1];
			}
			
			public void setSRNC_RelocationInfo_r7_add_ext(SRNC_RelocationInfo_r7_add_ext sRNC_RelocationInfo_r7_add_ext)
			{
			    mComponents[1] = sRNC_RelocationInfo_r7_add_ext;
			}
			
			public boolean hasSRNC_RelocationInfo_r7_add_ext()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteSRNC_RelocationInfo_r7_add_ext()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type SRNC_RelocationInfo_r7_add_ext from ASN1 Module Internode_definitions.
			 * @see ContainingBitString
			 */
			public static class SRNC_RelocationInfo_r7_add_ext extends ContainingBitString {
			    
			    /**
			     * The default constructor.
			     */
			    public SRNC_RelocationInfo_r7_add_ext()
			    {
			    }
			    
			    /**
			     * Construct Bit String from a byte array.
			     * All bits considered significant.
			     * @param value the byte array to set this object to.
			     */
			    public SRNC_RelocationInfo_r7_add_ext(byte[] value)
			    {
				super(value);
			    }
			    
			    
			    /**
			     * Construct Bit String from a byte array and significant bits.
			     * @param value the byte array to set this object to.
			     * @param sigBits the number of significant bits.
			     */
			    public SRNC_RelocationInfo_r7_add_ext(byte[] value, int sigBits)
			    {
				super(value, sigBits);
			    }
			    
			    /**
			     * Construct from a contained type value.
			     */
			    public SRNC_RelocationInfo_r7_add_ext(SRNC_RelocationInfo_r7_add_ext_IEs decoded)
			    {
				super(decoded);
			    }
			    
			    // Methods for getting and setting a contained value
			    public SRNC_RelocationInfo_r7_add_ext_IEs getContainedValue()
			    {
				return (SRNC_RelocationInfo_r7_add_ext_IEs)getDecodedValue();
			    }
			    
			    public void setContainedValue(SRNC_RelocationInfo_r7_add_ext_IEs value)
			    {
				setDecodedValue(value);
			    }
			    
			    /**
			     * Initialize the type descriptor.
			     */
			    private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$SRNC_RelocationInfo_r7_add_ext"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
				),
				12314,
				null,
				null,
				null,
				new TypeInfoRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r7_add_ext_IEs"
				    )
				),
				null
			    );
			    
			    /**
			     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r7_add_ext object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r7_add_ext object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for SRNC_RelocationInfo_r7_add_ext

			// Methods for field "v820NCEs"
			public V820NCEs getV820NCEs()
			{
			    return (V820NCEs)mComponents[2];
			}
			
			public void setV820NCEs(V820NCEs v820NCEs)
			{
			    mComponents[2] = v820NCEs;
			}
			
			public boolean hasV820NCEs()
			{
			    return componentIsPresent(2);
			}
			
			public void deleteV820NCEs()
			{
			    setComponentAbsent(2);
			}
			
			
			
			/**
			 * Define the ASN1 Type V820NCEs from ASN1 Module Internode_definitions.
			 * @see Sequence
			 */
			public static class V820NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V820NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V820NCEs(SRNC_RelocationInfo_v820ext_IEs srnc_RelocationInfo_v820ext, 
					    V860NCEs v860NCEs)
			    {
				setSrnc_RelocationInfo_v820ext(srnc_RelocationInfo_v820ext);
				setV860NCEs(v860NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V820NCEs(SRNC_RelocationInfo_v820ext_IEs srnc_RelocationInfo_v820ext)
			    {
				setSrnc_RelocationInfo_v820ext(srnc_RelocationInfo_v820ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SRNC_RelocationInfo_v820ext_IEs();
				mComponents[1] = new V860NCEs();
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
					return new SRNC_RelocationInfo_v820ext_IEs();
				    case 1:
					return new V860NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "srnc_RelocationInfo_v820ext"
			    public SRNC_RelocationInfo_v820ext_IEs getSrnc_RelocationInfo_v820ext()
			    {
				return (SRNC_RelocationInfo_v820ext_IEs)mComponents[0];
			    }
			    
			    public void setSrnc_RelocationInfo_v820ext(SRNC_RelocationInfo_v820ext_IEs srnc_RelocationInfo_v820ext)
			    {
				mComponents[0] = srnc_RelocationInfo_v820ext;
			    }
			    
			    
			    // Methods for field "v860NCEs"
			    public V860NCEs getV860NCEs()
			    {
				return (V860NCEs)mComponents[1];
			    }
			    
			    public void setV860NCEs(V860NCEs v860NCEs)
			    {
				mComponents[1] = v860NCEs;
			    }
			    
			    public boolean hasV860NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV860NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V860NCEs from ASN1 Module Internode_definitions.
			     * @see Sequence
			     */
			    public static class V860NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V860NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V860NCEs(SRNC_RelocationInfo_v860ext_IEs sRNC_RelocationInfo_v860ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setSRNC_RelocationInfo_v860ext(sRNC_RelocationInfo_v860ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V860NCEs(SRNC_RelocationInfo_v860ext_IEs sRNC_RelocationInfo_v860ext)
				{
				    setSRNC_RelocationInfo_v860ext(sRNC_RelocationInfo_v860ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SRNC_RelocationInfo_v860ext_IEs();
				    mComponents[1] = new NonCriticalExtensions();
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
					    return new SRNC_RelocationInfo_v860ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sRNC_RelocationInfo_v860ext"
				public SRNC_RelocationInfo_v860ext_IEs getSRNC_RelocationInfo_v860ext()
				{
				    return (SRNC_RelocationInfo_v860ext_IEs)mComponents[0];
				}
				
				public void setSRNC_RelocationInfo_v860ext(SRNC_RelocationInfo_v860ext_IEs sRNC_RelocationInfo_v860ext)
				{
				    mComponents[0] = sRNC_RelocationInfo_v860ext;
				}
				
				
				// Methods for field "nonCriticalExtensions"
				public NonCriticalExtensions getNonCriticalExtensions()
				{
				    return (NonCriticalExtensions)mComponents[1];
				}
				
				public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
				{
				    mComponents[1] = nonCriticalExtensions;
				}
				
				public boolean hasNonCriticalExtensions()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteNonCriticalExtensions()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class NonCriticalExtensions extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public NonCriticalExtensions()
				    {
				    }
				    
				    public void initComponents()
				    {
					
				    }
				    
				    // Instance initializer
				    {
					mComponents = new AbstractData[0];
				    }
				    
				    // Method to create a specific component instance
				    public AbstractData createInstance(int index)
				    {
					return null;
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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$V820NCEs$V860NCEs$NonCriticalExtensions"
					),
					new QName (
					    "builtin",
					    "SEQUENCE"
					),
					12314,
					null,
					new Fields (
					    new SequenceFieldInfo[] {
					    }
					),
					0,
					null,
					0
				    );
				    
				    /**
				     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for NonCriticalExtensions

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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$V820NCEs$V860NCEs"
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v860ext_IEs"
							),
							new QName (
							    "Internode-definitions",
							    "SRNC-RelocationInfo-v860ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v860ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v860ext_IEs"
							    )
							),
							0
						    )
						),
						"sRNC-RelocationInfo-v860ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$V820NCEs$V860NCEs$NonCriticalExtensions"
						    )
						),
						"nonCriticalExtensions",
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
				 * Get the type descriptor (TypeInfo) of 'this' V860NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V860NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V860NCEs

			    /**
			     * Initialize the type descriptor.
			     */
			    private static final SequenceInfo c_typeinfo = new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$V820NCEs"
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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_v820ext_IEs"
						    ),
						    new QName (
							"Internode-definitions",
							"SRNC-RelocationInfo-v820ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v820ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v820ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "srnc-RelocationInfo-v820ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$V820NCEs$V860NCEs"
						)
					    ),
					    "v860NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V820NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V820NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V820NCEs

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
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7"
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r7_IEs"
						),
						new QName (
						    "Internode-definitions",
						    "SRNC-RelocationInfo-r7-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r7_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r7_IEs"
						    )
						),
						0
					    )
					),
					"sRNC-RelocationInfo-r7",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$SRNC_RelocationInfo_r7_add_ext"
					    )
					),
					"sRNC-RelocationInfo-r7-add-ext",
					1,
					3,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$V820NCEs"
					    )
					),
					"v820NCEs",
					2,
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
					    new TagDecoderElement((short)0x8001, 1),
					    new TagDecoderElement((short)0x8002, 2)
					}
				    ),
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8002, 2)
					}
				    )
				}
			    ),
			    0
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' R7 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' R7 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for R7

		    // Methods for field "criticalExtensions"
		    public static CriticalExtensions2 createCriticalExtensions2WithCriticalExtensions(CriticalExtensions3 criticalExtensions)
		    {
			CriticalExtensions2 __object = new CriticalExtensions2();

			__object.setCriticalExtensions(criticalExtensions);
			return __object;
		    }
		    
		    public boolean hasCriticalExtensions()
		    {
			return getChosenFlag() == criticalExtensions_chosen;
		    }
		    
		    public void setCriticalExtensions(CriticalExtensions3 criticalExtensions)
		    {
			setChosenValue(criticalExtensions);
			setChosenFlag(criticalExtensions_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type CriticalExtensions3 from ASN1 Module Internode_definitions.
		     * @see Choice
		     */
		    public static class CriticalExtensions3 extends Choice {
			
			/**
			 * The default constructor.
			 */
			public CriticalExtensions3()
			{
			}
			
			public static final  int  r8_chosen = 1;
			public static final  int  criticalExtensions_chosen = 2;
			
			// Methods for field "r8"
			public static CriticalExtensions3 createCriticalExtensions3WithR8(R8 r8)
			{
			    CriticalExtensions3 __object = new CriticalExtensions3();

			    __object.setR8(r8);
			    return __object;
			}
			
			public boolean hasR8()
			{
			    return getChosenFlag() == r8_chosen;
			}
			
			public void setR8(R8 r8)
			{
			    setChosenValue(r8);
			    setChosenFlag(r8_chosen);
			}
			
			
			
			/**
			 * Define the ASN1 Type R8 from ASN1 Module Internode_definitions.
			 * @see Sequence
			 */
			public static class R8 extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public R8()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public R8(SRNC_RelocationInfo_r8_IEs sRNC_RelocationInfo_r8, 
					    BitString sRNC_RelocationInfo_r8_add_ext, 
					    V7e0NCEs v7e0NCEs)
			    {
				setSRNC_RelocationInfo_r8(sRNC_RelocationInfo_r8);
				setSRNC_RelocationInfo_r8_add_ext(sRNC_RelocationInfo_r8_add_ext);
				setV7e0NCEs(v7e0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public R8(SRNC_RelocationInfo_r8_IEs sRNC_RelocationInfo_r8)
			    {
				setSRNC_RelocationInfo_r8(sRNC_RelocationInfo_r8);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SRNC_RelocationInfo_r8_IEs();
				mComponents[1] = new BitString();
				mComponents[2] = new V7e0NCEs();
			    }
			    
			    // Instance initializer
			    {
				mComponents = new AbstractData[3];
			    }
			    
			    // Method to create a specific component instance
			    public AbstractData createInstance(int index)
			    {
				switch (index) {
				    case 0:
					return new SRNC_RelocationInfo_r8_IEs();
				    case 1:
					return new BitString();
				    case 2:
					return new V7e0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sRNC_RelocationInfo_r8"
			    public SRNC_RelocationInfo_r8_IEs getSRNC_RelocationInfo_r8()
			    {
				return (SRNC_RelocationInfo_r8_IEs)mComponents[0];
			    }
			    
			    public void setSRNC_RelocationInfo_r8(SRNC_RelocationInfo_r8_IEs sRNC_RelocationInfo_r8)
			    {
				mComponents[0] = sRNC_RelocationInfo_r8;
			    }
			    
			    
			    // Methods for field "sRNC_RelocationInfo_r8_add_ext"
			    public BitString getSRNC_RelocationInfo_r8_add_ext()
			    {
				return (BitString)mComponents[1];
			    }
			    
			    public void setSRNC_RelocationInfo_r8_add_ext(BitString sRNC_RelocationInfo_r8_add_ext)
			    {
				mComponents[1] = sRNC_RelocationInfo_r8_add_ext;
			    }
			    
			    public boolean hasSRNC_RelocationInfo_r8_add_ext()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteSRNC_RelocationInfo_r8_add_ext()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    // Methods for field "v7e0NCEs"
			    public V7e0NCEs getV7e0NCEs()
			    {
				return (V7e0NCEs)mComponents[2];
			    }
			    
			    public void setV7e0NCEs(V7e0NCEs v7e0NCEs)
			    {
				mComponents[2] = v7e0NCEs;
			    }
			    
			    public boolean hasV7e0NCEs()
			    {
				return componentIsPresent(2);
			    }
			    
			    public void deleteV7e0NCEs()
			    {
				setComponentAbsent(2);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V7e0NCEs from ASN1 Module Internode_definitions.
			     * @see Sequence
			     */
			    public static class V7e0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V7e0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext, 
						V7f0NCEs v7f0NCEs)
				{
				    setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
				    setV7f0NCEs(v7f0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V7e0NCEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
				{
				    setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SRNC_RelocationInfo_v7e0ext_IEs();
				    mComponents[1] = new V7f0NCEs();
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
					    return new SRNC_RelocationInfo_v7e0ext_IEs();
					case 1:
					    return new V7f0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sRNC_RelocationInfo_v7e0ext"
				public SRNC_RelocationInfo_v7e0ext_IEs getSRNC_RelocationInfo_v7e0ext()
				{
				    return (SRNC_RelocationInfo_v7e0ext_IEs)mComponents[0];
				}
				
				public void setSRNC_RelocationInfo_v7e0ext(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
				{
				    mComponents[0] = sRNC_RelocationInfo_v7e0ext;
				}
				
				
				// Methods for field "v7f0NCEs"
				public V7f0NCEs getV7f0NCEs()
				{
				    return (V7f0NCEs)mComponents[1];
				}
				
				public void setV7f0NCEs(V7f0NCEs v7f0NCEs)
				{
				    mComponents[1] = v7f0NCEs;
				}
				
				public boolean hasV7f0NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV7f0NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V7f0NCEs from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class V7f0NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V7f0NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext, 
						    V8d0NCEs v8d0NCEs)
				    {
					setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
					setV8d0NCEs(v8d0NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
				    {
					setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SRNC_RelocationInfo_v7f0ext_IEs();
					mComponents[1] = new V8d0NCEs();
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
						return new SRNC_RelocationInfo_v7f0ext_IEs();
					    case 1:
						return new V8d0NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_v7f0ext"
				    public SRNC_RelocationInfo_v7f0ext_IEs getSRNC_RelocationInfo_v7f0ext()
				    {
					return (SRNC_RelocationInfo_v7f0ext_IEs)mComponents[0];
				    }
				    
				    public void setSRNC_RelocationInfo_v7f0ext(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
				    {
					mComponents[0] = sRNC_RelocationInfo_v7f0ext;
				    }
				    
				    
				    // Methods for field "v8d0NCEs"
				    public V8d0NCEs getV8d0NCEs()
				    {
					return (V8d0NCEs)mComponents[1];
				    }
				    
				    public void setV8d0NCEs(V8d0NCEs v8d0NCEs)
				    {
					mComponents[1] = v8d0NCEs;
				    }
				    
				    public boolean hasV8d0NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV8d0NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V8d0NCEs from ASN1 Module Internode_definitions.
				     * @see Sequence
				     */
				    public static class V8d0NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V8d0NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V8d0NCEs(SRNC_RelocationInfo_v8d0ext_IEs sRNC_RelocationInfo_v8d0ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setSRNC_RelocationInfo_v8d0ext(sRNC_RelocationInfo_v8d0ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public V8d0NCEs(SRNC_RelocationInfo_v8d0ext_IEs sRNC_RelocationInfo_v8d0ext)
					{
					    setSRNC_RelocationInfo_v8d0ext(sRNC_RelocationInfo_v8d0ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new SRNC_RelocationInfo_v8d0ext_IEs();
					    mComponents[1] = new NonCriticalExtensions();
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
						    return new SRNC_RelocationInfo_v8d0ext_IEs();
						case 1:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "sRNC_RelocationInfo_v8d0ext"
					public SRNC_RelocationInfo_v8d0ext_IEs getSRNC_RelocationInfo_v8d0ext()
					{
					    return (SRNC_RelocationInfo_v8d0ext_IEs)mComponents[0];
					}
					
					public void setSRNC_RelocationInfo_v8d0ext(SRNC_RelocationInfo_v8d0ext_IEs sRNC_RelocationInfo_v8d0ext)
					{
					    mComponents[0] = sRNC_RelocationInfo_v8d0ext;
					}
					
					
					// Methods for field "nonCriticalExtensions"
					public NonCriticalExtensions getNonCriticalExtensions()
					{
					    return (NonCriticalExtensions)mComponents[1];
					}
					
					public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
					{
					    mComponents[1] = nonCriticalExtensions;
					}
					
					public boolean hasNonCriticalExtensions()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteNonCriticalExtensions()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
					 * @see Sequence
					 */
					public static class NonCriticalExtensions extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public NonCriticalExtensions()
					    {
					    }
					    
					    public void initComponents()
					    {
						
					    }
					    
					    // Instance initializer
					    {
						mComponents = new AbstractData[0];
					    }
					    
					    // Method to create a specific component instance
					    public AbstractData createInstance(int index)
					    {
						return null;
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs$V7f0NCEs$V8d0NCEs$NonCriticalExtensions"
						),
						new QName (
						    "builtin",
						    "SEQUENCE"
						),
						12314,
						null,
						new Fields (
						    new SequenceFieldInfo[] {
						    }
						),
						0,
						null,
						0
					    );
					    
					    /**
					     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for NonCriticalExtensions

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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs$V7f0NCEs$V8d0NCEs"
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
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v8d0ext_IEs"
								),
								new QName (
								    "Internode-definitions",
								    "SRNC-RelocationInfo-v8d0ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v8d0ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v8d0ext_IEs"
								    )
								),
								0
							    )
							),
							"sRNC-RelocationInfo-v8d0ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs$V7f0NCEs$V8d0NCEs$NonCriticalExtensions"
							    )
							),
							"nonCriticalExtensions",
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
					 * Get the type descriptor (TypeInfo) of 'this' V8d0NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V8d0NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V8d0NCEs

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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs$V7f0NCEs"
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v7f0ext_IEs"
							    ),
							    new QName (
								"Internode-definitions",
								"SRNC-RelocationInfo-v7f0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v7f0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v7f0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sRNC-RelocationInfo-v7f0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs$V7f0NCEs$V8d0NCEs"
							)
						    ),
						    "v8d0NCEs",
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
				     * Get the type descriptor (TypeInfo) of 'this' V7f0NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V7f0NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V7f0NCEs

				/**
				 * Initialize the type descriptor.
				 */
				private static final SequenceInfo c_typeinfo = new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs"
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_v7e0ext_IEs"
							),
							new QName (
							    "Internode-definitions",
							    "SRNC-RelocationInfo-v7e0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v7e0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v7e0ext_IEs"
							    )
							),
							0
						    )
						),
						"sRNC-RelocationInfo-v7e0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs$V7f0NCEs"
						    )
						),
						"v7f0NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V7e0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V7e0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V7e0NCEs

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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8"
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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r8_IEs"
						    ),
						    new QName (
							"Internode-definitions",
							"SRNC-RelocationInfo-r8-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r8_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r8_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sRNC-RelocationInfo-r8",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new BitStringInfo (
						    new Tags (
							new short[] {
							    (short)0x8001
							}
						    ),
						    new QName (
							"com.oss.asn1",
							"BitString"
						    ),
						    new QName (
							"builtin",
							"BIT STRING"
						    ),
						    12314,
						    null,
						    null,
						    null
						)
					    ),
					    "sRNC-RelocationInfo-r8-add-ext",
					    1,
					    3,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V7e0NCEs"
						)
					    ),
					    "v7e0NCEs",
					    2,
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
						new TagDecoderElement((short)0x8001, 1),
						new TagDecoderElement((short)0x8002, 2)
					    }
					),
					new TagDecoder (
					    new TagDecoderElement[] {
						new TagDecoderElement((short)0x8002, 2)
					    }
					)
				    }
				),
				0
			    );
			    
			    /**
			     * Get the type descriptor (TypeInfo) of 'this' R8 object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' R8 object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for R8

			// Methods for field "criticalExtensions"
			public static CriticalExtensions3 createCriticalExtensions3WithCriticalExtensions(CriticalExtensions4 criticalExtensions)
			{
			    CriticalExtensions3 __object = new CriticalExtensions3();

			    __object.setCriticalExtensions(criticalExtensions);
			    return __object;
			}
			
			public boolean hasCriticalExtensions()
			{
			    return getChosenFlag() == criticalExtensions_chosen;
			}
			
			public void setCriticalExtensions(CriticalExtensions4 criticalExtensions)
			{
			    setChosenValue(criticalExtensions);
			    setChosenFlag(criticalExtensions_chosen);
			}
			
			
			
			/**
			 * Define the ASN1 Type CriticalExtensions4 from ASN1 Module Internode_definitions.
			 * @see Choice
			 */
			public static class CriticalExtensions4 extends Choice {
			    
			    /**
			     * The default constructor.
			     */
			    public CriticalExtensions4()
			    {
			    }
			    
			    public static final  int  r9_chosen = 1;
			    public static final  int  criticalExtensions_chosen = 2;
			    
			    // Methods for field "r9"
			    public static CriticalExtensions4 createCriticalExtensions4WithR9(R9 r9)
			    {
				CriticalExtensions4 __object = new CriticalExtensions4();

				__object.setR9(r9);
				return __object;
			    }
			    
			    public boolean hasR9()
			    {
				return getChosenFlag() == r9_chosen;
			    }
			    
			    public void setR9(R9 r9)
			    {
				setChosenValue(r9);
				setChosenFlag(r9_chosen);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type R9 from ASN1 Module Internode_definitions.
			     * @see Sequence
			     */
			    public static class R9 extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public R9()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public R9(SRNC_RelocationInfo_r9_IEs sRNC_RelocationInfo_r9, 
						BitString sRNC_RelocationInfo_r9_add_ext, 
						V8d0NCEs v8d0NCEs)
				{
				    setSRNC_RelocationInfo_r9(sRNC_RelocationInfo_r9);
				    setSRNC_RelocationInfo_r9_add_ext(sRNC_RelocationInfo_r9_add_ext);
				    setV8d0NCEs(v8d0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public R9(SRNC_RelocationInfo_r9_IEs sRNC_RelocationInfo_r9)
				{
				    setSRNC_RelocationInfo_r9(sRNC_RelocationInfo_r9);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SRNC_RelocationInfo_r9_IEs();
				    mComponents[1] = new BitString();
				    mComponents[2] = new V8d0NCEs();
				}
				
				// Instance initializer
				{
				    mComponents = new AbstractData[3];
				}
				
				// Method to create a specific component instance
				public AbstractData createInstance(int index)
				{
				    switch (index) {
					case 0:
					    return new SRNC_RelocationInfo_r9_IEs();
					case 1:
					    return new BitString();
					case 2:
					    return new V8d0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sRNC_RelocationInfo_r9"
				public SRNC_RelocationInfo_r9_IEs getSRNC_RelocationInfo_r9()
				{
				    return (SRNC_RelocationInfo_r9_IEs)mComponents[0];
				}
				
				public void setSRNC_RelocationInfo_r9(SRNC_RelocationInfo_r9_IEs sRNC_RelocationInfo_r9)
				{
				    mComponents[0] = sRNC_RelocationInfo_r9;
				}
				
				
				// Methods for field "sRNC_RelocationInfo_r9_add_ext"
				public BitString getSRNC_RelocationInfo_r9_add_ext()
				{
				    return (BitString)mComponents[1];
				}
				
				public void setSRNC_RelocationInfo_r9_add_ext(BitString sRNC_RelocationInfo_r9_add_ext)
				{
				    mComponents[1] = sRNC_RelocationInfo_r9_add_ext;
				}
				
				public boolean hasSRNC_RelocationInfo_r9_add_ext()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteSRNC_RelocationInfo_r9_add_ext()
				{
				    setComponentAbsent(1);
				}
				
				
				// Methods for field "v8d0NCEs"
				public V8d0NCEs getV8d0NCEs()
				{
				    return (V8d0NCEs)mComponents[2];
				}
				
				public void setV8d0NCEs(V8d0NCEs v8d0NCEs)
				{
				    mComponents[2] = v8d0NCEs;
				}
				
				public boolean hasV8d0NCEs()
				{
				    return componentIsPresent(2);
				}
				
				public void deleteV8d0NCEs()
				{
				    setComponentAbsent(2);
				}
				
				
				
				/**
				 * Define the ASN1 Type V8d0NCEs from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class V8d0NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V8d0NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V8d0NCEs(SRNC_RelocationInfo_v8d0ext_IEs sRNC_RelocationInfo_v8d0ext, 
						    V970NCEs v970NCEs)
				    {
					setSRNC_RelocationInfo_v8d0ext(sRNC_RelocationInfo_v8d0ext);
					setV970NCEs(v970NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V8d0NCEs(SRNC_RelocationInfo_v8d0ext_IEs sRNC_RelocationInfo_v8d0ext)
				    {
					setSRNC_RelocationInfo_v8d0ext(sRNC_RelocationInfo_v8d0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SRNC_RelocationInfo_v8d0ext_IEs();
					mComponents[1] = new V970NCEs();
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
						return new SRNC_RelocationInfo_v8d0ext_IEs();
					    case 1:
						return new V970NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_v8d0ext"
				    public SRNC_RelocationInfo_v8d0ext_IEs getSRNC_RelocationInfo_v8d0ext()
				    {
					return (SRNC_RelocationInfo_v8d0ext_IEs)mComponents[0];
				    }
				    
				    public void setSRNC_RelocationInfo_v8d0ext(SRNC_RelocationInfo_v8d0ext_IEs sRNC_RelocationInfo_v8d0ext)
				    {
					mComponents[0] = sRNC_RelocationInfo_v8d0ext;
				    }
				    
				    
				    // Methods for field "v970NCEs"
				    public V970NCEs getV970NCEs()
				    {
					return (V970NCEs)mComponents[1];
				    }
				    
				    public void setV970NCEs(V970NCEs v970NCEs)
				    {
					mComponents[1] = v970NCEs;
				    }
				    
				    public boolean hasV970NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV970NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V970NCEs from ASN1 Module Internode_definitions.
				     * @see Sequence
				     */
				    public static class V970NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V970NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V970NCEs(SRNC_RelocationInfo_v970ext_IEs sRNC_RelocationInfo_v970ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setSRNC_RelocationInfo_v970ext(sRNC_RelocationInfo_v970ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public V970NCEs(SRNC_RelocationInfo_v970ext_IEs sRNC_RelocationInfo_v970ext)
					{
					    setSRNC_RelocationInfo_v970ext(sRNC_RelocationInfo_v970ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new SRNC_RelocationInfo_v970ext_IEs();
					    mComponents[1] = new NonCriticalExtensions();
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
						    return new SRNC_RelocationInfo_v970ext_IEs();
						case 1:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "sRNC_RelocationInfo_v970ext"
					public SRNC_RelocationInfo_v970ext_IEs getSRNC_RelocationInfo_v970ext()
					{
					    return (SRNC_RelocationInfo_v970ext_IEs)mComponents[0];
					}
					
					public void setSRNC_RelocationInfo_v970ext(SRNC_RelocationInfo_v970ext_IEs sRNC_RelocationInfo_v970ext)
					{
					    mComponents[0] = sRNC_RelocationInfo_v970ext;
					}
					
					
					// Methods for field "nonCriticalExtensions"
					public NonCriticalExtensions getNonCriticalExtensions()
					{
					    return (NonCriticalExtensions)mComponents[1];
					}
					
					public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
					{
					    mComponents[1] = nonCriticalExtensions;
					}
					
					public boolean hasNonCriticalExtensions()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteNonCriticalExtensions()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
					 * @see Sequence
					 */
					public static class NonCriticalExtensions extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public NonCriticalExtensions()
					    {
					    }
					    
					    public void initComponents()
					    {
						
					    }
					    
					    // Instance initializer
					    {
						mComponents = new AbstractData[0];
					    }
					    
					    // Method to create a specific component instance
					    public AbstractData createInstance(int index)
					    {
						return null;
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V8d0NCEs$V970NCEs$NonCriticalExtensions"
						),
						new QName (
						    "builtin",
						    "SEQUENCE"
						),
						12314,
						null,
						new Fields (
						    new SequenceFieldInfo[] {
						    }
						),
						0,
						null,
						0
					    );
					    
					    /**
					     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for NonCriticalExtensions

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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V8d0NCEs$V970NCEs"
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
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v970ext_IEs"
								),
								new QName (
								    "Internode-definitions",
								    "SRNC-RelocationInfo-v970ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v970ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.internode_definitions",
									"SRNC_RelocationInfo_v970ext_IEs"
								    )
								),
								0
							    )
							),
							"sRNC-RelocationInfo-v970ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V8d0NCEs$V970NCEs$NonCriticalExtensions"
							    )
							),
							"nonCriticalExtensions",
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
					 * Get the type descriptor (TypeInfo) of 'this' V970NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V970NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V970NCEs

				    /**
				     * Initialize the type descriptor.
				     */
				    private static final SequenceInfo c_typeinfo = new SequenceInfo (
					new Tags (
					    new short[] {
						(short)0x8002
					    }
					),
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V8d0NCEs"
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_v8d0ext_IEs"
							    ),
							    new QName (
								"Internode-definitions",
								"SRNC-RelocationInfo-v8d0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v8d0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_v8d0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sRNC-RelocationInfo-v8d0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V8d0NCEs$V970NCEs"
							)
						    ),
						    "v970NCEs",
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
				     * Get the type descriptor (TypeInfo) of 'this' V8d0NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V8d0NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V8d0NCEs

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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9"
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
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r9_IEs"
							),
							new QName (
							    "Internode-definitions",
							    "SRNC-RelocationInfo-r9-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r9_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r9_IEs"
							    )
							),
							0
						    )
						),
						"sRNC-RelocationInfo-r9",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new BitStringInfo (
							new Tags (
							    new short[] {
								(short)0x8001
							    }
							),
							new QName (
							    "com.oss.asn1",
							    "BitString"
							),
							new QName (
							    "builtin",
							    "BIT STRING"
							),
							12314,
							null,
							null,
							null
						    )
						),
						"sRNC-RelocationInfo-r9-add-ext",
						1,
						3,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V8d0NCEs"
						    )
						),
						"v8d0NCEs",
						2,
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
						    new TagDecoderElement((short)0x8001, 1),
						    new TagDecoderElement((short)0x8002, 2)
						}
					    ),
					    new TagDecoder (
						new TagDecoderElement[] {
						    new TagDecoderElement((short)0x8002, 2)
						}
					    )
					}
				    ),
				    0
				);
				
				/**
				 * Get the type descriptor (TypeInfo) of 'this' R9 object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' R9 object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for R9

			    // Methods for field "criticalExtensions"
			    public static CriticalExtensions4 createCriticalExtensions4WithCriticalExtensions(CriticalExtensions5 criticalExtensions)
			    {
				CriticalExtensions4 __object = new CriticalExtensions4();

				__object.setCriticalExtensions(criticalExtensions);
				return __object;
			    }
			    
			    public boolean hasCriticalExtensions()
			    {
				return getChosenFlag() == criticalExtensions_chosen;
			    }
			    
			    public void setCriticalExtensions(CriticalExtensions5 criticalExtensions)
			    {
				setChosenValue(criticalExtensions);
				setChosenFlag(criticalExtensions_chosen);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type CriticalExtensions5 from ASN1 Module Internode_definitions.
			     * @see Choice
			     */
			    public static class CriticalExtensions5 extends Choice {
				
				/**
				 * The default constructor.
				 */
				public CriticalExtensions5()
				{
				}
				
				public static final  int  r10_chosen = 1;
				public static final  int  criticalExtensions_chosen = 2;
				
				// Methods for field "r10"
				public static CriticalExtensions5 createCriticalExtensions5WithR10(R10 r10)
				{
				    CriticalExtensions5 __object = new CriticalExtensions5();

				    __object.setR10(r10);
				    return __object;
				}
				
				public boolean hasR10()
				{
				    return getChosenFlag() == r10_chosen;
				}
				
				public void setR10(R10 r10)
				{
				    setChosenValue(r10);
				    setChosenFlag(r10_chosen);
				}
				
				
				
				/**
				 * Define the ASN1 Type R10 from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class R10 extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public R10()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public R10(SRNC_RelocationInfo_r10_IEs sRNC_RelocationInfo_r10, 
						    BitString sRNC_RelocationInfo_r10_add_ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setSRNC_RelocationInfo_r10(sRNC_RelocationInfo_r10);
					setSRNC_RelocationInfo_r10_add_ext(sRNC_RelocationInfo_r10_add_ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public R10(SRNC_RelocationInfo_r10_IEs sRNC_RelocationInfo_r10)
				    {
					setSRNC_RelocationInfo_r10(sRNC_RelocationInfo_r10);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SRNC_RelocationInfo_r10_IEs();
					mComponents[1] = new BitString();
					mComponents[2] = new NonCriticalExtensions();
				    }
				    
				    // Instance initializer
				    {
					mComponents = new AbstractData[3];
				    }
				    
				    // Method to create a specific component instance
				    public AbstractData createInstance(int index)
				    {
					switch (index) {
					    case 0:
						return new SRNC_RelocationInfo_r10_IEs();
					    case 1:
						return new BitString();
					    case 2:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_r10"
				    public SRNC_RelocationInfo_r10_IEs getSRNC_RelocationInfo_r10()
				    {
					return (SRNC_RelocationInfo_r10_IEs)mComponents[0];
				    }
				    
				    public void setSRNC_RelocationInfo_r10(SRNC_RelocationInfo_r10_IEs sRNC_RelocationInfo_r10)
				    {
					mComponents[0] = sRNC_RelocationInfo_r10;
				    }
				    
				    
				    // Methods for field "sRNC_RelocationInfo_r10_add_ext"
				    public BitString getSRNC_RelocationInfo_r10_add_ext()
				    {
					return (BitString)mComponents[1];
				    }
				    
				    public void setSRNC_RelocationInfo_r10_add_ext(BitString sRNC_RelocationInfo_r10_add_ext)
				    {
					mComponents[1] = sRNC_RelocationInfo_r10_add_ext;
				    }
				    
				    public boolean hasSRNC_RelocationInfo_r10_add_ext()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteSRNC_RelocationInfo_r10_add_ext()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    // Methods for field "nonCriticalExtensions"
				    public NonCriticalExtensions getNonCriticalExtensions()
				    {
					return (NonCriticalExtensions)mComponents[2];
				    }
				    
				    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
				    {
					mComponents[2] = nonCriticalExtensions;
				    }
				    
				    public boolean hasNonCriticalExtensions()
				    {
					return componentIsPresent(2);
				    }
				    
				    public void deleteNonCriticalExtensions()
				    {
					setComponentAbsent(2);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
				     * @see Sequence
				     */
				    public static class NonCriticalExtensions extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public NonCriticalExtensions()
					{
					}
					
					public void initComponents()
					{
					    
					}
					
					// Instance initializer
					{
					    mComponents = new AbstractData[0];
					}
					
					// Method to create a specific component instance
					public AbstractData createInstance(int index)
					{
					    return null;
					}
					
					
					/**
					 * Initialize the type descriptor.
					 */
					private static final SequenceInfo c_typeinfo = new SequenceInfo (
					    new Tags (
						new short[] {
						    (short)0x8002
						}
					    ),
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10$NonCriticalExtensions"
					    ),
					    new QName (
						"builtin",
						"SEQUENCE"
					    ),
					    12314,
					    null,
					    new Fields (
						new SequenceFieldInfo[] {
						}
					    ),
					    0,
					    null,
					    0
					);
					
					/**
					 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for NonCriticalExtensions

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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10"
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
								"rrc.internode_definitions",
								"SRNC_RelocationInfo_r10_IEs"
							    ),
							    new QName (
								"Internode-definitions",
								"SRNC-RelocationInfo-r10-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_r10_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.internode_definitions",
								    "SRNC_RelocationInfo_r10_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sRNC-RelocationInfo-r10",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new BitStringInfo (
							    new Tags (
								new short[] {
								    (short)0x8001
								}
							    ),
							    new QName (
								"com.oss.asn1",
								"BitString"
							    ),
							    new QName (
								"builtin",
								"BIT STRING"
							    ),
							    12314,
							    null,
							    null,
							    null
							)
						    ),
						    "sRNC-RelocationInfo-r10-add-ext",
						    1,
						    3,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.internode_definitions",
							    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10$NonCriticalExtensions"
							)
						    ),
						    "nonCriticalExtensions",
						    2,
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
							new TagDecoderElement((short)0x8001, 1),
							new TagDecoderElement((short)0x8002, 2)
						    }
						),
						new TagDecoder (
						    new TagDecoderElement[] {
							new TagDecoderElement((short)0x8002, 2)
						    }
						)
					    }
					),
					0
				    );
				    
				    /**
				     * Get the type descriptor (TypeInfo) of 'this' R10 object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' R10 object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for R10

				// Methods for field "criticalExtensions"
				public static CriticalExtensions5 createCriticalExtensions5WithCriticalExtensions(CriticalExtensions6 criticalExtensions)
				{
				    CriticalExtensions5 __object = new CriticalExtensions5();

				    __object.setCriticalExtensions(criticalExtensions);
				    return __object;
				}
				
				public boolean hasCriticalExtensions()
				{
				    return getChosenFlag() == criticalExtensions_chosen;
				}
				
				public void setCriticalExtensions(CriticalExtensions6 criticalExtensions)
				{
				    setChosenValue(criticalExtensions);
				    setChosenFlag(criticalExtensions_chosen);
				}
				
				
				
				/**
				 * Define the ASN1 Type CriticalExtensions6 from ASN1 Module Internode_definitions.
				 * @see Sequence
				 */
				public static class CriticalExtensions6 extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public CriticalExtensions6()
				    {
				    }
				    
				    public void initComponents()
				    {
					
				    }
				    
				    // Instance initializer
				    {
					mComponents = new AbstractData[0];
				    }
				    
				    // Method to create a specific component instance
				    public AbstractData createInstance(int index)
				    {
					return null;
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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
					),
					new QName (
					    "builtin",
					    "SEQUENCE"
					),
					12314,
					null,
					new Fields (
					    new SequenceFieldInfo[] {
					    }
					),
					0,
					null,
					0
				    );
				    
				    /**
				     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions6 object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions6 object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for CriticalExtensions6

				// Method to create a specific choice instance
				public AbstractData createInstance(int chosen)
				{
				    switch (chosen) {
					case r10_chosen:
					    return new R10();
					case criticalExtensions_chosen:
					    return new CriticalExtensions6();
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
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10"
						    )
						),
						"r10",
						0,
						2
					    ),
					    new FieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.internode_definitions",
							"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
						    )
						),
						"criticalExtensions",
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
				 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions5 object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions5 object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for CriticalExtensions5

			    // Method to create a specific choice instance
			    public AbstractData createInstance(int chosen)
			    {
				switch (chosen) {
				    case r9_chosen:
					return new R9();
				    case criticalExtensions_chosen:
					return new CriticalExtensions5();
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
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9"
						)
					    ),
					    "r9",
					    0,
					    2
					),
					new FieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.internode_definitions",
						    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
						)
					    ),
					    "criticalExtensions",
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
			     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions4 object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions4 object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for CriticalExtensions4

			// Method to create a specific choice instance
			public AbstractData createInstance(int chosen)
			{
			    switch (chosen) {
				case r8_chosen:
				    return new R8();
				case criticalExtensions_chosen:
				    return new CriticalExtensions4();
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
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8"
					    )
					),
					"r8",
					0,
					2
				    ),
				    new FieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
					    )
					),
					"criticalExtensions",
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
			 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions3 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions3 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for CriticalExtensions3

		    // Method to create a specific choice instance
		    public AbstractData createInstance(int chosen)
		    {
			switch (chosen) {
			    case r7_chosen:
				return new R7();
			    case criticalExtensions_chosen:
				return new CriticalExtensions3();
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
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7"
					)
				    ),
				    "r7",
				    0,
				    2
				),
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.internode_definitions",
					    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
					)
				    ),
				    "criticalExtensions",
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
		     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions2 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions2 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for CriticalExtensions2

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case r6_chosen:
			    return new R6();
			case criticalExtensions_chosen:
			    return new CriticalExtensions2();
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.internode_definitions",
			"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$R6"
				    )
				),
				"r6",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
				    )
				),
				"criticalExtensions",
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
		 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions1 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions1 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for CriticalExtensions1

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case r5_chosen:
			return new R5();
		    case criticalExtensions_chosen:
			return new CriticalExtensions1();
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.internode_definitions",
		    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions"
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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$R5"
				)
			    ),
			    "r5",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions$CriticalExtensions1"
				)
			    ),
			    "criticalExtensions",
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
	     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for CriticalExtensions

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case r4_chosen:
		    return new R4();
		case criticalExtensions_chosen:
		    return new CriticalExtensions();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r3$Later_than_r3"
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
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$R4"
			    )
			),
			"r4",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r3$Later_than_r3$CriticalExtensions"
			    )
			),
			"criticalExtensions",
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
	 * Get the type descriptor (TypeInfo) of 'this' Later_than_r3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Later_than_r3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Later_than_r3

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case r3_chosen:
		return new R3();
	    case later_than_r3_chosen:
		return new Later_than_r3();
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
	    "SRNC_RelocationInfo_r3"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-r3"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3$R3"
			)
		    ),
		    "r3",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3$Later_than_r3"
			)
		    ),
		    "later-than-r3",
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r3 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r3 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_r3
