package Model;

import processing.core.PApplet;

public class BulletModel extends CharacterModel {

	public BulletModel(int posX, int posY, int tam, int vel, PApplet app) {
		super(posX, posY, tam, vel, app);
		// TODO Auto-generated constructor stub
	}

	public void paintBullet() {
		app.fill(242, 118, 248);
		app.ellipse(this.posX, this.posY, this.tam, this.tam);
	}

	public void moveBullet() {
		this.posY-=this.vel;
	}
	
	public void mov() {
		if (app.key == 'k') {
			moveBullet();
		}
	}
}
