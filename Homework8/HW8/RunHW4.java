package HW8;

public class RunHW4 {

	public static void main(String[] args) {

		PublisherImplementation pub = new PublisherImplementation();
		SubscriberOdds sOdd = new SubscriberOdds();
		SubscriberEvens sEvens = new SubscriberEvens();
		SubscriberThrees sThree = new SubscriberThrees();
		
		pub.registerObserver(sOdd);
		pub.registerObserver(sEvens);
		pub.registerObserver(sThree);
		
		pub.runSimulation();

	}

}
