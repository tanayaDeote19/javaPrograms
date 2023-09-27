 import java.util.Scanner;
 public class sumOfTwoNo {
	public static void main(String args[]) {
     int a,b,sum=0;

     Scanner obj= new Scanner(System.in);

     System.out.println("Enter two numbers");
     a=obj.nextInt();
     b=obj.nextInt();

     sum=a+b;

     System.out.println("Sum is "+sum);
     
     obj.close();
	}
     
}

