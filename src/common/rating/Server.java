package common.rating;

public enum Server {
	RMI_BINDING("ratingServer");
	
	public String name;
	
	private Server(String name) {
		this.name = name;
	}
}
