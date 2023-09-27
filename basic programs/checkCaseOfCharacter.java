import java.util.Scanner;
public class checkCaseOfCharacter {
    public static void main(String args[])
    {
        char a;
        int x;

        Scanner obj=new Scanner(System.in);

        System.out.println("Enter a character");
        a=obj.next().charAt(0);

        x=a;

        if(x>=65 && x<=90)
        {
            System.out.println("It is a capital letter");
        }
        else if(x>=97 && x<=122){
            System.out.println("It is a small letter");
        }
        else if(x>=48 && x<=57)
        {
            System.out.println("It is a digit");
        }
        else{
            System.out.println("I don't know this character");
        }
        
        obj.close();
        
    }
}
