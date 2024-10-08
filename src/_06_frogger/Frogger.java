package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 550;
    PImage background;
    PImage carLeft;
    PImage carRight;
    PImage frog;
    FroggerCar car1;
    FroggerCar car2;
    
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
    	car1 = new FroggerCar(carLeft,100,300,175,5);
    	car2 = new FroggerCar(carRight,600,225,175,5);
    	frog.resize(50, 50);
    	
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
               y-=3;
            }
            else if(keyCode == DOWN)
            {
                y+=3; 
            }
            else if(keyCode == RIGHT)
            {
                x+=3;
            }
            else if(keyCode == LEFT)
            {
                x-=3;
            }
        }
    }
    public void frogBorders() {
    	if(y>600) {
    		y=550;
    	}
    	else if(y<0) {
    		y=550;
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
    	image(frog,x,y);
    	image(car1.car,car1.x,car1.y);
    	image(car2.car,car2.x,car2.y);
    	car1.left();
    	car2.right();
    	if(intersects(car1)||intersects(car2)) {
    		x = 400;
    		y = 550;
    	}
    	if(y<50) {
    		System.out.println("You successfully crossed the road, CONGRATULATIONS!!!");
    	}
    	
    }
    boolean intersects(FroggerCar car) {
    	 if ((y > car.getY()+car.getSize()/3 && y < car.getY()+car.getSize()*2/3) &&
    	                (x > car.getX() && x < car.getX()+car.getSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }  
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
        
    }
}
