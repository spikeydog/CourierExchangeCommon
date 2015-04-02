package common;

import java.util.HashMap;
import java.util.Map;

/**
 * This class defines the set of viable states that a <code>DeliveryRequest</code> can
 * be in.
 * 
 * @author sedog
 *
 */
public enum Status {
	SAVED(1),
	POSTED(2),
	IN_PROGRESS(3),
	COMPLETE(4);
	
	public final int value;
	
	private Status(int value) {
		this.value = value;
	}
	
	// Mapping of integer values to human-readable Status values
	private static Map<Integer, Status> map = new HashMap<Integer, Status>();
	static {
		for (Status status : Status.values()) {
			map.put((Integer) status.value, status);
		}
	}
	
	/**
	 * Maps and returns the <code>Status</code> associated with the given value
	 * 
	 * @param value	integer stored in the database for this <code>Status</code>
	 * @return		<code>Status</code> mapped to <code>value</code>
	 */
	public static final Status map(int value) {
		return map.get((Integer) value);
	}
}
