package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private String[] ques={"1.Java is an object oriented language."
             ,"2.int x[] = new int[]{10,20,30}Arrays can also be created and initialize as in above statement."
             ,"3.Garbage Collection is manual process.","4.Constructor overloading is not possible in Java."};
     private boolean[] ans={true,true,false,false};
     private int score=0;
     Button yes;
     Button no;
     TextView question;
     private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.textView2);
        question.setText(ques[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= ques.length - 1) {
                    if (ans[index] == true)
                        score++;
                    index++;
                    if (index <= ques.length - 1)
                        question.setText(ques[index]);
                    else
                        Toast.makeText(MainActivity.this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= ques.length - 1) {
                    if (ans[index] == false)
                        score++;
                    index++;
                    if (index <= ques.length - 1)
                        question.setText(ques[index]);
                    else
                        Toast.makeText(MainActivity.this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}