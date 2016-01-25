package pt.americolib_soap;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {
	
	//MAIN
	public static void main(String[] args) {
		
		//PARAM (USA/PT IP ADDRESS):
		//74.125.239.142
		
		//SEI: Service Endpoint Interface
		if (args.length != 1) {
			System.out.println("You need to pass an IP ADDRESS!!");
		} else {
			//PARAM
			String ipAddress = args[0];
			//SERVICE
			GeoIPService ipService = new GeoIPService();
			//SOAP
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			//PORT
			GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
			
			//PRINTS
			System.out.println("IP ADDRESS = " + geoIp.getIP());
			System.out.println("COUNTRY NAME = " + geoIp.getCountryName());
			System.out.println("COUNTRY NAME = " + geoIp.getCountryCode());

			//END
			System.out.println("ENDED WITH SUCCESS!");
		}
	}
}
