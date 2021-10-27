public class Triangle {
  private Point v1, v2, v3;

  public double getPerimeter() {
    v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex(int x) {
    if (x == 1) {
      return v1;
    }
    if (x == 2) {
      return v2;
    }
    if (x == 3) {
      return v3;
    }
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
    String ans = "{(";
    ans += v1.getX() + "," + v1.getY() + "), (" + v2.getX() + "," + v2.getY() + "), (" + v3.getX() + "," + v3.getY() + "}"
  }

  /*Return true when the Points of the triangles are all equal() to the corresponding points of the other Triangle.
  */
  public boolean equals(Triangle other){
    if ()
  }


  /*Return "scalene", "isoscelese", or "equilateral"
  *Make sure to use closeEnough() to determine if two sides are equal because of rounding!
  */
  public String classify(){
  }


  /*Return the area of the triangle
  *Make sure to use the formula: Area = sqrt ( s(s-a)(s-b)(s-c) )
  *where s= perimeter/2 , and a,b,c are the side lengths.
  */
  public double area(){
  }

}
