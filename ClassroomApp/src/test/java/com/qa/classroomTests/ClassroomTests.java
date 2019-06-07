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
	private Classroom class2 = new Classroom(2, "Jason Statham");
	
	
	
	@Before
	public void setup() {
		classMapRepo = new ClassroomMapRepo();
		util = new JSONUtil();
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
	
	@Test
	public void createClassroomTest() {
		String classroomToCreate = util.getJSONForObject(class1);
		System.out.println(classroomToCreate);
		assertEquals(1, classMapRepo.getAccountMap().size(), 1);
	}
	
	@Test
	public void createClassroomTest2() {
		classMapRepo.getAccountMap().put(1, class1);
		classMapRepo.getAccountMap().put(2, class2);
		String classroomToCreate = util.getJSONForObject(class2);
		System.out.println(classroomToCreate);
		assertEquals(1, classMapRepo.getAccountMap().size(), 2);
	}

}
