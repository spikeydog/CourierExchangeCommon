package common.bidding;

public enum Server {
	RMI_BINDING("biddingServer");
	
	public String name;
	
	private Server(String name) {
		this.name = name;
	}
}
