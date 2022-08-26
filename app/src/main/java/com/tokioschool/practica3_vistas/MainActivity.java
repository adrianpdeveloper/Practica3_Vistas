package com.tokioschool.practica3_vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.tokioschool.practica3_vistas.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listeners();
    }

    private void functionNotAvailableSnackbar() {
        Snackbar.make(binding.getRoot(),R.string.main_activity_snackbar_not_available_function, BaseTransientBottomBar.LENGTH_LONG).show();
    }

    private void listeners() {
        //GET NEW PASSWORD
        binding.activityMainTv2GetNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Todo: funcionaliodad get new password
                functionNotAvailableSnackbar();
            }
        });

        //CREATE NEW ACCOUNT
        binding.activityMainTv4CreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Todo: funcionaliodad create new account
                functionNotAvailableSnackbar();
            }
        });
    }
}