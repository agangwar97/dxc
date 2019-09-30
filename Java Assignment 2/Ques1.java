package HR2;
import java.util.Scanner;

public class Ques1 {		
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	int choice = 0;
	public String toString() {
		return("\n"+ "\nProduct ID: "+getProductId()
		+"\nProduct Name: "+getProductName()
		+"\nQuantity On Hand: "+getQuantityOnHand()+"\nPrice: "+getPrice());
	}
	public Ques1() {	
		this.productId = 0000;
		this.productName = "Product Name";
		this.quantityOnHand = 00;
		this.price = 00;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		if(productId<0) {
			System.out.println("This field can not be negative!");
			System.exit(0);
		}
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		if(quantityOnHand<0) {
			System.out.println("This field can not be negative!");
			System.exit(0);
		}
		this.quantityOnHand = quantityOnHand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("This field can not be negative!");
			System.exit(0);
		}
		this.price = price;
	}
	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of products: ");
		int numOfProducts = sc.nextInt();
		Ques1 product[] = new Ques1[numOfProducts];
		for(int j = 0;j<numOfProducts;j++) {
			product[j] = new Ques1();
		}
		for(int j = 0 ;j<numOfProducts;j++) {
			System.out.println("Enter the Product "+(j+1)+" details below:");
			System.out.println("Enter the Product ID: ");
			product[j].setProductId(sc.nextInt());
			System.out.println("Enter the Product Name: ");
			product[j].setProductName(sc.next());
			System.out.println("Enter the quantity on hand: ");
			product[j].setQuantityOnHand(sc.nextInt());
			System.out.println("Enter the price: ");
			product[j].setPrice(sc.nextInt());
		}
		for(int j=0;j<numOfProducts;j++) {
			System.out.println(product[j]);
		}	
	}
}