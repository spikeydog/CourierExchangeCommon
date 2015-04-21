/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.rating.travellingTime;

/**
 *
 * @author Chiru
 */
public interface TravellingTime {
    
    public void setPersonalTravellingTime(long personalTravellingTime);
    public long getPersonalTravellingTime();
    
    public void setOverallTravellingTime(long overallTravellingTime);
    public long getOverallTravellingTime();
    
}
