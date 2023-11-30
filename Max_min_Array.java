package Logical_programs;

public class Max_min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,13,23,33,1,22,10,34};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<8;i++) {
			 if(arr[i]<min)
	           {
	           min=arr[i];
	           }
	         if(arr[i]>max)
	         {
	           max=arr[i];
	         }
	     }
		System.out.println("Maximum element is"+max);
		System.out.println("Minimum Element is"+min);
	}

}
