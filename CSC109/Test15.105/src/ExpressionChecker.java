import java.util.Stack;

public class ExpressionChecker
{
   public boolean checkParentheses(String expression)
   {
      int c = 0;
      Stack<String> stk = new Stack<String>();
      for (int i = 0; i < expression.length(); i++)
      {
         String part = expression.substring(i, i + 1);
         stk.push(part);
         if(part.equals(")")) {
             c++;
         }
      }
      
      while (!stk.isEmpty())
      {
         String part = stk.pop();
         if(part.equals("(")) {
             c--;
         }
      }
      
      return c == 0;
   }
}
