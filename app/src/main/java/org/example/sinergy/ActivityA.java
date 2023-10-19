package org.example.sinergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        findViewById(R.id.open_activityb).setOnClickListener(view -> {
            startActivity(
                    new Intent(this, ActivityB.class)
                            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            );
        });
    }
}
