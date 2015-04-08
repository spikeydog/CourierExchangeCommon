package common.bidding;

import java.io.Serializable;
import java.sql.Timestamp;

public interface Bid extends Serializable {
	
	/**
	 * @return the bidID
	 */
	public int getBidID();

	/**
	 * @param bidID the bidID to set
	 */
	public void setBidID(int bidID);
	
	/**
	 * @return the courierID
	 */
	public int getCourierID();
	
	/**
	 * @param courierID the courierID to set
	 */
	public void setCourierID(int courierID);
	
	/**
	 * @return the deliveryRequestID
	 */
	public int getDeliveryRequestID();
	
	/**
	 * @param deliveryRequestID the deliveryRequestID to set
	 */
	public void setDeliveryRequestID(int deliveryRequestID);
	
	/**
	 * @return the dropOffTime
	 */
	public Timestamp getDropOffTime();
	
	/**
	 * @param dropOffTime the dropOffTime to set
	 */
	public void setDropOffTime(Timestamp dropOffTime);
	
	/**
	 * @return the fee
	 */
	public float getFee();
	
	/**
	 * @param fee the fee to set
	 */
	public void setFee(float fee);
	
	/**
	 * @return the hasPendingUpdate
	 */
	public boolean isPendingUpdate();
	
	/**
	 * @param hasPendingUpdate the hasPendingUpdate to set
	 */
	public void setIsPendingUpdate(boolean hasPendingUpdate);
	
	/**
	 * @return the isAccepted
	 */
	public boolean isAccepted();
	
	/**
	 * @param hasPendingUpdate the hasPendingUpdate to set
	 */
	public void setIsAccepted(boolean isAccepted);
	
	/**
	 * @return the pickUpTime
	 */
	public Timestamp getPickUpTime();
	
	/**
	 * @param pickUpTime the pickUpTime to set
	 */
	public void setPickUpTime(Timestamp pickUpTime);
}
