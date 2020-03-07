package Model;

import processing.core.PApplet;

public class Logic {
	
	EnemyModel Enemy [];
	HeroModel Hero;
	public PApplet app;
	public Logic(PApplet app) {
		Enemy = new EnemyModel [20] ;
		Hero = new HeroModel(250, 450, 20, 2, app);
		this.app=app;
	
	for (int i = 0; i < Enemy.length; i++) {
		Enemy[i]= new EnemyModel((10+(i*24)), 50, 15, 2, app);
	}
	}
	
public void paint() {
	for (int i = 0; i < Enemy.length; i++) {
	Enemy[i].paintEne();
	Enemy[i].moveEne();
	}
	
	Hero.paintHero();
	
	
}



}
