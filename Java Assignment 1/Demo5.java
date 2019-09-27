package HR2;

import java.util.Scanner;

public class Demo5{
	Scanner sc=new Scanner(System.in);
	char character;
	public void display() {
		System.out.println("Please enter a character : ");
		character=sc.next().charAt(0);
		if(character=='A' || character=='a' || character=='E' || character=='e' || 
				character=='I' || character=='i' || character=='O' || character=='o' || 
				character=='U' || character=='u' )
		{
			System.out.println("Character is a vowel");
		}
		else {
			System.out.println("Character is not a vowel");
		}
	}
	public static void main(String args[]) {
		Demo5 ob1=new Demo5();
		ob1.display();
	}
}