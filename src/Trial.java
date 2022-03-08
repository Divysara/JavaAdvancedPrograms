
public class Trial implements MainInterface, SubInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trial t = new Trial();
		t.display();
		t.show();
		t.play();
		t.hello();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Child Display");

	}
	
	/*public void show() {
		MainInterface.super.show();
		System.out.println("Child show ");
	}
*/
	@Override
	public void play() {
		// TODO Auto-generated method stub
		MainInterface.super.play();
		SubInterface.super.play();
	}

}
