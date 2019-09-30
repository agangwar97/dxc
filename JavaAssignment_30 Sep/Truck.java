package HR;

public class Truck extends Vehicle {
		public int price;
		public String type;

		public Truck(String color, int noOfWheels, String model) {
			super(color, noOfWheels, model);
		}
		public Truck(String color, int noOfWheels, String model, int price, String type) {
			super(color, noOfWheels, model);
			this.price = price;
			this.type = type;
		}
	
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public String toString() {
			return "Truck [price=" + price + ", type=" + type + ", getColor()=" + getColor() + ", getNoOfWheels()="
					+ getNoOfWheels() + ", getModel()=" + getModel() + "]";
		}
	
}
