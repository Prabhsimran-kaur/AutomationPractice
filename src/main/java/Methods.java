//methods should be on class level
public class Methods {
	//define methods

	public static void main(String[] args) {
		// Do not define methods here. only call methods here.
		addition(10,5);
		addition(20,10);
		addition(50,50);
		

	}
	//define methods
	//methods without arguments
	/*public static void addition() {
		int no1=10, no2=5;
		int result=no1+no2;
		System.out.println("Addition of 2 numbers is:"+result);
		
	}*/
	
	//With arguments
	public static void addition(int no1, int no2) {
		int result=no1+ no2;
		System.out.println(result);
	}

}
