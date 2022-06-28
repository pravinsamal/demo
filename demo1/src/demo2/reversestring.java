package demo2;

import java.util.Scanner;

public class reversestring {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
	String value=	sc.nextLine();
	String w=value;
	String rev="";
	for(int a=value.length()-1; a>=0; a-- ) {
		rev=rev+value.charAt(a);
	}
	System.out.println(rev);
	if (rev.equals(w)) 
		System.out.println("is palimdrome");
	
	else 
		System.out.println("not palindrome");
	

	}
}
