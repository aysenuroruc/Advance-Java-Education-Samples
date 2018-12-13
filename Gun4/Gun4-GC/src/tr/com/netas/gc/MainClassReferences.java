package tr.com.netas.gc;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

import tr.com.netas.jpa.domain.Musteri;

public class MainClassReferences {

	public static void main(String[] args) {
		//Weak referanslar GC çalıştığında toplanırlar
		//Weak referanslar genelde cache için kullanılır 
		WeakReference<Musteri> ref = 
				new WeakReference<Musteri>(new Musteri("111", "a", "b"));
		
		//WeakHashMap cache için kullanılabilecek en ideal veri yapısıdır.
		
		WeakHashMap<String, Musteri> musteriCache = new WeakHashMap<>();
		
		musteriCache.put("ahmet", new Musteri("33333", "ahmet", "demirelli"));
		musteriCache.put("mehmet", new Musteri("3222", "mehmet", "demirelli"));
		
		
		
		
		//Soft referanslar outof memory olmaya yaklaşıldığında silinebilen
		//objeleri tutarlar
		SoftReference<Musteri> m3 = 
				new SoftReference<Musteri>(new Musteri("4", "vvv", "xxx"));
		
		
		System.out.println(ref.get());

	}

}
