
public class Main {

	static String  subStringReplace(String s) {
		
		if(s.isEmpty()) {
			return "String is Empty";
		}
		
		if(s.indexOf("l")!= -1  && s.lastIndexOf("l")!=-1) {
			s= s.substring(s.indexOf("l"), s.lastIndexOf("l"));
			
		}
		
		 
		
		String s1 = s.replace("o", "p");
		
		return s1;

	}
	
	
	public static void main(String[] args) {
//		String str="Hello"+"World";
//		String str2="Hello";
//		
//		StringBuilder sb = new StringBuilder("Hello");
//		sb.append("World");
//		System.out.println(str2);
//		str2="World";
//		String str1=new String("Hello");
//		
//		
//		
//		l to l
//		o -> p
		
System.out.println(subStringReplace("Hello world"));

System.out.println(subStringReplace("ABCD"));



	}

}
