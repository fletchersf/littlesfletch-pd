package apprentice.java;

/**
 * Create and overload constructors -- Create a class that has 4 fields and
 * construct the class with variations of one required field and the others
 * are optional.  Use constructor chaining as an example
 */
public class Contact {
  private final String name;
  private final String address;
  private final String phone;
  private final String email;

  public Contact() {
    this(null, null, null, null);
  }

  public Contact(String name) {
    this(name, null, null, null);
  }

  public Contact(String name, String address) {
    this(name, address, null, null);
  }

  public Contact(String name, String address, String phone) {
    this(name, address, phone, null);
  }

  public Contact(String name, String address, String phone, String email) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  @Override
  public String toString() {
    return "Contact{" +
      "name='" + name + '\'' +
      ", address='" + address + '\'' +
      ", phone='" + phone + '\'' +
      ", email='" + email + '\'' +
      '}';
  }

  public static void main(String... args) {
    System.out.println(new Contact());
    System.out.println(new Contact("James"));
    System.out.println(new Contact("John", "Eagle Mountain"));
    System.out.println(new Contact("Andrew", "Provo", "801 373-7364"));
    System.out.println(new Contact("Charles", "Pensecola", "554 275-2323", "littlefletchman@gmail.com"));
  }

}
