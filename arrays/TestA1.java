//Write a program to initialize an integer array
//print the sum and average of the array.
public class TestA1{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double avg = 0.0;
		for(int i : arr){
			sum = sum + i;
		}
		avg = sum/(arr.length);
		System.out.println("sum of an array is "+sum);
		System.out.println("average of an array is "+avg);
	}
}