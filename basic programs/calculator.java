import java.util.Scanner;
public class calculator {
    public static void main(String args[]){

        Scanner obj= new Scanner(System.in);

        String choice;
        int a,b,c;

        System.out.println("Enter two numbers");
        a=obj.nextInt();
        b=obj.nextInt();

        System.out.println("Enter a choice betweem(+,-,*,/)");
        choice=obj.next();
        
        switch(choice){
            case "+":
            c=a+b;
            System.out.println("Addition is "+ c);
            break;
            case "-":
            c=a-b;
            System.out.println("Subtraction is "+ c);
            break;
            case "/":
            c=a*b;
            System.out.println("Multiplication is "+ c);
            break;
            case "*":
            c=a/b;
            System.out.println("Division is "+ c);
            break;
            default:
            System.out.println("Enter a valid choice");
        }

        obj.close();
    }
    
}
