package Pack2;

public class Arrays {
	public static void main(String[] args) {
		
		//Array: It can store same data type multiple values, either string or int
		int a[]  = new int[5];  //size declaration
		//values declaration
		a[0]=11;
		a[1]=23;
		a[2]=34;
		a[3]=12;
		a[4]=25;
		System.out.println(a[1]);
		System.out.println(a[1]+a[3]);
		
		//String array:
		String s[]=new String[3];  //size declaration
		s[0]="aaaa";
		s[1]="bbbb";
		s[2]="cccc";
		
		System.out.println(s[0]+a[1]);
		
	}

}
