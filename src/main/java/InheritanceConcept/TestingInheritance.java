package InheritanceConcept;

public class TestingInheritance {

	public static void main(String[] args) {
		//1.Sceranio:
		//Jogging,Running//child can have both properties.
		Child child=new Child();
		child.jogging();
		child.running();
		child.walking();
		
		
		//2 Scenario
		//Jogging//Father has this properties.
		//Child is born after father so it is parent first then child
		Father father= new Father();
		father.jogging();
		father.walking();
		
		//3 Scenario
		
		Grandfather gf= new Grandfather() ;//Multilevel inheritance
		gf.walking();
			
		}
		

	}


