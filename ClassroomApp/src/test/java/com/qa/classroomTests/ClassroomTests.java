package com.qa.classroomTests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.repository.ClassroomMapRepo;
import com.qa.persistence.repository.ClassroomRepository;
import com.qa.util.JSONUtil;


public class ClassroomTests {
	
	ClassroomMapRepo classMapRepo;
	JSONUtil util;
	private Classroom class1 = new Classroom(1, "Jon Wick");
	
	
	
	@Before
	public void setup() {
		classMapRepo = new ClassroomMapRepo();
	}
	
	@After
	public void teardown() {
		this.classMapRepo=null;
	}
	
	
	@Test
	public void getAllAccountsTest1() {
		
		System.out.println(classMapRepo.getAllClassrooms());
		assertEquals("{}", classMapRepo.getAllClassrooms());
	}
	
	@Test
	public void getAllAccountsTest2() {
		classMapRepo.getAccountMap().put(1, class1);
		System.out.println(classMapRepo.getAllClassrooms());
		assertEquals("{\"1\":{\"id\":1,\"trainer\":\"Jon Wick\"}}", classMapRepo.getAllClassrooms());
	}

}
