/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.rating;

import java.rmi.Remote;
import java.rmi.RemoteException;
import common.util.code.rating.ExitCode;

/**
 *
 * @author Chiru
 */
public interface RatingServer extends Remote{
    
    public ExitCode insertRating(Rating rating) throws RemoteException;
    public Rating   getRating(int delReqID) throws RemoteException;
    
}
