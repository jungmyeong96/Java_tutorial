package staticex;

public class Student {

	public static int serialNum = 1000;
	
	int studentID;
	String studentName;
	
	int grade;
	
	String address;
	
	public Student(){
	
	serialNum++;
	
	studentID = serialNum;
	
	}
	
	public static int getSerialNum() { //static 붙여야함 
		int i = 10; // 지역변수 가능 
		i ++;
		System.out.println(i);
		//studentName = "홍길동"; //인스턴스 변수는 데이터의 생성 순서가 다름 
		return serialNum; //class static 변수 
	}
}