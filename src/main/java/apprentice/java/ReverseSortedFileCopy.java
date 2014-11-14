package apprentice.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.Charset.defaultCharset;
import static java.nio.file.Files.readAllLines;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
import static org.apache.commons.io.FileUtils.writeLines;

/**
 * Read a file with 10k lines of text, and output another file with the lines in reverse sorted order
 */
public class ReverseSortedFileCopy {

  private static final String INPUT_FILE = "src/main/resources/input-file.txt";
  private static final String OUTPUT_FILE = "target/output-file.txt";

  public static void main(String... args) throws IOException {
    final List<String> lines = readAllLines(Paths.get(INPUT_FILE), defaultCharset());
    sort(lines, reverseOrder());
    writeLines(new File(OUTPUT_FILE), lines);
  }

}
