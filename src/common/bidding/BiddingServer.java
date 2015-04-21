package common.bidding;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import common.delivery.DeliveryRequest;
import common.util.code.bidding.ExitCode;

public interface BiddingServer extends Remote {
	
	/**
	 * Allows the user to view a sorted <code>List</code> of all <code>Bids</code> placed upon the given
	 * <code>DeliveryRequest</code>. Exposes the functionality of both ListBids and SortBids use 
	 * cases.
	 * 
	 * @param request	the <code>DeliveryRequest</code> for which bids will be listed
	 * @param criterion the criteria by which bids will be sorted
	 * @param order		the order in which bids are to be sorted
	 * @return <code>List&#60Bid&#62</code>
	 */
	public List<Bid> listBids(DeliveryRequest request, SortCriterion criterion, SortOrder order) throws RemoteException ;
	
	/**
	 * Inserts a new bid record into the database using the given <code>Bid</code>. It models
	 * the placement of a bid by the <code>User</code> and on the <code>DeliveryRequest</code> it references.
	 * Returns the <code>ExitCode</code> indicating the success or failure of this operation.
	 *  
	 * @param bid	<code>Bid</code> containing the information needed to place it.
	 * @return <code>ExitCode</code>
	 */
	public ExitCode placeBid(Bid bid) throws RemoteException ;
	
	/**
	 * Updates an exiting bid record using the given <code>Bid</code> and returns an <code>ExitCode</code>
	 * indicating the success or failure of this operation.
	 * 
	 * @param bid	<code>Bid</code> containing the information to update
	 * @return 		<code>ExitCode</code>
	 */
	public ExitCode updateBid(Bid bid) throws RemoteException ;
	
	/**
	 * Finalizes the given <code>Bid</code> on the given <code>DeliveryRequest</code>.
	 * 
	 * @param delivery	The <code>DeliveryRequest</code> to be fulfilled by <code>bid</code>
	 * @param bid		The <code>Bid</code> to fulfill <code>delivery</code>
	 * @return 			<code>ExitCode</code>
	 */
	public ExitCode acceptBid(DeliveryRequest delivery, Bid bid) throws RemoteException ;
	
	public Bid getBid(Bid bid) throws RemoteException;
}
