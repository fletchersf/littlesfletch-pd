package apprentice.java;

/**
 * Show how to overload methods
 */
public class OverloadedMethod {

  public static void main(String[] args) {
    final OverloadedMethod overloadedMethod = new OverloadedMethod();
    overloadedMethod.divideBy2(1231);
    overloadedMethod.divideBy2(1231L);
    overloadedMethod.divideBy2(1231.0F);
    overloadedMethod.divideBy2(1231.0);
  }

  public void divideBy2(int intValue) {
    System.out.println("divideBy2 with integer: " + intValue / 2.0);
  }

  public void divideBy2(long longValue) {
    System.out.println("divideBy2 with long: " + longValue / 2.0);
  }

  public void divideBy2(float floatValue) {
    System.out.println("divideBy2 with float: " + floatValue / 2.0);
  }

  public void divideBy2(double doubleValue) {
    System.out.println("divideBy2 with double: " + doubleValue / 2.0);
  }

}
