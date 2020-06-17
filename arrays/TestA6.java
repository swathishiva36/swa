

//Write a program to initialize an array and print them in a sorted order.
public class TestA6{
	static void Sorting(int arr[],int len){
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
		for(int a : arr)
			System.out.print(a+" ");
	}
	public static void main(String[] args) {
		int[] arr = {4,7,1,3,2,5,99,102,45,400};
		Sorting(arr,10);
	}
}