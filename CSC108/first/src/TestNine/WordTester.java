package TestNine;

//The following classes are used to check your work:

public class WordTester 
{
 public static void main(String[] args)
 {
    Word w = new Word("Hello");
    System.out.println(w.makeDouble().makeDouble().toString());
    System.out.println("Expected: HelloHelloHelloHello");
 }
}