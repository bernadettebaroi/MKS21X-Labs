public class Point{

//fields (instance variables):

  private double x,y;

//constructors:

  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }

// accessor methods

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public static double distance (Point a, Point b) {
    return Math.sqrt((b.x-a.x)*(b.x-a.x)+(b.y - a.y)*(b.y - a.y));
  }
  public double distanceTo(Point b) {
    return Math.sqrt((b.x-x)*(b.x-x)+(b.y - y)*(b.y - y));
  }
  
  public String toString(){
    return "(" + x + ", " + y + ")";
  }

  /*Return true when the respective x and y values of the two points differ by at most 0.001% each.
  *To avoid issues: If one is 0.0, the other must be exactly 0.0.
  */
  public boolean equals(Point other){
    if (other == null) {
      return false;
    }
    return (closeEnough(other.x, x) && closeEnough(other.y, y));
  }

  public static boolean closeEnough(double a, double b){
  //How can you determine if two values are close enough to eachother?
    return ((a==0.0 && b==0.0)||((Math.abs(a-b)/Math.abs(b))*100<=0.001));
  }
}
