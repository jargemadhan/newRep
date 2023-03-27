package stream;

public class Watch {
	String brand;
	String color;
	int price;
	boolean isAnalog;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAnalog() {
		return isAnalog;
	}
	public void setAnalog(boolean isAnalog) {
		this.isAnalog = isAnalog;
	}
	public Watch(String brand, String color, int price, boolean isAnalog) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.isAnalog = isAnalog;
	}

	public String toString() {
		return "brand=" + brand + ", color=" + color + ", price=" + price + ", isAnalog=" + isAnalog;
	}
	

}
