import java.util.Scanner;
public class eligibleForVote {
 public static void main(String args[]){
    int age;

    Scanner obj= new Scanner(System.in);

    System.out.println("Enter your age");
    age=obj.nextInt();

    if(age>=18){
        System.out.println("You are Eligible for voting");
    }
    else{
        System.out.println("You are not Eligible for voting");
    }
    
    obj.close();
 }
}
