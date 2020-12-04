import java.util.Set;

public class SpellCheck {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> dictionaryWords = readWords("words");
        Set<String> documentWords = readWords("alice30.txt");
        
        for(String word : documentWords) { 
            if(!dictionaryWords.contains(word)) {
                System.out.println(word);
            }
        }
        
    }
    
    public static Set<String> readWords (String fileName) throws FileNotFOundException {
        File file = new File("files/" + fileName);
        
        Scanner in = new Scanner(file);
        in.UseDelimiter
    }
}
