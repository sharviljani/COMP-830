package MidTerm_ObserverPattern;

public class MidTerm_Run {

	public static void main(String[] args) {
		
		WorkManager item = new WorkManager();
		
		
		for (int i = 1; i < 5; i++)
			item.registerObserver(new Worker(i));
		
		item.setWorkItem(new WorkItem(1, 0, "Message1"));
		item.notifyObservers(null);
		
		item.setWorkItem(new WorkItem(3, 0, "Message3"));
		item.notifyObservers(null);
		
		item.setWorkItem(new WorkItem(5, 0, "Message5"));
		item.notifyObservers(null);
	}
}
