package tr.com.netas.collections.queues;

public class MyString implements Comparable<MyString>{
	
	private int priority;
	private String str;
	
	
	
	
	
	public MyString(int priority, String str) {
		super();
		this.priority = priority;
		this.str = str;
	}





	public int getPriority() {
		return priority;
	}





	public void setPriority(int priority) {
		this.priority = priority;
	}





	public String getStr() {
		return str;
	}





	public void setStr(String str) {
		this.str = str;
	}





	@Override
	public String toString() {
		return str;
	}





	@Override
	public int compareTo(MyString o) {
		if(o.getPriority()>priority)
			return -1;
		else if(priority>o.getPriority())
			return 1;
		return 0;
	}

}
