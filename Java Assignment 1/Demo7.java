package HR2;

import java.util.Scanner;

public class Demo7{
	Scanner sc=new Scanner(System.in);
	int leapYear;
	public void display() {
		System.out.println("Please enter the year : ");
		leapYear=sc.nextInt();
        if(leapYear%4==0)
        {
        	if(leapYear%100==0)
        	{
        			if(leapYear%400==0)
        						System.out.println(leapYear+" is a leap year");
        			else 
        						System.out.println(leapYear+" is not a leap year");
        	}
        	else
        	  		System.out.println(leapYear+" is a leap year");
        }
        	else
            		System.out.println(leapYear+" is not a leap year"); 
	}
	public static void main(String args[]) {
		Demo7 ob1=new Demo7();
		ob1.display();
	}
}