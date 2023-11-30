package Logical_programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");	//153
		int n =sc.nextInt();
		int temp,c,res=0;
		temp=n;
		while(n!=0) {
			c=n%10;
			res=res+(c*c*c);
			n=n/10;
		}
		if(temp == res) {
			System.out.println("Given number is Armstrong "+res);
		}else {
			System.out.println("Given number is Not Armstrong, Value= "+res);
		}
		
	}

}
