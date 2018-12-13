package tr.com.netas.java8;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {
		
		TestInterface ti = (x) -> {
			System.out.println("Merhaba "+x);
			System.out.println("Test2");
		};
		
	
		
		
		ti.test(3);
		
		

	}

}
