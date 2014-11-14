package apprentice.java.accessmodifiers;

import apprentice.java.accessmodifiers.package1.BaseClass;
import apprentice.java.accessmodifiers.package1.SubClassInSamePackage;
import apprentice.java.accessmodifiers.package2.SubClassInDifferentPackage;

/**
 * Write code to show how access modifiers work: private, protected, and public
 */
public class AccessModifiers {

  public static void main(String... args) {
    final BaseClass baseClass = new BaseClass();

    baseClass.publicAccessMethod();
    // baseClass.protectedAccessMethod(); // This method cannot be accessed from here
    // baseClass.packageAccessMethod(); // This method cannot be accessed from here
    // baseClass.privateAccessMethod(); // This method cannot be accessed from here

    final SubClassInSamePackage subClassInSamePackage = new SubClassInSamePackage();
    subClassInSamePackage.publicAccessMethod(); // We can access the public method of the base class
    subClassInSamePackage.publicMethodInSamePackage();
    // subClassInDifferentPackage.protectedAccessMethod(); // This method cannot be accessed from here
    // subClassInDifferentPackage.packageAccessMethod(); // This method cannot be accessed from here
    // subClassInDifferentPackage.privateAccessMethod(); // This method cannot be accessed from here

    final SubClassInDifferentPackage subClassInDifferentPackage = new SubClassInDifferentPackage();
    subClassInDifferentPackage.publicAccessMethod(); // We can access the public method of the base class
    subClassInDifferentPackage.publicMethodInDifferentPackage();
    // subClassInDifferentPackage.protectedAccessMethod(); // This method cannot be accessed from here
    // subClassInDifferentPackage.packageAccessMethod(); // This method cannot be accessed from here
    // subClassInDifferentPackage.privateAccessMethod(); // This method cannot be accessed from here
  }

}
