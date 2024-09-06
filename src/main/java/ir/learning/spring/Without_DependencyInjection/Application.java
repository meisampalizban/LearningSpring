package ir.learning.spring.Without_DependencyInjection;

public class Application {

	public static void main(String[] args) {
	Student st=new Student();
	
	
	Address studentAddress=new Address();
	studentAddress.setCountry("Iran");
	studentAddress.setCity("Tehran");
	studentAddress.setStreet("Shahran");
	studentAddress.setZipCode(1478854691);
	
	Address educationAddress=new Address();
	educationAddress.setCountry("Iran");
	educationAddress.setCity("Tehran");
	educationAddress.setStreet("ImamHosien.sq");
	educationAddress.setZipCode(1593469798);
	
	Education education =new Education();
	education.setUniName("Shamsipoor");
	education.setEvidence("master");
	education.setGrade((byte)16);
	education.setUniversityAddress(educationAddress);
	
	
	st.setUserName("meisam palizban");
	st.setAge(24);
	st.setPhoneNumber(+989381223106L);
	st.setAddress(studentAddress);
	st.setEducation(education);
	
	
	System.out.println(st.toString());

	}

}
