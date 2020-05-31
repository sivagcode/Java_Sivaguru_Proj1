package oopconcepts;

public class ClassDemoTwo {

	public static void main(String[] args) {
		CarThree bmw = new CarThree(); // Create and initialize the object
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());
		
		CarThree benz = new CarThree();
		benz.setMake("Benz");
		System.out.println(benz.getMake());
		
		benz.setModel("c300");
		System.out.println(benz.getModel());
		
		benz.setYear(2020);
		System.out.println(benz.getYear());
	}
}