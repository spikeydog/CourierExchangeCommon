package basic;

import common.bidding.Bid;
import common.bidding.BidCE;
import common.delivery.DeliveryRequest;
import common.delivery.DeliveryRequestCE;
import common.util.code.bidding.ExitCode;

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
	}
}
