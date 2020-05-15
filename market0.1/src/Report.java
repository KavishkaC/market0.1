import java.io.File; 
import java.io.IOException; 
import java.io.FileWriter;

public class Report {
	
	protected String res;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String generateProductReport(String path) {
		
	    try {
	        File myObj = new File(path+"/"+"ProductReport.txt");
	        if (myObj.createNewFile()) {
	        	FileWriter myWriter = new FileWriter(path+"/"+"ProductReport.txt");
	            myWriter.write("Product Report\n");
	            myWriter.write("==============\n");
	            //parse products sql query here 
	            myWriter.close();	
	            res =("File created: " + path+myObj.getName());
	        } else {
	        	res = "File already exists.";
	        }
	      } catch (IOException e) {
	    	  res = "An error occurred.";
	        e.printStackTrace();
	      }
	    return res;
	    
	    
		
	}
	
public String generateEmployeeReport(String path) {
		
	    try {
	        File myObj = new File(path+"/"+"EmployeeReport.txt");
	       
	        if (myObj.createNewFile()) {
	        	FileWriter myWriter = new FileWriter(path+"/"+"EmployeeReport.txt");
	            myWriter.write("Employee Report\n");
	            myWriter.write("==============\n");
	            //parse products sql query here 
	            myWriter.close();	
	           res =("File created: " +path+myObj.getName());
	        } else {
	          res = "File already exists.";
	        }
	      } catch (IOException e) {
	    	   res = "An error occurred.";
	        e.printStackTrace();
	      }
	    
	    return res;
		
	}
	
	
	
	
	
	
	
	
	
	

}
