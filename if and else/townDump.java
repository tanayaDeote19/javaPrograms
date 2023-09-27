/*The New Britain, Connecticut town dump charges you $20 to dispose of 200 pounds of trash. They charge $8 for each additional hundred pounds beyond the first 200. Write a program that asks for the weight of a load of trash and then calculates the charge. */

import java.util.Scanner;
public class townDump {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double weight,a;
        double charges=20;
        System.out.println("Enter the weight of load");
        weight=obj.nextDouble();
        if(weight==200){
            System.out.println("Charges are:"+ charges);
        }
        else if(weight>200){
            a=2-(10-(10-(weight/100)));
            charges=charges-8*a;
            System.out.println("Charges are:"+ charges);
        }
        else{
            System.out.println("No charges for this amount of weight");
        }
        
       obj.close();
    }
}

