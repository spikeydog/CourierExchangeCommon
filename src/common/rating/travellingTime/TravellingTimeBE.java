/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.rating.travellingTime;

import java.io.Serializable;

/**
 *
 * @author Chiru
 */
public class TravellingTimeBE implements TravellingTime, Serializable {
    private static final long serialVersionUID = 82728L;
    private long personalTravellingTime;
    private long overallTravellingTime;

    public long getPersonalTravellingTime() {
        return personalTravellingTime;
    }

    public void setPersonalTravellingTime(long personalTravellingTime) {
        this.personalTravellingTime = personalTravellingTime;
    }

    public long getOverallTravellingTime() {
        return overallTravellingTime;
    }

    public void setOverallTravellingTime(long overallTravellingTime) {
        this.overallTravellingTime = overallTravellingTime;
    }    

    @Override
    public String toString() {
        return "TravellingTimeBE{" + "personalTravellingTime=" + personalTravellingTime + ", overallTravellingTime=" + overallTravellingTime + '}';
    }

    
    
}
