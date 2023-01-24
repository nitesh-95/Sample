package Logical_Extra;

public class secondMaxNoArray2 
{

	public static void main(String[] args) 
	{
		int size,stat;
        int[] A= {1,7,4,5,6};
        
        int nth_max_no = 2;			// nth no. insertion
        size= A.length;
        
        for(int i=0;i<size;i++)
        {
        	for (int j=i+1;j<size;j++)
        	{
        		if (A[i]>A[j])
        		{
        			stat = A[i];
        			A[i]=A[j];
        			A[j]=stat;
        		}
        		
        	}
        	
        }
        System.out.println(nth_max_no + "nth Highest no. of Array is "+A[size-nth_max_no]);
	}

}
