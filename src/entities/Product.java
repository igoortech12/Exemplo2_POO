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
		 							� NO ATRIBUTO DA CLASSE 'public int quantity' */
		}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
