package ArrayListAndList;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 94);
		studentKim.addSubject("수학", 88);
		
		studentKim.showStudentInfo();
	}

}
