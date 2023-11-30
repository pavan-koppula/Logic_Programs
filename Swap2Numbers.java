package Logical_programs;

public class Swap2Numbers {
	
//------------------------Swap two variables-----------------------------------
	public static void main(String args[]) {
		int a=34;
		int b=43;
		System.out.println("Before Swaping");
		System.out.println(a);
		System.out.println(b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping");
		System.out.println(a);
		System.out.println(b);
		
//-------------------------Logic 2-----------------------------------------
		int p=75;
		int k=68;
		System.out.println("Before a="+p+", b="+k);
		p=p+k;
		k=p-k;
		p=p-k;
		System.out.println("p="+p);
		System.out.println("k="+k);
		

	}
}
