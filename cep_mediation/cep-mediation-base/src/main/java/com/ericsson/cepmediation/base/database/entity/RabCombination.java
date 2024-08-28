package com.ericsson.cepmediation.base.database.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RabCombination {

	private List<Short> sortedRabs;
	
	public RabCombination(List<Short> rabs) {
		sortedRabs = rabs;
		Collections.sort(sortedRabs);
		Collections.unmodifiableList(sortedRabs);
		
	}
	
	public List<Short> getSortedRabs() {
		return sortedRabs;
	}
	
	@Override
    public int hashCode() {

        int hash = 1;
        
        for (Short rab : sortedRabs) {
        	hash = hash * 31 + rab;
        }

        return hash;

    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }

        final RabCombination otherRabCombination = (RabCombination) other;
        
        if (sortedRabs.size() != otherRabCombination.getSortedRabs().size()) {
        	return false;
        }

        boolean result = true;
         
        for (int i=0; i<sortedRabs.size(); i++) {
        	result = result && (sortedRabs.get(i) == otherRabCombination.getSortedRabs().get(i));
        }
        
        return result;

    }
    
    /**
     * Compares this rab combination to another rab combination and finds all rabs that are in this
     * combination but are not in the other combination. All instances of duplicate rab types that
     * are not in the other rab combination will be returned e.g. rabCombination has values [2,5,5] and 
     * otherRabCombination has values [1,2,5] then the result has value [5]
     *  
     * @param subsetRabCombination contains subset of rabs
     * @return RabCombinartion containing the missing rabs
     */
    public RabCombination findMissingRabs(RabCombination otherRabCombination) {
    	List<Short> missingRabs = new ArrayList<Short>();
    	List<Short> subsetSortedRabs = otherRabCombination.getSortedRabs();
    	int startSearchFromindex = 0;
    	for (int i=0; i<sortedRabs.size(); i++) {
    		Short rab = sortedRabs.get(i);
    		boolean found = false;
    		for (int j=startSearchFromindex; j<subsetSortedRabs.size(); j++ ) {
    			if (rab == subsetSortedRabs.get(j)) {
    				startSearchFromindex = j + 1;
    				found = true;
    				break;
    			}
    		}
    		if (!found) {
    			missingRabs.add(rab);
    		}
    	}
    	return new RabCombination(missingRabs);
    }
    
}
