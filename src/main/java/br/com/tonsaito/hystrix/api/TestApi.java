package br.com.tonsaito.hystrix.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

@Component
@Provider
@Path("/api/test")
public class TestApi {

	@GET
	@Path("/ping")
	@Produces(MediaType.TEXT_PLAIN)
	public Response ping(){
		String result = "Hello World 2!";
		return Response.status(200).entity(result).build();
	}
}
