package ru.job4j.condition;
 
public class Point {
	private int x;
	private int y;
 
	public  Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
  
	public double distanceTo (Point that) {
		double dx = this.x - that.x;
		double dy = this.y - that.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
  
	public int getX() {
		return this.x;
	}
 
	public int getY() {
		return this.y;
	}
  
	public boolean is(int a, int b) {
		if(y == x * a + b) {
		return true;
			} else {
				return false; 
				}
	} 
}