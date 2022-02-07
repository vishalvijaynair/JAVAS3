import java.util.*;
public class student {
    String name;
    Scanner scn = new Scanner(System.in);    
    int z,x,c,v,b,r;

    public static void main(String args[]){
        student s3 = new student();
        s3.read();
        s3.display();
    }

    void read() {
         System.out.print("Enter the name of the student:");
         name = scn.next();
         System.out.print("Enter the roll number:");
            r = scn.nextInt(); 
         System.out.print("Enter the mark of subject 1:") ;
            z = scn.nextInt();
         System.out.print("Enter the mark of subject 2:") ;
            x = scn.nextInt();
         System.out.print("Enter the mark of subject 3:") ;
            c = scn.nextInt();
         System.out.print("Enter the mark of subject 4:") ;
            v = scn.nextInt();
         System.out.print("Enter the mark of subject 5:") ;
            b = scn.nextInt();
    
    }
    void display(){
        System.out.println("Name : " +name);
        System.out.println("Roll Number : "+r);
        System.out.println("Mark of subject 1 : "+z);
        System.out.println("Mark of subject 2 : "+x);
        System.out.println("Mark of subject 3 : "+c);
        System.out.println("Mark of subject 4 : "+v);
        System.out.println("Mark of subject 5 : "+b);

    }
}

