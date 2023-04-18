package WörterZählen;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private String text;
    private HashMap<String, Integer> wordCounter = new HashMap<>();

    public WordCounter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void convertTextToMap(){

String replace = text.replaceAll(","," ");
       String[] splitText = text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            if (wordCounter.get(splitText[i]) == null){
                wordCounter.put(splitText[i], 1);
            }
            else {
                wordCounter.put(splitText[i], wordCounter.get(splitText[i]) + 1);
            }
        }
    }
}
