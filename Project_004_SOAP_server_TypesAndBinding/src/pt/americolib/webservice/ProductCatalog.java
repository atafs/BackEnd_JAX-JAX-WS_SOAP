package pt.americolib.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pt.americolib.business.ProductServiceImpl;
import pt.americolib.model.Product;

@WebService(portName="TestMartCatalogPort", serviceName="ProductCatalogService", name="TestMartCatalog")
public class ProductCatalog {
	
	//ATTRIBUTES
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	@WebMethod
	public List<Product> getProducts_v2(String category) {
		return productService.getProducts_v2(category);
	}
}
