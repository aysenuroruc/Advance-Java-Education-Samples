package tr.com.netas.polymorphism;

public class PartTimeEmployee extends BasicEmployee{

	public PartTimeEmployee(int workDays, int experience) {
		super(workDays, experience);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double salary() {
		double salary = this.getWorkDays() * 300;
		return salary;
	}

}
