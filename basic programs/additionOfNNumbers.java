import java.util.Scanner;
public class additionOfNNumbers {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);

        int i=0,n,sum=0;

        System.out.println("Enter a number");
        n=obj.nextInt();

        while(i<=n){
            sum=sum+i;
            i++;
        }

        System.out.println("Sum is "+sum);
        
        obj.close();
    }
}
