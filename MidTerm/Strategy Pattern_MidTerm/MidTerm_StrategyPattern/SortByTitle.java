package MidTerm_StrategyPattern;

import java.util.ArrayList;
import java.util.Collections;

public class SortByTitle implements BookLibrarian {
	@Override
	public void setSortMethod(ArrayList bookObjects)
	{
		Collections.sort(bookObjects, BookLibrarian.compareTitle);
		for(int i=0; i<bookObjects.size(); i++)
		{
			System.out.printf("Object : %s\tTitle : %s\tAuthor : %s\tYearPublished : %d\tSummary : %s\n",bookObjects.get(i), ((BookInformation) bookObjects.get(i)).getBookTitle(), ((BookInformation) bookObjects.get(i)).getBookAuthor(), ((BookInformation) bookObjects.get(i)).getBookYearPublished(), ((BookInformation) bookObjects.get(i)).getBookSummary());
		}
	}

}
