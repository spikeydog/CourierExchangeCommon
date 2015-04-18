package common.bidding;

import java.util.HashMap;
import java.util.Map;

public enum SortOrder {
	DESC("descending"),
	ASC("ascending");
	
	private String name;
	
	private SortOrder(String name) {
		this.name = name;
	}
	
	// Mapping of integer values to human-readable Status values
	private static Map<String, SortOrder> map = new HashMap<String, SortOrder>();
	static {
		for (SortOrder order : SortOrder.values()) {
			map.put(order.name, order);
		}
	}
	
	/**
	 * Maps and returns the <code>Status</code> associated with the given value
	 * 
	 * @param value	integer stored in the database for this <code>Status</code>
	 * @return		<code>Status</code> mapped to <code>value</code>
	 */
	public static final SortOrder map(String name) {
		return map.get(name);
	}
}
