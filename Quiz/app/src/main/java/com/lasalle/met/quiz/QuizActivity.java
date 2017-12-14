package com.lasalle.met.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by FurruPi on 13/12/17.
 */

public class QuizActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        final String texto = intent.getStringExtra("Extra1");
        setContentView(R.layout.activity_quiz);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        textView = (TextView) findViewById(R.id.textView_question);
        button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quiz",texto);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("QuizActivity","Checked");
            }
        });
    }
}
