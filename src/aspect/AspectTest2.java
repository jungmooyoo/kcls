package aspect;


public class AspectTest2 {
	
	private void publicTarget() { 
		if ("test".equals("test")) {
		    System.out.println("publicTarget Start!!");
		}else {
			System.out.println("publicTarget End!!"); 
		}
	}
	
	

}
