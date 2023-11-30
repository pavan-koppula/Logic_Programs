package Logical_programs;

import java.util.Scanner;

public class Add_Num {

	public static void main(String[] args) {
//------------------------add all the digits of a given positive integer------------------------------
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num,dig,sum=0; 
		num=sc.nextInt();
		while(num>0) {
			dig=num%10;
			sum=sum+dig;
			num=num/10;
		}
		System.out.println("Sum is="+sum);
	}
}
