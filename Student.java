package builderPatternPackage;

public class Student {
	private int id;
	private String name;
	private int age;
	private String UniversityName;
	private Gender gender;
	private String PhoneNumber;
	private double psp;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public double getPsp() {
		return psp;
	}

	public void setPsp(double psp) {
		this.psp = psp;
	}

	private Student(Helper helper) {
		this.id=helper.getId();
		this.name=helper.getName();
		this.age=helper.getAge();
		this.UniversityName=helper.getUniversityName();
		this.gender=helper.getGender();
		this.PhoneNumber=helper.getPhoneNumber();
		this.psp=helper.getPsp();
		
	}



	public static Helper getHelper() {
		// TODO Auto-generated method stub
		return new Helper();
	}
	
	 static class Helper {
		private int id;
		private String name;
		private int age;
		private String UniversityName;
		private Gender gender;
		private String PhoneNumber;
		private double psp;
		
		




		public int getId() {
			return id;
		}


		public Helper setId(int id) {
			this.id = id;
			return this;
		}

		
		public String getName() {
			return name;
		}


		public Helper setName(String name) {
			this.name = name;
			return this;
		}


		public int getAge() {
			return age;
		}


		public Helper setAge(int age) {
			this.age = age;
			return this;
		}


		public String getUniversityName() {
			return UniversityName;
		}


		public void setUniversityName(String universityName) {
			UniversityName = universityName;
		}


		public Gender getGender() {
			return gender;
		}

		public Helper setGender(Gender gender) {
			this.gender = gender;
			return this;
		}
		

		public String getPhoneNumber() {
			return PhoneNumber;
		}

		public Helper setPhoneNumber(String PhoneNumber) {
			this.PhoneNumber = PhoneNumber;
			return this;
		}

		public double getPsp() {
			return psp;
		}

		public Helper setPsp(double psp) {
			this.psp = psp;
			return this;
		}
		public  boolean Validate(){
			if(this.PhoneNumber.length()!=10) {
			return false;
			}
			return true;
		}

		public  Student build() throws InvalidArgumentException {
			
			if(!Validate()){
				throw new InvalidArgumentException();
			}
			
			return new Student(this);
		}
	}

}
