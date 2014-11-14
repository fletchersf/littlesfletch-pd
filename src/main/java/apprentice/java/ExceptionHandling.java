package apprentice.java;

import java.io.IOException;

/**
 * Show usage of a checked exception, an unchecked exception, and a non-Exception throwable.
 */
public class ExceptionHandling {

  public static void main(String... args) throws IOException {

    try {
      throwCheckedException();
    }
    // Requires catch or compile error
    catch (Exception e) {
      System.out.println("Caught checked exception: " + e.getMessage());
    }

    try {
      throwUncheckedException();
    }
    // Doesn't require catch
    catch (RuntimeException e) {
      System.out.println("Caught unchecked exception: " + e.getMessage());
    }

    // Doesn't need catch
    try {
      throwThrowable();
    }
    catch (Throwable throwable) {
      System.out.println("Caught throwable: " + throwable.getMessage());
    }
  }

  private static void throwThrowable() {
    throw new Error("Throwable message");
  }

  private static void throwUncheckedException() {
    throw new RuntimeException("RuntimeException message");
  }

  private static void throwCheckedException() throws Exception {
    throw new Exception("Caught exception message");
  }

}
