package pt.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pt.test.business.CalculatorServiceImpl;
import pt.test.contract.CalculatorInterface;

@WebService
public class Calculator {
	//ATTRIBUTES
	CalculatorInterface calculator = new CalculatorServiceImpl();
	
	@WebMethod
	public int add(int a, int b) {
		return calculator.add(a, b);
	}
	
	@WebMethod
	public int multitply(int a, int b) {
		return calculator.multitply(a, b);
	}
}
