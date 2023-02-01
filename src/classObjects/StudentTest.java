package classObjects; //패키지란?

//패키지는 소스내의 묶음
//소스코드를 성격별로 계층구조 형태로 정렬

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //인스턴스 생성 Student: 참조형 데이터타입
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 서초구 서초동";

		
		Student studentKim = new Student(); // studentKim은 스택 new Student 인스턴스는 힙메모리에 생성 (가비지콜렉터에서 없애줌)
		studentKim.studentName = "김유";
		studentKim.studentID = 100;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		}
}
