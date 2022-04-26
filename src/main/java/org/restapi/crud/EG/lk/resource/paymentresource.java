package org.restapi.crud.EG.lk.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import org.restapi.crud.EG.lk.model.paymentmodel;
import org.restapi.crud.EG.lk.service.paymentservice;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/PaymentService")
public class paymentresource {
paymentservice service = new paymentservice();

	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public paymentmodel addUser(paymentmodel user){
		return service.insertUser(user);
		
	}
	
	@Path("/retrieve")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<paymentmodel> getUser() throws SQLException{
		return service.getUser();
		
	}
	
	@Path("/retrieveById/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<paymentmodel> getUser(@PathParam("id") int id) throws SQLException{
		return service.getUserById(id);
		
	}
	
	@Path("/updateUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public paymentmodel updateUser(paymentmodel user){
		return service.updateUser(user);
		
	}
	
	@Path("/deleteUserById/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int deleteUser(@PathParam("id") int id){
		return service.deleteUser(id);
		
	}

}
