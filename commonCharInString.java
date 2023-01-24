package Logical_Extra;

public class commonCharInString
{

	public static void main(String[] args) 
	{
		String N="automation";
		char val='t';      //insert the charachter
		int count=0;

		for (char charString : N.toCharArray())
		{
			if (val==charString)
			{
				count++;
				
			}
		}
		System.out.println("Common character of "+ val + " in String "+N+" is " + "=" + count);
	}

}
