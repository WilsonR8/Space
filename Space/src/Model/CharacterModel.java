package Model;

import processing.core.PApplet;

public class CharacterModel {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;
	
	public CharacterModel(int posX, int posY, int tam, int vel, PApplet app) {
		this.posX=posX;
		this.posY=posY;
		this.tam=tam;
		this.app=app;
		  
	}

}
