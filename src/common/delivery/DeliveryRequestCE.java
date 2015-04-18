package common.delivery;

import java.io.Serializable;
import java.sql.Timestamp;

public class DeliveryRequestCE implements DeliveryRequest, Serializable, Cloneable {
	private static final long serialVersionUID = 345L;
	public static final int DEFAULT_REQ_ID = 0;
	public static final int DEFAULT_BID_ID = 0;
	public static final int DEFAULT_CUST_ID = 0;
	private int bidID = DEFAULT_BID_ID;
	private int customerID = DEFAULT_CUST_ID;
	private int deliveryRequestID = DEFAULT_REQ_ID;
	private String description;
	private Timestamp dropOffTime;
	private String dropOffAddress;
	private Timestamp realDropOffTime;
	private Timestamp pickUpTime;
	private String pickUpAddress;
	private Timestamp realPickUpTime;
	private Timestamp postTime;
	private Status status = Status.SAVED;
	private float weight = Float.NaN;
	
	/**
	 * @return the bidID
	 */
	public int getBidID() {
		return bidID;
	}
	/**
	 * @param bidID the bidID to set
	 */
	public void setBidID(int bidID) {
		this.bidID = bidID;
	}
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the deliveryRequestID
	 */
	public int getDeliveryRequestID() {
		return deliveryRequestID;
	}
	/**
	 * @param deliveryRequestID the deliveryRequestID to set
	 */
	public void setDeliveryRequestID(int deliveryRequestID) {
		this.deliveryRequestID = deliveryRequestID;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the dropOffTime
	 */
	public Timestamp getDropOffTime() {
		return dropOffTime;
	}
	/**
	 * @param dropOffTime the dropOffTime to set
	 */
	public void setDropOffTime(Timestamp dropOffTime) {
		this.dropOffTime = dropOffTime;
	}
	/**
	 * @return the dropOffAddress
	 */
	public String getDropOffAddress() {
		return dropOffAddress;
	}
	/**
	 * @param dropOffAddress the dropOffAddress to set
	 */
	public void setDropOffAddress(String dropOffAddress) {
		this.dropOffAddress = dropOffAddress;
	}
	/**
	 * @return the realDropOffTime
	 */
	public Timestamp getRealDropOffTime() {
		return realDropOffTime;
	}
	/**
	 * @param realDropOffTime the realDropOffTime to set
	 */
	public void setRealDropOffTime(Timestamp realDropOffTime) {
		this.realDropOffTime = realDropOffTime;
	}
	/**
	 * @return the pickUpTime
	 */
	public Timestamp getPickUpTime() {
		return pickUpTime;
	}
	/**
	 * @param pickUpTime the pickUpTime to set
	 */
	public void setPickUpTime(Timestamp pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	/**
	 * @return the pickUpAddress
	 */
	public String getPickUpAddress() {
		return pickUpAddress;
	}
	/**
	 * @param pickUpAddress the pickUpAddress to set
	 */
	public void setPickUpAddress(String pickUpAddress) {
		this.pickUpAddress = pickUpAddress;
	}
	/**
	 * @return the realPickUpTime
	 */
	public Timestamp getRealPickUpTime() {
		return realPickUpTime;
	}
	/**
	 * @param realPickUpTime the realPickUpTime to set
	 */
	public void setRealPickUpTime(Timestamp realPickUpTime) {
		this.realPickUpTime = realPickUpTime;
	}
	/**
	 * @return the postTime
	 */
	public Timestamp getPostTime() {
		return postTime;
	}
	/**
	 * @param postTime the postTime to set
	 */
	public void setPostTime(Timestamp postTime) {
		this.postTime = postTime;
	}
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	/**
	 * Returns a <code>String</code> representation of this <code>DeliveryRequest</code>
	 * @return	<code>String</code>
	 */
	@Override
	public String toString() {
		StringBuilder scribe = new StringBuilder();
		
		scribe.append("deliveryRequestID:")
				.append(this.deliveryRequestID)
				.append("bidID:").append(this.bidID).append("\n")
				.append("customerID:").append(this.customerID).append("\n")
				.append("description:").append(this.description).append("\n")
				.append("dropOffTime:")
				.append(this.dropOffTime == null? "null" : this.dropOffTime).append("\n")
				.append("dropOffAddress:")
				.append(this.dropOffAddress == null? "null" : this.dropOffAddress).append("\n")
				.append("realDropOffTime:")
				.append(this.realDropOffTime == null? "null" : this.realDropOffTime).append("\n")
				.append("pickUpTime:")
				.append(this.pickUpTime == null? "null" : this.pickUpTime).append("\n")
				.append("pickUpAddress:")
				.append(this.pickUpAddress == null? "null" : this.pickUpAddress).append("\n")
				.append("realPickUpTime:")
				.append(this.realPickUpTime == null? "null" : this.realPickUpTime).append("\n")
				.append("postTime:")
				.append(this.postTime == null? "null" : this.postTime).append("\n")
				.append("status:").append(this.status.name()).append("\n")
				.append("weight:").append(this.weight).append("\n");
		
		return scribe.toString();
	}
	
	/**
	 * Returns only a base copy of this <code>DeliveryRequest</code>.
	 */
	@Override
	public DeliveryRequestCE clone() {
		// The copy to return
		DeliveryRequestCE copy = null;
		try {
			copy = (DeliveryRequestCE) super.clone();
		} catch (CloneNotSupportedException ex) {
			// Nothing to do here, really.
		}
		copy.setDropOffTime(this.dropOffTime);
		copy.setPickUpTime(this.pickUpTime);
		copy.setDescription(this.description);
		copy.setWeight(this.weight);
		copy.setCustomerID(this.customerID);
		copy.setStatus(Status.SAVED);
		
		return copy;
	}

}
