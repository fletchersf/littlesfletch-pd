package apprentice.java.compinstat;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Common logic used through inheritance in two different classes
 */
public abstract class InheritedCommonLogic {

  private final String filename;

  protected InheritedCommonLogic(String filename) {
    this.filename = filename;
  }

  protected void writeToFile(String message) {
    final Path path = Paths.get(filename);
    try {
      Files.write(path, Arrays.asList(message), Charset.defaultCharset());
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }


}
