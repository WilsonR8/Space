package Model;

import processing.core.PApplet;

public class Logic {

	EnemyModel Enemy[];
	HeroModel Hero;
	HeroModel moveHero;
	BulletModel Bullet;
	public PApplet app;

	public Logic(PApplet app) {
		Enemy = new EnemyModel[20];
		Hero = new HeroModel(250, 450, 20, 15, app);
		Bullet = new BulletModel(255, 455, 10, 20, app);
		
		this.app = app;

		for (int i = 0; i < Enemy.length; i++) {
			Enemy[i] = new EnemyModel((10 + (i * 24)), 50, 15, 2, app);
		}
	}

	public void paint() {
		for (int i = 0; i < Enemy.length; i++) {
			Enemy[i].paintEne();
			Enemy[i].moveEne();
		}

		Hero.paintHero();
		Bullet.paintBullet();
	}

	public void MoveHero() {
		Hero.mov();
		Bullet.mov();
	}
	
	public void MoveBullet() {
		Bullet.mov();
	}

}
