
public class OverlaodingPractical1 {

	public static void main(String[] args) {
		OverlaodingPractical1 op= new OverlaodingPractical1();
        op.searchDetails();
		op.searchDetails("selenium");
		
		op.searchDetails("selenium", 123);
	}
	public void searchDetails() {
		System.out.println("Clicked on search button");
	}
	public void searchDetails(String productName) {
		System.out.println("Entered product name:"+productName);
		System.out.println("Clicked on search button");

}
	public void searchDetails(String productName, int price) {
		System.out.println("Entered product name:"+productName);
		System.out.println("Enter price:"+price);	
	}}
		
