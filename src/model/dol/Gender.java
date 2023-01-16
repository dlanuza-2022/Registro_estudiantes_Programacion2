package model.dol;

public enum Gender {
	

	FEMALE("M"), MALE("H");
	

	private Gender(String gender) {
		
		this.gender = gender;
		
	}
	
	
	
	
	private String gender;




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}
	

	
	
	
}
