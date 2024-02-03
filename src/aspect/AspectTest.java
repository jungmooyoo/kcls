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
	}
}
