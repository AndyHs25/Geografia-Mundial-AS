package com.example.geografiamundial;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

import java.time.LocalTime;

public class PortadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_portada);

        LottieAnimationView animationView = findViewById(R.id.animation_view);
        animationView.setAnimation("Animation1.json");
        animationView.setSpeed(3f);
        animationView.setRepeatCount(LottieDrawable.INFINITE);
        animationView.playAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(PortadaActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}