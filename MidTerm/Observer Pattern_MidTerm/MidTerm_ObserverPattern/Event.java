package MidTerm_ObserverPattern;

public interface Event {
	
	public long getItemID();
	
	public long getWorkerID();
	
	public String getMessage();

	public void incrementItemId();


}
