package org.littlesfletch;

import org.testng.annotations.Test;

public class FileLineSorterTest {

  @Test
  public void testSortFile() throws Exception {

    FileLineSorter.sort("/home/samuel/testFile", "/home/samuel/ascendingFile", true);
    FileLineSorter.sort("/home/samuel/testFile", "/home/samuel/descendingFile", false);
  }
}
