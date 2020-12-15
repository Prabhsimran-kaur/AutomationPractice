package InheritancewithCar;

//method overriding
//polmorphism
//cannot override static methods 
//override only static methods.
//cannot override final method.

public class BMW extends Car {//child
	
	
	@Override
	public void start() {
		System.out.println("BMW-->Start--->Start Using KEyless");
		
	}
	
	public void autoAirSuspension() {
		System.out.println("BMW-->Auto Air Suspension");
	}
	@Override
		public  void stop() {
			System.out.println("BMW-->Stop car");
		}
	}


