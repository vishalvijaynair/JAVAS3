import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int copy,rev=0,mod;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=obj.nextInt();
        copy=n;
        while(n>0)
        {
            mod=n%10;
            rev=(rev*10)+mod;
            n=n/10;
        }
        if(copy==rev)
        {
            System.out.println("The number "+copy+" is a palindrome");
        }
        else
        System.out.println("The number "+copy+" is a not a palindrome");
    }
}