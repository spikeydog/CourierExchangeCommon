package common.user;

import java.io.Serializable;


/**
 * This class models a common.user of the system and facilitates RMI by defining 
 * shared entity class definitions.
 * 
 * @author sedog
 *
 */
public interface User extends Serializable {
	
	/**
	 * @return the city
	 */
	public String getCity();

	/**
	 * @param city the city to set
	 */
	public void setCity(String city);
	
	/**
	 * @return the email
	 */
	public String getEmail();
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email);
	
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo();
	
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo);
	
	/**
	 * @return the state
	 */
	public String getState();
	
	/**
	 * @param state the state to set
	 */
	public void setState(String state);
	
	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress1();
	
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress1(String streetAddress);
	
	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress2();
	
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress2(String streetAddress);
	
	/**
	 * @return the userID
	 */
	public int getUserID();
	
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID);
	
	/**
	 * @return the username
	 */
	public String getUsername();
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username);
	
	/**
	 * @return the userType
	 */
	public UserType getUserType();
	
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType);
	
	/**
	 * @return the zipCode
	 */
	public String getZipCode();
	
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode);
	
	public String getPassword();
	public void setPassword(String password);
}
