public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
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
    if (getx())
  }
}
