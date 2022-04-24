package org.restapi.crud.EG.lk.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import org.restapi.crud.EG.lk.model.performancemodel;
import org.restapi.crud.EG.lk.service.performanceservice;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/PerformanceService")
public class performanceresource {

		performanceservice service = new performanceservice();
		
		@Path("/Performs")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public performancemodel addPerform(performancemodel perform1) {
			return service.insertPerform(perform1);
		}
		
		@Path("/Performs")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<performancemodel> getPerform() throws SQLException {
			return service.getPerform();
		}
		
		@Path("/Performs/{year}")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
	    public ArrayList<performancemodel> getPerformById(@PathParam("year") int year) throws SQLException {
			return service.getPerformById(year);
		}
	    
	    @Path("/Performs")
		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		public performancemodel updatePerform( performancemodel perform1) {
			return service.updatePerform(perform1);
		}
		
		@Path("/Performs/{year}")
		@DELETE
		@Consumes(MediaType.APPLICATION_JSON)
		public int deletePerform(@PathParam("year") int year) {
			return service.deletePerform(year);
		}
}

