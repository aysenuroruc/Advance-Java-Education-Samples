package tr.com.netas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import tr.com.netas.jpa.domain.Musteri;

public class MainClass2 {

	public static void main(String[] args) {
		
		List<Musteri> musteriler = new ArrayList<>();
		for( int i = 0 ;i<100;i++)
		{
			musteriler.add(new Musteri(100+i,"a", "aaa", "bbb"));
		}
		
		musteriler.stream()
		.filter( m -> m.getId()>150 )
		.map(t ->  { 
			t.setAd("no name");
			return t;
		})
		.forEach(s->System.out.println(s));


	}

}
