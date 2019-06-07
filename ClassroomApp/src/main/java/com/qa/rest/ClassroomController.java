package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	@POST
	@Produces( "application/json" )
	public String createClassroom(@PathParam("classroom") String classroom) {
		return classroomService.createClassroom(classroom);
	}
	
	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces( "application/json" )
	public String deleteClassroom(@PathParam("id") int id) {
		return classroomService.deleteClassroom(id);
	}
	
	@Path("/updateClassroom/{id}{trainer}")
	@PUT
	@Produces( "application/json" )
	public String updateClassroom(@PathParam("id, trainer") int id, String trainer) {
		return classroomService.updateClassroom(id, trainer);
	}
	
}

