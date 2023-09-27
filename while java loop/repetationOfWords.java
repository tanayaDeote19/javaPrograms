/*Write a program that asks the user to enter a word. The program will then repeat word for as many times as it has characters:  
*/
import java.util.Scanner;
public class repetationOfWords {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String str;
        int i=0;
        System.out.println("Enter a word");
        str=obj.next();

        while(i<str.length()){
            System.out.println(str);
            i++;
        }

    obj.close();
}
    
}
