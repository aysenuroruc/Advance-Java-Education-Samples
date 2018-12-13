package tr.com.netas.dp.behavioral.observer;

public class Kamyon extends Tasit {

	@Override
	public void git() {
		
		System.out.println("KAMYON gidiyor");

	}

	@Override
	public void dur() {
		System.out.println("KAMYON durdu");

	}
}
