import java.util.Scanner;
class fibonacci
{
    public static void main(String args[]) 
    {
        int first=0,second=1,third,i;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the limit of the series :");
        int n=obj.nextInt();
        System.out.println(first + "\n" + second);
        for(i=0;i<n;i++)
        {
            third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }    
    }
}