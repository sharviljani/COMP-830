package MidTerm_ObserverPattern;

public class Worker implements Observer {


	private long workerId;

	public Worker(long workerId) {
		this.workerId = workerId;
	}
	
	public long getID() {
		return this.workerId;
		
	}
		
	public Event notify(Event e) {
		if(e.getItemID() == workerId)
		{
			System.out.printf("Worker %s processed WorkItem %s message %s\n", workerId, e.getItemID(), e.getMessage());
			return e;
		}
		else
		{
			return null;
		}
	}
	public long getWorkerId() {
		return workerId;
	}
}