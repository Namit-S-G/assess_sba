package q4_p2;

import java.util.Scanner;

import q4_p1.Q4;
import q4_p1.Q6;

public class Q7 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Q4 obj1=new Q4();
		Q6 obj2=new Q6();
		
		System.out.println("enter no 1");
		int a=sc.nextInt();
		
		System.out.println("enter no 2");
		obj1.y=sc.nextInt();
		obj2.add(a,obj1.y);    
		obj1.setx(a);       
		obj1.printxy();
		sc.close();
	}
}
