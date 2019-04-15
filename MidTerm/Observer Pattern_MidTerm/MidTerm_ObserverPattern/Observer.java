package MidTerm_ObserverPattern;

public interface Observer {

	public long getID();
		
		public Event notify(Event e);
}
