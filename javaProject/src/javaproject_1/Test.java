package javaproject_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Product...");
		int size = sc.nextInt();
		Operation opt = new Operation(size);

		System.out.println("Enter product details...");

		for (int i = 0; i < size; i++) {
			Product p1 = new Product(i, null, null, i, i, null);
			System.out.println("Enter " + (i + 1) + " product name");
			String pname = sc.next();
			System.out.println("Enter " + (i + 1) + " product company");
			String pcompany = sc.next();
			System.out.println("Enter " + (i + 1) + " product price");
			double price = sc.nextDouble();
			System.out.println("Enter " + (i + 1) + " product quantity");
			int quantity = sc.nextInt();
			System.out.println("Enter " + (i + 1) + " product color");
			String color = sc.next();
			p1.setPname(pname);
			p1.setCompanyName(pcompany);
			p1.setPrice(price);
			p1.setQuantity(quantity);
			p1.setColor(color);
			opt.addProduct(p1);

		}
		String text = "";
		Product pdt = null;

		do {

			System.out.println("press 1 for find product by pid...");
			System.out.println("press 2 for find product by pname...");
			System.out.println("press 3 for show all product...");
			System.out.println("press 4 for delete a product...");
			System.out.println("Enter choice :-... ");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter pid no. to find product...");
				pdt = opt.findProductByPid(sc.nextInt());
				if (pdt != null) {
					System.out.println("pid : " + pdt.getPid() + ", Name : " + pdt.getPname() + ", company : "
							+ pdt.getCompanyName() + ", price : " + pdt.getPrice() + ", quantity : " + pdt.getQuantity()
							+ ", color : " + pdt.getColor());

				} else {
					System.out.println("this pid not exists...");
				}
				break;
			case 2:
				System.out.println("Enter pname to find product...");
				pdt = opt.findProductByPname(sc.next());
				if (pdt != null) {
					System.out.println("pid : " + pdt.getPid() + ", Name : " + pdt.getPname() + ", company : "
							+ pdt.getCompanyName() + ", price : " + pdt.getPrice() + ", quantity : " + pdt.getQuantity()
							+ ", color : " + pdt.getColor());

				} else {
					System.out.println("this pname not exists...");
				}
				break;
			case 3:
				opt.showAllProduct();
				break;
			case 4:
				System.out.println("Enter pid to delete product...");
				if (opt.delete(sc.nextInt())) {
					System.out.println("deleted successfully...");
				} else {
					System.out.println("this pid is not exists...");
				}
				break;

			default:
				System.out.println("wrong choice....");
			}
			System.out.println("Do u want to continue ? y/n");
			text = sc.next();

		} while (text.equalsIgnoreCase("y"));
		System.out.println("Thank you.");
		sc.close();

	}

}
