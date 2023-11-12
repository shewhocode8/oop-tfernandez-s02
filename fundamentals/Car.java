public class Car{
	// fields
	public String make;
	public String color;
	public int year;

	// methods
	public void start(){
		System.out.println("The car is started.");
	}

	public void stop(){
		System.out.println("The car has stopped.");
	}


	// class instantiation - the process of creating an object using a class
	/*
		syntax:
			className identifier = new className();

		new keyword it allocates memory for the new objects and calls constructor

		Constructor syntax:
		modifier className class{
			className{
				//construcor
			}
		}
	*/
	public static void main(String[] args){
		Car sportsCar = new Car();
		sportsCar.make = "Ferrari";
		sportsCar.color = "red";
		sportsCar.year = 2020;

		System.out.println(sportsCar.make);
		System.out.println(sportsCar.color);

		sportsCar.start();
	}

}