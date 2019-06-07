package com.qa.persistence.domain;

import java.awt.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String trainer;
	
	//@OneToMany( targetEntity=Trainee.class )
	//private List traineeList;
	
	public Classroom(int id, String trainer) {
		this.id = id;
		this.trainer = trainer;
	}
	
	public Classroom() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	//public List getTraineeList() {
	//	return traineeList;
	//}

	//public void setTraineeList(List traineeList) {
	//	this.traineeList = traineeList;
	//}
	
	/*@Override
	public String toString() {
		return "id=" + id + ", trainer=" + trainer;
	}*/

}
