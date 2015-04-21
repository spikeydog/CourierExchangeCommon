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
public enum Server {
    RMI_BINDING("travellingTimeServer");	
	public String name;	
	private Server(String name) {
		this.name = name;
	}
}
