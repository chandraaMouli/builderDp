package builderPatternPackage;

public class BuilderPatternClient {
	
	public static void main(String[] args) throws InvalidArgumentException {
		
		
		//v1
		/*
		 * Helper help=new Helper(); help.setId(2024); help.setName("raju");
		 * help.setAge(0); help.setGender(Gender.MALE);
		 * help.setPhoneNumber("1234567890"); help.setPsp(98.1);
		 * 
		 * Student student=new Student(help);
		 */
		
		//v2
//		Helper  help1=Student.getHelper();
//		help1.setId(2024);
//		help1.setName("rani");
//		help1.setAge(0);
//		help1.setGender(Gender.MALE);
//		help1.setPhoneNumber("1234567890");
//		help1.setPsp(98.1);
		
	
//		Student student2=help1.build();
		
		//Student student3=new Student(help1);
		
		//v3
		Student student =Student.getHelper().setAge(22)
											.setId(2)
											.setName("chandra")
											.setGender(Gender.MALE)
											.setPsp(23.09)
											.setPhoneNumber("1234567890")
											.build();
	System.out.println(student.getPhoneNumber());
		
	}
	
}
