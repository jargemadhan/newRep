package stream;

public class Mobile {
	String brand;
	int price;
	String ram;
	String os;
	boolean isAndriod;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean isAndriod() {
		return isAndriod;
	}
	public void setAndriod(boolean isAndriod) {
		this.isAndriod = isAndriod;
	}
	public Mobile(String brand, int price, String ram, String os, boolean isAndriod) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.os = os;
		this.isAndriod = isAndriod;
	}
	@Override
	public String toString() {
		return "brand=" + brand + ", price=" + price + ", ram=" + ram + ", os=" + os + ", isAndriod="
				+ isAndriod;
	}
	

}
