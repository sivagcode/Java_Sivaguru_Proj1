package automobile;

public abstract class AbstractCars {
	
	private int privateSpeed;
	public int publicSpeed;
	
	protected int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public AbstractCars () {
		this(0);
	}
	
	public AbstractCars (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}
	
	public abstract void engineStart(String keyType, int numOfCyl);
	
	public static void main(String[] args) {
		AbstractCars engstrt = new AbstractDemoBMW();
		engstrt.engineStart("auto", 2);
		
		AbstractCars ptsped = new AbstractDemoBMW();
		ptsped.setPrivateSpeed(0);
		System.out.println(ptsped.privateSpeed);
		
	}
	}

