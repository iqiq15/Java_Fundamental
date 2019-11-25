package java_20191125;

public class Member {
	
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String ssn;
	private int age;
	private double height;
	private String password;
	private String email;
	
	//this 1.자기자신 객체 this. 2.다른 생성자 호출 this(); , 생성자에서만 호출 가능
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	//name에 대한 setter 메서드
	public void setName(String name){
		this.name = name;
	}
	
	//name에 대한 getter 메서드
	public String getName(){
		return name;
	}
	
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	
	public String getZipcode(){
		return zipcode;
	}
	
	public void setAddress1(String address1){
		this.address1 = address1;
	}
	
	public String getAddress1(){
		return address1;
	}
	
	public void setAddress2(String address2){
		this.address2 = address2;
	}
	
	public String getAddress2(){
		return address2;
	}
	
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	
	public String getSsn(){
		return ssn;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public Double getHeight(){
		return height;
	}
	*/
	
}
