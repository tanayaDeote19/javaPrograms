/*Bob's Discount Bolts charges the following prices:  
•	5 cents per bolt 
•	3 cents per nut 
•	1 cent per washer 
Write a program that asks the user for the number of bolts, nuts, and washers in their purchase and then calculates and prints out the total. As an added feature, the program checks the order. A correct order must have at least as many nuts as bolts and at least twice as many washers as blots, otherwise the order has an error.  
For an error the program writes out "Check the Order: too few nuts" or "Check the Order: too few washers" as appropriate. Both error messages are written if the order has both errors. If there are no errors the program writes out "Order is OK." In all cases the total price in cents (of the specified number of items) is written out.  
 */

import java.util.Scanner;
public class orderChecker {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        int bolts,nuts,washer,total;

        System.out.println("Enter no.of bolts");
        bolts=obj.nextInt();

        System.out.println("Enter no.of nuts");
        nuts=obj.nextInt();

        System.out.println("Enter no.of washer");
        washer=obj.nextInt();
        
        if(bolts>nuts){
            System.out.println("Check the Order: too few nuts");
            total=bolts*5+nuts*3+washer*1;
            System.out.println("Total cost: "+total);
        }
         else if(washer!=2*bolts){
            System.out.println("Check the Order: too few washer");
            total=bolts*5+nuts*3+washer*1;
            System.out.println("Total cost: "+total);
        }
        if(bolts<=nuts && washer==2*bolts){
            System.out.println("Order is OK.");
            total=bolts*5+nuts*3+washer*1;
            System.out.println("Total cost: "+total);
        }
        

    obj.close();
    }
    
}
