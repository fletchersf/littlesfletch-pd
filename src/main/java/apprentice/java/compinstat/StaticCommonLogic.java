package apprentice.java.compinstat;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Common logic used through static method calls in two different classes
 */
public final class StaticCommonLogic {

  private StaticCommonLogic() {}

  public static void writeToFile(String filename, String message) {
    final Path path = Paths.get(filename);
    try {
      Files.write(path, Arrays.asList(message), Charset.defaultCharset());
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }


}
