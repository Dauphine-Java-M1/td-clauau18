package fr.dauphine.clauxaurelien.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point 
{
	private int x,y;
	private static int pointCounter;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
    	Point.pointCounter += 1;
	}
	
	public Point(Point p)
	{
		this.x = p.getX();
		this.y = p.getY();
    	Point.pointCounter += 1;
	}
	
    public static void main( String[] args )
    {
    	//Point p = new Point(2,3);
    	//System.out.println(p);
    	
//    	Point p1=new Point(1,2);
//    	Point p2=p1;
//    	Point p3=new Point(1,2);
//    	
//    	System.out.println(p1==p2);
//    	System.out.println(p1==p3);
    	Point p1=new Point(1,2);
    	Point p2=p1;
    	Point p3=new Point(1,2);
    	ArrayList<Point> list = new ArrayList<>();
    	list.add(p1);
    	System.out.println(list.indexOf(p2));
    	System.out.println(list.indexOf(p3));
    }
    public int getX() {
		return this.x;
	}
    public int getY() {
		return this.y;
	}
    
    @Override
	public String toString() {
		return ("(" + this.x + "," + this.y + ")");
	}
    
    public boolean isSameAs(Point p)
    {	
    	boolean isSame = false;
    	if( this.x == p.getX() && this.y == p.getY())
    	{
    		isSame = true;
    	}
    	return isSame;
    }
    
    @Override
    public boolean equals(Object obj) {
    	boolean isSame = false;
    	if( this.x == ((Point) obj).getX() && this.y == ((Point) obj).getY())
    	{
    		isSame = true;
    	}
    	return isSame;
    }
    
    public Point translate(int dx,int dy) {
    	return new Point(this.getX()+dx, this.getY()+dy);
    }
}	

