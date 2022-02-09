import java.util.Scanner;
public class frequency
{
	public static void main(String args[])
	{
		int freq=0;
		Scanner obj=new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String s=obj.nextLine();
		System.out.print("Enter the character to be searched: ");
		char a=obj.next().charAt(0);
		int n=s.length();
		int i;
		for(i=0;i<n;i++)
		{
			if(a==s.charAt(i))
			{
				System.out.println("The character is found at position "+(i+1));
				freq++;

			}
                 }
		if(freq==0){
		System.out.println("The character is not in the given string");
		}
		else{
		System.out.println("The frequency of character is "+freq);
		}
	}
}
