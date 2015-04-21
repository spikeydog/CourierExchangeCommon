/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.rating.metrics;

import java.io.Serializable;

/**
 *
 * @author Chiru
 */

public interface Metrics{
	
	public int getCourierID();
	public void setCourierID(int courierID);
	
	public float getAverageOverallRating();
	public void setAverageOverallRating(float averageOverallRating);
	
	public float getAverageProfesionalismRating();
	public void setAverageProfesionalismRating(float averageProfesionalismRating);
	
	public float getAverageDeliveryPersonRating();
	public void setAverageDeliveryPersonRating(float averageDeliveryPersonRating);
        
        public int getTotalRequestsDelivered();
        public void setTotalRequestsDelivered(int totalRequestsDelivered);
        
        public int getPercentageRequestsDeliveredOnTime();
        public void setPercentageRequestsDeliveredOnTime(int percentageRequestsDeliveredOnTime);       
        
        public int getNoOfBidsPlaced();
        public void setNoOfBidsPlaced(int noOfBidsPlaced);        
}
