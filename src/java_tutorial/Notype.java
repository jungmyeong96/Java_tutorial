package java_tutorial;

public class Notype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var noType = 10; //type 추론으로 어떤 값인지 자동으로 파악가능
		var noType2 = 3.14;
		System.out.println(noType);
		System.out.println(noType2);
		
		noType2 = 4;
		System.out.println(noType2);
	}

}
