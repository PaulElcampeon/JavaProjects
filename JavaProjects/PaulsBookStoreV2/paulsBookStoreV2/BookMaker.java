package paulsBookStoreV2;

public class BookMaker{

	private String name;
	private int year;
	private double price;
	private String discount;
	
	
	public BookMaker(String name, int year, double price) {
		
		this.name = name;
		this.year = year;
		this.price = price;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}

