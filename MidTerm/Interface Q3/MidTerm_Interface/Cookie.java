package MidTerm_Interface;

public class Cookie implements BakedGoods{

	int Price;
	String Description;
	String sellByDate;
	
	public Cookie(int Price, String Description, String sellByDate) {
		this.Price = Price;
		this.Description = Description;
		this.sellByDate = sellByDate;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		System.out.println("\n-Price of a Cookie");
		return Price;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		System.out.println("\n-Description of a Cookie");
		return Description;
		
	}
	@Override
	public String getSellByDate() {
		// TODO Auto-generated method stub
		System.out.println("\n-Sell-By Date of the Cookie");
		return sellByDate;
	}
}
