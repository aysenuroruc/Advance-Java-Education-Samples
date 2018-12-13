package tr.com.netas.collections.generics;

public class BasicEmployee {

	private int workDays;
	private int experience;
	
	
	public BasicEmployee(int workDays, int experience) {
		super();
		this.workDays = workDays;
		this.experience = experience;
	}


	public double salary()
	{
		double salary = workDays * 400;
		salary += experience * 500;
		return salary;
	}


	public int getWorkDays() {
		return workDays;
	}


	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	

}
