package Logical_programs;

import java.util.Scanner;

public class Sum_of_a_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");	
		int n =sc.nextInt();
		int sum=0,d;
		while(n>0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of given Number="+sum);
	}

}
