package apprentice.java.accessmodifiers.package1;

/**
 * Base class.
 * Part of: Write code to show how access modifiers work: private, protected, and public
 * <p/>
 * These methods are in order from least-restrictive to most
 */
public class BaseClass {

  public void publicAccessMethod() {
    System.out.println("Method with public access called");
  }

  protected void protectedAccessMethod() {
    System.out.println("Method with protected access called");
  }

  void packageAccessMethod() {
    System.out.println("Method with packageaccess called");
  }

  @SuppressWarnings("UnusedDeclaration")
  private void privateAccessMethod() {
    System.out.println("Method with private access called");
  }

}
