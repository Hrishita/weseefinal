package org.tensorflow.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// Container of fragments - precategory, selectcat, phoneauth, otp,register
public class PreHomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_home_screen);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragcontainer, new PreCategoryFragment(), "select category").commit();

    }
}