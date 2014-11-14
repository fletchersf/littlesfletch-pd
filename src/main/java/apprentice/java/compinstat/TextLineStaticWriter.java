package apprentice.java.compinstat;

/**
 * Write text to file using static methods
 */
public class TextLineStaticWriter {

  private final String filename;

  public TextLineStaticWriter(String filename) {
    this.filename = filename;
  }

  public void writeToFile(String message) {
    StaticCommonLogic.writeToFile(filename, message);
  }

}
