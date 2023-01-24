package Logical;


public class WhiteSpacesInString 
{

	public static void main(String[] args)
	{
		String S= "Nitesh Sadanand Tadadikar";
		
		char ref=' ';
		int count=0;
		for (int i=0; i<=S.length()-1;i++)
		{
			char charFromString = S.charAt(i);
			
			if(ref==charFromString)
			{
			count++;	
			}
		}
		System.out.println(count);
	}

}
