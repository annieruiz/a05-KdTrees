package kdTree;
 // GIT REPO
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.RedBlackBST;

public class PointST<Value> {
	int size;
	private RedBlackBST<Point2D, Value> st;

	/**
	 * Construct an empty symbol table of points
	 */
	public PointST() {
		st = new RedBlackBST<>();
	}

	/**
	 * is the symbol table empty?
	 * 
	 * @return boolean true if empty, false if otherwise
	 */
	public boolean isEmpty() {
//		return size() == 0;
		return st.isEmpty();
	}

	/**
	 * number of points
	 * 
	 * @return int number of points
	 */
	public int size() {
		return st.size();
	}

	/**
	 * associate the value val with the point p
	 * 
	 * @param p
	 *            Point2d key for the value
	 * @param val
	 *            value
	 */
	public void put(Point2D p, Value val) {
		if (p == null) //FIXME can val be null?
			throw new NullPointerException("called put() with null point");
		st.put(p, val);
	}

	/**
	 * value associated with point p
	 * 
	 * @param p
	 *            Point2d key to get
	 * @return value at point p
	 */
	public Value get(Point2D p) {
		if (p == null)
			throw new NullPointerException("called get() with null point");
		return st.get(p);
	}

	/**
	 * does the symbol table contain point p?
	 * 
	 * @param p
	 *            Point2d key to get
	 * @return true if it contains point p, false if otherwise
	 */
	public boolean contains(Point2D p) {
		if (p == null)
			throw new NullPointerException("called contains() with null point");
		return st.contains(p);
	}

	/**
	 * all the point in the symbol table
	 * 
	 * @return all the points in the symbol table
	 */
	public Iterable<Point2D> points() {
		return st.keys();
	} 

	/**
	 * all the points that are inside the rectangle
	 * @param rect rectangle we are searching inside
	 * @return iterable containing all the points inside the rectangle
	 */
	public Iterable<Point2D> range(RectHV rect) {
		if (rect == null) throw new NullPointerException("called range() with null rectangle");
		Queue<Point2D> que = new Queue<>();
		for (Point2D p : st.keys()) {
			if (rect.contains(p))
				que.enqueue(p);
		}
		return que;
	}
	
	/**
	 * nearest neighbor to point p; null if the symbol table is empty
	 * @param p
	 * @return
	 */
	public Point2D nearest(Point2D p) { //Verify that we are going in the direction like if we were inserting the point into the graph.
		if (p == null) throw new NullPointerException("called nearest() with null point");
		Point2D nearest = st.max();
		for (Point2D point : st.keys()) {
			if (p.distanceSquaredTo(point) < p.distanceSquaredTo(nearest)) {
				nearest = point;
			}
		}
		return nearest;
	}

	/**
	 * unit testing of the methods (not graded)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}
}