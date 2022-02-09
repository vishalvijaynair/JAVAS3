import java.util.*;
class multi
{
	public static void main(String args[])
	{
		int i,j;
		int a[][]=new int [50][50];
		int b[][]=new int [50][50];		
		int multi[][]=new int [50][50];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter order of first matrix:");
		int m=obj.nextInt();
		int n=obj.nextInt();
		System.out.println("Enter order of second matrix:");
		int p=obj.nextInt();
		int q=obj.nextInt();
		if(m==p&&n==q)
		{
			System.out.println("Enter the first matrix");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=obj.nextInt();
				}
			}
			System.out.println("Enter the second matrix");
			for(i=0;i<p;i++)
			{
				for(j=0;j<q;j++)
				{
					b[i][j]=obj.nextInt();
				}
			}
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("The sum of matrix is :");
			for(i=0;i<p;i++)
			{
				for(j=0;j<q;j++)
				{
					System.out.print(sum[i][j]+" ");
				}
					System.out.print("\n");
			}
		}
		else 
		{
			System.out.println("Addition not possible");	
		}
	}
}
