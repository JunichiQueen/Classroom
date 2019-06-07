package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

public class ClassroomMapRepo implements ClassroomRepository {
	
	Map<Integer, Classroom> accountMap = new HashMap<Integer, Classroom>();
	
	
	
	JSONUtil util;

	public String getAllClassrooms() {
		return new JSONUtil().getJSONForObject(accountMap);
	}
	

	public Map<Integer, Classroom> getAccountMap() {
		return accountMap;
	}

	public void setAccountMap(Map<Integer, Classroom> accountMap) {
		this.accountMap = accountMap;
	}


	

}
