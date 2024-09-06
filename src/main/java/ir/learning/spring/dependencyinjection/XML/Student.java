package ir.learning.spring.dependencyinjection.XML;

public class Student {
	
	private String userName;
	private int age;
	private long phoneNumber;
	
	private Address address;
	
	private Education education;
	
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public long getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	
	public Education getEducation(){
		return education;
	}
	
	public void setEducation(Education education){
		this.education = education;
	}
	
	public String toString(){
		return "[\n " + this.userName + ",\n " + this.age + ",\n " + this.phoneNumber
				+ ", \n Student Address is :" + this.address + "\n Student Education is : " + this.education + "\n]";
	}
}
