package java_20191210.dto;

public class SalDto {
	private int grade;
	private int loSal;
	private int hiSal;
	
	public SalDto(){
		super();
	}
	
	public SalDto(int grade, int loSal, int hiSal){
		super();
		this.grade = grade;
		this.loSal = loSal;
		this.hiSal = hiSal;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getLoSal() {
		return loSal;
	}

	public void setLoSal(int loSal) {
		this.loSal = loSal;
	}

	public int getHiSal() {
		return hiSal;
	}

	public void setHiSal(int hiSal) {
		this.hiSal = hiSal;
	}
	
	
	
	
}
