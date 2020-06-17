//Write a program to initialize an integer array
//find the maximum and minimum value of the array.
public class TestA2{
	static int max_array(int[] arr){
		int ans = arr[0];
		for(int i : arr){
			if(ans < i)
				ans = i;
		}
		return ans;
	}
	static int min_array(int[] arr){
		int ans = arr[0];
		for(int i : arr){
			if(ans > i)
				ans = i;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {11,2,30,4,5,66,7,880,9,100};
		int max = 0,min = 0;
		max = max_array(arr);
		min = min_array(arr);
		System.out.println("Maximum value of an array: "+max);
		System.out.println("Minimum value of an array: "+min);
	}
}