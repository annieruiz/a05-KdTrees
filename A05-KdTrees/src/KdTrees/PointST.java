package KdTrees;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.RedBlackBST;

public class PointST<Value> {
	int size;
	RedBlackBST<Point2D, String> point;
	
	/**
	 * construct an empty symbol table of points
	 */
	public PointST() {
		RedBlackBST<Point2D, String> point = new RedBlackBST<Point2D, String>();
		//this.point = point;
	}
	
	/**
	 * is the symbol table empty?
	 * @return true if empty, false if not
	 */
	public boolean isEmpty() {
	}
	
	/**
	 * number of points 
	 * @return
	 */
	public int size() {
		if (size == 0) {
			
		}
	}
	
	/**
	 * associate the value val with point p
	 * @param p
	 * @param val
	 */
	public void put(Point2D p, Value val) {
		point.put(p, val);
	}
	
	/**
	 * value associated with point p 
	 * @param p
	 * @return
	 */
	public Value get(Point2D p) {
		
	}
	
	/**
	 * does the symbol table contain point p? 
	 * @param p
	 * @return
	 */
	public boolean contains(Point2D p) {
		
	}
	
	/**
	 * all points in the symbol table 
	 * @return
	 */
	public Iterable<Point2D> point() {
		
	}
	
	/**
	 * all points that are inside the rectangle
	 * @param rect
	 * @return
	 */
	public Iterable<Point2D> range(RectHV rect) {
		
	}
	
	/**
	 * a nearest neighbor to point p; null if the symbol table is empty 
	 * @param p
	 * @return
	 */
	public Point2D nearest (Point2D p) {
		
	}
	
	/**
	 * unit testing of the methods (not graded) 
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
