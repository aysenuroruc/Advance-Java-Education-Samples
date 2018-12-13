package tr.com.netas.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		BasicEmployee be = new BasicEmployee(22,5);	
		System.out.println( be.salary());
		Manager mn = new Manager(10, 10, "461382");		
		System.out.println(mn.salary());
	
		BasicEmployee be2 = new Manager(12, 9, "HR");
		be2.salary(); // Polymorphism
			
		BordroPrinter bp = new BordroPrinter();
		
		bp.print(be);
		bp.print(be2);
		bp.print(mn);
		
		
		
		PartTimeEmployee pt = new PartTimeEmployee(22, 1);
		
		bp.print(pt);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
