package org.restapi.crud.EG.lk.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import org.restapi.crud.EG.lk.model.customermodel;
import org.restapi.crud.EG.lk.service.customerservice;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/CustomerService")
public class customerresource {
	
	customerservice service = new customerservice();
	
	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public customermodel addUser(customermodel user) {
		return service.insertUser(user);
	}
	
	@Path("/retrieve")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public ArrayList<customermodel> getUser() throws SQLException {
		return service.getUser();
	}
    
    @Path("/retrieveById/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public ArrayList<customermodel> getUser(@PathParam("id") int id) throws SQLException {
		return service.getUserById(id);
	}
    
	@Path("/updateUser")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public customermodel updateUser( customermodel user) {
		return service.updateUser(user);
	}
	
	@Path("/deleteById/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int deleteUser(@PathParam("id") int id) {
		return service.deleteUser(id);
	}
}