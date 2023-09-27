/*The maximum possible efficiency of a steam engine depends on the temperature of the steam in the boiler and the temperature of the outside air:  
efficiency = 1 - Tair / Tsteam 
where Tair is the air temperature and Tsteam is the steam temperature. The temperatures are give in degrees above absolute zero. Normal air temperature is about 300oK. Boiling is 373oK. Write a program that asks the user for the air temperature and the steam temperature and writes out the maximum possible efficiency of a steam engine. However, if the steam temperature is less than 373oK there is no steam, so the efficiency is zero.  
Use integer or floating point input, but do the calculations in floating point.  
 */

import java.util.Scanner;
public class steamEngineEfficiency {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double Tair,Tsteam,efficiency;
 
        System.out.println("Enter air temperature in kelvin");
        Tair=obj.nextDouble();

        System.out.println("Enter steam temperature in kelvin");
        Tsteam=obj.nextDouble();

        efficiency=1-(Tair/Tsteam);

        if(Tsteam<373){
            efficiency=0;
        }
        
        System.out.println("Efficiency of steam engine is:"+ efficiency);

     obj.close();   
    }
    
}
