package common.util.code.rating;

import java.util.HashMap;
import java.util.Map;

public enum ExitCode {
	// The operation was successful
	SUCCESS("Action successful"),
	// A general (default) failure code so that mysterious failures will be reported
	FAILURE("An unknown error occurred"),
	// A SQLException occurred
	SQL_EXCEPTION("A database error occurred"),
	// Rating Range Error
	RATING_RANGE_ERR("Ratings provided need to be in the rage of 1 to 5"),
	// Multiple OR no delivery Requests
	RATING_DEL_REQ_NOT_EXIST("Provided Delivery Request does not exist");
	
private String message;
	
	private ExitCode(String message) {
		this.message = message;
	}
	
	// Mapping of integer values to human-readable Status values
	private static Map<String, ExitCode> map = new HashMap<String, ExitCode>();
	static {
		for (ExitCode criterion : ExitCode.values()) {
			map.put(criterion.message, criterion);
		}
	}
	
	/**
	 * Maps and returns the <code>Status</code> associated with the given value
	 * 
	 * @param value	integer stored in the database for this <code>Status</code>
	 * @return		<code>Status</code> mapped to <code>value</code>
	 */
	public static final ExitCode map(String message) {
		return map.get(message);
	}
}
