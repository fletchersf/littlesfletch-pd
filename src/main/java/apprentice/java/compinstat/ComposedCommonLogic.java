package apprentice.java.compinstat;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Common logic used through composition in two different classes
 */
public class ComposedCommonLogic {

  private final String filename;

  public ComposedCommonLogic(String filename) {
    this.filename = filename;
  }

  public void writeToFile(String message) {
    final Path path = Paths.get(filename);
    try {
      Files.write(path, Arrays.asList(message), Charset.defaultCharset());
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

}
