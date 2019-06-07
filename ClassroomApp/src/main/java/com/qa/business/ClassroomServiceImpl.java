package com.qa.business;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomDBRepo;

public class ClassroomServiceImpl implements ClassroomService{

	@Inject
	ClassroomDBRepo classroomDBRepo;
	
	public String getAllClassrooms() {
		return classroomDBRepo.getAllClassrooms();
	}

	public String createClassroom(String classroom) {
		return classroomDBRepo.createClassroom(classroom);
	}
	
	

}
