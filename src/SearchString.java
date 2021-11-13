import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchString {
	public static String searchString(String statement,String str) {
		String s[]=statement.split(" ");
		Map<String, Integer> hm =new HashMap<String, Integer>();
		
		for(String str1:s) {
			if(hm.containsKey(str1)) {
				hm.put(str1,hm.get(str1)+1);
			}
			else {
				
				hm.put(str1,1);
			}
			
		}
		
		return hm.toString();
		
	}

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
		
		
		System.out.println(searchString("My name name is Nikhil", "name"));
		
		
		

	}

}
