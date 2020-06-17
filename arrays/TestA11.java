//Given an array of type int, print true if every element is 1 or 4. 
public class TestA11{
	static boolean only14(int[] arr){
		boolean ans = false;
		for(int a : arr){
			if((a == 1) || (a == 4)) ans = true;
			else{
				 ans = false;
				 break;	
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		int i = 0;
		for(String str : args){
			arr[i] = Integer.parseInt(str);
			i++;
		}
		boolean b = only14(arr);
		System.out.println(b);
		//else System.out.println("false");
	}
}