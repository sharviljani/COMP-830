package HW8;

public class SubscriberOdds implements Observer{
	
public boolean notifyObserver(Event E) {
		
		
		if(E.getEventData() % 2 != 0)
		{
			System.out.println("Event "+ E.getEventNumber()+" "+E.getEventData()+" is odd");
			
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}

	}

