import java.util.*;
class trans
{
	public static void main(String args[])
	{
		int i,j;
		int a[][]=new int [50][50];
		int b[][]=new int [50][50];		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter order of matrix:");
		int m=obj.nextInt();
		int n=obj.nextInt();
		System.out.println("Enter the  matrix");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=obj.nextInt();
				}
			}
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					b[i][j]=a[j][i];
				}
			}
			System.out.println("The transpose of matrix  is :");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(b[i][j]+" ");
				}
					System.out.print("\n");
			}
	}
}
