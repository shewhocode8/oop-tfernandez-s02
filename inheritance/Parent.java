/*
	Inheritance(minamana)
		- a technique used to inherit attributes and methods from class to another
	superclass(parent)
		- the class where we will inherit attributes and methods
	subclass(child)
		- the class who will inherit attributes and methods from a superclass
	extends
		- used after the class name indicates that a certain class will inherit from another class
		syntax:
			modifiers class subClassName extends superClassName{
				//attributes or methods
			}

*/
public class Parent{
	public String name, gender;
	public int age;

	// create implicit constructor
	public Parent(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// create object method
	public void checkStatus(){
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Age : " + age);
	}
}