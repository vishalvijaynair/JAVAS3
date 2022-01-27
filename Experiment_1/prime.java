import java.util.Scanner;
public class prime 
{
    public static void main(String args[]) 
    {
        int i,n,b=0;
        Scanner sys=new Scanner(System.in);
        System.out.print("Enter a number :");
        n=sys.nextInt();
        if(n==0||n==1)
        System.out.println("The number is neither prime or composite");
        else
        {
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
            b++;
            }
        }
        if(b==0)
        System.out.println("The number is prime");
        else
        System.out.println("The number is not prime");
    }
    }
    
}
