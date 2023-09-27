
/*In a new role-playing fantasy game players must design their character by picking a point value for each of three characteristics:  
•	Strength, from 1 to 10 
•	Health, from 1 to 10 
•	Luck, from 1 to 10 
Write a program that asks for a name for the character and asks for the point value of for each of the three characteristics. However, the total points must be less than 15. If the total exceeds 15, then 5 points are assigned to each characteristic  
 */

import java.util.Scanner;
public class fantacyGame {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String cname;
        int strength,health,luck,total=0;

         System.out.println("Welcome to Yertle's Quest");

         System.out.println("Enter the name of your character: ");
         cname=obj.next();

         System.out.println("Enter strength (1-10): ");
         strength=obj.nextInt();

         System.out.println("Enter health (1-10): ");
         health=obj.nextInt();

         System.out.println("Enter luck (1-10): ");
         luck=obj.nextInt();

         total= strength+luck+health;
         if(total>15){
            strength=5;
            luck=5;
            health=5;
         }
         System.out.println("You have to give your character too many points!  Default values have been assigned: ");
         System.out.println(cname+", strength: "+strength+", health: "+health+", luck: "+luck);
         obj.close();
    }
}