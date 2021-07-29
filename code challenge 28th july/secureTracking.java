package basic;


public class secureTracking {
	
	public static String checkTracking (String Str) {
		if(Str.startsWith("https://")) {
			return  "secure";
		}
		else 
		if(Str.startsWith("http://")) {
			return "not secure";
		}
		return" not secure";
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(checkTracking("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checkTracking("http://en.wikipedia.org/wiki/Main_Page"));

	}
	
	
}
