package HR2;

import java.util.Scanner;

public class Demo6{
	Scanner sc=new Scanner(System.in);
	int number1;
	int number2;
	public void display() {
		System.out.println("Please enter first number : ");
		number1=sc.nextInt();
		System.out.println("Please enter second number : ");
		number2=sc.nextInt();
		System.out.println("First number is: "+number1);
		System.out.println("Second number is: "+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After swapping:");
		System.out.println("First number is: "+number1);
		System.out.println("Second number is: "+number2);
	}
	public static void main(String args[]) {
		Demo6 ob1=new Demo6();
		ob1.display();
	}
}