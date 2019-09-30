package HR2;
import java.util.Scanner;

public class Ques2 {
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	
	public String toString() {
		return ("\nProduct ID: "+productId+"\nProduct Name: "+productName+"\nQuantity On Hand: "+quantityOnHand+"\nPrice: "+price);
	}
	public Ques2() {		
		this.productId = 0;
		this.productName = "NA";
		this.quantityOnHand = 0;
		this.price = 0;
	}
	public Ques2(int productId, String productName, int quantityOnHand, int price) {
		this();	
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int retrieve=0;	
		Ques2 product1 = new Ques2(101,"Alienware",2,200000);
		Ques2 product2 = new Ques2(102,"BoseHeadphones",3,25000);
		Ques2 product3 = new Ques2(103,"Fitbit",4,15000);
		Ques2 product4 = new Ques2(104,"XboxOne",1,35000);
		Ques2 product5 = new Ques2(105,"PS4",5,30000);
		System.out.println("Enter the Product ID: ");
		retrieve = sc.nextInt();
		
		switch(retrieve){
		case 101:
			System.out.println(product1);
			break;
			
		case 102:
			System.out.println(product2);
			break;
		
		case 103:
			System.out.println(product3);
			break;
			
		case 104:
			System.out.println(product4);
			break;
			
		case 105:
			System.out.println(product5);
			break;
			
		default:
			System.out.println("The product with Product ID: "+retrieve+" doesn't exist.");
			System.exit(0);
		}
	}
}