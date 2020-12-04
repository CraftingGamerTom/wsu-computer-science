/*
Recall that a predicate is a method with a Boolean return value. The Predicate interface can be used to test whether a value fulfills a property. A class implementing this interface provides an invoke method for carrying out a particular test.

The GenericUtil class contains a generic static method that finds the first value in an array that matches a given predicate. Your task is to complete the header of that method.

Complete the following code:
*/
public class GenericUtil
{
   /**
      Finds first match.
      @param value an array of values
      @param pred a predicate
      @return the first value for which pred is true
   */
   public static <T> T findFirstMatch(T[] values, Predicate pred)
   {
      for (T value : values   )
         if (pred.invoke(value))
            return value;
      return null;
   }
}

