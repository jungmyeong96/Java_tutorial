package cooperation;

public class Student {
	private String studentName;
	private int grade;
	private int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //객체의 협
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) { //객체의 협
		subway.take(1000);
		money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 "+ money + "입니다");
	}

}
