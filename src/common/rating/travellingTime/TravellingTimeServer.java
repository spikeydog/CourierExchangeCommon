/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.rating.travellingTime;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Chiru
 */
public interface TravellingTimeServer extends Remote{
     public TravellingTime getTravellingTimes(int courier_id,String pickUpAdress,String dropOffAdress) throws RemoteException;    
}
