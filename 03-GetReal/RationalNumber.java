public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return (double) numerator / (double) denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber a = new RationalNumber(denominator, numerator);
    return a;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (other.getDenominator() == other.getNumerator()) {
      return true;
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "0";
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    int ans = 1;
    for (int i = 1; i <= a && i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        ans = i;
      }
    }
    return ans;
  }
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }

  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber ans = new RationalNumber(numerator*other.getNumerator(), denominator*other.getDenominator());
    return ans;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber ans = new RationalNumber(numerator*other.getDenominator(), denominator*other.getNumerator());
    return ans;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    numerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
    denominator = denominator * other.getDenominator();
    RationalNumber ans = new RationalNumber(numerator, denominator);
    return ans;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    numerator = numerator * other.getDenominator() - other.getNumerator() * denominator;
    denominator = denominator * other.getDenominator();
    RationalNumber ans = new RationalNumber(numerator, denominator);
    return ans;
  }

}
