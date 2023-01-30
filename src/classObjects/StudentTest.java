package classObjects; //패키지란?

//패키지는 소스내의 묶음
//소스코드를 성격별로 계층구조 형태로 정렬

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		studentLee.showStudentInfor();
		}
}
