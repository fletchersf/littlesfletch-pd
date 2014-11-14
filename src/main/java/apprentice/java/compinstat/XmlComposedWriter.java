package apprentice.java.compinstat;

import static java.lang.String.format;

/**
 * Write xml to file using composition
 */
public class XmlComposedWriter {

  private final ComposedCommonLogic composedCommonLogic;

  public XmlComposedWriter(String filename) {
    composedCommonLogic = new ComposedCommonLogic(filename);
  }

  public void writeToFile(String message) {
    composedCommonLogic.writeToFile(format("<xml><message value=\"%s\"/></xml>", message));
  }

}
