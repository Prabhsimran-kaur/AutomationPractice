package InheritancewithCar;

public class TestingCar {//also make class final

	public static void main(String[] args) {
		
		BMW b= new BMW();//child
		b.start();
		b.refuel();
		b.stop();
		b.autoAirSuspension();
		b.engine();
		
		
		Car c= new Car();//parent
		c.start();
		c.refuel();
		c.stop();
		c.engine();
		
		Car c1= new BMW();//Top Casting
		
		//Child class object using reference of Parent Class.
		c1.start();
		c1.stop();
		c1.refuel();
		//Webdriver driver= new ChromeDriver();
		//parent=new child
		//Concept called Top Casting
		
		

	}

}
