package MidTerm_Interface;


import java.util.ArrayList;
import java.util.List;

public class MidTerm_Run {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BakedGoods> List = new ArrayList <BakedGoods>();
		
		List.add(new Cookie(1, "Chocolate Chip Cookie.", "May 10 2019"));
		List.add(new CinnamonRoll(2, "Taste filled with Cinnamon twist.", "April 30 2019"));
		List.add(new Brownie(3, "Choco lava Cake Brownie", "April 21 2019"));
		
		for (BakedGoods x : List) {
			System.out.println("\tPrice--> $" + x.getPrice());
			System.out.println("\tDescription--> " + x.getDescription());
			System.out.println("\tSell-by Date--> " + x.getSellByDate() + "\n");
		}
	}
}

