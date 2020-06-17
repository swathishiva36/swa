//find the largest 2 numbers and the smallest 2 numbers in the given array.
public class TestA5{
	static void find_largest_and_smallest_number(int arr[],int len){
		int i = 0, j = 0,temp = 0;
		for(i = 0; i < len -1; i++){
			for(j = 0 ; j < len- i - 1; j++){
				if(arr[j] >  arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(arr[len-2]+","+arr[len-1]+","+arr[0]+","+arr[1]);
	}
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		int i = 0;
		for(String str : args){
			arr[i] = Integer.parseInt(str);
			i++;
		}
		find_largest_and_smallest_number(arr,args.length);
	}
}