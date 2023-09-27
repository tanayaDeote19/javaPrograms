/*Write a program that adds up the squares and adds up the cubes of integers from 1 to N, where N is entered by the user:  
Upper Limit: 
5 
The sum of Squares is  55 
The sum of Cubes   is  225 
Do this by using just one loop that generates the integers. Of course, if you really needed to calculate these sums you would use the appropriate formulas:  
12	+ 22 + 32 + ... + n2 = n(n+1)(2n+1)/6  
13	+ 23 + 33 + ... + n3 = n2(n+1)2/4  
Add these formulas to your program and print out their results as well as that of the explicit summations.  
*/

import java.util.Scanner;
public class addingUpSquaresAndCubes {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        
        int n,sum1=0,sum2=0;
        System.out.println("Enter upper limit");
        n=obj.nextInt();

        while(n>0){
             sum1+=Math.pow(n,2);
             sum2+=Math.pow(n,3);
             n--;
        }
        System.out.println("Sum of squares is: "+sum1);
        System.out.println("Sum of squares is: "+sum2);



    obj.close();}
}
