package singleton;

public class CarCompany {

	private static CarCompany instance = new CarCompany(); // static을 이용해 단일 인스턴스 즉, 싱글톤 구현 
	
	private CarCompany() {}
	
	public static CarCompany getInstance() {
		if (instance == null)
			instance = new CarCompany();
		return instance;
	}

}
