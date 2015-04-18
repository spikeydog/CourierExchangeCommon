package common.user;

public enum Server {
	RMI_BINDING("userServer");
	
	public String name;
	
	private Server(String name) {
		this.name = name;
	}
}
