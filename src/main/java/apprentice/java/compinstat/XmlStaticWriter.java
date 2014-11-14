package apprentice.java.compinstat;

import static java.lang.String.format;

/**
 * Write XML to file using static methods
 */
public class XmlStaticWriter {

  private final String filename;

  public XmlStaticWriter(String filename) {
    this.filename = filename;
  }

  public void writeToFile(String message) {
    StaticCommonLogic.writeToFile(filename, format("<xml><message value=\"%s\"/></xml>", message));
  }

}
