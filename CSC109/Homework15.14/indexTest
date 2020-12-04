import java.io.FileNotFoundException;
import java.util.Set;

/**
   A program to read in a Java source file and
   produce an index of all identifiers in the file.
*/
public class IndexDemo
{  
   public static void main(String[] args)
      throws FileNotFoundException
   {  
      IdentifierIndex index = new IdentifierIndex();
      index.read("IndexDemo.java"); // reads this file
      Set<String> idents = index.getIdentifiers();
      for (String ident : idents)
      {
         Set<Integer> lines = index.getLines(ident);
         System.out.println(ident + ": " + lines);
      }
   }
}