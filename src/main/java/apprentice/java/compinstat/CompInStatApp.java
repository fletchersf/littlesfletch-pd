package apprentice.java.compinstat;

/**
 * apprentice.java.compinstat.InheritedApp
 */
public class CompInStatApp {

  public static void main(String[] args) {
    final XmlInheritedWriter xmlWriter = new XmlInheritedWriter("inherited-file.xml");
    xmlWriter.writeToFile("xml message for inherited");

    final TextLineInheritedWriter textWriter = new TextLineInheritedWriter("inherited-file.txt");
    textWriter.writeToFile("text message for inherited");

    final XmlComposedWriter xmlComposedWriter = new XmlComposedWriter("composed-file.xml");
    xmlComposedWriter.writeToFile("xml message for composed");

    final TextLineComposedWriter textLineComposedWriter = new TextLineComposedWriter("composed-file.txt");
    textLineComposedWriter.writeToFile("text message for composed");

    final XmlStaticWriter xmlStaticWriter = new XmlStaticWriter("static-file.xml");
    xmlStaticWriter.writeToFile("xml message for static");

    final TextLineStaticWriter textLineStaticWriter = new TextLineStaticWriter("static-file.txt");
    textLineStaticWriter.writeToFile("text message for static");
  }

}
