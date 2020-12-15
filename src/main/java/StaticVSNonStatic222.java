//static methods can be called inside other  non static methods directly.
//static methods can be called inside other static methods directly.

//Non static methods can be called inside static methods using object reference.
//Non static methods can be called inside non static methods directly.
public class StaticVSNonStatic222 {

	public static void main(String[] args) {
		addition();
		StaticVSNonStatic222 sa=new StaticVSNonStatic222();
		sa.multiplication();
		sa.cancelOrder();
	}
	
	public static void addition() {
		System.out.println("static method");
	}
     public void multiplication() {//non static
	System.out.println("non static method");
	division();
	cancelOrder();
}
     
     public static void division() {//static 
    	 System.out.println("non static method");
     }
     
     public void cancelOrder() {//non static
    	 
     }
}
