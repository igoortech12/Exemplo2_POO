package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product(); // VARIÁVEL DO TIPO 'Product'
		System.out.println("Enter product data: ");
		System.out.print("Name ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println("\nProduct data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("\nUpdated data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("\nUpdated data: " + product.toString());
		
		
		sc.close();
	}

}
