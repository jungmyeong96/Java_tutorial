package classObjects;

//class는 대부분 대문자로 시작
//하나의 java파일에 하나의 클래스를 두는 것이 원칙이나, 여러개의 클래스가 같이 있는 경우 public클래스는 단 하나이며,
//public 클래스와 자바 파일의 이름은 동일해야함.
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
/*	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfor();
	}*/
}

