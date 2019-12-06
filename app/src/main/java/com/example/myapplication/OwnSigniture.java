package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class OwnSigniture extends AppCompatActivity {
    /**the name of owner.*/
    private String name;
    /**the age of owner.*/
    private String age;
    /**the name of owner's university*/
    private String university;
    /**the sex of the owner*/
    private String sex;
    /**the description of owner.*/
    private String description;
    /** owner's words*/
    private String words;

    /**@return owners edit their own information by this.*/
    public void onCreate(Bundle savedInstanceState) {
        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chunk_own);
        Button save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                edit();
            }
        });

    }
    public void edit() {
        EditText nameT = findViewById(R.id.name);
        name = nameT.getText().toString();
        EditText ageT = findViewById(R.id.age);
        age = ageT.getText().toString();
        EditText universityT = findViewById(R.id.university);
        university = universityT.getText().toString();
        EditText sexT = findViewById(R.id.sex);
        sex = sexT.getText().toString();
        EditText descriptionT = findViewById(R.id.description);
        description = descriptionT.getText().toString();
        EditText wordsT = findViewById(R.id.signature);
        words = wordsT.getText().toString();
        putOn(makeTag());
    }
    public void putOn(String toPut) {
        //NFC put
    }
    public String makeTag() {
        String toSend = name +"/" + age + "/" + university + "/" + sex + "/" + description + "/"
                + words;
        return toSend;
    }
}
