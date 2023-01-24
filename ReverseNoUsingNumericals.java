package Logical;

import java.util.Scanner;

public class ReverseNoUsingNumericals 
{

	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the Value ");
		int NumberInput=S.nextInt();
		int RevNumber=0;
		
		for (int i=NumberInput;i>0;i=i/10)
		{
			int remainder = i%10;
			RevNumber=RevNumber*10+remainder;
		}
		System.out.println(RevNumber);
		
		
		int numIp = S.nextInt();
		int numRev=0;
		
		for(int i=numIp; i>0; i=i/10)
		{
			int rem = i%10;
			numRev=numRev*10+rem;
		}
		System.out.println(numRev);
	}

}
