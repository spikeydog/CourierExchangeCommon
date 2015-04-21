package common.util;

/**
 * This enumeration stores the partial URL to access an RMI server
 * over the network. This will be used in combination with the 
 * Server.RMI_BINDING.name variable available in each module-based
 * package.
 * 
 * A servlet will use:
 * java.rmi.Naming.locate(common.util.RMI.URL.path + Server.RMI_BINDING.name)
 * to obtain a copy of the RMI server stub (for whichever module)
 * 
 * @author sedog
 *
 */
public enum RMI {
	URL("rmi://localhost:2222/");
	
	public final String path;
	
	private RMI(String path) {
		this.path = path;
	}
}
