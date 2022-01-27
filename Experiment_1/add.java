import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=obj.nextInt();
        System.out.println("Enter the second number :");
        int b=obj.nextInt();
        System.out.println("Sum = "+(a+b));
    }
}