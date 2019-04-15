package MidTerm_Interface;

public class Brownie implements BakedGoods{
	
	int Price;
	String Description;
	String sellByDate;

	public Brownie(int Price, String Description, String sellByDate) {
		this.Price = Price;
		this.Description = Description;
		this.sellByDate = sellByDate;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		System.out.println("\n-Price of the Brownie");
		return Price;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		System.out.println("\n-Description of Brownie");
		return Description;
	}
	@Override
	public String getSellByDate() {
		// TODO Auto-generated method stub
		System.out.println("\n-Sell-By Date of Brownie");
		return sellByDate;
	}

}
