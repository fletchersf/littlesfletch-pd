package apprentice.java;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryStringList {

  public static void main(String... args) {
    //noinspection MismatchedQueryAndUpdateOfCollection
    final List<String> stringList = new ArrayList<>();
    int i = 0;
    int numCharacters = 0;
    while (true) {
      try {
        final String string = "string" + i++;
        numCharacters += string.length();
        stringList.add(string);
      }
      catch (OutOfMemoryError e) {
        System.out.println("numCharacters = " + numCharacters); // Printed 279637061
        System.exit(0);
      }

    }

  }

}
