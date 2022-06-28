package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class exx1 {
	public static int assembly(int N,int A[]) {
		int result =-404;
		int[] copyA=Arrays.copyOf(A, N);
		Arrays.sort(copyA);
		for(int i=0; i<N;i++) {
			if(A[i] != copyA[i])
				System.out.println(i +" ");
		}
		
		return result;
	
		
	}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in) ;
		int N =sc.nextInt();
		
		int A [] =new int [N];
		for (int i=0; i<N; i++) 
			A[i] =sc.nextInt();
		
	
		
		
	}

}
