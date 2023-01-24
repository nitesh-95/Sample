package Logical;

import java.util.Scanner;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the String ");
		
		String enteredString = S.next();
		
		String RevString = "";
		char charInString = 0;
		for(int i=enteredString.length()-1; i>=0;i--)
		{
			charInString=enteredString.charAt(i);
			RevString= RevString+charInString;
		}
		
		
		
		System.out.println(RevString);
	}

}
