package tr.com.netas.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import tr.com.netas.jpa.domain.Musteri;

public class MainClass5 {

	public static void main(String[] args) {
	
		
	  Function<Integer, Integer> f =  (x) -> x *2 + 5;
	  
	  Predicate<Integer> tekmiCiftMi = (x) -> x%2==0;
	 
	  Consumer<Integer>  consume  = (x) -> System.out.println(x);
	  
	  Supplier<Musteri> musterCreator = () -> new Musteri(1, "11", "a", "b");
	  
	  
	   int t = f.apply(23);
	   System.out.println(t);
	  
	   
	   Musteri m =  musterCreator.get();
	   System.out.println(m);
	  
	  

	}

}
