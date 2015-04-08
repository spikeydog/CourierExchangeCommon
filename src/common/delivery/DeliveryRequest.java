package common.delivery;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Interface allowing local and RMI access to the definition for a <code>
 * DeliveryRequestCE</code> object and its methods.
 * 
 * @author sedog
 */
public interface DeliveryRequest extends Serializable {

    /**
     * @return the bidID
     */
    public int getBidID();

    /**
     * @param bidID the bidID to set
     */
    public void setBidID(int bidID);

    /**
     * @return the customerID
     */
    public int getCustomerID();
    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID);

    /**
     * @return the deliveryRequestID
     */
    public int getDeliveryRequestID();

    /**
     * @param deliveryRequestID the deliveryRequestID to set
     */
    public void setDeliveryRequestID(int deliveryRequestID);

    /**
     * @return the description
     */
    public String getDescription();

    /**
     * @param description the description to set
     */
    public void setDescription(String description);

    /**
     * @return the dropOffAddress
     */
    public String getDropOffAddress();

    /**
     * @param dropOffAddress the dropOffAddress to set
     */
    public void setDropOffAddress(String dropOffAddress);

    /**
     * @return the dropOffTime
     */
    public Timestamp getDropOffTime();

    /**
     * @param dropOffTime the dropOffTime to set
     */
    public void setDropOffTime(Timestamp dropOffTime);

    /**
     * @return the pickUpAddress
     */
    public String getPickUpAddress();

    /**
     * @param pickUpAddress the pickUpAddress to set
     */
    public void setPickUpAddress(String pickUpAddress);
    
    /**
     * @return the pickUpAddress
     */
    public Timestamp getPickUpTime();

    /**
     * @param pickUpAddress the pickUpAddress to set
     */
    public void setPickUpTime(Timestamp pickUpTime);

    /**
     * @return the postTime
     */
    public Timestamp getPostTime();

    /**
     * @param postTime the postTime to set
     */
    public void setPostTime(Timestamp postTime);

    /**
     * @return the realDropOffTime
     */
    public Timestamp getRealDropOffTime();

    /**
     * @param realDropOffTime the realDropOffTime to set
     */
    public void setRealDropOffTime(Timestamp realDropOffTime);

    /**
     * @return the realPickUpTime
     */
    public Timestamp getRealPickUpTime();

    /**
     * @param realPickUpTime the realPickUpTime to set
     */
    public void setRealPickUpTime(Timestamp realPickUpTime);
    
    /**
     * @return the status
     */
    public Status getStatus();

    /**
     * @param weight the weight to set
     */
    public void setStatus(Status status);

    /**
     * @return the weight
     */
    public float getWeight();

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight);
}
