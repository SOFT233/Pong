package model;

import android.graphics.Point;

public class SpriteObject {

	//TODO use Bitmap type instead?
	protected String sprite;
	protected Point location;
	protected double xMove;
	protected double yMove;
	
	public SpriteObject(String sprite, Point location, double xMove, double yMove) {
		this.sprite = sprite;
		this.location = location;
		this.xMove = xMove;
		this.yMove = yMove;
	}

	public double getMoveX(){
		return xMove;
	}
	
	public double getMoveY(){
		return yMove;
	}
	
	public void update(){
		location.x += xMove;
		location.y += yMove;
	}
}
