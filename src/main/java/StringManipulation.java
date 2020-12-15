
public class StringManipulation {

	public static void main(String[] args) {
		
		//Split
		/*String s9="simran;sidhu;5147153786";
		String splitvals[]=s9.split(";");
		System.out.println(splitvals[0]);
		System.out.println(splitvals[1]);
		System.out.println(splitvals[2]);
		System.out.println(splitvals[3]);*/
		
		String dob="31=03-1991";
		String splitVal[]=dob.split("-");
		System.out.println(splitVal[2]+"/"+splitVal[1]+"/"+"/"+splitVal[0]);}
		
		
		
		//0-->date
		
		//String s1="Learning java is fun";
		//String s1="naa";
		
		//To find index of string
		//System.out.println(s1.indexOf("J"));
		//System.out.println(s1.indexOf("Lea"));
		//System.out.println(s1.indexOf("simran"));
		//value available at position 19
		/*System.out.println(s1.charAt(19));
		//System.out.println(s1.charAt(25));
		System.out.println(s1.indexOf("a",s1.indexOf("a")+1));
		
//length of string
		System.out.println("Length of String is:"+s1.length());
		if (s1.length()>=25) {
			System.out.println("pass");
			
		} else {
			System.out.println("fail");
			
			//Trim 
			String name1="     simran sidhu      ";
			System.out.println("Value is:"+name1);
			String trimedName=name1.trim();
			System.out.println("trimmed value is:"+trimedName);
		    String name2="Simran Sidhu";
		    if (name1.equalsIgnoreCase(name2)) {
		    	System.out.println("values are not matching");
				
			} else {
			System.out.println("values are not matching");

			}
		    //Replace Method
		    //String name= "     Simran Sidhu  G ";
		    //System.out.println(name.trim().replace(" ", ""));
		   // System.out.println(name.trim().replace(" ", ","));
		    
		    String dob="31-03-1991";
		    System.out.println(dob.replace("-", " /"));
		    
		    //UCase and LCase
		    String s3= "We are learning String Manipulation functions";
		    System.out.println(s3.toUpperCase());
		    System.out.println(s3.toLowerCase());
		    
		    //Substring
	String confMessage=	"Successfully booked - test9988";
	String subStr=confMessage.substring(0,19 );//sim
	if (confMessage.contains(subStr)) 
	{
		System.out.println("ticket booked successfully");
		
	} else {
		System.out.println("did not booked ticket");

	}
		    
    String s4="We are learning String Manipulation functions";
		    String s5="are";
		    //System.out.println(s4.substring(3));
		    System.out.println(s4.substring(7, 15));*/
		    
		    
		    

		}
		
		
	


