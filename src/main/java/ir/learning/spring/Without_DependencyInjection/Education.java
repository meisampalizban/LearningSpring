package ir.learning.spring.Without_DependencyInjection;


public class Education {
	
private String uniName;
private String evidence;
private byte grade;
private Address universityAddress;


public String getUniName() {
	return uniName;
}
public String getEvidence() {
	return evidence;
}
public byte getGrade() {
	return grade;
}
public Address getUniversityAddress() {
	return universityAddress;
}
public void setUniName(String uniName) {
	this.uniName = uniName;
}
public void setEvidence(String evidence) {
	this.evidence = evidence;
}
public void setGrade(byte grade) {
	this.grade = grade;
}
public void setUniversityAddress(Address universityAddress) {
	this.universityAddress = universityAddress;
}

public String toString(){
		return "(" + this.uniName + "," + this.evidence + "," + this.grade + "," + this.universityAddress + ")";
	}
}
