
public class Overloading {

	public static void main(String[] args) {
		
	
		String retValue=getCapital("canada");
		System.out.println(retValue);
	}
		
		
		
		public static String getCapital(String countryName) {
			System.out.println("it will return capital based on country name");
			
			if (countryName.equalsIgnoreCase("India")) {
				return "New Delhi";
			}else if (countryName.equalsIgnoreCase("Canada")) {
				return "Ottawa";
			}
				else if (countryName.equalsIgnoreCase("Usa")) {
					return "Washington";
				}else {
					return "No capital found";
				}}}
				
				
					
					
				
				
			
				
			

			
				
			
		

	


