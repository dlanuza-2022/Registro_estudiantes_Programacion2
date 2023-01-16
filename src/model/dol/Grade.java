package model.dol;

public enum Grade {
	
    PRIMER("1er"), 
    SEGUNDO("2do"), 
    TERCER("3er"), 
    CUARTO("4to"), 
    QUINTO("5to"), 
    SEXTO("6to"), 
    SEPTIMO("7mo"), 
    OCTAVO("8vo"),
    NOVENO("9no"),
    DECIMO("10mo"),
    ONCEAVO("11vo");
	

	private Grade(String grade) {
		
		this.grade = grade;
		
	}
	
	
	private String grade;


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	

}
