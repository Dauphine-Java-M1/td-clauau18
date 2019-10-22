package fr.dauphine.clauxaurelien.shapes;

import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisee {
	private LinkedList<Point> points;
	
	public LigneBrisee()
	{
		this.points = new LinkedList<Point>();
	}
	
	private void add(Point p) throws NullPointerException {
		Objects.requireNonNull(p);
		for (int i = 0; i <= this.points.length; i++) {
			if (this.points[i] != null) {
				this.points[i] = p;
			}
		}
	}
	
	private int pointCapacity() {
		return this.points.length;		
	}
	
	private int nbpoints() {
		int counter = 0;
		for (int i = 0; i <= this.points.length; i++) {
			if (this.points[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	private boolean contains(Point p) throws NullPointerException {
		Objects.requireNonNull(p);
		for (Point point : this.points) {
			if (point.equals(p)){
				return true;
			}
		}
		return false;
	}
}
