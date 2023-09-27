
import java.util.Scanner;
public class lastChanceGas {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int capacity,reading,mperg,total,miles;

        System.out.println("Enter tank capacity");
        capacity=obj.nextInt();

        System.out.println("Enter gas gauge in percent (full= 100, three quarters full = 75, and so on)");
        reading=obj.nextInt();

        System.out.println("Enter miles per gallon");
        mperg=obj.nextInt();

        System.out.println("Enter miles you have to cover");
        miles=obj.nextInt();

        total=((capacity*reading*mperg)/100);

        if(total<miles)
        {
            System.out.println("Get gas!!!!");
        }
        else{
            System.err.println("Safe to proceed!!!!");
        }

       obj.close();
    }
    
}
