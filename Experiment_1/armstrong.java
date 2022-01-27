import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        int copy,sum=0,mod;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=obj.nextInt();
        copy=n;
        while(n>0)
        {
            mod=n%10;
            sum=sum+(mod*mod*mod);
            n=n/10;
        }
        if(sum==copy)
        System.out.println("The number is an armstrong number");
        else
        System.out.println("The number is not an armstrong number");
    }
}