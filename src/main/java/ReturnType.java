
public class ReturnType {

	public static void main(String[] args) {
		//System.out.println( displayAddress());
		System.out.println(getCurrencyName("UK"));
	/*	int retVal=addition(10,20);
		//System.out.println(retVal);*/
		
		//System.out.println(addition(10,20));

	}
	public static String getCurrencyName(String countryName) {
		System.out.println("inside getCurrencyName method");
		if (countryName.equals("India")) {
			return"INR";
			} else if  (countryName.equals("canada")) {
			return"Dollar";
			}
		else if(countryName.equals("UK")) {
			return "Pound";
		}else {
			return "No currency found";
		}
	
	
}
	public static int addition(int no1, int no2) {
		int result=no1+no2;
		return result;
		
	}
	
	public static String displayAddress() {
		String username="naresh";
		String emailId="nihal@gmail.com";
		return emailId;
		
	}

}
