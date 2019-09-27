package HR2;

import java.util.Scanner;

public class Demo3{
	Scanner sc=new Scanner(System.in);
	int number1;
	int number2;
	public void display() {
		System.out.println("Please enter first number : ");
		number1=sc.nextInt();
		System.out.println("Please enter second number : ");
		number2=sc.nextInt();
		if(number1>=0 && number2>=0) {
		System.out.println("Result is : "+(number1+number2));
	}
		else {
			System.out.println("Cannot add negative numbers");
		}
	}
	public static void main(String args[]) {
		Demo3 ob1=new Demo3();
		ob1.display();
	}
}