package Logical_programs;

public class Upper_Lower_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Jai Shree Ram Jai Shree Ram";
		int mid=str.length()/2;
		String Lower_case="";
		String Upper_case="";
		
		for(int i=0;i<str.length();i++) {
			if(i<mid) {
				Lower_case= Lower_case + Character.toLowerCase(str.charAt(i));
			}else {
				Upper_case= Upper_case + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(Lower_case + Upper_case );
	}
}
