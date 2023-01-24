package Logical;

public class OneByOneBlankSpace 
{

	public static void main(String[] args)
	{
		String S="NiteshSadanandTadadikar";
		
		String newString="";
		char charOfString=' ';
		for (int i=0;i<S.length();i++)
		{
			if (i%2==0)
			{
				newString=newString+S.charAt(i);
			}
			else {
				newString=newString+charOfString;
			}
		}
		System.out.println(newString);
	}

}
