//method name can be anything
//it will have return types
//to run non static method , we need to call method

public class Constructor {
	
	String name;
	char lastInit;
	int age;
	char gender;
	//Constructor creation
	//constructor name should be same as class name
	//it will not have return types.
	//we need to create reference to call constructor.

	public static void main(String[] args) {
		System.out.println("hello");
		Constructor cc= new Constructor("simran","test123");
		
	}
	//with arguments
	public Constructor(String username, String password) {
		System.out.println("constructor with arguments");
		System.out.println(username+"---"+password);


	/*public String methodName() {
		System.out.println("non static method");
		String name="simarn";
		return name;
	}*/
	}
}