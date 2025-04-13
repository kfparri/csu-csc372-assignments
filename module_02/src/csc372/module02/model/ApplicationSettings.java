package csc372.module02.model;

public class ApplicationSettings {
	// create some static variables with different settings for the interface
	private int frameWidth = 500;
	private int frameHeight = 250;
	private String frameName = "Bank Application";
	private boolean frameResizable = false;
	private int elementPadding = 10;
	
	public int getFrameWidth() {
		return frameWidth;
	}
	
	public int getFrameHeight() {
		return frameHeight;
	}
	
	public String getFrameName() {
		return frameName;
	}
	
	public boolean getFrameResizable() {
		return frameResizable;
	}
	
	public int getElementPadding() {
		return elementPadding;
	}
}
