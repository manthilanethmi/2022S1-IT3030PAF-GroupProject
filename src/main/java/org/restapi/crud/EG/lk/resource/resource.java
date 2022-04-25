package org.restapi.crud.EG.lk.resource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.restapi.crud.EG.lk.model.model;
import org.restapi.crud.EG.lk.service.service;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;


@Path("/EmployeeManagement")
public class resource {
	
	service service=new service();
	
	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public model addUser(model user) {
	return service.insertUser(user);

	}
	
	@Path("/retrieve")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList<model> getUser () throws SQLException{
	return service.getUser();

	}
	
	@Path("/retrieveById{id}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList<model> getUser (@PathParam("id") int id) throws SQLException{
	return service.getUserById(id);

	}
	
	@Path("/updateUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public model updateUser(model user) {
	return service.updateUser(user);

	}
	
	@Path("/deleteUserById")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int  deleteUser(@PathParam("id")int id) {
	return service.deleteUser(id);

	}

}
