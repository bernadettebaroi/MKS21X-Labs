public class Demo{
  /* more methods can go here*/
  public static double distance (Point a, Point b) {
    double x1 = a.getX();
    double x2 = b.getX();
    double y1 = a.getY();
    double y2 = b.getY();
    return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
  }

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    System.out.println(  distance(P1,P2)); //call1
    System.out.println( Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
