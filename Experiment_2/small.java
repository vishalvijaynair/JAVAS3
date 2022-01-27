import java.util.*;
class small
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n,small,i,j;
        System.out.print("Enter the limit of the array :");
        n=obj.nextInt();
        System.out.println("Enter the elements in the array : ");
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        small=a[0];
        for(i=1;i<n;i++)
        {
            if(small>a[i])
            small=a[i];
           
        }
        System.out.println("The smallest number in the array is "+ small);
    }
}