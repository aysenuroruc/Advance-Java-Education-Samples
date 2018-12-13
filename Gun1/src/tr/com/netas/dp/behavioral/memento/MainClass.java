package tr.com.netas.dp.behavioral.memento;

public class MainClass {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		game.play();
		game.play();
		game.info();
		game.save("çarşamba");
		
		game.play();
		game.play();
		game.play();

		game.save("perşembe");
		
		game.play();

		game.save("cuma");
		
		
		game.load("çarşamba");
		
		game.info();
	}

}
