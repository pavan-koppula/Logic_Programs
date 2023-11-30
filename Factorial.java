package Logical_programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val=6,fact=1;
		for(int i=1;i<val;i++) {
			fact= fact+(fact*i);
		}
		System.out.println("Factorial of "+val+" is "+fact);
	}

}
