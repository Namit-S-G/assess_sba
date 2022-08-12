package namit_assignment;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your NAME : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your AGE : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your COUNTRY : ");
		String country = sc.next();
		
		
		if(age >= 18 && name != null && country.equalsIgnoreCase("India")) {
			System.out.println("You are an ELIGIBLE VOTER.");
		}
		else {
			System.out.println("You are NOT ELIGIBLE VOTER.");
		}
		sc.close();
	}
}
