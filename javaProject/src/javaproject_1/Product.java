package javaproject_1;

public class Product {
	private int pid;
	private String pname;
	private String companyName;
	private double price;
	private int quantity;
	private String color;

	public Product(int pid, String pname, String companyName, double price, int quantity, String color) {

		this.pid = pid;
		this.pname = pname;
		this.companyName = companyName;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
