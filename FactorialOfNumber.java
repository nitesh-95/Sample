package Logical;

import java.util.Scanner;

public class FactorialOfNumber 
{

	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Please enter the Number");
		int numInput = S.nextInt();
		
		int FactOfNum=1;
		for(int i=numInput; i>=1;i--)
		{
			FactOfNum=FactOfNum*i;
		}
		System.out.println(FactOfNum);
		
		
	}

}
