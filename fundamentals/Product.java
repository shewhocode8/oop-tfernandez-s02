// constructor
public class Product{
	//Constructor of the product class

	//global variable
	public String productName;
	public double price;

	public Product(String productName, double price){
		// this keyword refers to the class itself
		// this keyword will enables us to access global variables inside the class if you have the same variable names in a parameter
		this.productName = productName;
		this.price = price;

		System.out.print(productName + " product created.");
		System.out.println("PHP " + price);
	} 
}