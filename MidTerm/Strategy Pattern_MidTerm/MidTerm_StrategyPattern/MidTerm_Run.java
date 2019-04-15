package MidTerm_StrategyPattern;

import java.util.ArrayList;

public class MidTerm_Run {
	
	public static void main(String[] args)
	{
		BookInformation object1 = new BookInformation("The Pilgrim’s Progress", "John Bunyan", 1678, "A story of a man in search of truth told with the simple clarity and beauty of Bunyan’s prose make this the ultimate English classic.");
		BookInformation object2 = new BookInformation("Robinson Crusoe",  "Daniel Defoe",  1719, "By the end of the 19th century, no book in English literary history had enjoyed more editions, spin-offs and translations. Crusoe’s world-famous novel is a complex literary confection, and it’s irresistible.");
		BookInformation object3 = new BookInformation("Middlemarch", "George Eliot",1871-2, "This cathedral of words stands today as perhaps the greatest of the great Victorian fictions.");
		BookInformation object4 = new BookInformation("Gulliver’s Travels", "Jonathan Swift", 1726, "A satirical masterpiece that’s never been out of print, Jonathan Swift’s Gulliver’s Travels comes third in our list of the best novels written in English");		
		BookInformation object5 = new BookInformation("Clarissa", "Samuel Richardson", 1748, "Clarissa is a tragic heroine, pressured by her unscrupulous nouveau-riche family to marry a wealthy man she detests, in the book that Samuel Johnson described as “the first book in the world for the knowledge it displays of the human heart.”");	
		BookInformation object6 = new BookInformation("Tom Jones", "Henry Fielding", 1749, "Tom Jones is a classic English novel that captures the spirit of its age and whose famous characters have come to represent Augustan society in all its loquacious, turbulent, comic variety.");
		BookInformation object7 = new BookInformation("The Life and Opinions of Tristram Shandy, Gentleman", "Laurence Sterne", 1759, "Laurence Sterne’s vivid novel caused delight and consternation when it first appeared and has lost little of its original bite.");
		BookInformation object8 = new BookInformation("Emma", "Jane Austen", 1816, "Jane Austen’s Emma is her masterpiece, mixing the sparkle of her early books with a deep sensibility.");
		BookInformation object9 = new BookInformation("Frankenstein", "Mary Shelley", 1818, "Mary Shelley’s first novel has been hailed as a masterpiece of horror and the macabre.");
		BookInformation object10 = new BookInformation("Nightmare Abbey", "Thomas Love Peacock", 1818, "The great pleasure of Nightmare Abbey, which was inspired by Thomas Love Peacock’s friendship with Shelley, lies in the delight the author takes in poking fun at the romantic movement.");
		BookInformation object11 = new BookInformation("The Narrative of Arthur Gordon Pym of Nantucket", "Edgar Allan Poe", 1838, "Edgar Allan Poe’s only novel – a classic adventure story with supernatural elements – has fascinated and influenced generations of writers.");
		BookInformation object12 = new BookInformation("Sybil", "Benjamin Disraeli", 1845, "The future prime minister displayed flashes of brilliance that equalled the greatest Victorian novelists.");
		BookInformation object13 = new BookInformation("Jane Eyre", "Charlotte Brontë", 1847, "Charlotte Brontë’s erotic, gothic masterpiece became the sensation of Victorian England. Its great breakthrough was its intimate dialogue with the reader.");
		BookInformation object14 = new BookInformation("Wuthering Heights", "Emily Brontë", 1847, "Emily Brontë’s windswept masterpiece is notable not just for its wild beauty but for its daring reinvention of the novel form itself.");
		BookInformation object15 = new BookInformation("Vanity Fair", "William Thackeray", 1848, "William Thackeray’s masterpiece, set in Regency England, is a bravura performance by a writer at the top of his game");
		BookInformation object16 = new BookInformation("David Copperfield", "Charles Dickens", 1850, "David Copperfield marked the point at which Dickens became the great entertainer and also laid the foundations for his later, darker masterpieces.");
		BookInformation object17 = new BookInformation("The Scarlet Letter", "Nathaniel Hawthorne", 1850,"Nathaniel Hawthorne’s astounding book is full of intense symbolism and as haunting as anything by Edgar Allan Poe.");
		BookInformation object18 = new BookInformation("Moby-Dick", "Herman Melville", 1851, "Wise, funny and gripping, Melville’s epic work continues to cast a long shadow over American literature." );
		BookInformation object19 = new BookInformation("Alice’s Adventures in Wonderland", "Lewis Carroll", 1865, "Lewis Carroll’s brilliant nonsense tale is one of the most influential and best loved in the English canon." );
		BookInformation object20 = new BookInformation("The Moonstone", "Wilkie Collins", 1868, "Wilkie Collins’s masterpiece, hailed by many as the greatest English detective novel, is a brilliant marriage of the sensational and the realistic.");
		
		
		ArrayList<BookInformation> Objects = new ArrayList<BookInformation>();
		Objects.add(object1);
		Objects.add(object2);
		Objects.add(object3);
		Objects.add(object4);
		Objects.add(object5);
		Objects.add(object6);
		Objects.add(object7);
		Objects.add(object8);
		Objects.add(object9);
		Objects.add(object10);
		Objects.add(object11);
		Objects.add(object12);
		Objects.add(object13);
		Objects.add(object14);
		Objects.add(object15);
		Objects.add(object16);
		Objects.add(object17);
		Objects.add(object18);
		Objects.add(object19);
		Objects.add(object20);
		
		System.out.println("Sort the BookInformation list in Alphabetical order By Author \n");
		
		BookLibrarian sortAuthor = new SortByAuthor();
		
		sortAuthor.setSortMethod(Objects);
		
		System.out.println("\nSort the BookInformation list in Alphabetical order By Title \n");
		
		BookLibrarian sortTitle = new SortByTitle();
		
		sortTitle.setSortMethod(Objects);
		
		System.out.println("\nSort the BookInformation list in Chronological order By Published Year \n");
		
		BookLibrarian sortPublishYear = new SortByPublishYear();
		
		sortPublishYear.setSortMethod(Objects);
		
		
	}

}
