package org.example.sinergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityC extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        findViewById(R.id.open_activitya).setOnClickListener(this);
        findViewById(R.id.open_activityd).setOnClickListener(this);
        findViewById(R.id.close_activityc).setOnClickListener(this);
        findViewById(R.id.close_stack).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.open_activitya) {
            startActivity(new Intent(this, ActivityA.class));
            finishAffinity();
        }
        else if (view.getId() == R.id.open_activityd) {
            startActivity(
                    new Intent(this, ActivityD.class)
                            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            );
            finishAffinity();
        }
        else if (view.getId() == R.id.close_activityc) {
            finish();
        }
        else if (view.getId() == R.id.close_stack) {
            finishAffinity();
        }
    }
}
