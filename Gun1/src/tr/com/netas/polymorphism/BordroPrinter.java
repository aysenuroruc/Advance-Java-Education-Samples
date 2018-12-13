package tr.com.netas.polymorphism;

public class BordroPrinter {

	
	public void print(BasicEmployee employee)
	{
		System.out.println("Employee Type : "+employee.getClass().getSimpleName());
		System.out.println("Salary : " +employee.salary());
		System.out.println(" -----------------------------------------------");
		System.out.println();System.out.println();
	}
	

}
