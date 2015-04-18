package common.util.code.delivery;

import java.util.HashMap;
import java.util.Map;

public enum ExitCode {
	// Successful operation
	SUCCESS("Action successful"),
	// Default, undefined failure condition - should always be overwritten when known
	FAILURE("An unknown error occurred"),
	// A SQLException occurred
	SQL_EXCEPTION("A database error occurred"),
	// DeliveryRequest state-specific errors indicating field is invalid for some reason
	PICKUP_TIME_ERR("Verify that your desired Pick-Up Time is in the future and is before the Drop-Off Time"),
	DROP_OFF_TIME_ERR("Verify that your desired Drop-Off Time is in the future and is after the Pick-Up Time"),
	PICKUP_ADDR_ERR("Verify that the Pick-Up Address is in the greater San Francisco area"),
	DROP_OFF_ADDR_ERR("Verify that the Drop-Off Address is in the greater San Francisco area"),
	// There is either no user in the session, or user is not a customer
	CUST_ERR("You are not authorized to perform that action"),
	// The delivery request is not in the correct status for the chosen action
	STATUS_ERR("Your desired action is no longer valid");
	
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
