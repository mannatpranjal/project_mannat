package javaProject1;

public class Operation {
	private Product[] prdct; 
	private int index;

	Operation(int size) {
		prdct = new Product[size];
	}

	public void addProduct(Product p) {
		prdct[index++] = p;

	}

	public void showAllProduct() {
		for (int i = 0; i < prdct.length; i++) {
			if (prdct[i] != null) {
				System.out.println("pid : " + prdct[i].getPid() + ", name : " + prdct[i].getPname() + ", company : "
						+ prdct[i].getCompanyName() + ", price : " + prdct[i].getPrice() + ", quantity : "
						+ prdct[i].getQuantity() + ", color : " + prdct[i].getColor());
			}
		}
	}

	public boolean delete(int pid) {
		boolean status = false;

		for (int i = 0; i < prdct.length; i++) {
			if (prdct[i] != null) {
				if (prdct[i].getPid() == pid) {
					prdct[i] = null;
					status = true;
				}
			}
		}
		return status;

	}

	public Product findProductByPid(int pid) {
		Product pd = null;
		for (int i = 0; i < prdct.length; i++) {
			if (prdct[i] != null) {
				if (prdct[i].getPid() == pid) {
					pd = prdct[i];
				}
			}
		}
		return pd;
	}

	public Product findProductByPname(String pname) {
		Product pd = null;
		for (int i = 0; i < prdct.length; i++) {
			if (prdct[i] != null) {
				if (prdct[i].getPname().equalsIgnoreCase(pname)) {
					pd = prdct[i];
				}
			}
		}
		return pd;
	}

}
