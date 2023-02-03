package staticex;

public class StudentTest1 {
	
	public static void main(String[] args) {
		Student studentJames = new Student();
		System.out.println(Student.serialNum); 
		System.out.println(Student.getSerialNum()); // static 변수  getter도 가능 
		Student studentTomas = new Student();
		System.out.println(Student.serialNum);
		System.out.println(studentJames.studentID);
		System.out.println(Student.serialNum);
		System.out.println(studentTomas.studentID);
	}
}
