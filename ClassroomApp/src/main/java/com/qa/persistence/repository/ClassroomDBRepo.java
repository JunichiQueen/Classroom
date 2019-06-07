package com.qa.persistence.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

@Default
@Transactional(TxType.SUPPORTS)
public class ClassroomDBRepo implements ClassroomRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	JSONUtil util;
	
	public String getAllClassrooms() {
		Query query = em.createQuery("SELECT a FROM Classroom a");
		return util.getJSONForObject(query.getResultList());
	}
	
	@Transactional(TxType.REQUIRED)
	public String createClassroom(String classroom) {
		Classroom newClass = util.getObjectForJSON(classroom, Classroom.class);
		em.persist(newClass);
		return "You have successfully created an account";
	}
	
	public Classroom findAccount(int id) {
		  return em.find(Classroom.class, id);
		}

	@Override
	public String deleteClassroom(int ClassroomID) {
		em.remove(em.find(Classroom.class, ClassroomID));
		return null;
	}
	
	

}
