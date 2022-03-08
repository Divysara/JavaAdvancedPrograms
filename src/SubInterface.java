
public interface SubInterface {

	
	public void display();
	default void play() {
		System.out.println("SUB display");
	}
	default void hello() {
		System.out.println("sub hello");
	}
}
