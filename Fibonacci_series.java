package Logical_programs;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n,n1=0,n2=1,n3;
		n=sc.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=0;i<=n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
