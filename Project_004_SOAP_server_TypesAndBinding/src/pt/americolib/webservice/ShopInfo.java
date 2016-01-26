package pt.americolib.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class ShopInfo {
	
	/** FUNCTION: return information about the shop */
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String property) {
		String response = "Invalid property";
		if ("ShopName".equals(property)) {
			response = "Test Mart";
		}
		else if ("Since".equals(property)) {
			response = "since 2012";
		}
		return response;
	}

}
