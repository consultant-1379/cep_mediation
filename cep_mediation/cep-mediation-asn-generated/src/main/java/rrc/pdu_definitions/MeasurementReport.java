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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MeasurementReport from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementReport extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementReport()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementReport(rrc.informationelements.MeasurementIdentity measurementIdentity, 
		    rrc.informationelements.MeasuredResults measuredResults, 
		    rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH, 
		    rrc.informationelements.MeasuredResultsList additionalMeasuredResults, 
		    rrc.informationelements.EventResults eventResults, 
		    V390nonCriticalExtensions v390nonCriticalExtensions)
    {
	setMeasurementIdentity(measurementIdentity);
	setMeasuredResults(measuredResults);
	setMeasuredResultsOnRACH(measuredResultsOnRACH);
	setAdditionalMeasuredResults(additionalMeasuredResults);
	setEventResults(eventResults);
	setV390nonCriticalExtensions(v390nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public MeasurementReport(rrc.informationelements.MeasurementIdentity measurementIdentity)
    {
	setMeasurementIdentity(measurementIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MeasurementIdentity();
	mComponents[1] = new rrc.informationelements.MeasuredResults();
	mComponents[2] = new rrc.informationelements.MeasuredResultsOnRACH();
	mComponents[3] = new rrc.informationelements.MeasuredResultsList();
	mComponents[4] = new rrc.informationelements.EventResults();
	mComponents[5] = new V390nonCriticalExtensions();
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
		return new rrc.informationelements.MeasurementIdentity();
	    case 1:
		return new rrc.informationelements.MeasuredResults();
	    case 2:
		return new rrc.informationelements.MeasuredResultsOnRACH();
	    case 3:
		return new rrc.informationelements.MeasuredResultsList();
	    case 4:
		return new rrc.informationelements.EventResults();
	    case 5:
		return new V390nonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementIdentity"
    public rrc.informationelements.MeasurementIdentity getMeasurementIdentity()
    {
	return (rrc.informationelements.MeasurementIdentity)mComponents[0];
    }
    
    public void setMeasurementIdentity(rrc.informationelements.MeasurementIdentity measurementIdentity)
    {
	mComponents[0] = measurementIdentity;
    }
    
    
    // Methods for field "measuredResults"
    public rrc.informationelements.MeasuredResults getMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResults)mComponents[1];
    }
    
    public void setMeasuredResults(rrc.informationelements.MeasuredResults measuredResults)
    {
	mComponents[1] = measuredResults;
    }
    
    public boolean hasMeasuredResults()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasuredResults()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "measuredResultsOnRACH"
    public rrc.informationelements.MeasuredResultsOnRACH getMeasuredResultsOnRACH()
    {
	return (rrc.informationelements.MeasuredResultsOnRACH)mComponents[2];
    }
    
    public void setMeasuredResultsOnRACH(rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH)
    {
	mComponents[2] = measuredResultsOnRACH;
    }
    
    public boolean hasMeasuredResultsOnRACH()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasuredResultsOnRACH()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "additionalMeasuredResults"
    public rrc.informationelements.MeasuredResultsList getAdditionalMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResultsList)mComponents[3];
    }
    
    public void setAdditionalMeasuredResults(rrc.informationelements.MeasuredResultsList additionalMeasuredResults)
    {
	mComponents[3] = additionalMeasuredResults;
    }
    
    public boolean hasAdditionalMeasuredResults()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAdditionalMeasuredResults()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "eventResults"
    public rrc.informationelements.EventResults getEventResults()
    {
	return (rrc.informationelements.EventResults)mComponents[4];
    }
    
    public void setEventResults(rrc.informationelements.EventResults eventResults)
    {
	mComponents[4] = eventResults;
    }
    
    public boolean hasEventResults()
    {
	return componentIsPresent(4);
    }
    
    public void deleteEventResults()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "v390nonCriticalExtensions"
    public V390nonCriticalExtensions getV390nonCriticalExtensions()
    {
	return (V390nonCriticalExtensions)mComponents[5];
    }
    
    public void setV390nonCriticalExtensions(V390nonCriticalExtensions v390nonCriticalExtensions)
    {
	mComponents[5] = v390nonCriticalExtensions;
    }
    
    public boolean hasV390nonCriticalExtensions()
    {
	return componentIsPresent(5);
    }
    
    public void deleteV390nonCriticalExtensions()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type V390nonCriticalExtensions from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V390nonCriticalExtensions extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V390nonCriticalExtensions()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V390nonCriticalExtensions(MeasurementReport_v390ext measurementReport_v390ext, 
			LaterNCEs laterNCEs)
	{
	    setMeasurementReport_v390ext(measurementReport_v390ext);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V390nonCriticalExtensions(MeasurementReport_v390ext measurementReport_v390ext)
	{
	    setMeasurementReport_v390ext(measurementReport_v390ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MeasurementReport_v390ext();
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
		    return new MeasurementReport_v390ext();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "measurementReport_v390ext"
	public MeasurementReport_v390ext getMeasurementReport_v390ext()
	{
	    return (MeasurementReport_v390ext)mComponents[0];
	}
	
	public void setMeasurementReport_v390ext(MeasurementReport_v390ext measurementReport_v390ext)
	{
	    mComponents[0] = measurementReport_v390ext;
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
	 * Define the ASN1 Type LaterNCEs from ASN1 Module PDU_definitions.
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
	    public LaterNCEs(BitString measurementReport_r3_add_ext, 
			    V4b0NCEs v4b0NCEs)
	    {
		setMeasurementReport_r3_add_ext(measurementReport_r3_add_ext);
		setV4b0NCEs(v4b0NCEs);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BitString();
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
			return new BitString();
		    case 1:
			return new V4b0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "measurementReport_r3_add_ext"
	    public BitString getMeasurementReport_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setMeasurementReport_r3_add_ext(BitString measurementReport_r3_add_ext)
	    {
		mComponents[0] = measurementReport_r3_add_ext;
	    }
	    
	    public boolean hasMeasurementReport_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteMeasurementReport_r3_add_ext()
	    {
		setComponentAbsent(0);
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
	     * Define the ASN1 Type V4b0NCEs from ASN1 Module PDU_definitions.
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
		public V4b0NCEs(MeasurementReport_v4b0ext_IEs measurementReport_v4b0ext, 
				V590NCEs v590NCEs)
		{
		    setMeasurementReport_v4b0ext(measurementReport_v4b0ext);
		    setV590NCEs(v590NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V4b0NCEs(MeasurementReport_v4b0ext_IEs measurementReport_v4b0ext)
		{
		    setMeasurementReport_v4b0ext(measurementReport_v4b0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new MeasurementReport_v4b0ext_IEs();
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
			    return new MeasurementReport_v4b0ext_IEs();
			case 1:
			    return new V590NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "measurementReport_v4b0ext"
		public MeasurementReport_v4b0ext_IEs getMeasurementReport_v4b0ext()
		{
		    return (MeasurementReport_v4b0ext_IEs)mComponents[0];
		}
		
		public void setMeasurementReport_v4b0ext(MeasurementReport_v4b0ext_IEs measurementReport_v4b0ext)
		{
		    mComponents[0] = measurementReport_v4b0ext;
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
		 * Define the ASN1 Type V590NCEs from ASN1 Module PDU_definitions.
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
		    public V590NCEs(MeasurementReport_v590ext_IEs measurementReport_v590ext, 
				    V5b0NCEs v5b0NCEs)
		    {
			setMeasurementReport_v590ext(measurementReport_v590ext);
			setV5b0NCEs(v5b0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V590NCEs(MeasurementReport_v590ext_IEs measurementReport_v590ext)
		    {
			setMeasurementReport_v590ext(measurementReport_v590ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new MeasurementReport_v590ext_IEs();
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
				return new MeasurementReport_v590ext_IEs();
			    case 1:
				return new V5b0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "measurementReport_v590ext"
		    public MeasurementReport_v590ext_IEs getMeasurementReport_v590ext()
		    {
			return (MeasurementReport_v590ext_IEs)mComponents[0];
		    }
		    
		    public void setMeasurementReport_v590ext(MeasurementReport_v590ext_IEs measurementReport_v590ext)
		    {
			mComponents[0] = measurementReport_v590ext;
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
		     * Define the ASN1 Type V5b0NCEs from ASN1 Module PDU_definitions.
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
			public V5b0NCEs(MeasurementReport_v5b0ext_IEs measurementReport_v5b0ext, 
					V690NCEs v690NCEs)
			{
			    setMeasurementReport_v5b0ext(measurementReport_v5b0ext);
			    setV690NCEs(v690NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V5b0NCEs(MeasurementReport_v5b0ext_IEs measurementReport_v5b0ext)
			{
			    setMeasurementReport_v5b0ext(measurementReport_v5b0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new MeasurementReport_v5b0ext_IEs();
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
				    return new MeasurementReport_v5b0ext_IEs();
				case 1:
				    return new V690NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "measurementReport_v5b0ext"
			public MeasurementReport_v5b0ext_IEs getMeasurementReport_v5b0ext()
			{
			    return (MeasurementReport_v5b0ext_IEs)mComponents[0];
			}
			
			public void setMeasurementReport_v5b0ext(MeasurementReport_v5b0ext_IEs measurementReport_v5b0ext)
			{
			    mComponents[0] = measurementReport_v5b0ext;
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
			 * Define the ASN1 Type V690NCEs from ASN1 Module PDU_definitions.
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
			    public V690NCEs(MeasurementReport_v690ext_IEs measurementReport_v690ext, 
					    V770NCEs v770NCEs)
			    {
				setMeasurementReport_v690ext(measurementReport_v690ext);
				setV770NCEs(v770NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V690NCEs(MeasurementReport_v690ext_IEs measurementReport_v690ext)
			    {
				setMeasurementReport_v690ext(measurementReport_v690ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new MeasurementReport_v690ext_IEs();
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
					return new MeasurementReport_v690ext_IEs();
				    case 1:
					return new V770NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "measurementReport_v690ext"
			    public MeasurementReport_v690ext_IEs getMeasurementReport_v690ext()
			    {
				return (MeasurementReport_v690ext_IEs)mComponents[0];
			    }
			    
			    public void setMeasurementReport_v690ext(MeasurementReport_v690ext_IEs measurementReport_v690ext)
			    {
				mComponents[0] = measurementReport_v690ext;
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
			     * Define the ASN1 Type V770NCEs from ASN1 Module PDU_definitions.
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
				public V770NCEs(MeasurementReport_v770ext_IEs measurementReport_v770ext, 
						V860NCEs v860NCEs)
				{
				    setMeasurementReport_v770ext(measurementReport_v770ext);
				    setV860NCEs(v860NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V770NCEs(MeasurementReport_v770ext_IEs measurementReport_v770ext)
				{
				    setMeasurementReport_v770ext(measurementReport_v770ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new MeasurementReport_v770ext_IEs();
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
					    return new MeasurementReport_v770ext_IEs();
					case 1:
					    return new V860NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "measurementReport_v770ext"
				public MeasurementReport_v770ext_IEs getMeasurementReport_v770ext()
				{
				    return (MeasurementReport_v770ext_IEs)mComponents[0];
				}
				
				public void setMeasurementReport_v770ext(MeasurementReport_v770ext_IEs measurementReport_v770ext)
				{
				    mComponents[0] = measurementReport_v770ext;
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
				 * Define the ASN1 Type V860NCEs from ASN1 Module PDU_definitions.
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
				    public V860NCEs(MeasurementReport_v860ext_IEs measurementReport_v860ext, 
						    V920NCEs v920NCEs)
				    {
					setMeasurementReport_v860ext(measurementReport_v860ext);
					setV920NCEs(v920NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V860NCEs(MeasurementReport_v860ext_IEs measurementReport_v860ext)
				    {
					setMeasurementReport_v860ext(measurementReport_v860ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new MeasurementReport_v860ext_IEs();
					mComponents[1] = new V920NCEs();
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
						return new MeasurementReport_v860ext_IEs();
					    case 1:
						return new V920NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "measurementReport_v860ext"
				    public MeasurementReport_v860ext_IEs getMeasurementReport_v860ext()
				    {
					return (MeasurementReport_v860ext_IEs)mComponents[0];
				    }
				    
				    public void setMeasurementReport_v860ext(MeasurementReport_v860ext_IEs measurementReport_v860ext)
				    {
					mComponents[0] = measurementReport_v860ext;
				    }
				    
				    
				    // Methods for field "v920NCEs"
				    public V920NCEs getV920NCEs()
				    {
					return (V920NCEs)mComponents[1];
				    }
				    
				    public void setV920NCEs(V920NCEs v920NCEs)
				    {
					mComponents[1] = v920NCEs;
				    }
				    
				    public boolean hasV920NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV920NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V920NCEs from ASN1 Module PDU_definitions.
				     * @see Sequence
				     */
				    public static class V920NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V920NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V920NCEs(MeasurementReport_v920ext_IEs measurementReport_v920ext, 
							V970NCEs v970NCEs)
					{
					    setMeasurementReport_v920ext(measurementReport_v920ext);
					    setV970NCEs(v970NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V920NCEs(MeasurementReport_v920ext_IEs measurementReport_v920ext)
					{
					    setMeasurementReport_v920ext(measurementReport_v920ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new MeasurementReport_v920ext_IEs();
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
						    return new MeasurementReport_v920ext_IEs();
						case 1:
						    return new V970NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "measurementReport_v920ext"
					public MeasurementReport_v920ext_IEs getMeasurementReport_v920ext()
					{
					    return (MeasurementReport_v920ext_IEs)mComponents[0];
					}
					
					public void setMeasurementReport_v920ext(MeasurementReport_v920ext_IEs measurementReport_v920ext)
					{
					    mComponents[0] = measurementReport_v920ext;
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
					 * Define the ASN1 Type V970NCEs from ASN1 Module PDU_definitions.
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
					    public V970NCEs(MeasurementReport_v970ext_IEs measurementReport_v970ext_IE, 
							    Va40NCEs va40NCEs)
					    {
						setMeasurementReport_v970ext_IE(measurementReport_v970ext_IE);
						setVa40NCEs(va40NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V970NCEs(MeasurementReport_v970ext_IEs measurementReport_v970ext_IE)
					    {
						setMeasurementReport_v970ext_IE(measurementReport_v970ext_IE);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new MeasurementReport_v970ext_IEs();
						mComponents[1] = new Va40NCEs();
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
							return new MeasurementReport_v970ext_IEs();
						    case 1:
							return new Va40NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "measurementReport_v970ext_IE"
					    public MeasurementReport_v970ext_IEs getMeasurementReport_v970ext_IE()
					    {
						return (MeasurementReport_v970ext_IEs)mComponents[0];
					    }
					    
					    public void setMeasurementReport_v970ext_IE(MeasurementReport_v970ext_IEs measurementReport_v970ext_IE)
					    {
						mComponents[0] = measurementReport_v970ext_IE;
					    }
					    
					    
					    // Methods for field "va40NCEs"
					    public Va40NCEs getVa40NCEs()
					    {
						return (Va40NCEs)mComponents[1];
					    }
					    
					    public void setVa40NCEs(Va40NCEs va40NCEs)
					    {
						mComponents[1] = va40NCEs;
					    }
					    
					    public boolean hasVa40NCEs()
					    {
						return componentIsPresent(1);
					    }
					    
					    public void deleteVa40NCEs()
					    {
						setComponentAbsent(1);
					    }
					    
					    
					    
					    /**
					     * Define the ASN1 Type Va40NCEs from ASN1 Module PDU_definitions.
					     * @see Sequence
					     */
					    public static class Va40NCEs extends Sequence {
						
						/**
						 * The default constructor.
						 */
						public Va40NCEs()
						{
						}
						
						/**
						 * Construct with AbstractData components.
						 */
						public Va40NCEs(MeasurementReport_va40ext_IEs measurementReport_va40ext, 
								NonCriticalExtensions nonCriticalExtensions)
						{
						    setMeasurementReport_va40ext(measurementReport_va40ext);
						    setNonCriticalExtensions(nonCriticalExtensions);
						}
						
						/**
						 * Construct with required components.
						 */
						public Va40NCEs(MeasurementReport_va40ext_IEs measurementReport_va40ext)
						{
						    setMeasurementReport_va40ext(measurementReport_va40ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new MeasurementReport_va40ext_IEs();
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
							    return new MeasurementReport_va40ext_IEs();
							case 1:
							    return new NonCriticalExtensions();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "measurementReport_va40ext"
						public MeasurementReport_va40ext_IEs getMeasurementReport_va40ext()
						{
						    return (MeasurementReport_va40ext_IEs)mComponents[0];
						}
						
						public void setMeasurementReport_va40ext(MeasurementReport_va40ext_IEs measurementReport_va40ext)
						{
						    mComponents[0] = measurementReport_va40ext;
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
						 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
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
							    "rrc.pdu_definitions",
							    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs$V970NCEs$Va40NCEs$NonCriticalExtensions"
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
							"rrc.pdu_definitions",
							"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs$V970NCEs$Va40NCEs"
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
									    "rrc.pdu_definitions",
									    "MeasurementReport_va40ext_IEs"
									),
									new QName (
									    "PDU-definitions",
									    "MeasurementReport-va40ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.pdu_definitions",
										"MeasurementReport_va40ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.pdu_definitions",
										"MeasurementReport_va40ext_IEs"
									    )
									),
									0
								    )
								),
								"measurementReport-va40ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.pdu_definitions",
									"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs$V970NCEs$Va40NCEs$NonCriticalExtensions"
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
						 * Get the type descriptor (TypeInfo) of 'this' Va40NCEs object.
						 */
						public TypeInfo getTypeInfo()
						{
						    return c_typeinfo;
						}
						
						/**
						 * Get the static type descriptor (TypeInfo) of 'this' Va40NCEs object.
						 */
						public static TypeInfo getStaticTypeInfo()
						{
						    return c_typeinfo;
						}
						
					    } // End class definition for Va40NCEs

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
						    "rrc.pdu_definitions",
						    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs$V970NCEs"
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
									"rrc.pdu_definitions",
									"MeasurementReport_v970ext_IEs"
								    ),
								    new QName (
									"PDU-definitions",
									"MeasurementReport-v970ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.pdu_definitions",
									    "MeasurementReport_v970ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.pdu_definitions",
									    "MeasurementReport_v970ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "measurementReport-v970ext-IE",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.pdu_definitions",
								    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs$V970NCEs$Va40NCEs"
								)
							    ),
							    "va40NCEs",
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
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs"
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
								    "rrc.pdu_definitions",
								    "MeasurementReport_v920ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "MeasurementReport-v920ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"MeasurementReport_v920ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"MeasurementReport_v920ext_IEs"
								    )
								),
								0
							    )
							),
							"measurementReport-v920ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs$V970NCEs"
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
					 * Get the type descriptor (TypeInfo) of 'this' V920NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V920NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V920NCEs

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
					    "rrc.pdu_definitions",
					    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs"
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
								"rrc.pdu_definitions",
								"MeasurementReport_v860ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"MeasurementReport-v860ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "MeasurementReport_v860ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "MeasurementReport_v860ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "measurementReport-v860ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs$V920NCEs"
							)
						    ),
						    "v920NCEs",
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
					"rrc.pdu_definitions",
					"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs"
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
							    "rrc.pdu_definitions",
							    "MeasurementReport_v770ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "MeasurementReport-v770ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementReport_v770ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementReport_v770ext_IEs"
							    )
							),
							0
						    )
						),
						"measurementReport-v770ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs$V860NCEs"
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
				    "rrc.pdu_definitions",
				    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs"
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
							"rrc.pdu_definitions",
							"MeasurementReport_v690ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"MeasurementReport-v690ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementReport_v690ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementReport_v690ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "measurementReport-v690ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs$V770NCEs"
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
				"rrc.pdu_definitions",
				"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs"
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
						    "rrc.pdu_definitions",
						    "MeasurementReport_v5b0ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "MeasurementReport-v5b0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementReport_v5b0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementReport_v5b0ext_IEs"
						    )
						),
						0
					    )
					),
					"measurementReport-v5b0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$V690NCEs"
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
			    "rrc.pdu_definitions",
			    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs"
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
						"rrc.pdu_definitions",
						"MeasurementReport_v590ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"MeasurementReport-v590ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MeasurementReport_v590ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MeasurementReport_v590ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "measurementReport-v590ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs"
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
			"rrc.pdu_definitions",
			"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs"
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
					    "rrc.pdu_definitions",
					    "MeasurementReport_v4b0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "MeasurementReport-v4b0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementReport_v4b0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementReport_v4b0ext_IEs"
					    )
					),
					0
				    )
				),
				"measurementReport-v4b0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs$V590NCEs"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
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
			    "measurementReport-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MeasurementReport$V390nonCriticalExtensions$LaterNCEs$V4b0NCEs"
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"MeasurementReport$V390nonCriticalExtensions"
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
				    "rrc.pdu_definitions",
				    "MeasurementReport_v390ext"
				),
				new QName (
				    "PDU-definitions",
				    "MeasurementReport-v390ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementReport_v390ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementReport_v390ext"
				    )
				),
				0
			    )
			),
			"measurementReport-v390ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MeasurementReport$V390nonCriticalExtensions$LaterNCEs"
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
	 * Get the type descriptor (TypeInfo) of 'this' V390nonCriticalExtensions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V390nonCriticalExtensions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V390nonCriticalExtensions

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
	    "rrc.pdu_definitions",
	    "MeasurementReport"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementReport"
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
				"MeasurementIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MeasurementIdentity(1), 
				    new rrc.informationelements.MeasurementIdentity(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "measurementIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResults"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResults"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    )
			)
		    ),
		    "measuredResults",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsOnRACH"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsOnRACH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACH"
				)
			    ),
			    0
			)
		    ),
		    "measuredResultsOnRACH",
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
				"MeasuredResultsList"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResults"
				)
			    )
			)
		    ),
		    "additionalMeasuredResults",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EventResults"
			    ),
			    new QName (
				"InformationElements",
				"EventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EventResults"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    )
			)
		    ),
		    "eventResults",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MeasurementReport$V390nonCriticalExtensions"
			)
		    ),
		    "v390nonCriticalExtensions",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementReport object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementReport object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementReport
