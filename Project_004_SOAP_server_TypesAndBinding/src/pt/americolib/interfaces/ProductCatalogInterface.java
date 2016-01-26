package pt.americolib.interfaces;

import java.util.List;

import pt.americolib.model.Product;

public interface ProductCatalogInterface {

	public abstract List<String> getProductCategories();

	public abstract List<String> getProducts(String category);

	public abstract boolean addProduct(String category, String product);

	public abstract List<Product> getProducts_v2(String category);

}