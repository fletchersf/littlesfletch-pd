package apprentice.java.accessmodifiers.package1;

/**
 * Extension of base class in same package.
 * Part of: Write code to show how access modifiers work: private, protected, and public
 */
public class SubClassInSamePackage extends BaseClass {

  public void publicMethodInSamePackage() {
    System.out.println("Public method in SubClassInSamePackage called");

    super.publicAccessMethod();
    super.protectedAccessMethod();
    super.packageAccessMethod();
    // super.privateAccessMethod(); // This method cannot be accessed
  }

}
