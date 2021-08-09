package task1;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class VowelSort {
	
	public static void main(String[] args) {
		
		String s = "hey hello everyone its getting complicated right that's why we should wrap up fast";
		
		
		System.out.println(SortBasedOnVowelCount(s));
	}
	
	public static String SortBasedOnVowelCount(String s) {
		
		Map<Integer, String> map = new TreeMap<>();
		String ar[] = s.split(" ");
		Arrays.sort(ar);
		for (String w : ar) {
			//int length=w.length();
			int n = countVowel(w);
			if(map.containsKey(n)) {
				String temp=map.get(n);
				temp=temp+" "+w;
				map.put(n, temp);
			}else {
				map.put(n, w);
			}
		}
		System.out.println("map : "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer, String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		
		}
		return sb.toString().trim();
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
		
	
		
	
}
