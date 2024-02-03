package aspect;


public class AspectTest2 {
	
	private void publicTarget() { 
		if ("test".equals("test")) {
		    System.out.println("publicTarget Start!!");
		}else {
			System.out.println("publicTarget End!!"); 
		}
		
		// 사이 추가 
				System.out.println("");
		
		// 신규 추가 
		if ("test".equals("test")) {
		    System.out.println("publicTarget Start!!");
		}else {
			System.out.println("publicTarget End!!"); 
		}
		
		// 신규 추가 1
				if ("test".equals("test")) {
				    System.out.println("publicTarget Start!!");
				}else {
					System.out.println("publicTarget End!!"); 
				}
	}
	
	

}
