public class Child extends Parent{
	public String faveGames;

	public Child(String name, String gender, int age, String faveGames){
		super(name, gender, age);
		this.faveGames = faveGames;
	}

	public void checkStatus(){
		super.checkStatus();
		System.out.println("Favorite Game: " + faveGames);
	}

	public void drink(){
		System.out.println(" - drinking milk -");
	}
}