package com.Guruprasad.innovativesolutions.Activities.Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.Guruprasad.innovativesolutions.R;
import com.Guruprasad.innovativesolutions.databinding.ActivityVerifyOtpactivityBinding;

public class VerifyOTPActivity extends AppCompatActivity {
    ActivityVerifyOtpactivityBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerifyOtpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding.buttonVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerifyOTPActivity.this,SignupActivity.class));
            }
        });
    }
}