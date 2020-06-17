//Print a version of the given array where all the 10's have been removed.
// The remaining elements should shift left towards the start of the array as needed,
//and the empty spaces at the end of the array should be 0.
//So {1, 10, 10, 2} yields {1, 2, 0, 0}.
//You may modify and display the given array or make a new array.

public class TestA9{
	static void withoutTen(int[] arr,int len){
		for(int i = 0; i < len; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int len = args.length;
		int[] arr = new int[len];
		int i = 0;
		for(String a : args){
			arr[i] = Integer.parseInt(a);
			if(arr[i] == 10) 
				arr[i] =0;
			i++;
		}
		for(i = 0; i < len -1; i++){
			for(int j = 0 ; j < len- i - 1; j++){
				if(arr[j] < arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		withoutTen(arr,len);
	}
}