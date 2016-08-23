package Pack2;
// find the smallest number in array?
public class day9 {
	public static void main(String[] args) {
		int numbers[] = new
				int[]{32, 42, 45, 47, 50 ,60 ,23,10};
				int smallest = numbers[0];
				int largest = numbers[0];
				for (int i=0;i< numbers.length;i++){
				
				if (numbers[i]>largest){
				largest = numbers[i];
				}else if(numbers[i] < smallest){
				smallest=numbers[i];
				
				}
				}
				System.out.println("largest number is " +largest);
				System.out.println("smallestnumberis "+smallest);
				

	}

}
