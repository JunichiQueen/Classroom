package com.qa.business;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomDBRepo;

public interface ClassroomService {
	public String getAllClassrooms();
	public String createClassroom(String classroom);
	public String deleteClassroom(int id);
	public String updateClassroom(int ClassroomID, String trainer);
}
