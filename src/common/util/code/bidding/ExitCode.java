package common.util.code.bidding;

public enum ExitCode {
	// The operation was successful
	SUCCESS,
	// A general (default) failure code so that mysterious failures will be reported
	FAILURE,
	// A SQLException occurred
	SQL_EXCEPTION,
	// drop off time cannot be converted to java.sql.Timestamp
	DROP_OFF_TIME_ERR,
	// pick up time cannot be converted to java.sql.Timestamp
	PICKUP_TIME_ERR,
	// fee cannot be converted to float
	FEE_ERR,
	// The bid is invalid and cannot be inserted or updated
	BID_INVALID,
	// The bid is a duplicate; the Courier already has one on that delivery request
	BID_DUPLICATE,
	// The bid has already been accepted and cannot be updated
	BID_ACCEPTED,
	// The selected delivery in the current session is null
	REQ_NULL,
	// The bid-upon delivery request is no longer valid
	REQ_INVALID;
}
