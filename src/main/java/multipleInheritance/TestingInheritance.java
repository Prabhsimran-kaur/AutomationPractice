package multipleInheritance;

public class TestingInheritance {

	public static void main(String[] args) {
		Son son=new Son();
		son.snooring();
		son.smoking();
		
		Parent parent=new Parent();
		parent.boozing();
		parent.snooring();
	}

}
