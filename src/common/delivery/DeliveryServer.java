package common.delivery;

import java.rmi.Remote;
import java.util.List;

import common.user.User;
import common.util.code.delivery.ExitCode;

public interface DeliveryServer extends Remote {
	/**
	 * Accepts a request to create a new DeliveryRequest in the system
	 * @param request
	 * @return
	 */
	public ExitCode createDeliveryRequest(DeliveryRequest request);
	
	public ExitCode edit_delivery(DeliveryRequest delivery);
	
	public ExitCode activate_delivery(DeliveryRequest delivery);
	
	public ExitCode delete_delivery(DeliveryRequest delivery);
	
	public DeliveryRequest search_delivery(DeliveryRequest delivery);
	
	public List<DeliveryRequest> list_deliveries(Status status, User user);
}
