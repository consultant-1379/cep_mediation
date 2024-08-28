package com.ericsson.cepmediation.correlation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.database.entity.RabCombination;
import com.ericsson.cepmediation.base.database.entity.RabTypeInfo;

public final class RabTypes {
	
	private static Map<Integer,String> rabTypeValues = new HashMap<Integer,String>();
	private static Map<Integer,RabTypeInfo> rabTypesInfo = new HashMap<Integer,RabTypeInfo>();
	private static Map<RabCombination,Short> rabCombinations2RabType = new HashMap<RabCombination, Short>();

	
	static {
		
		rabTypeValues.put(0, "IDLE");
    	rabTypeValues.put(1, "SRB_13.6_13.6");
    	rabTypeValues.put(2, "CONVERSATIONAL_CS_12.2_12.2");
    	rabTypeValues.put(3, "CONVERSATIONAL_CS_64_64");
    	rabTypeValues.put(4, "INTERACTIVE_PS_RACH_FACH");
    	rabTypeValues.put(5, "INTERACTIVE_PS_64_64");
    	rabTypeValues.put(6, "INTERACTIVE_PS_64_128");
    	rabTypeValues.put(7, "INTERACTIVE_PS_64_384");
    	rabTypeValues.put(8, "STREAMING_CS_57.6_57.6");
    	rabTypeValues.put(9, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_0_0");
    	rabTypeValues.put(10, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_64");
    	rabTypeValues.put(11, "SRB_13.6_13.6");
    	rabTypeValues.put(12, "CONVERSATIONAL_CS_12.2_12.2");
    	rabTypeValues.put(13, "STREAMING_PS_16_64-INTERACTIVE_PS_8_8");
    	rabTypeValues.put(14, "CONVERSATIONAL_CS_64_64-INTERACTIVE_PS_8_8");
    	rabTypeValues.put(15, "INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(16, "INTERACTIVE_PS_384_HS");
    	rabTypeValues.put(17, "STREAMING_PS_16_128-INTERACTIVE_PS_8_8");
    	rabTypeValues.put(18, "INTERACTIVE_PS_128_128");
    	rabTypeValues.put(19, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(20, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_384_HS");
    	rabTypeValues.put(21, "INTERACTIVE_PS_URA_URA");
    	rabTypeValues.put(22, "STREAMING_PS_128_16-INTERACTIVE_PS_8_8");
    	rabTypeValues.put(23, "CONVERSATIONAL_CS_12.2_12.2-STREAMING_PS_128_16-INTERACTIVE_PS_8_8");
    	rabTypeValues.put(24, "CONVERSATIONAL_CS_12.2_12.2-STREAMING_PS_16_128-INTERACTIVE_PS_8_8");
    	rabTypeValues.put(25, "INTERACTIVE_PS_EUL_HS");
    	rabTypeValues.put(26, "INTERACTIVE_PS_64_64-INTERACTIVE_PS_64_64");
    	rabTypeValues.put(27, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_64-INTERACTIVE_PS_64_64");
    	rabTypeValues.put(28, "INTERACTIVE_PS_128_64");
    	rabTypeValues.put(29, "INTERACTIVE_PS_384_64");
    	rabTypeValues.put(30, "INTERACTIVE_PS_384_128");
    	rabTypeValues.put(31, "INTERACTIVE_PS_128_384");
    	rabTypeValues.put(32, "INTERACTIVE_PS_384_384");
    	rabTypeValues.put(33, "CONVERSATIONAL_CS_7.95_7.95");
    	rabTypeValues.put(34, "CONVERSATIONAL_CS_5.9_5.9");
    	rabTypeValues.put(35, "CONVERSATIONAL_CS_4.75_4.75");
    	rabTypeValues.put(36, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_128");
    	rabTypeValues.put(37, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_128_64");
    	rabTypeValues.put(38, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_384");
    	rabTypeValues.put(39, "INTERACTIVE_PS_64_128-INTERACTIVE_PS_64_128");
    	rabTypeValues.put(40, "CONVERSATIONAL_CS_12.65_12.65");
    	rabTypeValues.put(41, "CONVERSATIONAL_CS_12.65_12.65");
    	rabTypeValues.put(42, "CONVERSATIONAL_CS_12.65_12.65-INTERACTIVE_PS_0_0");
    	rabTypeValues.put(43, "CONVERSATIONAL_CS_12.65_12.65-INTERACTIVE_PS_64_64");
    	rabTypeValues.put(44, "CONVERSATIONAL_CS_12.65_12.65-INTERACTIVE_PS_64_128");
    	rabTypeValues.put(45, "CONVERSATIONAL_CS_12.65_12.65-INTERACTIVE_PS_128_64");
    	rabTypeValues.put(46, "STREAMING_PS_128_HS-INTERACTIVE_PS_8_HS");
    	rabTypeValues.put(47, "CONVERSATIONAL_CS_12.65_12.65-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(48, "CONVERSATIONAL_CS_12.65_12.65-INTERACTIVE_PS_384_HS");
    	rabTypeValues.put(49, "CONVERSATIONAL_CS_12.2_12.2-STREAMING_PS_128_HS-INTERACTIVE_PS_8_HS");
    	rabTypeValues.put(50, "CONVERSATIONAL_CS_12.65_12.65-STREAMING_PS_16_128-INTERACTIVE_PS_8_8");
    	rabTypeValues.put(51, "CONVERSATIONAL_CS_12.65_12.65-INTERACTIVE_PS_64_64-INTERACTIVE_PS_64_64");
    	rabTypeValues.put(52, "INTERACTIVE_PS_128_HS");
    	rabTypeValues.put(53, "INTERACTIVE_PS_16_HS");
    	rabTypeValues.put(54, "INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(55, "INTERACTIVE_PS_128_HS-INTERACTIVE_PS_128_HS");
    	rabTypeValues.put(56, "INTERACTIVE_PS_384_HS-INTERACTIVE_PS_384_HS");
    	rabTypeValues.put(57, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(58, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_128_HS-INTERACTIVE_PS_128_HS");
    	rabTypeValues.put(59, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_384_HS-INTERACTIVE_PS_384_HS");
    	rabTypeValues.put(60, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_128_HS");
    	rabTypeValues.put(61, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(62, "INTERACTIVE_PS_EUL_HS-INTERACTIVE_PS_EUL_HS"); 
    	rabTypeValues.put(63, "STREAMING_PS_16_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(64, "CONVERSATIONAL_CS_12.2_12.2-STREAMING_PS_16_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(65, "CONVERSATIONAL_CS_12.2_12.2-STREAMING_PS_128_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(66, "INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(67, "INTERACTIVE_PS_16_16");
    	rabTypeValues.put(68, "INTERACTIVE_PS_16_64");
    	rabTypeValues.put(69, "INTERACTIVE_PS_64_16");
    	rabTypeValues.put(71, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_64-INTERACTIVE_PS_64_64-INTERACTIVE_PS_64_64");
    	rabTypeValues.put(72, "STREAMING_PS_16_HS-INTERACTIVE_PS_8_HS");
    	rabTypeValues.put(73, "STREAMING_PS_32_HS-INTERACTIVE_PS_8_HS");
    	rabTypeValues.put(74, "INTERACTIVE_PS_64_64-INTERACTIVE_PS_64_64-INTERACTIVE_PS_64_64");
    	rabTypeValues.put(75, "STREAMING_PS_128_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_64_HS");
    	rabTypeValues.put(76, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_64_64-INTERACTIVE_PS_128_128-INTERACTIVE_PS_128_128");
    	rabTypeValues.put(77, "CONVERSATIONAL_CS_12.2_12.2-STREAMING_PS_16_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_8_HS");
    	rabTypeValues.put(78, "CONVERSATIONAL_CS_12.2_12.2-STREAMING_PS_32_HS-INTERACTIVE_PS_64_HS-INTERACTIVE_PS_8_HS");
    	rabTypeValues.put(79, "CONVERSATIONAL_CS_5.9_5.9");
    	rabTypeValues.put(80, "CONVERSATIONAL_CS_5.9_5.9-INTERACTIVE_PS_0_0");
    	rabTypeValues.put(94, "SRB_3.4_3.4");
    	rabTypeValues.put(95, "SRB_3.4_3.4");
    	rabTypeValues.put(113, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_16_HS");
    	rabTypeValues.put(123, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_EUL_HS");
    	rabTypeValues.put(124, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_EUL_HS-INTERACTIVE_PS_EUL_HS");
    	rabTypeValues.put(125, "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_EUL_HS-INTERACTIVE_PS_EUL_HS-INTERACTIVE_PS_EUL_HS");
    	rabTypeValues.put(128, "INTERACTIVE_PS_EUL_HS-INTERACTIVE_PS_EUL_HS-INTERACTIVE_PS_EUL_HS");
    	rabTypeValues.put(176, "CONVERSATIONAL_CS_5.9_5.9-INTERACTIVE_PS_EUL_HS");
    	rabTypeValues.put(181, "CONVERSATIONAL_CS_64_64-INTERACTIVE_PS_8_HS");
    	
    	rabTypeValues.put(5000, "INTERACTIVE_PS_0_0");
    	rabTypeValues.put(5001, "STREAMING_PS_16_64");
    	rabTypeValues.put(5002, "INTERACTIVE_PS_8_8");
    	rabTypeValues.put(5003, "STREAMING_PS_16_128");
    	rabTypeValues.put(5004, "STREAMING_PS_128_16");
    	rabTypeValues.put(5005, "STREAMING_PS_128_HS");
    	rabTypeValues.put(5006, "INTERACTIVE_PS_8_HS");
    	rabTypeValues.put(5007, "STREAMING_PS_16_HS");
    	rabTypeValues.put(5008, "STREAMING_PS_32_HS");
    	
    	loadRabTypeInfo();
    	loadRabCombinations2RabType();
	}
	
	
	private static void loadRabTypeInfo() {
		Map<String, Short> description2RabType = getDescription2RabType();
		for (Map.Entry<Integer, String> rabTypeValue : rabTypeValues.entrySet()) {
			Integer rabTypeNumber = rabTypeValue.getKey();
			String rabTypeDescription = rabTypeValue.getValue();
			List<Short> rabs = new ArrayList<Short>();
			if (rabTypeDescription != null && !rabTypeDescription.isEmpty()) {
				final byte psRabCnt = countOccurences(rabTypeDescription, "_PS_");
				final byte csRabCnt = countOccurences(rabTypeDescription, "_CS_");
				if (rabTypeNumber == 12 || rabTypeNumber == 41 || rabTypeNumber == 11) {
					rabs.add(rabTypeNumber.shortValue());
				} else {
					String[] rabTypeDescriptionSplit = rabTypeDescription.split("-");
					for (String description : rabTypeDescriptionSplit) {
						Short rabType = description2RabType.get(description);
						if (rabType != null) {
							rabs.add(rabType);
						} else {
							// Should not get here but just in case
							rabs.add(DefaultValues.DEFAULT_SHORT_VALUE);
						}
					}
				}
				rabTypesInfo.put(rabTypeNumber, new RabTypeInfo(psRabCnt, csRabCnt, rabs));
			}
		}
	}
	
	private static void loadRabCombinations2RabType() {
		for (Map.Entry<Integer, RabTypeInfo> rabTypeInfo : rabTypesInfo.entrySet()) {
			Short rabTypeNumber = rabTypeInfo.getKey().shortValue();
			RabCombination rabs = rabTypeInfo.getValue().getComposedOfRabTypes();
			rabCombinations2RabType.put(rabs, rabTypeNumber);
		}
	}
	
	private static Map<String, Short> getDescription2RabType() {
		Map<String, Short> results = new HashMap<String, Short>();
		for (Map.Entry<Integer, String> rabTypeValue : rabTypeValues.entrySet()) {
			Integer rabTypeNumber = rabTypeValue.getKey();
			if (rabTypeNumber == 12 || rabTypeNumber == 41 || rabTypeNumber == 11) {
				continue;
			}
			String rabTypeDescription = rabTypeValue.getValue();
			String[] rabDescriptions = rabTypeDescription.split("-");
			if (rabDescriptions.length == 1) {
				results.put(rabTypeDescription, rabTypeNumber.shortValue());
			}
		}
		return results;
	}
	
	private static byte countOccurences(String source, final String pattern) {
        byte count = 0;
        int pos = source.indexOf(pattern);
        while (pos > -1) {
            count++;
            source = source.substring(pos + pattern.length());
            pos = source.indexOf(pattern);
        }
        return count;

    }
	
    
    public static boolean isCsRabOnly(final int rab) {
        return getPsCount(rab) == 0 && getCsCount(rab) > 0;
    }
    

    public static byte getPsCount( int rab) {
        final RabTypeInfo res = rabTypesInfo.get(rab);
        return res != null ? res.getPsRabCount() : 0;
    }
    

    public static byte getCsCount(final int rab) {
        final RabTypeInfo res = rabTypesInfo.get(rab);
        return res != null ? res.getCsRabCount() : 0;
    }
    
    public static boolean isMultiRab(final int rab) {
    	final RabTypeInfo res = rabTypesInfo.get(rab);
        return res != null ? res.isMultiRab() : false;
    }
    
    public static short getExtraRabsInFirstRab(final int firstRab, final int secondRab) {
    	RabCombination firstRabCombo;
    	RabCombination secondRabCombo;
    	
    	RabTypeInfo firstRabType = rabTypesInfo.get(firstRab);
    	if (firstRabType != null) {
    		firstRabCombo = firstRabType.getComposedOfRabTypes();
    	} else {
    		return DefaultValues.DEFAULT_SHORT_VALUE;
    	}
    	
    	RabTypeInfo secondRabType = rabTypesInfo.get(secondRab);
    	if (secondRabType != null) {
    		secondRabCombo = secondRabType.getComposedOfRabTypes();
    	} else {
    		return DefaultValues.DEFAULT_SHORT_VALUE;
    	}
    	
    	RabCombination extraRabsInFirstRab = firstRabCombo.findMissingRabs(secondRabCombo);
    	Short result = rabCombinations2RabType.get(extraRabsInFirstRab);
    	if (result != null) {
    		return result.shortValue();
    	}
    	return DefaultValues.DEFAULT_SHORT_VALUE;
    }
    
    public static boolean isHsdpaBearer(final int bearerId) {
        final String description = rabTypeValues.get(bearerId);
        if (description != null && description.contains("HS")) {
            return true;
        }
        return false;
    }


    public static boolean isHsupaBearer(final int bearerId) {
        final String description = rabTypeValues.get(bearerId);
        if (description != null && description.contains("EUL")) {
            return true;
        }
        return false;
    }
       
}

    