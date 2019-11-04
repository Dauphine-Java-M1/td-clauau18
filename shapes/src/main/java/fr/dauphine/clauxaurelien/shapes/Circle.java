package fr.dauphine.clauxaurelien.shapes;

public class Circle {
	private Point centre;
	private int rayon;
	
	public static void main( String[] args )
    {
	Point p=new Point(1,2);
	Circle c=new Circle(p,1);
	Circle c2=new Circle(p,2);
	c2.translate(1,1);
	System.out.println(c+" "+c2);
	
	Circle c3 = new Circle(new Point(1,2), 1);
	c3.getCentre().translate(1,1);
	System.out.println(c3);
	}
	
	@Override
	public String toString() {
		return ("Cercle de centre " + this.centre.toString() + "   Rayon : " + this.rayon + "  Surface : " + this.surface());
	}
	
	public Circle(Point p, int rayon){
		this.centre = new Point(p.getX(),p.getY());
		this.rayon = rayon;		
	}
	
	public void translate(int dx, int dy) {
		this.centre = this.centre.translate(dx, dy);
	}
	
	public double surface() {
		return  Math.pow(this.rayon, 2) * Math.PI;
	}
	public Point getCentre() {
		return this.centre;
	}
	public int getRayon() {
		return this.rayon;
	}
	public boolean contains(Point p) {
		boolean isContained = false; 
		double norme = Math.sqrt((Math.pow(p.getX()-this.centre.getX(), 2)) + Math.pow(p.getY()-this.centre.getY(), 2));
		if (norme < this.rayon) {
			isContained = true;
		}
		return isContained;
}
	
}
