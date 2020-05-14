
public class Employee {
	
	private int eid;
	private String name;



	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid,String name) {
		// TODO Auto-generated constructor stub
		this.eid = eid;
		this.name = name;
	
	}
	
	
	public double billItem(String id,int qty) {
		double total=0.00;
		double price;
	try {
	//price=get price
		price=12.00;
		total=price*qty;
		
		
		
	  	
	}catch(Exception e){
		System.out.println("Something wrong!please retry.");
	}
	
	return total;
}
	
	public void createPayment(int payid,double payment)
	{
		
	System.out.println("sucssess");
	}

}
