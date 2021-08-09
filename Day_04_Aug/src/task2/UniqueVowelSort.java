package task2;
import java.util.Arrays;
public class UniqueVowelSort {	 
	public static String unique(String s)
    {
        String str = new String();    
        int len = s.length();      
        for (int i = 0; i < len; i++)
        {           
            char c = s.charAt(i);             
            // if c is present in str, it returns
            // the index of c, else it returns -1
            if (str.indexOf(c) < 0)
            {
                // adding c to str if -1 is returned
                str += c;
            }
        }
         
        return str;
    }
 
	public static int countVowel(String s) {
		int count=0;
		
		s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				count++;				
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		 String word = "gee hurry ry";
		 String ar[] = word.split(" ");
		 for (String w : ar) {
			 System.out.print(w+ "=");			 
			 String strDup=unique(w);
		     System.out.print(countVowel(strDup)+"  ");		     
		 }
	     
	}	
}
