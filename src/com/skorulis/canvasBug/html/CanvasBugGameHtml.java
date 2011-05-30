package com.skorulis.canvasBug.html;

import com.skorulis.canvasBug.core.CanvasBugGame;

import forplay.core.ForPlay;
import forplay.html.HtmlAssetManager;
import forplay.html.HtmlGame;
import forplay.html.HtmlPlatform;
public class CanvasBugGameHtml extends HtmlGame{

  @Override
  public void start() {
	HtmlAssetManager assets = HtmlPlatform.register().assetManager();
	assets.setPathPrefix("/CanvasBug/");
    ForPlay.run(new CanvasBugGame());
  }
  
}
