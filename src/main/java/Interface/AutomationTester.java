package Interface;
//100% Abstraction--> only method declaration/method prototype
public interface AutomationTester {
	//interface always overridden it should not be static.
	//interface variables should be final or static
	final int salary=1000;
	
	public void manualTesting();
	public void automationTool();
	public void defectReporting();
	//JDL1.8 CAN ACCESS DEFAULT METHOD
	default void deafultMethod() {
		System.out.println("Default Method");
	}
	//JDLK1.8 CANNOT ACCESS STATIC METHOD
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}
