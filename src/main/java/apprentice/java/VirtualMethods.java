package apprentice.java;

import java.util.Arrays;
import java.util.List;

/**
 * Write code to show how virtual method invocation lets one implementation be swapped for another.
 */
public class VirtualMethods {

  private static class Insect {
    public String getTaxonomyKingdom() {
      return "Animalia";
    }
    public String getTaxonomyPhylum() {
      return "Arthropoda";
    }
    public String getTaxonomyClass() {
      return "Insecta";
    }
    public String getTaxonomyOrder() {
      return "Unknown";
    }
    public String getTaxonomyFamily() {
      return "Unknown";
    }
  }

  private static class Butterfly extends Insect {
    @Override
    public String getTaxonomyOrder() {
      return "Lepidoptera";
    }
    @Override
    public String getTaxonomyFamily() {
      return "Butterfly";
    }
  }

  private static class Beetle extends Insect {
    @Override
    public String getTaxonomyOrder() {
      return "Coleoptera";
    }
    @Override
    public String getTaxonomyFamily() {
      return "Beetle";
    }
  }

  public static void main(String... args) {
    List<Insect> insects = Arrays.asList(new Butterfly(), new Beetle(), new Insect());
    for (Insect insect : insects) {
      System.out.println(insect.getTaxonomyKingdom() + " : "
          + insect.getTaxonomyPhylum() + " : "
          + insect.getTaxonomyClass() + " : "
          + insect.getTaxonomyOrder() + " : "
          + insect.getTaxonomyFamily());
    }
  }

}
