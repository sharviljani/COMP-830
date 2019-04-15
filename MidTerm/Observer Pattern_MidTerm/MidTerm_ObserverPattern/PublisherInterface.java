package MidTerm_ObserverPattern;

public interface PublisherInterface {

		void registerObserver(Worker o);
		void removeObserver(Worker o);
		void notifyObservers(Event e);
		
}
