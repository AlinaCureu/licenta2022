package com.jonyapps.a2022proiect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class PaginaStart extends AppCompatActivity {

    private static final int waitingTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginastart1);
        showAnimation();
    }

    private void showAnimation() {
        ConstraintLayout layout =findViewById(R.id.layout);
        layout.postDelayed(this::goToMainActivity, waitingTime);
    }

    private void goToMainActivity() {
        Intent intent = new Intent(PaginaStart.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|
                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}