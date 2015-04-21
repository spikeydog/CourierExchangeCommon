package common.delivery;

/**
 * Stores the name under which the RMI server in this module will be 
 * bound to the registry. Using this enumerated value avoids RMI 
 * communication failures due to using incorrect explicit strings.
 * 
 * @author sedog
 *
 */
public enum Server {
	RMI_BINDING("deliveryServer");
	
	public String name;
	
	private Server(String name) {
		this.name = name;
	}
}
