/*Write a program that asks for your age in years, months, and days and writes out your age in seconds. Do this by calculating the number of total days you have been alive, then multiply this by the number of hours per day (24), the number of minutes per hour (60), and the number of seconds per minute (60). Assume that there are 365 days per year (ignore leap years). But correctly take account of the different number of days in different months. If the user enters 5 for the number of months, add up the number of days in the first 5 months: 31 + 28 + 31 + 30 + 31  
A human lifespan is about 2.5 billion seconds (2.5 billion heart-beats). Write out what percentage of your expected lifespan you have lived.  
 */
import java.util.Scanner;
public class yourAgeInSeconds {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int year,month,days,tdays,jan,feb,mar,april,may,june,july,aug,sept,oct,nov,dec,span=0,t1;
        double perct;
        System.out.println("Enter your age in in years");
        year=obj.nextInt();
        
        System.out.println("Now enter months");
        month=obj.nextInt();

        System.out.println("Now enter days");
        days=obj.nextInt();

        
        tdays=(year*24)*60*60;

        jan=tdays+(31*60*60*24);
        feb=tdays+(31*60*60*24)+(28*60*60*24);
        mar=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24);
        april=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24);
        may=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24);
        june=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24);
        july=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24);
        aug=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(31*60*60*24);
        sept=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(31*60*60*24)+(30*60*60*24);
        oct=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24);
        nov=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24);
        dec=tdays+(31*60*60*24)+(28*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24)+(30*60*60*24)+(31*60*60*24);

       if(month==0)
       {
        span=jan;
        System.out.println("Your age in sec "+tdays);
       }
       else if(month==1)
       {
        span=jan;
        System.out.println("Your age in sec "+jan);
       }
       else if(month==2)
       {
        span=feb;
        System.out.println("Your age in sec "+feb);
       }
       else if(month==3)
       {
        span=mar;
        System.out.println("Your age in sec "+mar);
       }
       else if(month==4)
       {
        span=april;
        System.out.println("Your age in sec "+april);
       }
       else if(month==5)
       {
        span=may;
        System.out.println("Your age in sec "+may);
       }
       else if(month==6)
       {
        span=june;
        System.out.println("Your age in sec "+june);
       }
       else if(month==7)
       {
        span=july;
        System.out.println("Your age in sec "+july);
       }
       else if(month==8)
       {
        span=aug;
        System.out.println("Your age in sec "+aug);
       }
       else if(month==9)
       {
        span=sept;
        System.out.println("Your age in sec "+sept);
       }
       else if(month==10)
       {
        span=oct;
        System.out.println("Your age in sec "+oct);
       }
       else if(month==11)
       {
        span=nov;
        System.out.println("Your age in sec "+nov);
       }
       else if(month==12)
       {
        span=dec;
        System.out.println("Your age in sec "+dec);
       }
       
       t1=span/100000;
       perct= (t1/2.5);
       System.out.println("percentage of your expected lifespan you have lived "+perct);



    obj.close();
}
}
