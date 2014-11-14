package apprentice.java;

import java.util.Arrays;
import java.util.List;

/**
 * Write code that uses the instanceof operator and show how casting works
 */
public class InstanceOf {

  private static interface Insect {
    abstract String getOrder();
  }

  private static class Butterfly implements Insect {
    public String antenae = "Knob at the end";
    public int wings = 4;

    @Override
    public String getOrder() {
      return "Lepidoptera";
    }
  }

  private static class Moth implements Insect {
    public String antenae = "Fan shaped";
    public int wings = 4;

    @Override
    public String getOrder() {
      return "Lepidoptera";
    }
  }

  private static class Beetle implements Insect {
    public int hardWings = 2;
    public int softWings = 2;

    @Override
    public String getOrder() {
      return "Coleoptera";
    }
  }

  private static class Fly implements Insect {
    public int wings = 2;

    @Override
    public String getOrder() {
      return "Diptera";
    }
  }

  public static void main(String... args) {
    final List<Insect> insects = Arrays.asList(new Beetle(), new Fly(), new Butterfly(), new Moth());
    for (Insect insect : insects) {
      String output = "%s: order: %s, number of wings: %s, Antenae: %s";
      String order = insect.getOrder();
      String type = getInsectType(insect);
      if (insect instanceof Butterfly) {
        Butterfly butterfly = (Butterfly) insect;
        System.out.println(String.format(output, type, order, butterfly.wings, butterfly.antenae));
      }
      else if (insect instanceof Beetle) {
        // Although the object is a Beetle object, Beetle-specific fields and methods are not available
        // without casting. The following line would be a comple error
        // insect.hardWings;
        Beetle beetle = (Beetle) insect;
        // Casting the object now makes the Beetle-specific fields available
        System.out.println(String.format(output, type, order, beetle.hardWings + beetle.softWings, "varries"));
      }
      else if (insect instanceof Moth) {
        Moth moth = (Moth) insect;
        System.out.println(String.format(output, type, order, moth.wings, moth.antenae));
      }
      else if (insect instanceof Fly) {
        Fly fly = (Fly) insect;
        System.out.println(String.format(output, type, order, fly.wings, "small"));
      }
    }
  }

  private static String getInsectType(Insect insect) {
    // This method illustrates that although the passed object is an Insect object the actual class
    // is Beetle, Butterfly, Moth, and Fly.
    return insect.getClass().getName().substring(27);
  }

}
