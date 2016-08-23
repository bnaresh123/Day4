package Pack3;

public class String_Functions {
	 public static void main(String[] args) {
		String s="the rain have been started";
		//size
		System.out.println("Total charactors in the String: "+s.length());
		//compare
		String str="The rain have been started";
		System.out.println(s.equals(str));
		
		System.out.println(s.equalsIgnoreCase(str));
		//index
		System.out.println(s.indexOf('d'));
		System.out.println(s.charAt(25));
		//startswith
		System.out.println(s.startsWith("the"));
		//endswith
		System.out.println(s.endsWith("star444ted"));
		System.out.println(s.endsWith("ted"));
		
		//substrings
		System.out.println(s.substring(4));
		System.out.println(s.substring(4,8));
		
		
		
		
	}

}
