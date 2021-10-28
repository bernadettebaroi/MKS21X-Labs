public class Triangle {
  private Point v1, v2, v3;

  public Triangle (Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double a, double b, double c, double d, double e, double f) {
    v1 = new Point(a,b);
    v2 = new Point(c,d);
    v3 = new Point(e,f);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex(int x) {
    Point ans = v1;
    if (x == 1) {
      ans = v1;
    } else if (x == 2) {
      ans = v2;
    } else if (x == 3) {
      ans = v3;
    }
  return ans;
  }

  public void setVertex(int x, Point b) {
    if (x == 1) {
      v1 = b;
    }
    if (x == 2) {
      v2 = b;
    }
    if (x == 3) {
      v3 = b;
    }
  }

  public String toString() {
    String ans = "{";
    ans += "(" + v1.getX() + "," + v1.getY() + "), ";
    ans += "(" + v2.getX() + "," + v2.getY() + "), ";
    ans += "(" + v3.getX() + "," + v3.getY() + ")}";
    return ans;
  }

  /*Return true when the Points of the triangles are all equal() to the corresponding points of the other Triangle.
  */
  public boolean equals(Triangle other){
    if (other == null) {
      return false;
    }
    return (v1.equals(other.v1) && v2.equals(other.v2) && v3.equals(other.v3));
  }

  public static boolean closeEnough(double a, double b){
    //How can you determine if two values are close enough to eachother?
    return ((a==0.0&&b==0.0)||((Math.abs(a-b)/Math.abs(b))*100<=0.001));
  }

  /*Return "scalene", "isoscelese", or "equilateral"
  *Make sure to use closeEnough() to determine if two sides are equal because of rounding!
  */
  public String classify(){
    String ans = "";
    if ( (closeEnough(v1.distanceTo(v2), v2.distanceTo(v2))) && (closeEnough(v2.distanceTo(v3), v1.distanceTo(v2))) ) {
      ans = "equilateral";
    } else if ((closeEnough(v1.distanceTo(v2), v2.distanceTo(v3))) || (closeEnough(v2.distanceTo(v3), v3.distanceTo(v1))) ) {
      ans = "isoscelese";
    } else {
      ans = "scalene";
    }
    return ans;
  }


  /*Return the area of the triangle
  *Make sure to use the formula: Area = sqrt ( s(s-a)(s-b)(s-c) )
  *where s= perimeter/2 , and a,b,c are the side lengths.
  */
  public double area(){
    double s = getPerimeter()/2;
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double Area = Math.sqrt ( s * (s-a)* (s-b) * (s-c));
    return Area;
  }
}
