/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.rating.metrics;

import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author Chiru
 */
public interface MetricsServer extends Remote{    
    public Metrics getMetrics(int courierID);    
    public List<Metrics> getMetricsForAllCouriers();
}
