package HW8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PublisherImplementation implements PublisherInterface {

	private List<Observer> subscribers = new ArrayList<Observer>();
	

	public void registerObserver(Observer o) {
		
		subscribers.add(o);
	}

	public void removeObserver(Observer o) {
		
		subscribers.remove(o);
	}

	public void notifyObserver(Observer o) {
		
		
	}

	private Event generateEvent(int eventNumber) {
		
		Random myNum = new Random();
		int number = 1 + myNum.nextInt(500);
		Event eventGen = new Event (eventNumber, number );
		
		return eventGen ;
		
	}

	public void notifyObserver() {

	}

	public void runSimulation() {
		int oddNums = 0; // Odd number counts
		int threeNums = 0;// Threes number count
		int evensNums = 0;// Evens number count
		
		for (int i = 1 ; i < 201; i++ ) {
			
			Event eventObj = generateEvent(i);
			
			
		}
		
		

	}

}
