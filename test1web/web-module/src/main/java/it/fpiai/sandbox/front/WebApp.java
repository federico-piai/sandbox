package it.fpiai.sandbox.front;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class WebApp {

	@GET
	@Path("/main")
	@Produces("text/plain")
	public String mainEvent(){
		return "Ciao";
	}
	
}
