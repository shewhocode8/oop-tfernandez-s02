public class Character{
	public String name, dialog;
	public int hp, mp, lvl;

	// Create constructor - consider as object method
	public Character(String name, String dialog, int hp, int mp, int lvl){
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
	}

	public void introduce(){
		System.out.println("I am " + name);
	}

	public void sayDialog(){
		System.out.println(name + ":" + dialog);
	}

	// modified method add parameters
	public void talkTo(String firstName){
		System.out.println(name + ": Hello! " + firstName);
	}

	public void greetTo(Character x){
		System.out.println(name + ": Hello! " + x.name);
	}

	public String greet(Character x){
		return name + ": Hello! " + x.name;
	}
}