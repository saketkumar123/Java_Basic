/* Java Program Example - Add n Numbers */

import java.util.Scanner;

public class Add_N_Number {

	public static void main(String[] args) {
		int i,n,sum = 0,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many you want to enter to add them?");
		n = sc.nextInt();
		System.out.println("Enter "+n+" Numbers: ");
		for(i=0;i<n;i++){
			num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("Sum of all "+n+ " numbers is: "+sum);
	}

}
