package pt.americolib;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pt.americolib.business.ProductServiceImpl;

@WebService(
		//definitions tag in wsdl xml
		name="TestMartCatalog", 
		portName="TestMartCatalogPort", 
		serviceName="ProductCatalogService", 
		targetNamespace="http://americolib.itworld.com/"
		)
public class ProductCatalog {
	
	//ATTRIBUTES
	ProductServiceImpl productService = new ProductServiceImpl();
	
	//METHOD (public = default @WebMethod)
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	//EXCLUDE WEB SERVICE METHOD: exclude=true
//	@WebMethod(exclude=true)
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
//	@WebMethod(exclude=true)
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

}
