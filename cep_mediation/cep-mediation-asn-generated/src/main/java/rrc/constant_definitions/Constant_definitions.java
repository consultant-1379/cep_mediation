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


package rrc.constant_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

public abstract class Constant_definitions extends ASN1Module {

    
    
    // Value references
    public static final com.oss.asn1.INTEGER hiPDSCHidentities = 
	new com.oss.asn1.INTEGER(64);
    public static final com.oss.asn1.INTEGER hiPUSCHidentities = 
	new com.oss.asn1.INTEGER(64);
    public static final com.oss.asn1.INTEGER hiRM = 
	new com.oss.asn1.INTEGER(256);
    public static final com.oss.asn1.INTEGER maxAC = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxAdditionalMeas = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxASC = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxASCmap = 
	new com.oss.asn1.INTEGER(7);
    public static final com.oss.asn1.INTEGER maxASCpersist = 
	new com.oss.asn1.INTEGER(6);
    public static final com.oss.asn1.INTEGER maxCCTrCH = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxCellMeas = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxCellMeasOnSecULFreq = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxCellMeas_1 = 
	new com.oss.asn1.INTEGER(31);
    public static final com.oss.asn1.INTEGER maxCellMeasOnSecULFreq_1 = 
	new com.oss.asn1.INTEGER(31);
    public static final com.oss.asn1.INTEGER maxCNdomains = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxCommonHRNTI = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxCommonQueueID = 
	new com.oss.asn1.INTEGER(2);
    public static final com.oss.asn1.INTEGER maxCPCHsets = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxDedicatedCSGFreq = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxDPCH_DLchan = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxDPDCH_UL = 
	new com.oss.asn1.INTEGER(6);
    public static final com.oss.asn1.INTEGER maxDRACclasses = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxE_DCHMACdFlow = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxE_DCHMACdFlow_1 = 
	new com.oss.asn1.INTEGER(7);
    public static final com.oss.asn1.INTEGER maxEUTRACellPerFreq = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxEUTRATargetFreqs = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxEDCHRL = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxEDCHRL_1 = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxEDCHs = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxEDCHTxPattern_TDD128 = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxEDCHTxPattern_TDD128_1 = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxERNTIgroup = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxERNTIperGroup = 
	new com.oss.asn1.INTEGER(2);
    public static final com.oss.asn1.INTEGER maxERUCCH = 
	new com.oss.asn1.INTEGER(256);
    public static final com.oss.asn1.INTEGER maxFACHPCH = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxFreq = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxFreqBandsEUTRA = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxFreqBandsFDD = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxFreqBandsFDD2 = 
	new com.oss.asn1.INTEGER(22);
    public static final com.oss.asn1.INTEGER maxFreqBandsFDD_ext = 
	new com.oss.asn1.INTEGER(15);
    public static final com.oss.asn1.INTEGER maxFreqBandsFDD_ext2 = 
	new com.oss.asn1.INTEGER(64);
    public static final com.oss.asn1.INTEGER maxFreqBandsIndicatorSupport = 
	new com.oss.asn1.INTEGER(2);
    public static final com.oss.asn1.INTEGER maxFreqBandsTDD = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxFreqBandsTDD_ext = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxFreqBandsGSM = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxFreqMeasWithoutCM = 
	new com.oss.asn1.INTEGER(2);
    public static final com.oss.asn1.INTEGER maxGANSS = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxGANSS_1 = 
	new com.oss.asn1.INTEGER(7);
    public static final com.oss.asn1.INTEGER maxGANSSSat = 
	new com.oss.asn1.INTEGER(64);
    public static final com.oss.asn1.INTEGER maxGANSSSat_1 = 
	new com.oss.asn1.INTEGER(63);
    public static final com.oss.asn1.INTEGER maxGERAN_SI = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxGSMTargetCells = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxHNBNameSize = 
	new com.oss.asn1.INTEGER(48);
    public static final com.oss.asn1.INTEGER maxHProcesses = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxHS_SCCHLessTrBlk = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxHSDSCHTBIndex = 
	new com.oss.asn1.INTEGER(64);
    public static final com.oss.asn1.INTEGER maxHSDSCHTBIndex_tdd384 = 
	new com.oss.asn1.INTEGER(512);
    public static final com.oss.asn1.INTEGER maxHSSCCHs = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxHSSCCHs_1 = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxHSSICH_TDD128 = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxHSSICH_TDD128_1 = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxInterSysMessages = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxLoCHperRLC = 
	new com.oss.asn1.INTEGER(2);
    public static final com.oss.asn1.INTEGER maxLoggedMeasReport = 
	new com.oss.asn1.INTEGER(128);
    public static final com.oss.asn1.INTEGER maxMAC_d_PDUsizes = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxMBMS_CommonCCTrCh = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxMBMS_CommonPhyCh = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxMBMS_CommonRB = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxMBMS_CommonTrCh = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxMBMS_Freq = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxMBMS_L1CP = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxMBMSservCount = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxMBMSservModif = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxMBMSservSched = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxMBMSservSelect = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxMBMSservUnmodif = 
	new com.oss.asn1.INTEGER(64);
    public static final com.oss.asn1.INTEGER maxMBMSTransmis = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxMBSFNClusters = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxMeasCSGRange = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxMeasEvent = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxMeasEventOnSecULFreq = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxMeasIntervals = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxMeasOccasionPattern = 
	new com.oss.asn1.INTEGER(5);
    public static final com.oss.asn1.INTEGER maxMeasOccasionPattern_1 = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxMeasParEvent = 
	new com.oss.asn1.INTEGER(2);
    public static final com.oss.asn1.INTEGER maxNonContiguousMultiCellCombinations = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxNumCDMA2000Freqs = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxNumE_AGCH = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxNumE_HICH = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxNumEUTRAFreqs = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxNumGSMCellGroup = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxNumGSMFreqRanges = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxNumFDDFreqs = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxNumANRLoggedItems = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxnumLoggedMeas = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxNumTDDFreqs = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxNoOfMeas = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxOtherRAT = 
	new com.oss.asn1.INTEGER(15);
    public static final com.oss.asn1.INTEGER maxOtherRAT_16 = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxPage1 = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxPCPCH_APsig = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxPCPCH_APsubCh = 
	new com.oss.asn1.INTEGER(12);
    public static final com.oss.asn1.INTEGER maxPCPCH_CDsig = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxPCPCH_CDsubCh = 
	new com.oss.asn1.INTEGER(12);
    public static final com.oss.asn1.INTEGER maxPCPCH_SF = 
	new com.oss.asn1.INTEGER(7);
    public static final com.oss.asn1.INTEGER maxPCPCHs = 
	new com.oss.asn1.INTEGER(64);
    public static final com.oss.asn1.INTEGER maxPDCPAlgoType = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxPDSCH = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxPDSCH_TFCIgroups = 
	new com.oss.asn1.INTEGER(256);
    public static final com.oss.asn1.INTEGER maxPRACH = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxPRACH_FPACH = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxPredefConfig = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxPrio = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxPrio_1 = 
	new com.oss.asn1.INTEGER(7);
    public static final com.oss.asn1.INTEGER maxPUSCH = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxQueueIDs = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxRABsetup = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxRAT = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxRB = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxRBallRABs = 
	new com.oss.asn1.INTEGER(27);
    public static final com.oss.asn1.INTEGER maxRBMuxOptions = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxRBperRAB = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxRBperTrCh = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxReportedEUTRACellPerFreq = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxReportedEUTRAFreqs = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxReportedGSMCells = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxRL = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxRL_1 = 
	new com.oss.asn1.INTEGER(7);
    public static final com.oss.asn1.INTEGER maxRLCPDUsizePerLogChan = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxRFC3095_CID = 
	new com.oss.asn1.INTEGER(16384);
    public static final com.oss.asn1.INTEGER maxROHC_PacketSizes_r4 = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxROHC_Profile_r4 = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxRxPatternForHSDSCH_TDD128 = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxRxPatternForHSDSCH_TDD128_1 = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxSat = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxSatClockModels = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxSCCPCH = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxSgnType = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxSIB = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxSIB_FACH = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxSIBperMsg = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxSIrequest = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxSRBsetup = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxSystemCapability = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxTDD128Carrier = 
	new com.oss.asn1.INTEGER(6);
    public static final com.oss.asn1.INTEGER maxTDD128Carrier_1 = 
	new com.oss.asn1.INTEGER(5);
    public static final com.oss.asn1.INTEGER maxTbsForHSDSCH_TDD128 = 
	new com.oss.asn1.INTEGER(4);
    public static final com.oss.asn1.INTEGER maxTbsForHSDSCH_TDD128_1 = 
	new com.oss.asn1.INTEGER(3);
    public static final com.oss.asn1.INTEGER maxTF = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxTF_CPCH = 
	new com.oss.asn1.INTEGER(16);
    public static final com.oss.asn1.INTEGER maxTFC = 
	new com.oss.asn1.INTEGER(1024);
    public static final com.oss.asn1.INTEGER maxTFCsub = 
	new com.oss.asn1.INTEGER(1024);
    public static final com.oss.asn1.INTEGER maxTFCI_2_Combs = 
	new com.oss.asn1.INTEGER(512);
    public static final com.oss.asn1.INTEGER maxTGPS = 
	new com.oss.asn1.INTEGER(6);
    public static final com.oss.asn1.INTEGER maxTrCH = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxTrCHpreconf = 
	new com.oss.asn1.INTEGER(32);
    public static final com.oss.asn1.INTEGER maxTS = 
	new com.oss.asn1.INTEGER(14);
    public static final com.oss.asn1.INTEGER maxTS_1 = 
	new com.oss.asn1.INTEGER(13);
    public static final com.oss.asn1.INTEGER maxTS_2 = 
	new com.oss.asn1.INTEGER(12);
    public static final com.oss.asn1.INTEGER maxTS_LCR = 
	new com.oss.asn1.INTEGER(6);
    public static final com.oss.asn1.INTEGER maxTS_LCR_1 = 
	new com.oss.asn1.INTEGER(5);
    public static final com.oss.asn1.INTEGER maxURA = 
	new com.oss.asn1.INTEGER(8);
    public static final com.oss.asn1.INTEGER maxURNTI_Group = 
	new com.oss.asn1.INTEGER(8);
}
