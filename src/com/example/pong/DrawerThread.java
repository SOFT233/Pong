package com.example.pong;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class DrawerThread extends Thread {

	private SurfaceHolder sh;
	private Canvas canvas;
	private boolean run = false;
	
	//TODO check method...is _holder just a name?
	public DrawerThread(SurfaceHolder _holder){
		this.sh = _holder;
	}
	
	//TODO check mehtod...just a setter? can change param name?
	public void setRunnable(boolean _run){
		this.run = _run;
	}
	
	public void run(){
		
		while(this.run){
			
			this.canvas = null;
			
			try{
				canvas = sh.lockCanvas(null);
				
				synchronized(sh){
					//TODO redraw background first to cover previous images
					//TODO redraw objects
					//ball.onDraw(this.canvas);
				}
			} finally {
				
				if(this.canvas != null){
					
					sh.unlockCanvasAndPost(this.canvas);
				}
			}
		}
	}
	
	public Canvas getCanvas(){
		
		if(this.canvas != null){
			
			return this.canvas;
			
		} else {
			
			return null;
		}
	}
}
