public class Main {
	public static void main(String[] args){
		Parent parent = new Parent("Juan", "Male", 24);
		Child child = new Child("Jin", "Male", 4, "Dota");

		System.out.println("--- Parent's Status ---");
		parent.checkStatus();

		System.out.println("--- Child's Status ---");
		child.checkStatus();

		child.drink();
		// parent.drink();
	}
}