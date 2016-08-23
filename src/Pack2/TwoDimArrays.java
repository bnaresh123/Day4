package Pack2;

public class TwoDimArrays {
	public static void main(String[] args) {
		int a[][]=new int[3][3];//size declaration
		//values declaration
		//row 1 declaration
		a[0][0]=11;
		a[0][1]=22;
		a[0][2]=33;
		
		//row 2 declaration
		a[1][0]=44;
		a[1][1]=55;
		a[1][2]=66;
		
		//row 3 declaration
		a[2][0]=77;
		a[2][1]=88;
		a[2][2]=99;
		
		System.out.println(a[0][1]);
		System.out.println(a[2][2]);
		
	}
}
