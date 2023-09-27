/*Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values.  */
import java.util.Scanner;
public class integerNumbersbetweenTwoNumbers {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.println("Enter staring number");
        a=obj.nextInt();

         System.out.println("Enter ending number");
        b=obj.nextInt();

        while(a<b)
        {
            a++;
            System.out.println(a);
        }

        obj.close();
    }
}
