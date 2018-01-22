package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounter extends AppCompatActivity {

    EditText promptEditText;
    Button wordCountButton;
    TextView answerText;
    TextEntered textEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        promptEditText = findViewById(R.id.text_entry_prompt);
        wordCountButton = findViewById(R.id.word_count_button);
        answerText = findViewById(R.id.answer);

    }

    public void onWordCountButtonClick(View button){
        String text = promptEditText.getText().toString();
        Log.d(getClass().toString(), "The text entered was: " + text);
        textEntered = new TextEntered(text);

        int wordCount = textEntered.wordCount();
        String displayAnswer = "Word count is " + wordCount;

        answerText.setText(displayAnswer);
    }

}
