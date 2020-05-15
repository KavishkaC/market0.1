
public class Payment {
	private String status;
	
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	
	
	public String addPayment(double total,double cash, double balance) {
	try {	
	//sql query add payment pass this 3
		status="updated Successully";
	}catch(Exception e) {
		status="Somthing went wrong";
		
	}
		
	return status;
	}
	
	public String showPayment() {
		try {	
			//sql query show payments
				
			}catch(Exception e) {
				status="Somthing went wrong";
				
			}
		return status;
		
	}
}
