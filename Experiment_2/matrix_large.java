import java.util.*;
class matrix_large
{
	public static void main(String args[])
	{
		int i,j,max; 
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=obj.nextInt();
		System.out.println("Enter the number of coloumns");
		int c=obj.nextInt();
		int a[][]=new int[50][50];
		System.out.println("Enter the elements in the matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		max=a[0][0];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(a[i][j]>max)
				max=a[i][j];
			}
		}
	System.out.println("Largest element in matrix:"+max);
	}
}
