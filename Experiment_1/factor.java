import java.util.Scanner;
class factor
{
    public static void main(String args[])
    {
        int i;
       Scanner obj=new Scanner(System.in);
       System.out.print("Enter a number :" );
       int n=obj.nextInt();
       System.out.println("The factors of the number "+n+" are");
       for(i=1;i<=n;i++)
       {
           if(n%i==0)
           System.out.println(i);
       }
       
    }
}