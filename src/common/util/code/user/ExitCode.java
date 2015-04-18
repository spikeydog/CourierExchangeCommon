package common.util.code.user;

import java.util.HashMap;
import java.util.Map;

public enum ExitCode {
	// Successful operation
		SUCCESS("Action successful"),
		// Default, undefined failure condition - should always be overwritten when known
		FAILURE("An unknown error occurred"),
		// A SQLException occurred
		SQL_EXCEPTION("A database error occurred");
		
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
