package Model;

import processing.core.PApplet;

public class EnemyModel extends CharacterModel {

	public EnemyModel(int posX, int posY, int tam, int vel, PApplet app) {
		super(posX, posY, tam, vel, app);
		// TODO Auto-generated constructor stub
	}

	public void paintEne() {
		app.fill(172, 242, 255);
		app.rect(this.posX, this.posY, this.tam + 5, this.tam);
	}

	public void moveEne() {
		if (this.posY > 0) {
			this.posX += this.vel;
		}
		if (this.posX == 500) {
			this.posX = 0;
			this.posY += 20;
			this.posX -= this.vel;
		} else {
			if (this.posX == 0) {
				this.posY += 20;
				this.posX += this.vel;
			}
		}
	}

}
