package apprentice.java;

/**
 * Show how to override a method in a subclass
 */
public class OverrideMethod {

  public static void main(String... args) {
    final BaseClass baseClass = new BaseClass();
    final BaseClass subClass = new SubClass();

    baseClass.methodToOverride();
    subClass.methodToOverride();
  }

  private static class BaseClass {

    protected void methodToOverride() {
      System.out.println("Method to override in base class");
    }

  }

  private static final class SubClass extends BaseClass {

    @Override
    protected void methodToOverride() {
      System.out.println("Method to override in sub class");
    }

  }
}
