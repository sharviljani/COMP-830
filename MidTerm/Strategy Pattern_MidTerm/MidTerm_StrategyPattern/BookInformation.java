package MidTerm_StrategyPattern;

import java.util.Comparator;

public class BookInformation {
	public static Comparator compareAuthor;
	private String author;
	private String title;
	int yearPublished;
	private String summary;
		
	
	public BookInformation(String title , String author, int publishDate, String summary)
	{
		super();
		this.author = author;
		this.title = title;
		this.yearPublished = publishDate;
		this.summary = summary;
	}
	
	public String getBookTitle() {
		return title;
	}

	public void setBookTitle(String Title) {
		this.title = title;
	}
	public String getBookAuthor() {
		return author;
	}

	public void setBookAuthor(String BookAuthor) {
		this.author = author;
	}
	
	public int getBookYearPublished() {
		return yearPublished;
	}

	public void setBookYearPublished(int YearPublished) {
		this.yearPublished =  yearPublished;
	}

	public String getBookSummary() {
		return summary;
	}

	public void setBookSummary(String Summary) {
		this.summary = summary;
	}



}
