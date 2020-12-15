//NonStatic things cannot be used inside static things
//To access non static variables into main , we have to do through object reference 
//global variables/instances are always defined on Class level
public class ClassesObjects {
	//Non Static variables
	String name;
	int makeYear;
	boolean available;
	double milage;
	
	//static int wheels;
	//static int noOfSteerings;
	//new ClassesObjects().name="Civic";

	public static void main(String[] args) {
                 //ObjectRef
		ClassesObjects    car1= new ClassesObjects();
	    car1.name="Elantra";
	    car1.available=true;
	    car1.makeYear=2018;
	    car1.milage=10.1;
	     
	     
	     
	    ClassesObjects    car2 =new ClassesObjects();
	    car2.name="jaquar";
	    car2.available=true;
	    car2.makeYear=2010;
	    car2.milage=10.1;
	     
	    
	    ClassesObjects    car3= new ClassesObjects();
	    car3.name="civic";
	    car3.available=true;
	    car3.makeYear=2011;
	    car3.milage=10.1;
	    
	    car1=car2;
	    car2=car3;
	    car3=car1;
	    
	    System.out.println(car3.name+"--------+car3.makeYear");
	    System.out.println(car2.name+"--------+car2.makeYear");
	    System.out.println(car1.name+"--------+car1.makeYear");
	    
	    
	     
		
	}

}
