/*You have been asked to write a program for the Sam and Ella Delicatessen. The program takes daily orders from the Internet. It asks for the item, its price in cents, and if express delivery is wanted. The program writes out the order and the charges. Regular delivery for items under $10 is $2.00; for items $10 or more delivery is free. For express delivery add $3.00. */

import java.util.Scanner;

public class internetDelicatessen {
	public static void main(String args[]) {
		String item;
		double price,total;
		int value,delivery=0;

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter item name:");
		item=obj.nextLine();

		System.out.println("Enter the price");
		price=obj.nextDouble();

		System.out.println("Do you want Overnight Delivery (1 for yes and 0 for no)");
		value=obj.nextInt();

		if(price<10) {
			delivery+=2;
		}
		if(value==1) {
			delivery+=3;
		}

		total=delivery+price;

		System.out.println(item+" "+price);
		System.out.println("Delivery "+delivery);
		System.out.println("Total "+total);
		
		obj.close();
	}

}
