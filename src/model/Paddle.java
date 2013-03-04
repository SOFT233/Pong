package model;

import android.graphics.Point;

public class Paddle extends SpriteObject {
	
	private boolean enabled;

	public Paddle(String sprite, Point location, double xMove, double yMove, boolean enabled) {
		super(sprite, location, xMove, yMove);
		this.enabled = enabled;
	}
	
}
