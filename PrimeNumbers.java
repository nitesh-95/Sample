package Logical;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int numInput = 4;
		int count=0;
		
		for (int i=2;i<numInput;i++)
		{
			if (numInput%i==0)
			{
				count++;
				break;
			}
		}
		
		if (count==1)
		{
		System.out.println("The Number is non Prime");
		}
		else
		{
		System.out.println("The Number is Prime");
		}
	}

}
