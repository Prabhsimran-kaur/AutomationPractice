package InheritancewithCar;
//Method overriding---having same methods names in 2 different calsses but implemenation different
public class Car extends Vehicle{//parent
	
	public void start() {
		System.out.println("Car-->Start");
	}
		public void stop() {
			System.out.println("Car-->stop");
		}	
	    public void refuel() {
	    	System.out.println("Car-->refuel");
	    }
		
		
	}


