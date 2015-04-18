package common.util;

public enum RMI {
	URL("rmi://localhost/2222/");
	
	public final String path;
	
	private RMI(String path) {
		this.path = path;
	}
}
