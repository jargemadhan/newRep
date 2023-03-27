package stream;

public class Pencil {
	String brand;
	boolean isLeadType;
	int price;
	String color;
	float loadSize;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean getIsLeadType() {
		return isLeadType;
	}
	public void setIsLeadType(boolean isLeadType) {
		this.isLeadType = isLeadType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getLoadSize() {
		return loadSize;
	}
	public void setLoadSize(float loadSize) {
		this.loadSize = loadSize;
	}
	public Pencil(String brand,boolean isLeadType, int price, String color, float loadSize) {
		super();
		this.brand=brand;
		this.isLeadType = isLeadType;
		this.price = price;
		this.color = color;
		this.loadSize = loadSize;
	}

	public String toString() {
		return "brand="+brand+", isLeadType=" + isLeadType + ", price=" + price + ", color=" + color + ", loadSize=" + loadSize;
	}
	

}
