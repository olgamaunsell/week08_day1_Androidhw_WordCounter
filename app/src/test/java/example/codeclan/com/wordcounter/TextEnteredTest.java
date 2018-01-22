package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 22/01/2018.
 */

public class TextEnteredTest {

    TextEntered textEntered;

    @Before
    public void before(){
        String text = "Here's some words to count";
        textEntered = new TextEntered(text);

    }

    @Test

    public void canCountWords(){
        assertEquals(5, textEntered.wordCount() );
    }
}
