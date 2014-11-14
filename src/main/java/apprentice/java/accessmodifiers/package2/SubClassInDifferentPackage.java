package apprentice.java.accessmodifiers.package2;

import apprentice.java.accessmodifiers.package1.BaseClass;

/**
 * Extension of BaseClass in a different package.
 * Part of: Write code to show how access modifiers work: private, protected, and public
 */
public class SubClassInDifferentPackage extends BaseClass {

  public void publicMethodInDifferentPackage() {
    System.out.println("Public method in SubClassInDifferentPackage called");

    super.publicAccessMethod();
    super.protectedAccessMethod();
    // super.packageAccessMethod(); // This method cannot be accessed
    // super.privateAccessMethod(); // This method cannot be accessed
  }

}
