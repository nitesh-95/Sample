package Logical_Extra;

public class secondMaxNoArray 
{

	public static void main(String[] args) 
	{
		int temp, size;
        int array[] = {10, 20, 125, 63, 96, 57};
        size = array.length;
        System.out.println(size);
        for(int i = 0; i<size; i++ )      //i=0     ,1     ,2   ,3  ,4 ,5
        {
            for(int j = i+1; j<size; j++) //j=12345 ,2345  ,345 ,45 ,5
            {

                if(array[i]>array[j])     //==FFFFF ,FFFF  ,TFT ,TT ,T
                {
                    temp = array[i];      //---------------,t=125,-,63------------,t=125,96----------t=125
                    array[i] = array[j];  //---------------,a[2]=63,a[2]=57-------,a[3]=96,a[3]=63---a[4]=96
                    array[j] = temp;      //---------------,a[3]=125,a[5]=63------,a[4]=125,a[5]=96--a[5]=125
                }						  // 10, 20, 57,63, 96, 125
            }
            System.out.println("Third second largest number is:: "+array[i]); 
        }
	}

}
