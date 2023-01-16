package model.dol;

import java.util.Date;

public abstract class Person {
		
	private String firstName;
	private String middleName;
	private String surName;
	private String secondSurname;
	
	private Date birthDate;
	
	private int age;
	
	private Gender gender;
	
	
	/** Informacion de acceso */
	private String user;
	private String password;
	
	

	public Person() {
		super();
	}


	

	public Person(String firstName, String middleName, String surName, String secondSurname, Date birthDate, int age,
			Gender gender, String user, String password) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
		this.secondSurname = secondSurname;
		this.birthDate = birthDate;
		this.age = age;
		this.gender = gender;
		this.user = user;
		this.password = password;
	}






	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}




	public String getUser() {
		return user;
	}




	public void setUser(String user) {
		this.user = user;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	

}
