package pt.americolib.model;

//DAO
public class Product {
	
	//ATTRIBUTES
	private String name;
	private String sku;
	private double price;
	
	//CONSTRUCTOR
	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
