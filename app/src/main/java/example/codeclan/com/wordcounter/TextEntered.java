package example.codeclan.com.wordcounter;

/**
 * Created by admin on 22/01/2018.
 */

public class TextEntered {

    private String textEntered;

    public TextEntered(String text){
        this.textEntered = text;
    }

    public int wordCount(){
        String trimmed = this.textEntered.trim();
        int wordCount = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        return wordCount;
    }

}
