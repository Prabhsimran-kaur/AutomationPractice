
public class LoopingStatements {
	//lines of code increasing
	//program does not look good
	//same statement need to be executed multiple times, 
//we need to use loops
	//for, while, Do While
	//infinite loop/storage of memory loop-pitfalls loop
	//WHILE LOOP
	//if value is not incremented it will land into infinite loop
	//condition is checked at beginning itself
	//if condition did not match, it will not enter inside loop even once
	//DO WHILE LOOP
	//if value is not incremented it will land into infinite loop
	//condition is checked at once
	//if condition did not match, it will  enter inside loop atleast once
	public static void main(String[] args) 
	{
		int i=10;
		while (i<3) {
			System.out.println("heloo");
			i++;
		}
			
	
		/*int i=10;
		do {
			System.out.println("6789");
			i++;
		} while (i<3);*/
		
		
		/*for (int i = 0; i < 4; i++) {
			System.out.println(i+ "-->hello");*/
			
		//Interview question
		/*for (; ; ) {
			System.out.println("heloo");
			//Output=infinite loop
			//
		//for (int i = 0; i < 3; ) {
			
		}*/
	}}
	
			
		

	


