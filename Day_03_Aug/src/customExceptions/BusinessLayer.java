package customExceptions;

public class BusinessLayer {

	
	public boolean isValidEmail(String Email) throws InvalidEmailExceptions{
		
			//var Emailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			String regex = "^(.+)@(.+)$";  	        	        
			if(Email!=null && Email.matches(regex)) {       
			return true;
			}else {
				throw new InvalidEmailExceptions("Entered Email "+Email+" is INVALID");
		}
	}
}

//[A-Z]{5}[0-9]{4}[A-Z]{1}