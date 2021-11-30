
public class Point2D {

private int x,y;
	
	private Point2D() {
		this.x = 0;
		this.y = 0;
	}
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		return "Point (" + x + "," + y +")";
	}
	
	public boolean isEqual(Point2D pt) {
		if(this.x == pt.x && this.y == pt.y) {
			return true;
		}
		return false;
	}
	
	public Point2D createNewPoint(int xCords, int yCords) {
		return new Point2D(xCords + this.x , yCords + this.y);
	}
	public double calcDistance(Point2D pt) {
		return Math.sqrt(Math.pow(pt.x - this.x,2) + Math.pow(pt.y - this.y,2));
	}



	}


