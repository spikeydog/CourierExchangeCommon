package common.bidding;

import java.util.HashMap;
import java.util.Map;

public enum SortCriterion {
	DROP_TIME("drop_time"),
	PICKUP_TIME("pickup_time"),
	FEE("fee");
	
	private String name;
	
	private SortCriterion(String name) {
		this.name = name;
	}
	
	// Mapping of integer values to human-readable Status values
	private static Map<String, SortCriterion> map = new HashMap<String, SortCriterion>();
	static {
		for (SortCriterion criterion : SortCriterion.values()) {
			map.put(criterion.name, criterion);
		}
	}
	
	/**
	 * Maps and returns the <code>Status</code> associated with the given value
	 * 
	 * @param value	integer stored in the database for this <code>Status</code>
	 * @return		<code>Status</code> mapped to <code>value</code>
	 */
	public static final SortCriterion map(String name) {
		return map.get(name);
	}
}
