package MidTerm_ObserverPattern;

public class WorkItem implements Event {

	private long itemId;
	private long workerId;
	private String message;
	
	public WorkItem(long itemId, long workerId, String message) {
		this.itemId = itemId;
		this.workerId = workerId;
		this.message = message;
	}
	
	public long getItemId() {
		return itemId;
	}
	
	public long getWorkerId() {
		return workerId;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void incrementItemId() {
		itemId +=1;
	}

	@Override
	public long getItemID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getWorkerID() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
