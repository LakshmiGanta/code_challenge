package customExceptions;

public class PresentationLayer {
	
	public static void main(String[] args) {
		
		BusinessLayer b1 = new BusinessLayer();
		try {
			if(b1.isValidEmail("lucky.ganta@gmail.com")) {
				System.out.println("Email Validated");
			}
			}catch(InvalidEmailExceptions e){
				System.out.println(e.getMessage());
			}
		
	}

}
