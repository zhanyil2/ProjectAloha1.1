package com.example.myapplication;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


public class Mainactivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        LinearLayout now = findViewById(R.id.choose);
        //set two button
        Button editMine = findViewById(R.id.editOwn);
        Button search = findViewById(R.id.search);
        //set two intent
        final Intent intent1 = new Intent(this, NFC.class);
        final Intent intent2 = new Intent(this, NFCSS.class);
        //two click listener
        editMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                startActivity(intent1);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                startActivity(intent2);
            }
        });
        /**final Intent intent3 = new Intent(this, NFC.class);
        startActivity(intent3);*/
    }

}
