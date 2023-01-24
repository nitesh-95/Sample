package Logical_Extra;

public class ascending_descending_Array 
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
        
        System.out.println("For Ascending");
        for (int i=0;i<size;i++)
        {
        	System.out.println(A[i]);
        }
        
        System.out.println("For Descending");
        for (int i=size-1;i>=0;i--)
        {
        	System.out.println(A[i]);
        }
       
	}

}
