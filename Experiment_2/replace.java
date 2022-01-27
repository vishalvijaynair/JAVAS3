import java.util.Scanner;
class replace
{
    public static void main(String args[])
    {
        int i,num,loc;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the limit of the array :");
        int n=obj.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the elements in the array :");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.print("Enter the element you want to insert :");
        num=obj.nextInt();
        System.out.print("Enter the location in which element is to be added :");
        loc=obj.nextInt();
        for(i=0;i<n;i++)
        {
            if(loc==i+1)
            a[i]=num;
        }
        System.out.println("The updated array is");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }

}