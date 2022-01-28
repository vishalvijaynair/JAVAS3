import java.util.Scanner;
class second_largest
{
    public static void main(String args[])
    {
        int i,large,temp,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the limit of the array :");
        int n=obj.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the elements in the array :");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
    
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }   }
        }
        System.out.println("Second largest element is "+a[1]);
    }

}