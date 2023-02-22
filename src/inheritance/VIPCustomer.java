package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	//	System.out.println("VIPCusomer() ������ ȣ��");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	//	System.out.println("VIPCusomer(int, String) ������ ȣ��");
	}
	
	@Override
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원아이디는  " + agentID + "입니다.";  
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	
}