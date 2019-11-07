package fr.dauphine.clauxaurelien.shapes;

import java.util.ArrayList;

public class Ring extends Circle {
	private Circle interneCircle;
	
	public Ring(Point p, int rayon, int rayonInterne){
		super(p,rayon);
		// un  cercle  dont  un  cercle  interne  a   ́eté supprim ́e.
		this.interneCircle = new Circle(p, rayonInterne);
	}
	
	public Circle getInterneCircle() {
		return interneCircle;
	}
	
	public int getSuperRayon() {
		return super.getRayon();
	}
	
	public Point getSuperCentre() {
		return super.getCentre();
	}
	
	public static void main( String[] args )
    {	
		Point p = new Point(1,2);
		Ring ring = new Ring(p, 4, 2);
		System.out.println(ring);
	}
	
	@Override
    public boolean equals(Object obj) {
    	boolean isSame = false;
    	if( super.getCentre() == ((Ring) obj).getCentre() && super.getRayon() == ((Ring) obj).getRayon() && super.getRayon() == ((Ring) obj).getRayon())
    	{
    		isSame = true;
    	}
    	return isSame;
    }
	
	@Override
	public String toString() {
		return ("Cercle de centre " + super.getCentre().toString() + "   Rayon : " + super.getRayon() + "  Rayon interne : " + this.interneCircle.getRayon());
	}
	
	public boolean contains(Point p) {
    	boolean isContained = false;
		if (super.contains(p) && !this.interneCircle.contains(p)) {
			isContained = true;
		}
		return isContained;
	}
	
	public static boolean containss(Point p, ArrayList<Ring> rings) {
    	boolean isContained = false;
		for(int i = 0; i< rings.size(); i++) {
			if ( rings.get(i).contains(p) ) {
				isContained = true;
			}
		}
		return isContained;
	}
}
