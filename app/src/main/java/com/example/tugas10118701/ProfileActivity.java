package com.example.tugas10118701;
//8 April 2021, 10118701, Stenly Gustaf Damping, IF10
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tugas10118701.R;

public class ProfileActivity extends AppCompatActivity {
    Button kembali ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        kembali  = (Button) findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                ProfileActivity.this.startActivity(intent);
                ProfileActivity.this.finish();
            }
        });
    }
}