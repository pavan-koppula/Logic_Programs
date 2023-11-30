package Logical_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,rev,org_num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		org_num = num;
		rev=0;
		while(num!=0) {
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(org_num == rev) {
			System.out.println("Given Number is Palindrome"+rev);
		}else {
			System.out.println("Given Number is Not a Palindrome"+rev);
		}
		
	}

}
