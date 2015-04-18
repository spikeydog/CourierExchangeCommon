package common.rating;

import java.io.Serializable;

public class RatingCE implements Rating, Serializable {

	private final static long serialVersionUID = 726L;
    private int ratingID;
    private int deliveryRequestID;
    private int customerOverallRating;
    private int customerProfesionalismRating;
    private int customerDeliveryPersonRating;
	public int getRatingID() {
		return ratingID;
	}
	public void setRatingID(int ratingID) {
		this.ratingID = ratingID;
	}
	public int getDeliveryRequestID() {
		return deliveryRequestID;
	}
	public void setDeliveryRequestID(int deliveryRequestID) {
		this.deliveryRequestID = deliveryRequestID;
	}
	public int getCustomerOverallRating() {
		return customerOverallRating;
	}
	public void setCustomerOverallRating(int customerOverallRating) {
		this.customerOverallRating = customerOverallRating;
	}
	public int getCustomerProfesionalismRating() {
		return customerProfesionalismRating;
	}
	public void setCustomerProfesionalismRating(int customerProfesionalismRating) {
		this.customerProfesionalismRating = customerProfesionalismRating;
	}
	public int getCustomerDeliveryPersonRating() {
		return customerDeliveryPersonRating;
	}
	public void setCustomerDeliveryPersonRating(int customerDeliveryPersonRating) {
		this.customerDeliveryPersonRating = customerDeliveryPersonRating;
	}
}
