package model.dol;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Group implements IBuildRow {
	private Grade grade;
	private Section section;
	private ArrayList<Student> students;
	
	private String name;
	
	private int numStudents;
	
	private String[] subjects;
	
	private int numSubjects;
	
	private String guideTeacher;
	

	public Group(Grade grade, Section section, ArrayList<Student> students, String name, String teacher) {
		super();
		this.grade = grade;
		this.section = section;
		this.students = students;
		this.name = name;
		this.guideTeacher = teacher;
		
		subjects = new String[6];
		numSubjects = 0;
		 numStudents = 0;

	}

	public Group() {
		super();
		subjects = new String[6];
		numSubjects = 0;
		 numStudents = 0;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public int getNumSubjects() {
		return numSubjects;
	}

	public void setNumSubjects(int numSubjects) {
		this.numSubjects = numSubjects;
	}
	
	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public String getGuideTeacher() {
		return guideTeacher;
	}

	public void setGuideTeacher(String guideTeacher) {
		this.guideTeacher = guideTeacher;
	}

	public void addSubject(String subject) {
		if(this.numSubjects <= 5) {
			subjects[this.numSubjects] = subject;
			this.numSubjects++;
		}else{
			JOptionPane.showMessageDialog(null, "El grupo no puedo admitir mas materias.", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	
	public void addStudent(Student est) {
		students.add(est);
		this.numStudents++;
	}
	
	
	
	@Override
	public Object[] buildRow() {
		Object[] row = new Object[4];
		row[0] = this.getGrade().getGrade();
		row[1] = this.getSection().getSection();
		row[2] = this.getGuideTeacher();
		row[3] = String.valueOf(this.getNumStudents());
				
		
		return row;
	}

	
	

}
