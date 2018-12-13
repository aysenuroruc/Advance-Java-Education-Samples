package tr.com.netas.polymorphism;

public class Manager extends BasicEmployee{
	
	private String dept;

	public Manager(int workDays, int experience, String dept) {
		super(workDays, experience);
		this.dept = dept;
	}

	
	@Override
	public double salary() {
		double salary = this.getWorkDays() * 400;
		salary += this.getExperience() * 1000;
		return salary;
	}
}
