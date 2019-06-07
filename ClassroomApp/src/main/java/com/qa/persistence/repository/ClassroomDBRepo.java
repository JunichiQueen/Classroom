package com.qa.persistence.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

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
		return util.getJSONForObject(query);
	}
	
	

}