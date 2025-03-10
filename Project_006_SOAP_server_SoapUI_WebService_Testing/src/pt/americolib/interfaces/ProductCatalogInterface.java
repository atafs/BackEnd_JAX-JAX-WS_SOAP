package pt.americolib.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pt.americolib.model.Product;

@WebService(name="TestMartCatalog", targetNamespace="http://americolib.itworld.com/")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
//	@WebResult(name="Product")
	public abstract List<Product> getProducts_v2(String category);

}