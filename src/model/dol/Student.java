package model.dol;

import java.util.Date;

import javax.swing.JOptionPane;

import misc.CatcherUtil;

public class Student extends Person implements IBuildTable {
	
	private Date entryDate; //Fecha de entrada
	private String IDCard;  //Carnet
	private double[] notes; //Notas
	private int numNotes; //Numero de materias
	private double average;  //Promedio
	private String group;  //Grupo
	
	
	public Student() {
		super();
		numNotes = 0;
		notes = new double[6];
	}


	
	public Student(String firstName, String middleName, String surName, String secondSurname, Date birthDate, int age,
			Gender gender, String user, String password, Date entryDate, String IDCard, int numNotes, double average, String group) {
		super(firstName, middleName, surName, secondSurname, birthDate, age, gender, user, password);
		this.entryDate = entryDate;
		this.IDCard =IDCard;
		this.numNotes = numNotes;
		this.average = average;
		this.group = group;
		notes = new double[6];
		numNotes = 0;
		
	}



	public Date getEntryDate() {
		return entryDate;
	}



	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}



	public String getIDCard() {
		return IDCard;
	}



	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}



	public int getNumNotes() {
		return numNotes;
	}



	public void setNumSubjects(int numNotes) {
		this.numNotes = numNotes;
	}



	public double getAverage() {
		return average;
	}



	public void setAverage(double average) {
		this.average = average;
	}



	@Override
	public String getFirstName() {
		return super.getFirstName();
	}



	@Override
	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}



	@Override
	public String getMiddleName() {
		return super.getMiddleName();
	}



	@Override
	public void setMiddleName(String middleName) {
		super.setMiddleName(middleName);
	}



	@Override
	public String getSurName() {
		return super.getSurName();
	}



	@Override
	public void setSurName(String surName) {
		super.setSurName(surName);
	}



	@Override
	public String getSecondSurname() {
		return super.getSecondSurname();
	}



	@Override
	public void setSecondSurname(String secondSurname) {
		super.setSecondSurname(secondSurname);
	}



	@Override
	public Date getBirthDate() {
		return super.getBirthDate();
	}



	@Override
	public void setBirthDate(Date birthDate) {
		super.setBirthDate(birthDate);
	}



	@Override
	public int getAge() {
		return super.getAge();
	}



	@Override
	public void setAge(int age) {
		super.setAge(age);
	}



	@Override
	public Gender getGender() {
		return super.getGender();
	}



	@Override
	public void setGender(Gender gender) {
		super.setGender(gender);
	}


	
	@Override
	public String getUser() {
		return super.getUser();
	}



	@Override
	public void setUser(String user) {
		super.setUser(user);
	}



	@Override
	public String getPassword() {
		return super.getPassword();
	}



	@Override
	public void setPassword(String password) {
		super.setPassword(password);
	}


	public double[] getNotes() {
		return notes;
	}


	public double getNote(int index) {
		return this.notes[index];
	}
	
	

	public void setNotes(double[] notes) {
		this.notes = notes;
	}



	public String getGroup() {
		return group;
	}



	public void setGroup(String group) {
		this.group = group;
	}



	public void setNumNotes(int numNotes) {
		this.numNotes = numNotes;
	}


	public void addNote(double note) {
		if(this.numNotes <= 5) {
			this.notes[numNotes] = note;
			this.numNotes++;
		}else {
			JOptionPane.showMessageDialog(null,  "No se  pueden agregar mas notas.", "Error.", JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	
	

	@Override
	public Object[] buildRow() {
		Object[] row = new Object[12]; 
		row[0] = this.getIDCard();
	    row[1] = this.getFirstName() + " " + this.getMiddleName();
		row[2] = this.getSurName() + " " + this.getSecondSurname();
		row[3] = this.getGender().getGender();
		row[4] = String.valueOf(this.getAge());
		row[5] = CatcherUtil.cutDecimals(this.getNote(0));
		row[6] = CatcherUtil.cutDecimals(this.getNote(1));
		row[7] = CatcherUtil.cutDecimals(this.getNote(2));
		row[8] = CatcherUtil.cutDecimals(this.getNote(3));
		row[9] = CatcherUtil.cutDecimals(this.getNote(4));
		row[10] = CatcherUtil.cutDecimals(this.getNote(5));
	    row[11] = this.getAverage();
		
		return row;
	}



	@Override
	public String[] buildColummns() {
		return null;
	}





	
	
	
	
	
	
	
	

}
