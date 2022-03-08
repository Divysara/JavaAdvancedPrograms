
public interface MainInterface {

	public void display();
	default void play() {
		System.out.println("MAIN play");
	}
	
	default void show() {
		System.out.println("MAIN show");
	}
}
