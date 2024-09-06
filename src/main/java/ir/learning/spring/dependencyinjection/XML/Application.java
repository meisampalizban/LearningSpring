package ir.learning.spring.dependencyinjection.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection_by_XML.xml");
		
		Student st = context.getBean(Student.class);
		
		
		Address studentAddress = context.getBean(Address.class);
		studentAddress.setCountry("Iran");
		studentAddress.setCity("Tehran");
		studentAddress.setStreet("Shahran");
		studentAddress.setZipCode(1478854691);
		
		Address educationAddress = context.getBean(Address.class);
		educationAddress.setCountry("Iran");
		educationAddress.setCity("Tehran");
		educationAddress.setStreet("ImamHosien.sq");
		educationAddress.setZipCode(1593469798);
		
		Education education = context.getBean(Education.class);
		education.setUniName("Shamsipoor");
		education.setEvidence("master");
		education.setGrade((byte) 16);
		education.setUniversityAddress(educationAddress);
		
		
		st.setUserName("meisam palizban");
		st.setAge(24);
		st.setPhoneNumber(+989381223106L);
		st.setAddress(studentAddress);
		st.setEducation(education);
		
		
		System.out.println(st.toString());
		
	}
	
}
