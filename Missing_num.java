package Logical_programs;

public class Missing_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]={1,2,3,4,5,7,8};
		int sum=(8*9)/2;
		int arsum=0;
		
		for(int i=0; i<ar.length; i++) {
			arsum =arsum + ar[i];
		}
		System.out.println("Missing Number;"+(sum - arsum));
		
	}

}
