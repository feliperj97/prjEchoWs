package control;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Echo {
	@WebMethod
	public String Echo(String frase) {
		return "Echo: " + frase;
	}
}
