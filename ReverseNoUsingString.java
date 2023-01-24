package Logical;

import java.util.Scanner;

public class ReverseNoUsingString {

	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
		
		System.out.println("Enter the Integer Value ");
		int NumberInput = S.nextInt();
		
		String NoInString = Integer.toString(NumberInput);
		String revValue="";
		for (int i=NoInString.length()-1;i>=0;i--)
		{
			revValue=revValue+NoInString.charAt(i);
		}
		System.out.println(revValue);
		
		int NumberReversed = Integer.parseInt(revValue);
		
		System.out.println(NumberReversed);
	}

}
