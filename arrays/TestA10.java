//Print an array that contains the exact same numbers as the given array,
// but rearranged so that all the even numbers come before all the odd numbers.
// Other than that, the numbers can be in any order.
// You may modify and print the given array, or make a new array.

public class TestA10{
	static void evenOdd(int[] arr){
		int i;
		int[] new_arr = new int[arr.length];
		int j = 0,k = arr.length-1;
		for(i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				new_arr[j] = arr[i];
				j++;
			}
			else{
				new_arr[k] = arr[i];
				k--;
			}
		}
		System.out.print("[");
		for(i = 0; i < new_arr.length; i++){
			if(i < new_arr.length - 1)
				System.out.print(new_arr[i]+",");
			else
				System.out.print(new_arr[i]+"]");
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		int i = 0;
		for(String str : args){
			arr[i] = Integer.parseInt(str);
			i++;
		}
		evenOdd(arr);
	}
}