import java.util.Scanner;

/* Java Program Example - Interchange Two Numbers */

public class Interchange_Two_Numbers {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number: ");
		a = sc.nextInt();
		System.out.print("Enter the Second number: ");
		b = sc.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("Number Interchanged..");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}

}
