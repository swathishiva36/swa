





//Write a program to initialize an integer array with values and 
//check if a given number is present in the array or not.
public class TestA3{
	public static void main(String[] args) {
		int[] arr1 = {1,4,34,56,7};
		int k = 90; //int k = 56;
		int count = 0,i = 0;
		for(i = 0; i < 5; i++){
			if(arr1[i] == k) break;
			else count++;
		}
		if(count == 5) System.out.println("-1");
		else System.out.println(i);
	}
}