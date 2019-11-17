package com.T8073.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the pet database table.
 * 
 */
public class Pet implements Serializable {

	private int petId;

	private Date birthday;

	private String desc;

	private String petBreed;

	private String petName;

	private String petSex;

	public Pet() {
	}

	public int getPetId() {
		return this.petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPetBreed() {
		return this.petBreed;
	}

	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	public String getPetName() {
		return this.petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetSex() {
		return this.petSex;
	}

	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}

}