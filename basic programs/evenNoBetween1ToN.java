import java.util.Scanner;
public class evenNoBetween1ToN {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        int i=1,n;

        System.out.println("Enter a number");
        n=obj.nextInt();

        System.out.println("Even numbers are: ");

        while(i<=n){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
        
        obj.close();

    }
}
