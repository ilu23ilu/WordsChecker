import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
    private HashSet<String> words;

    public WordsChecker(String text) {
        this.words = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }
    public boolean hasWord(String word){
        return words.contains(word);
    }
}
