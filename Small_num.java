package Logical_programs;

public class Small_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,13,1,12,14};
		int min=a[0];
		for(int i=0;i<5;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Smallest Value="+min);
	}

}
