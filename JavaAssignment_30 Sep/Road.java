package HR;

public class Road {
	 
	public static void main(String[] args) {
		Truck o1=new Truck("Black",8,"CGS");
		o1.setPrice(400000);
		o1.setType("Commercial");
		System.out.println(o1);
		
		Car o2=new Car("Silver",4,"ZS2");
		o2.setPrice(700000);
		o2.setType("Sedan");
		System.out.println(o2);
		
		Bus o3=new Bus("Green",10,"Volvo");
		o3.setPrice(100000);
		o3.setType("Public");
		System.out.println(o3);
	}
	
}
