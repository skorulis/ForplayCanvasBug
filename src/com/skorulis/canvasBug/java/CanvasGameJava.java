package com.skorulis.canvasBug.java;

import com.skorulis.canvasBug.core.CanvasBugGame;

import forplay.core.ForPlay;
import forplay.java.JavaAssetManager;
import forplay.java.JavaPlatform;

public class CanvasGameJava {

  public static void main(String[] args) {
    JavaAssetManager assets = JavaPlatform.register().assetManager();
    assets.setPathPrefix("src/com/skorulis/heli2/resources");
    ForPlay.run(new CanvasBugGame());
  }
  
}
