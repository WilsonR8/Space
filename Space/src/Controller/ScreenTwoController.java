package Controller;
import Model.Logic;
import processing.core.PApplet;

public class ScreenTwoController {

	Logic LogicControl;
	PApplet app;
	public ScreenTwoController(PApplet app) {
		LogicControl = new Logic(app);
		this.app=app;
	}
	
public void paintControl() {
	LogicControl.paint();
}
	
	
	
}
