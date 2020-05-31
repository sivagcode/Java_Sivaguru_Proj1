package automobile;

//This class is called as Concrete class
public class AbstractDemoBMW extends AbstractCars {
	
	public void setPrivateSpeed(int speed) {
		super.setPrivateSpeed(30);
	}	

	@Override
	public void engineStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engine start");
		System.out.println("Every child class may have different implementation");
	}
}
