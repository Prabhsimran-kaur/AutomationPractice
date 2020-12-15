//we cannot have same method names and same number of arguments
//
//Method name same, datatype same, but number of arguments different
//Method name same, datatype different, but number of arguments same
//
public class MethodOverloading {

	public static void main(String[] args) {
	login(12345);
			

	}
	public static void login(int otp) {
		System.out.println("one argument");
	}
	public static void logi(String username) {
		System.out.println("one argument but different datatype");
	}
	public static void login(String username, String password) {
		System.out.println("String with different combinations");
	}
	public static void login(int accountNum, String password) {
		System.out.println("one is int and other is String ");
	}
	

}
