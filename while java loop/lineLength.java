/*Write a program that asks the user to enter two words. The program then prints out both words on one line. The words will be separated by enought dots so that the total line length is 30:  */

import java.util.Scanner;
public class lineLength {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String a,b;
        int i=0;

        System.out.println("Enter a word");
        a=obj.next();

         System.out.println("Enter a word");
        b=obj.next();
        i=a.length()+b.length();
        System.out.print(a);
        while(i<30){
          System.err.print(".");   
          i++;
        }
        System.out.print(a);


    obj.close();
}
    
}
