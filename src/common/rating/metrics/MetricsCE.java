/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.rating.metrics;

/**
 *
 * @author Chiru
 */
public class MetricsCE implements Metrics{    

       int courierID;
       float averageOverallRating;
       float averageProfesionalismRating;
       float averageDeliveryPersonRating;
       int totalRequestsDelivered;
       int percentageRequestsDeliveredOnTime;
       int noOfBidsPlaced;


    public int getCourierID() {
        return courierID;
    }

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }

    public float getAverageOverallRating() {
        return averageOverallRating;
    }

    public void setAverageOverallRating(float averageOverallRating) {
        this.averageOverallRating = averageOverallRating;
    }

    public float getAverageProfesionalismRating() {
        return averageProfesionalismRating;
    }

    public void setAverageProfesionalismRating(float averageProfesionalismRating) {
        this.averageProfesionalismRating = averageProfesionalismRating;
    }

    public float getAverageDeliveryPersonRating() {
        return averageDeliveryPersonRating;
    }

    public void setAverageDeliveryPersonRating(float averageDeliveryPersonRating) {
        this.averageDeliveryPersonRating = averageDeliveryPersonRating;
    }

    public int getTotalRequestsDelivered() {
        return totalRequestsDelivered;
    }

    public void setTotalRequestsDelivered(int totalRequestsDelivered) {
        this.totalRequestsDelivered = totalRequestsDelivered;
    }

    public int getPercentageRequestsDeliveredOnTime() {
        return percentageRequestsDeliveredOnTime;
    }

    public void setPercentageRequestsDeliveredOnTime(int percentageRequestsDeliveredOnTime) {
        this.percentageRequestsDeliveredOnTime = percentageRequestsDeliveredOnTime;
    }

    public int getNoOfBidsPlaced() {
        return noOfBidsPlaced;
    }

    public void setNoOfBidsPlaced(int noOfBidsPlaced) {
        this.noOfBidsPlaced = noOfBidsPlaced;
    }       

    @Override
    public String toString() {
        return "MetricsCE{ "+" courierID=" + courierID + ", averageOverallRating=" + averageOverallRating + ", averageProfesionalismRating=" + averageProfesionalismRating + ", averageDeliveryPersonRating=" + averageDeliveryPersonRating + ", totalRequestsDelivered=" + totalRequestsDelivered + ", percentageRequestsDeliveredOnTime=" + percentageRequestsDeliveredOnTime + ", noOfBidsPlaced=" + noOfBidsPlaced + '}';
    }
}