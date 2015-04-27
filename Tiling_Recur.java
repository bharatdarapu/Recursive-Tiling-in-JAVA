package syr;

import java.util.Scanner;

public class Tiling_Recur {

	public static void main(String[] args) {
	System.out.println("The values of T and A for the respective N are as follows:");
	System.out.println("N				T				A");
	for(int n=0;n<=10;n++)
	System.out.println(""+n+"				"+computeT(n)+"				"+computeA(n));
	}
	static int computeT(int n)
	{
		if(n<0)
		return 0;
		else if(n==0)
		return 1;
		else
		return computeT(n-2)+(2*computeA(n-1)); 
	}
	static int computeA(int n)
	{
		if(n<1)
		return 0;
		else 
		return computeT(n-1)+computeA(n-2); 
	}
}
