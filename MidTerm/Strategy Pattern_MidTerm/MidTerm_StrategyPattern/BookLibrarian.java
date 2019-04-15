package MidTerm_StrategyPattern;

import java.util.ArrayList;
import java.util.Comparator;

public interface BookLibrarian {
	
	public void setSortMethod(ArrayList bookObjects);

	
	public static Comparator<BookInformation> compareAuthor = new Comparator<BookInformation>() {

		@Override
		public int compare(BookInformation y1, BookInformation y2) {
			String x1 = y1.getBookAuthor();
			String x2 = y2.getBookAuthor();
			
			return x1.compareTo(x2);
		}
	};
	
	public static Comparator<BookInformation> compareTitle = new Comparator<BookInformation>() {

		@Override
		public int compare(BookInformation y1, BookInformation y2) {
			String x1 = y1.getBookTitle();
			String x2 = y2.getBookTitle();
			
			return x1.compareTo(x2);
		}
	};
	
	public static Comparator<BookInformation> compareYearPublished = new Comparator<BookInformation>() {

		@Override
		public int compare(BookInformation y1, BookInformation y2) {
			return y1.yearPublished - y2.yearPublished;
		}
	};
	

}
