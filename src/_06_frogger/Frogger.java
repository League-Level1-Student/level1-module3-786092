package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 300;
    PImage background;
    PImage carLeft;
    PImage carRight;
    PImage frog;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	background = loadImage("src/_06_frogger/froggerBackground.png");
    	background.resize(WIDTH, HEIGHT);
    	carLeft = loadImage("src/_06_frogger/carLeft.png");
    	carRight = loadImage("src/_06_frogger/carRight.png");
    	frog = loadImage("src/_06_frogger/frog.png");
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
               y--;
            }
            else if(keyCode == DOWN)
            {
                y++; 
            }
            else if(keyCode == RIGHT)
            {
                x++;
            }
            else if(keyCode == LEFT)
            {
                x--;
            }
        }
    }
    public void frogBorders() {
    	if(y>600) {
    		y=300;
    	}
    	else if(y<0) {
    		y=300;
    	}
    	else if(x>800) {
    		x=400;
    	}
    	else if(x<0) {
    		x=400;
    	}
    }
    @Override
    public void draw() {
    	background(background);
    	fill(0,255,0);
    	ellipse(x,y,100,100);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
        
    }
}
