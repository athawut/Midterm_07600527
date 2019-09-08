package com.example.midterm07600527;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        String nusername = intent.getStringExtra("username");
        String ngoesto = intent.getStringExtra("goesto");
        String nlivein = intent.getStringExtra("livein");
        String nfrom = intent.getStringExtra("from");

        TextView username = findViewById(R.id.textViewUsername);
        TextView goesto = findViewById(R.id.textViewGoesto);
        TextView livein = findViewById(R.id.textViewLivein);
        TextView from = findViewById(R.id.textViewFrom);

        username.setText(nusername);
        goesto.setText(ngoesto);
        livein.setText(nlivein);
        from.setText(nfrom);




        Toast t = Toast.makeText(ProfileActivity.this,R.string.welcome+nusername,Toast.LENGTH_LONG);
        t.show();

    }
}
