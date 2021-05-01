package kodlamaio;

public class Main {

	public static void main(String[] args) {
		User user1=new User();
		user1.setId(1);
		user1.setName("Azmi");
		user1.setLastName("Karakaya");
		user1.setEmail("kodlamaio@io.com");
		user1.setPassword("123456");
	
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setTrainingBranch("Java & REACT");
		instructor1.setEmail("engindemirog@kodlamaio.com");
		instructor1.setPassword("123456");
		
		Student student1=new Student();
		student1.setId(1);
		student1.setName("Kerem");
		student1.setLastName("Karakaya");
		student1.setStudentNumber(1260);
		student1.setEmail("kkarakaya@kodlamaio.com");
		student1.setPassword("123456");
		
		UserManager userManager=new UserManager();
		UserManager instructorManager=new InstructorManager();
		UserManager studentManager=new StudentManager();
		
		userManager.add(user1);
		instructorManager.add(instructor1);
		studentManager.add(student1);
		
		
		
		}

}
