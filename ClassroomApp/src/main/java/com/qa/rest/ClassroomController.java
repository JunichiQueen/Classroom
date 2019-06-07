package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	@Path("/createClassroom/{classroom}")
	@GET
	@Produces( "application/json" )
	public String createClassroom(@PathParam("classroom") String classroom) {
		return classroomService.createClassroom(classroom);
	}
	
	@Path("/deleteClassroom/{id}")
	@GET
	@Produces( "application/json" )
	public String deleteClassroom(@PathParam("id") int id) {
		return classroomService.deleteClassroom(id);
	}
	
}
