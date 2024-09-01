package _06_frogger;

import processing.core.PImage;

public class FroggerCar {
	PImage car;
	int x = 400;
	int y = 300;
	int size = 175;
	int speed = 1;
	FroggerCar(PImage car, int x, int y, int size, int speed) {
		this.car = car;
		this.x = x;
		this.y = y;
		this.size = size;
		this.speed = speed;
		this.car.resize(size, size);
	}
	void left() {
		x-=speed;
		if(x<0) {
			x = Frogger.WIDTH;
		}
	}
	void right() {
		x+=speed;
		if(x>Frogger.WIDTH) {
			x = 0;
		}
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	int getSize() {
		return size;
	}
	
}
