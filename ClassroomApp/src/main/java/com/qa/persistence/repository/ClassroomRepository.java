package com.qa.persistence.repository;

public interface ClassroomRepository {
	
	public String getAllClassrooms();
	public String createClassroom(String classroom);
	public String deleteClassroom(int ClassroomID);
	public String updateClassroom(int ClassroomID, String trainer);

}
