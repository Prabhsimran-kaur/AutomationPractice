package Interface;
//We should not create an object for interface
public class TestingInterface {

	public static void main(String[] args) {
		
		AutomationTester at= new SeleniumTester();//TOP CASTING
		at.automationTool();
		at.defectReporting();
		at.manualTesting();
		at.deafultMethod();
		int sal=at.salary;
		System.out.println(sal);
		
		
		
		
		/*SeleniumTester st= new SeleniumTester();
		st.automationTool();
		st.defectReporting();
		st.manualTesting();
		st.wealthDomain();*/
		
		

	}

}
