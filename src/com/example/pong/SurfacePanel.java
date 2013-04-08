package com.example.pong;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SurfacePanel extends SurfaceView implements SurfaceHolder.Callback {

	private DrawerThread drawerThread = null;
	
	//TODO instead of this use SpriteObject such as Paddle and Ball (includes its own Bitmap)
	private Bitmap bitmap;
	private float x, y;
	private float vx, vy;
	
	public SurfacePanel(Context context) {
		super(context);
		// TODO Use objects, each with their own coords
		//bitmap = bitmapFactory.decodeResource(getResources(), R.drawable.ball
		
		x = 50.0f;
		y = 50.0f;
		
		vx = 10.0f;
		vy = 10.0f;
		
		getHolder().addCallback(this);
		drawerThread = new DrawerThread(getHolder());
	}

	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}

}
