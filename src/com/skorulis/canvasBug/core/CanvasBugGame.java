package com.skorulis.canvasBug.core;

import forplay.core.CanvasLayer;
import static forplay.core.ForPlay.*;
import forplay.core.Game;

public class CanvasBugGame implements Game{

	CanvasLayer canvas;
	
	@Override
	public void init() {
		canvas = graphics().createCanvasLayer(400, 400);
		graphics().rootLayer().add(canvas);
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paint(float alpha) {
		canvas.canvas().clear();
		canvas.canvas().drawText("TEST " + currentTime(), 0, 50);
	}

	@Override
	public int updateRate() {
		return 25;
	}

}
