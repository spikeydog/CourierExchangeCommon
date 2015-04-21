package basic;

import java.rmi.RemoteException;
import java.util.List;

import common.bidding.Bid;
import common.bidding.BidCE;
import common.bidding.BiddingServer;
import common.bidding.SortCriterion;
import common.bidding.SortOrder;
import common.delivery.DeliveryRequest;
import common.delivery.DeliveryRequestCE;
import common.user.User;
import common.user.UserCE;
import common.util.code.bidding.ExitCode;
import common.rating.RatingServer;

public class Foo {
	public static final void main(String[] args) {
		Bid bid = new BidCE();
		bid.setBidID(234);
		System.out.println(bid.toString());
		System.out.println(ExitCode.REQ_NULL.toString());
		DeliveryRequest req = new DeliveryRequestCE(); 
		java.util.Random rand = new java.util.Random();
		req.setBidID(rand.nextInt(Integer.MAX_VALUE));
		System.out.println(req.getBidID());
		System.out.println(req.toString());
		System.out.println(common.util.RMI.URL.path + common.bidding.Server.RMI_BINDING.name);
		System.out.println(common.util.code.bidding.ExitCode.BID_ACCEPTED);
		User user = new UserCE();
		user.setUsername("fooberry");
		System.out.println(user.getUsername());
		//RatingServer ratingServer = (RatingServer) new Object();
		Foo foo = new Foo();
		BiddingServer bidServer = foo.new BidServerF();
		try {System.out.println(bidServer.getBid(null));} catch (RemoteException ex) {};
		System.out.println(bidServer.toString());
		System.out.println(BidCE.DEFAULT_BID_ID);
	}
	
	public class BidServerF implements BiddingServer {
		public ExitCode placeBid(Bid bid) {return null;}
		public ExitCode acceptBid(DeliveryRequest r, Bid bid) {return null;}
		public List<Bid> listBids(DeliveryRequest r, SortCriterion c, SortOrder o) {return null;}
		public Bid getBid(Bid bid) {return new BidCE();}
		public ExitCode updateBid(Bid bid) {return null;}
	}
}
