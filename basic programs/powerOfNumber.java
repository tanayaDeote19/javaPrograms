/*Write a program that computes XN where X is a floating point number and N is a positive integer. The program informs the user that N must be positive if the user enters a negative value. Of course,  
XN = X * X * X * ... * X       <-- N of these  
The user dialog will look something like this:  
Enter X 1.3 
Enter N 
5 
 
1.3 raised to the power 5 is:  3.71293 
*/
import java.util.Scanner;
public class powerOfNumber {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double a,b;
        int n;

        System.out.println("Enter a floating point value ");
        a=obj.nextFloat();

        System.out.println("Enter positive integer");
        n=obj.nextInt();

        if(n>=0){
             b=Math.pow(a, n);
             System.out.println(a+" to the power "+n+"is "+b);
        }
        else{
            System.out.println("N must be a positive integer.");
        }
        obj.close();
    }
}
