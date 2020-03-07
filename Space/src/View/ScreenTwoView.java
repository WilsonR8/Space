package View;

import Controller.ScreenTwoController;
import processing.core.PApplet;

public class ScreenTwoView {

	ScreenTwoController View2C;
	PApplet app;

	public ScreenTwoView(PApplet app) {
		View2C = new ScreenTwoController(app);
		this.app = app;
	}

	public void paintView() {
		View2C.paintControl();
	}
	
	public void moveView() {
		View2C.moveControl();
	}

}
