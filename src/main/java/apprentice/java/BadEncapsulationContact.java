package apprentice.java;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Show a bad example of encapsulation and explain why
 */
@SuppressWarnings({"UnusedDeclaration", "SpringJavaAutowiredMembersInspection"})
public class BadEncapsulationContact {

  // Should expose fields with getters. Creates unnecessary coupling. Fields are best left private
  public Date myDate;
  public String myPrivateString;
  protected String protectedString;

  @Autowired
  private Date injectedVariable;

  // This is private, but we expose it through mutability.
  private Date mutableDate;

  // We should not allow getting the Date object since it's mutable
  public Date getMutableDate() {
    return mutableDate;
  }

  // We should not allow setting the Date object directly since it's mutable
  public void setMutableDate(Date mutableDate) {
    this.mutableDate = mutableDate;
  }

  // Since this field should be handled by Spring, it's probably a bad design
  // or bad tests that require a getter for it.
  public Date getInjectedVariable() {
    return injectedVariable;
  }

}
