//Initialize an integer array with ascii values 
//print the corresponding character values in a single row.
public class TestA4{
public static void main(String[] args) {
		int[] arr = {33,34,35,36,37,38,39,40,41,42,43,44,45,46,47};
		for(int i : arr){
			System.out.print((char)i+" ");
		}
	}
}