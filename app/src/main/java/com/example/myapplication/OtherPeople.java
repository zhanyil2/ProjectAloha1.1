package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OtherPeople extends AppCompatActivity {
    /** to show name.*/
    private String name;
    /** to show age.*/
    private String age;
    /** to show university*/
    private String university;
    /** to show sex.*/
    private String sex;
    /** to show description.*/
    private String description;
    /** to show words.*/
    private String words;

    public void onCreate(Bundle savedInstanceState) {
        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chunk_others);
        /**
        NFC get a string.
         */
        //String a = "abjhfjbhjhb";
        /**
         * ********** not quite sure if this is right.**********
         */
        NFC leNFC = new NFC();
        String a = leNFC.getNFCContent();
        // when applied by NFC, change the a to what we have.
        //String a = "a/b/c/d/e/f/g/h/i";
        putTag(a);

    }
    public void treatString(String gotTag) {
        String[] strings = gotTag.split("/");
        name = strings[0];
        age = strings[1];
        university = strings[2];
        sex = strings[3];
        description = strings[4];
        words = strings[5];

    }
    public void putTag(String whatWeGet) {
        treatString(whatWeGet);
        TextView title = findViewById(R.id.title);
        title.setTextColor(Color.RED);
        title.setVisibility(View.VISIBLE);
        TextView nameShow = findViewById(R.id.othername);
        TextView ageShow = findViewById(R.id.otherage);
        TextView uniShow = findViewById(R.id.otheruniversity);
        TextView sexShow = findViewById(R.id.othersex);
        TextView desShow = findViewById(R.id.otherdescription);
        TextView wordShow = findViewById(R.id.otherwords);
        nameShow.setVisibility(View.VISIBLE);
        uniShow.setVisibility(View.VISIBLE);
        ageShow.setVisibility(View.VISIBLE);
        sexShow.setVisibility(View.VISIBLE);
        desShow.setVisibility(View.VISIBLE);
        wordShow.setVisibility(View.VISIBLE);
        nameShow.setText(name);
        ageShow.setText(age);
        uniShow.setText(university);
        sexShow.setText(sex);
        desShow.setText(description);
        wordShow.setText(words);

    }
}
