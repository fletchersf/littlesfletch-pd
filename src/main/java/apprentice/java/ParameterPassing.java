package apprentice.java;

/**
 * Determine the effect upon object references and primitive values when they are passed
 * into methods that change the values --
 * <pre>
 * Create a method 3 parameters,
 * <ul>
 *   <li>one is parameter is pass by value</li>
 *   <li>one is passed by reference</li>
 *   <li>one with the keyword final</li>
 * </ul>
 *
 * Output:
 *   Passing by value: value should be 10: Actual value is: 10
 *   Passing by value final: value should be 20: Actual value is: 20
 *   Passing by reference: value should be 30: Actual value is: 30
 *   Passing by reference with final: value should be 40: Actual value is: 40
 * </pre>
 */
@SuppressWarnings({"ParameterCanBeLocal", "UnusedDeclaration", "UnusedAssignment"})
public class ParameterPassing {

  public static void main(String... args) {
    final ParameterPassing parameterPassing = new ParameterPassing();

    final int byValue = 10;
    final int byValueFinal = 20;
    final MyClass byReference = new MyClass();
    final MyClass byReferenceFinal = new MyClass();

    parameterPassing.parameterMethod(byValue, byValueFinal, byReference, byReferenceFinal);

    System.out.println("Passing by value: value should be 10: Actual value is: " + byValue);
    System.out.println("Passing by value final: value should be 20: Actual value is: " + byValueFinal);
    System.out.println("Passing by reference: value should be 30: Actual value is: " + byReference.integerField);
    System.out.println("Passing by reference with final: value should be 40: Actual value is: " + byReferenceFinal.integerField);
  }

  // NOTE: The byReference parameters are more accurately said to pass the reference by value instead of passing by reference.
  private void parameterMethod(int byValue, final int byValueFinal, MyClass byReference, final MyClass byReferenceFinal) {
    // Case 1: passing by value.
    // You can change the value within the method, but the changed value is not seen by the calling code
    byValue = 11;

    // Case 2: passing by value with a final qualifier
    // This is a compiler error because you cannot change a final variable
    // byValueFinal = 21;

    // Case 3: passing by reference, changing field in the object.
    // Only a reference to the object is on the stack. This changes the field in the original class.
    // The calling code will see the new value in the object.
    byReference.integerField = 30;

    // case 4: passing by reference, changing the reference
    // Since this variable is not final the code lets the reference be changed. The new value will be
    // usable within this method but have no effect on the original object and do not affect the calling code.
    // The changed value is usable within this method.
    byReference = new MyClass();
    byReference.integerField = 31;

    // case 5: passing by reference with a final qualifier
    // Changing a field in the object changes the value of the original object. Calling code will see the
    // changed value, however trying to change the value of the reference will result in a compile error
    // because you cannot change a final variable.
    byReferenceFinal.integerField = 40;
    // byReferenceFinal = new byReferenceFinal();
  }

  private static final class MyClass {

    public int integerField = 1;
  }

}
