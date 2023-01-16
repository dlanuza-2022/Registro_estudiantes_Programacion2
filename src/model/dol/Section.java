package model.dol;

public enum Section {

	A("A"), B("B"), C("C"), D("D"); 
	

	private Section(String section) {
		
		this.section = section;
		
	}
	
	
	private String section;


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}
	

	
	

}
