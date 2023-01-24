package Logical_Extra;

import java.util.ArrayList;

public class String_with_DoubleQuote 
{

	public static void main(String[] args) 
	{
		ArrayList AL =  new ArrayList();
		
		AL.add("abc");
		AL.add("asdf");
		AL.add("asd");
		AL.add('"'+"asdf "+"asd"+'"');
		AL.add("asdfknjk");
		AL.add("asdnj");
		AL.add('"'+"asdfhg "+"asdbnn"+'"');

		System.out.println("=========Input========");
		System.out.println(AL);
		System.out.println("=========Output========");
		
		for (Object ALi:AL)
		{
			System.out.println(ALi);
		}
	}

}
