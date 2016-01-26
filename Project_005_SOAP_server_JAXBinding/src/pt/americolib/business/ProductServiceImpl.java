package pt.americolib.business;

import java.util.ArrayList;
import java.util.List;

import pt.americolib.model.Product;

public class ProductServiceImpl {
	
	//ATTRIBUTES
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();

	//CONSTRUCTOR
	public ProductServiceImpl() {
		//BOOKS
		bookList.add("Inferno");
		bookList.add("Joy");
		bookList.add("Casa Blanca");
		
		//MUSICS
		musicList.add("Americo");
		musicList.add("Tomas");
		musicList.add("Ana");

		//MOVIES
		movieList.add("Terminator");
		movieList.add("Rambo");
		movieList.add("Rocky");
	}
	
	/** */
	public List<String> getProductCategories() {
		//LIST
		List<String> categories = new ArrayList<String>();
		categories.add("Books"); 
		categories.add("Musics"); 
		categories.add("Movies"); 
		return categories;
	}
	
	/** FUNCTION: returns a list of data */
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "musics":
			return musicList;
		case "movies":
			return movieList;
		default:
			break;
		}
		return null;
	}
	
	/** FUNCTION: add products */
	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "musics":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return true;
		}
		return true;
	}
	
	/** */
	public List<Product> getProducts_v2(String category) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Java Americo Tomas Book", "1234", 9999.99));
		productList.add(new Product("Java Ana Batalha Book", "5678", 999999.99));

		return productList;
	}
}
