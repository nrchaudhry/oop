
public class Honda4 implements Bike {

	static void m() {  
	    int data=50/0;
	   
	    System.out.println("I am in m()!");
	  }  
	  static void n(){  
	    m();  
	  }  
	  
	  static void p() {
		  int a = 50/0;
	  }  
	  
	  public static void main(String[] args) {
		
		  try {
			p();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Other actions
		System.out.println("rest of the code...");  
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changegear() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
