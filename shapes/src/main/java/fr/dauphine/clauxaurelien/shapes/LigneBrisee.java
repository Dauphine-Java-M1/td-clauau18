package fr.dauphine.clauxaurelien.shapes;

import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisee {
	private LinkedList<Point> points;
	
	public LigneBrisee()
	{
		this.points = new LinkedList<Point>();
	}
	
	public void add(Point p) throws NullPointerException {
		Objects.requireNonNull(p);
		for (int i = 0; i <= this.points.size(); i++) {
			if (this.points.get(i) != null) {
				this.points.set(i,p);
			}
		}
	}
	
	public int pointCapacity() {
		return this.points.size();		
	}
	
	
	public boolean contains(Point p) throws NullPointerException {
		
		return this.points.contains(p);
	}
}
