import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        int i,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of the number "+n+" is "+fact);
    }
}