
public class ConstructorConcept {
	String carName;//class variables
	int model;
	String clor;
	boolean gearSystem;
	
	public ConstructorConcept(String carName) {
		System.out.println(carName);
	}
		public ConstructorConcept() {
			System.out.println("Without arguments");
		}
		
		
	public ConstructorConcept(String carName, int model, String clor, boolean gearSystem) {
			
			this.carName = carName;//this is used to access class variables
			this.model = model;
			this.clor = clor;
			this.gearSystem = gearSystem;
		}
	public static void main(String[] args) {
		ConstructorConcept c1=new ConstructorConcept();
		ConstructorConcept c2=new ConstructorConcept("CRV");

		ConstructorConcept c3=new ConstructorConcept("Civic",2020,"black",true);
		ConstructorConcept c4=new ConstructorConcept("bmw",2010,"black",true);
		ConstructorConcept c5=new ConstructorConcept("elantra",2022,"white",false);
		
		System.out.println(c3.carName+"--"+c3.model);
		System.out.println(c4.carName+"---"+c4.model);
		System.out.println(c5.carName+"==="+c5.model);
		
		
		
		}

	}
	


