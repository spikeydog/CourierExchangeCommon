package common.delivery;

public enum Server {
	RMI_BINDING("deliveryServer");
	
	public String name;
	
	private Server(String name) {
		this.name = name;
	}
}
