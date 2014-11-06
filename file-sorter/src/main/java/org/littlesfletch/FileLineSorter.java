package org.littlesfletch;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FileLineSorter
{
  public static void main(String args[])
  {
    sort(args[0], args[1], true);
  }

  public static void sort(String inputFile, String outputFile, boolean ascending) {
    List<String> list = new ArrayList<>();

    try{
      // Open the file that is the first
      // command line parameter
      FileInputStream inputStream = new FileInputStream(inputFile);
      // Get the object of DataInputStream
      BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
      String strLine;
      //Read File Line By Line
      while ((strLine = br.readLine()) != null)   {
        list.add(strLine);
      }
      //Close the input stream
      inputStream.close();

      Collections.sort(list);

      FileOutputStream outputStream = new FileOutputStream(outputFile);
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
      if (ascending) {
        for (String line : list) {
          writer.write(line + "\n");
        }
      }
      else {
        for (int i = 0; i < list.size(); i++) {
          writer.write(list.get(list.size() - (i + 1)) + "\n");
        }
      }
      writer.flush();
      outputStream.close();
    }
    catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }


  }

//  /// <summary>
//  /// Performs sorting
//  /// </summary>
//  /// <param name="inputFileName">The name of the file that needs to be sorted
//  /// </param>
//  /// <param name="outputFileName">The name of the file in which
//  /// sorted lines from the <paramref name="inputFileName"/> should be saved
//  /// </param>
//  public void sort(String inputFileName, String outputFileName) {
//      Map chunks = new HashMap<String, ChunkInfo>(Comparer);
//      var info = new FileInfo(inputFileName);
//      //If file size is less than maxFileSize simply sort its content in memory.
//      if (info.Length < maxFileSize)
//          SortFile(inputFileName, outputFileName);
//      //Otherwise create temp directory and split file into chunks,
//      //saving each chunk as a new file into this directory
//      else
//      {
//          var dir = new DirectoryInfo("tmp");
//          if (dir.Exists)
//              dir.Delete(true);
//          dir.Create();
//          SplitFile(inputFileName, 1);
//          Merge(outputFileName);
//      }
//  }
//
//  /// <summary>
//  /// Merges all chunks into one file
//  /// </summary>
//  private void merge(String outputFileName)
//  {
//      using (var output = File.Create(outputFileName))
//      {
//          foreach (var name in chunks)
//          {
//              name.Value.Close();
//              if (name.Value.NoSortFileName != null)
//              {
//                  CopyFile(name.Value.NoSortFileName, output);
//                  //File.Delete(name.Value.NoSortFileName);
//              }
//              if (name.Value.FileName != null)
//              {
//                  CopyFile(name.Value.FileName, output);
//                  //File.Delete(name.Value.FileName);
//              }
//          }
//      }
//  }
//
//  /// <summary>
//  /// Splits big file into some chunks by matching starting characters in each line
//  /// </summary>
//  /// <param name="inputFileName">Big file name</param>
//  /// <param name="chars">Number of starting characters to split by</param>
//  private void splitFile(String inputFileName, int chars)
//  {
//      var files = new Dictionary<string, FileChunk>(Comparer);
//      using (var sr = new StreamReader(inputFileName, Encoding))
//      {
//          while (sr.Peek() >= 0)
//          {
//              string entry = sr.ReadLine();
//              //The length of the line is less than the current
//              //number of characters we split by
//              //In this cases we add the line to the non-sorted file
//              if (entry.Length < chars)
//              {
//                  ChunkInfo nameInfo;
//                  if (!chunks.TryGetValue(entry, out nameInfo))
//                      chunks.Add(entry, nameInfo = new ChunkInfo());
//                  nameInfo.AddSmallString(entry, Encoding);
//              }
//              //Otherwise we add the line to the file corresponding
//              //to the first char characters of the line
//              else
//              {
//                  string start = entry.Substring(0, chars);
//                  FileChunk sfi;
//                  if (!files.TryGetValue(start, out sfi))
//                  {
//                      sfi = new FileChunk(Encoding);
//                      files.Add(start, sfi);
//                  }
//                  sfi.Append(entry, Encoding);
//              }
//          }
//      }
//      //For each of the chunk we check if size of the chunk is
//      //still greater than the maxFileSize
//      foreach (var file in files)
//      {
//          file.Value.Close();
//          //If it is - split to smaller chunks
//          if (file.Value.Size > maxFileSize)
//          {
//              SplitFile(file.Value.FileName, chars + 1);
//              File.Delete(file.Value.FileName);
//          }
//          //Otherwise save it to the dictionary
//          else
//          {
//              SortFile(file.Value.FileName, file.Value.FileName);
//              ChunkInfo nameInfo;
//              if (!chunks.TryGetValue(file.Key, out nameInfo))
//                  chunks.Add(file.Key, nameInfo = new ChunkInfo());
//              nameInfo.FileName = file.Value.FileName;
//          }
//      }
//  }
}
