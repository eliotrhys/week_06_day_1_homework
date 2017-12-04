import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> results;

    public EightBall() {
        this.results = new ArrayList<>();
    }

    public int getWordCount() {
        return this.results.size();
    }

    public void addWord(String word) {
        this.results.add(word);
    }

    public String shakeThat() {
        Collections.shuffle(results);
        return results.get(0);
    }

}