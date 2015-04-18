package common.util.code.bidding;

import java.util.HashMap;
import java.util.Map;

public enum ExitCode {
	// The operation was successful
	SUCCESS("Action successful"),
	// A general (default) failure code so that mysterious failures will be reported
	FAILURE("An unknown error occurred"),
	// A SQLException occurred
	SQL_EXCEPTION("A database error occurred"),
	// drop off time cannot be converted to java.sql.Timestamp
	DROP_OFF_TIME_ERR("Verify your offered Drop-Off Time is in the future and after your Pick-Up Time"),
	// pick up time cannot be converted to java.sql.Timestamp
	PICKUP_TIME_ERR("Verify that your offered Pick-Up Time is in the future and is before your Drop-Off Time"),
	// fee cannot be converted to float
	FEE_ERR("Are you sure you want to offer a free delivery?"),
	// The bid is invalid and cannot be inserted or updated
	BID_INVALID("Debug:The bid is invalid"),
	// The bid is a duplicate; the Courier already has one on that delivery request
	BID_DUPLICATE("You already have placed a bid on this Delivery"),
	// The bid has already been accepted and cannot be updated
	BID_ACCEPTED("You cannot alter your bid once it has been accepted by a Customer"),
	// The selected delivery in the current session is null
	REQ_NULL("Debug:No delivery in the session"),
	// The bid-upon delivery request is no longer valid
	REQ_INVALID("That delivery request is no longer available for bidding");
	
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
