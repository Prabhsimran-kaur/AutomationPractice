
public class Static001 {

	public static void main(String[] args) {
	//Directly
	addition();	
	//Through Classname;
	Static001.addition();
	

	}
	public static void addition() {
		System.out.println("Static Method");
	}
	
	public static void multiplication() {
		System.out.println("Non Static Method");
		
	}
 
}
