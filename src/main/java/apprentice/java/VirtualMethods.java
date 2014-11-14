package apprentice.java;

import java.util.Arrays;
import java.util.List;

/**
 * Write code to show how virtual method invocation lets one implementation be swapped for another.
 */
public class VirtualMethods {

  private static class Insect {
    public String getOrder() {
      return "Unknown";
    }
  }

  private static class Butterfly extends Insect {
    @Override
    public String getOrder() {
      return "Lepidoptera";
    }
  }

  private static class Beetle extends Insect {
    @Override
    public String getOrder() {
      return "Coleoptera";
    }
  }

  public static void main(String... args) {
    List<Insect> classes = Arrays.asList(new Butterfly(), new Beetle(), new Insect());
    for (Insect myObject : classes) {
      System.out.println(myObject.getOrder());
    }
  }

}
