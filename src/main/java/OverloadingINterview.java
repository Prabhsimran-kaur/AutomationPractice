//can we overlaod main method
//yes
//can we overlaod static method=yes
//can we call one main in other main
public class OverloadingINterview {

	public static void main(String[] args) {
		main(19);

	}
	public static void main(int no) {
		System.out.println(no);
		main("sim");
	}
	public static void main(String name) {
		System.out.println(name);
	}
	

}
