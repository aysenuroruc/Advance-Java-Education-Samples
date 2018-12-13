package tr.com.netas.java8;

import javax.lang.model.SourceVersion;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class MainClass4 {

	public static void main(String[] args) throws Exception{
		
		/*
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("print('Hello World!');");
		*/
		
		final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();        
		for( final SourceVersion version: compiler.getSourceVersions() ) {
		    System.out.println( version );
		}

	}

}
