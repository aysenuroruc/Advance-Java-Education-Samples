package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		URL url = new URL("file:///Users/ahmetdemirelli/Desktop/reflection-test.jar");
		
		URLClassLoader loader = new URLClassLoader(new URL[] {url});
		
		Class c =  loader.loadClass("tr.com.netas.jpa.domain.Musteri");
		Object musteri =  c.newInstance();
		
		Method[]  methods = 	c.getDeclaredMethods();
	   
	   for(Method m : methods)
	   {
		   System.out.println(m.getModifiers()+" "+ m.getName());
	   }
	   /*
		
	   Method method1 = 	c.getDeclaredMethod("publicMetod", null);
	   method1.invoke(musteri, null);
	   
	   Method method2 = 	c.getDeclaredMethod("publicMetod",int.class);
	   method2.invoke(musteri, 35);
	   
	   Method toplama = 	c.getDeclaredMethod("toplama",int.class,int.class);
	   Object sonuc = toplama.invoke(musteri, 135,435);
	   System.out.println(sonuc);
	   
	   Method privateMethod = 	c.getDeclaredMethod("privateMetod", null);
	   privateMethod.setAccessible(true);
	   privateMethod.invoke(musteri, null);
	   
	 
		 
		Constructor[]  cons = c.getConstructors();
		
		for(Constructor con : cons)
		{
			System.out.println(con.getModifiers() + " - "+ con.getName()+ " "+ con.getParameterCount());
		}
		  
		 
		 Method method1 = 	c.getDeclaredMethod("toString", null);
		 String aa = (String) method1.invoke(musteri, null);
		 System.err.println(aa);
		 
		Constructor con = c.getConstructor(String.class,String.class,String.class);
		
		 Object musteri2 = con.newInstance("1111","ahmet","demirelli");
		 
		 String aaa = (String) method1.invoke(musteri2, null);
		 System.out.println(aaa);
		 */
		 //Modifiers  
		//1 public,
		//2 private,
		//3 <>   default
		//4 protected
		Field[]  fields = c.getDeclaredFields();
		
		for(Field f : fields)
		{
			System.out.println( f.getModifiers()+" "+f.getType() +" "+ f.getName());
		}
		
	
	
	}

}
