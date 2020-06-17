//Given 2 int arrays, a and b, each length 3, 
//form a new array of length 2, containing their middle elements.
public class TestA12{
	static void middleway(int arr1[],int arr2[]){
		int[] len = new int[2];
		len[0] = arr1[1];
		len[1] = arr2[1];
		System.out.println("["+len[0]+","+len[1]+"]");
	}
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int i = 0,j = 0;
		for(String str : args){
			if(i < 3) arr1[i] = Integer.parseInt(str);
			else{
				if(i >= 3 && i < 6) 
					arr2[j] = Integer.parseInt(str);
				j++;	
			}
			i++;
		}
		middleway(arr1,arr2);
	}
}