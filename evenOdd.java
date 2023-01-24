package Logical;

import java.util.Scanner;

public class evenOdd 
{

	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
		System.out.println("Please enter the Number ");
		int numInput = S.nextInt();
		
		if (numInput%2==0)
		{
			System.out.println("Number is Even");
		}
		
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
