package MidTerm_ObserverPattern;


import java.util.ArrayList;
import java.util.List;

public class WorkManager implements PublisherInterface {

	private List<Worker> workers;
	private WorkItem workItem;
	
	public WorkManager() {
		workers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Worker o) {
		workers.add(o);

	}

	@Override
	public void removeObserver(Worker o) {
		workers.remove(o);
	}

	@Override
	public void notifyObservers(Event e) {
		Event item = workItem;
		for (Worker w : workers) {
			if (item.getItemID() > 4)
				break;
				
			item = w.notify(item);
			if (item != null) {
				System.out.println(String.format("%d: Completed work on WorkItem<%d>", w.getWorkerId(), item.getItemID() - 1));
			}
		}
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
}
