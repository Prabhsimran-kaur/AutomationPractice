//error occurs it will display an exception
//it will  not proceed further from line of code where exception occurs
//Try and Catch ---> to handle exception and continue further we will use try and catch block
public class Exceptions {

	public static void main(String[] args) {

		
		try {
			System.out.println(10/0);
		
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception details is:"+e1);
		
	
}}}


