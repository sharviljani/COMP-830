package HW8;

public class SubscriberEvens implements Observer {

	public boolean notifyObserver(Event E) {
		
		
		if(E.getEventData() % 2 == 0)
		{
			System.out.println("Event "+ E.getEventNumber()+" "+E.getEventData()+" is even");
			
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}

}
