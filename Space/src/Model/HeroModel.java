package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class HeroModel extends CharacterModel {
	
	
	ArrayList<BulletModel> Bullet;

	public HeroModel(int posX, int posY, int tam, int vel, PApplet app) {
		super(posX, posY, tam, vel, app);
		// TODO Auto-generated constructor stub
		
		Bullet = new ArrayList <BulletModel>();
		
		for (int i = 0; i < Bullet.size(); i++) {

		Bullet.get(i).paintBullet();

		Bullet.get(i).moveBullet();
		}
	}
	
	


	public void paintHero() {
		app.fill(250, 172, 198);
		app.rect(this.posX, this.posY, this.tam * 2, this.tam);
	}

	public void moveHizq() {
		if (this.posX < 500) {
			this.posX -= this.vel;

		}
	}

	public void moveHder() {

		if (this.posX > 0) {
			this.posX += this.vel;

		}
	}

	public void mov() {
		if (app.key == 'd') {
			moveHder();
		}

		if (app.key == 'a') {
			moveHizq();
		}
	}
}
