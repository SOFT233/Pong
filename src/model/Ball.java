package model;

import android.graphics.Point;

public class Ball extends SpriteObject {
	
	private double scale;

	public Ball(String sprite, Point location, double xMove, double yMove, double scale) {
		super(sprite, location, xMove, yMove);
		this.scale = scale;
	}

}
