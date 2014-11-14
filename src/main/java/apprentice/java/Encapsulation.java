package apprentice.java;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Show an example of good encapsulation
 */
@SuppressWarnings({"UnusedDeclaration", "SpringJavaAutowiredMembersInspection"})
public class Encapsulation {

  private Date myDate;
  private String myPrivateString;
  private String protectedString;

  @Autowired
  private Date injectedVariable; // No getters/setters for this

  // We do not return the mutable object.  We create a new one.
  public Date getMyDate() {
    return new Date(myDate.getTime());
  }

  // We do not set the mutable object that the caller could continue to modify.  We create a new one.
  public void setMyDate(Date myDate) {
    this.myDate = new Date(myDate.getTime());
  }

  // We don't give direct access to the field, but we provide a private getter
  protected String getProtectedString() {
    return protectedString;
  }

}
