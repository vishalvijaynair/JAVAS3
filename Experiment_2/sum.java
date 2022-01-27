import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the limit of the array :");
        n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
            sum=sum+a[i];
        }
        System.out.println("The sum of "+n+" elements in the array is "+sum);
    }
}
