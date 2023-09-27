/*Write a program that computes the following sum:  
sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N 
N is an integer limit that the user enters.  
*/

import java.util.Scanner;
public class seriesOfSum {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double sum=0,n,i=1;

        System.out.println("Enter n");
        n=obj.nextInt();
        while(i<=n){
            sum+=(1/i);
            i++;
        }
        System.out.println("Sum is: "+sum);
        obj.close();
}
}
