package common;

import java.util.HashMap;
import java.util.Map;

public enum UserType {
	COURIER(1),
	CUSTOMER(2);
	
public final int value;
	
	private UserType(int value) {
		this.value = value;
	}
	
	// Mapping of integer values to human-readable Status values
	private static Map<Integer, UserType> map = new HashMap<Integer, UserType>();
	static {
		for (UserType status : UserType.values()) {
			map.put((Integer) status.value, status);
		}
	}
	
	/**
	 * Maps and returns the <code>Status</code> associated with the given value
	 * 
	 * @param value	integer stored in the database for this <code>Status</code>
	 * @return		<code>Status</code> mapped to <code>value</code>
	 */
	public static final UserType map(int value) {
		return map.get((Integer) value);
	}
}
