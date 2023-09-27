/*At the State Fair Pie Eating Contest all contestants in the heavyweight division must weigh within 100 pounds and 250 pounds. Write a program that asks for a contestant's weight and then says if the contestant is allowed in the contest.
 */

import java.util.Scanner;
public class pieEatingContest {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int weight;
        System.out.println("Enter the weight in pounds");
        weight=obj.nextInt();

        if(weight>=100 && weight<=250)
        {
            System.out.println("Your are allowed in contest");
        }
        else{
            System.out.println("Your are not allowed in contest");
        }

        obj.close();
    }
}
