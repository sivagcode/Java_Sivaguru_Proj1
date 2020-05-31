package oopconcepts;
public class ConstructorDemo {

	public static void main(String[] args) {
		
		CarFive c1 = new CarFive();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("*********************");
		
		CarFive c2 = new CarFive(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}