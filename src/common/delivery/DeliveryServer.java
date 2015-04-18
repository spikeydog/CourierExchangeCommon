package common.delivery;

import java.rmi.Remote;

import common.util.code.delivery.ExitCode;

public interface DeliveryServer extends Remote {
	/**
	 * Accepts a request to create a new DeliveryRequest in the system
	 * @param request
	 * @return
	 */
	public ExitCode createDeliveryRequest(DeliveryRequest request);
}
