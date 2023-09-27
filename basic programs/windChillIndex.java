/*Write a program that calculates the wind chill index given the temperature and the wind speed.  
C:\JavaCode> java WindChill 
Enter Wind Speed: 
15 
Enter Temperature: 
20 
Wind Chill: 6.218885266083872 
The wind chill index (WCI) is calculated from the wind speed v in miles per hour and the temperature temp in Fahrenheit. Three formulas are used, depending on the wind speed:  
If wind speed is less than 3 mph then wind chill = current temperature  
If the current temperature is greater than 50° F then wind chill = current temperature 
 otherwise, wind chill = 35.74 + 0.6215*temp - 35.75*v0.16 + 0.4275*temp*v0.16 
You will need to import java.lang.Math and use floating point input for this exercise. To calculate v0.16 use Math.pow().  */

import java.util.Scanner;
public class windChillIndex {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double speed,ctemp,wchill;
        System.out.println("Enter wind speed in miles per hour");
        speed=obj.nextDouble();
        System.out.println("Enter Temperature in fahrenheit");
        ctemp=obj.nextDouble();
        if(speed<3)
        {
           wchill=ctemp;
           System.out.println("Wind chill: "+wchill);
        }
        else if(ctemp>50)
        {
           wchill=ctemp;
           System.out.println("Wind chill: "+wchill);
        }
        else{
            wchill= 35.74 + 0.6215*ctemp - (35.75*(Math.pow(speed, 0.16))) +( 0.4275*(ctemp*(Math.pow(speed, 0.16))));
            System.out.println("Wind chill: "+wchill);
        }


    obj.close();
}
    
}
