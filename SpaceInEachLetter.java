package Logical;

public class SpaceInEachLetter 
{

	public static void main(String[] args) 
	{
		String S="Nitesh Sadanand Tadadikar";
		
		String NewString="";
		char SpaceChar=' ';
		char charInString=' ';
		for (int i=0;i<=S.length()-1;i++)
		{
			charInString = S.charAt(i);
			NewString=NewString+charInString;
			NewString=NewString+SpaceChar;
		}
		System.out.println(NewString);
	}

}
