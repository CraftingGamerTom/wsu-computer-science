//Two strings of equal length can be interlaced like the teeth of a zipper to form a new word. For example, interlacing cota and rain yields croatian. The following class constructs a ZipperWord from two strings.

//Your task is to complete the implementation of the toStringHelper method below. That method computes the zipped word resulting from interleaving characters from first and second, starting with the given position. Interleave the characters at that position and combine with a recursive call to toStringHelper.

//Complete the following code:

public class ZipperWord
{
   public ZipperWord(String word1, String word2)
   {
      assert word1.length() == word2.length();
      first = word1;
      second = word2;
   }

   public String toString()
   {
      return toStringHelper(0);
   }

   /**
      Returns the interleaving of the characters of the string
      first and second, starting at position start. This method
      should recursively call itself.
      @param start the starting position
      @return the interleaved word parts
   */
   private String toStringHelper(int start)
   {
      if (start >= first.length() || start >= second.length()) {
          return "";
      }
      else {
          String s = "";
          s += first.substring(start, start+1);
          s += second.substring(start, start+1);
          s += toStringHelper(start+1);
          return s;
      }
   }

   private String first;
   private String second;

   // this method is used to check your work

   public static String check(String word1, String word2)
   {
      ZipperWord zippy = new ZipperWord(word1, word2);
      return zippy.toString();
   }
}