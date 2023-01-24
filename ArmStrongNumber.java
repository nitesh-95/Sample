package Logical;

public class ArmStrongNumber {

	public static void main(String[] args)
	{
		int numInput = 153;
		int sum = 0;
		
		for(int i=numInput; i>=1;i=i/10)
		{
			int remainder = i%10;
			
			sum=sum+(remainder*remainder*remainder);
		}
		
		if (numInput==sum)
		{
			System.out.println("The Number is Armstrong Number");
		}
		else
		{
			System.out.println("The Number is not Armstrong Number");
		}
	}

}
