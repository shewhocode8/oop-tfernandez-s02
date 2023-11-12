import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//Product prod = new Product("headlights", 350.0f);
		//Product prod2 = new Product("clutch", 2500.0f);

		/*Scanner scanner = new Scanner(System.in);

		System.out.println("Car brand: ");
		String productName = scanner.nextLine();

		System.out.println("Car price: ");
		Double price = scanner.nextDouble();*/

		Character hero1 = new Character("AnpanMan", "I can be your hero!", 1000, 512, 100);
		Character hero2 = new Character("Saitama", "Omni-serious Hi!", 500, 100, 50);
		System.out.println(hero1.dialog);
		hero1.sayDialog();
		hero1.introduce();
		hero2.introduce();
		hero1.sayDialog();
		hero2.sayDialog();
		hero2.talkTo("Thonie");
		hero1.greetTo(hero2);

		// return type
		System.out.println(hero2.greet(hero1));

	}
}