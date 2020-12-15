import java.util.ArrayList;

public class Return {

	public static void main(String[] args) {
		
		 ArrayList<String>al=getItemsFromRest("Indian Rest");
		//System.out.println("Size is:"+al.size());
		 //for loop
		 for (int i = 0; i < al.size(); i++) {
			 System.out.println(al.get(i));
			
		}}

	
	
	public static ArrayList<String> getItemsFromRest(String restName) {
	
	ArrayList<String>ar=new ArrayList<String>();
	if (restName.equals("Mandonalds")) {
		ar.add("Burger");
		ar.add("Nugets");
		ar.add("French Fries");
		
	
		
	} else if (restName.equals("India rest")){
		ar.add("naan");
		ar.add("biryani");
		ar.add("butter");
		
	}
	return ar;

	}}


