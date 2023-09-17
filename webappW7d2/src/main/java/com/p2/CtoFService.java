package com.p2;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {
	
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
		Double far;
		Double celsius=36.8;
		far=((celsius*9)/5)+32;
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n"+far;
	     return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" +
	                "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	    	}
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c")Double c) {
		Double far;
		Double celsius=c;
		far=((celsius*9)/5)+32;
		String result = "@Produces(\"application/xml\")Output: \n\nC to F Converter Output: \n\n" + far;
  return "<ctofservice>" + "<celsius>" + celsius + "</celsius>"+ "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
 }
	
		

}
