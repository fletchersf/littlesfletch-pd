package apprentice.java.compinstat;

import static java.lang.String.format;

/**
 * Write xml to file using inheritance
 */
public class XmlInheritedWriter extends ComposedCommonLogic {

  public XmlInheritedWriter(String filename) {
    super(filename);
  }

  @Override
  public void writeToFile(String message) {
    super.writeToFile(format("<xml><message value=\"%s\"/></xml>", message));
  }

}
