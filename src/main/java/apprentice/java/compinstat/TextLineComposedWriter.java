package apprentice.java.compinstat;

/**
 * Write text to file using composition
 */
public class TextLineComposedWriter {

  private final ComposedCommonLogic composedCommonLogic;

  public TextLineComposedWriter(String filename) {
    composedCommonLogic = new ComposedCommonLogic(filename);
  }

  public void writeToFile(String message) {
    composedCommonLogic.writeToFile(message);
  }

}
