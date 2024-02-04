package aspect;


public class AspectTest {
	
	private void publicTarget() { 
		if ("test".equals("test")) {
        System.out.println("");
		}else {
			System.out.println("publicTarget End!!"); 
		}
		
		// 신규 추가 
		if ("test".equals("test")) {
	        System.out.println("");
			}else {
				System.out.println("publicTarget End!!"); 
			}
		
		// 사이 추가 
		System.out.println("");
		
		
		// 신규 추가1 
				if ("test".equals("test")) {
			        System.out.println("");
					}else {
						System.out.println("publicTarget End!!"); 
					}
				
				// 신규 추가2
				if ("test".equals("test")) {
			        System.out.println("");
					}else {
						System.out.println("publicTarget End!!"); 
					}		
				
	    // otherbranch 추가 
		System.out.println("otherbranch");
	}
}
