import java.util.Scanner;
public class areaOfCircle {
    public static void main(String args[]){

        float area, r;

        Scanner obj=new Scanner(System.in);

        System.out.println("Enter radius");
        r=obj.nextFloat();
        area=3.14f*r*r;
        
        System.out.println("Area is: "+area);
        obj.close();
    }
}

