

public class MachineTester {

	public static void main(String[] args){
		
		FaxMachine fax1 = new FaxMachine("FaxMachine1", "(555)666-7777");
		FaxMachine fax2 = new FaxMachine("FaxMachine2", "(888)999-1111");
		Printer print1 = new Printer("Printer1", false);
		Printer print2 = new Printer("Printer2", true);
		
		System.out.println(fax1.getName());
		System.out.println("Expected: FaxMachine1");
		System.out.println(fax1.getFaxNum());
		System.out.println("Expected: (555)666-7777");
		
		System.out.println(fax2.getName());
		System.out.println("Expected: FaxMachine2");
		System.out.println(fax2.getFaxNum());
		System.out.println("Expected: (888)999-1111");

		System.out.println(print1.getName());
		System.out.println("Expected: Printer1");
		System.out.println(print1.getIsColor());
		System.out.println("Expected: false");
		
		System.out.println(print2.getName());
		System.out.println("Expected: Printer2");
		System.out.println(print2.getIsColor());
		System.out.println("Expected: true");
	}
}
