package singleton;
import java.util.Calendar;

public class CarCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CarCompany c0 = CarCompany(); 싱글톤을 위해 기본 생성자막아버림 
		
		CarCompany c1 = CarCompany.getInstance();
		CarCompany c2 = CarCompany.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		Calendar cal =  Calendar.getInstance(); // 이런식으로 단일 인스턴스만 필요한 상황에서 사용됨 
		
	
	}

}
