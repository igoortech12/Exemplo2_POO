package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; 	/* 'this' EXPLICITA QUE O ACESSO
		 							É NO ATRIBUTO DA CLASSE 'public int quantity' */
		}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price) // price
				+ ", "
				+ quantity
				+ " units, Total; $ "
				+ String.format("%.2f", totalValueInStock()); //totalValueInStock()
	}
}
