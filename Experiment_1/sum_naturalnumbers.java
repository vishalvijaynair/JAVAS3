import java.util.Scanner;
class sum_naturalnumbers
{
    public static void main(String args[]) 
    {
        int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=obj.nextInt();
        for(int i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of first "+a+" natural numbers is "+sum);
    }
}       