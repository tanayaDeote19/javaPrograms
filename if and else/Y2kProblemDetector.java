/*Write a program that asks a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). The program is to correctly write out the users age in years.  
Year of Birth: 62 
Current year: 99 
Your age: 37 
The program will have to determine when a two digit value such as "62" corresponds to a year in the 20th century ("1962") or the 21st century. Here is another run of the program, where "00" is taken to mean the year 2000:  
Year of Birth: 62 
Current year: 00 Your age: 38 
Assume that ages are not negative. Another run of the program:  
Year of Birth: 27 
Current year: 07 Your age: 80 
In the following run, the age of the person could be 6 or 106 depending on the assumptions. Assume that the age will always be less than or equal to 100.  
Year of Birth: 01 
Current year: 07 
Your age: 6 
*/

import java.util.Scanner;

public class Y2kProblemDetector {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int byear,cyear,age;
        
        System.out.println("Enter your year of birth");
        byear=obj.nextInt();

        System.out.println("Enter your current year");
        cyear=obj.nextInt();

        if(byear>cyear){
            age=byear-cyear;
        }
        else{
            age=cyear-byear;
        }
        System.out.println("Your age: "+age);

    obj.close();
    }
}
