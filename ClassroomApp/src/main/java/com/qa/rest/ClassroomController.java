package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.business.ClassroomService;

@Path("/classroom")
public class ClassroomController {
	
	@Inject
	ClassroomService classroomService;
	
	@Path("/getAllClassrooms")
	@GET
	@Produces( "application/json" )
	public String getAllClassrooms() {
		return classroomService.getAllClassrooms();

}
	
}

