package View;
import processing.core.PApplet;

public class Main extends PApplet {

	
	
	ScreenTwoView View2;
	PApplet app;
	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");
	}
	
public void setup() {
	View2 = new ScreenTwoView(this);


}

public void settings() {
	size(500,500);
}

public void draw() {
	background(0);
	
	View2.paintView();
	
	
	
}

}
