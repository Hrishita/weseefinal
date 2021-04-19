package org.tensorflow.demo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

                    FirebaseUser user;
                    user= FirebaseAuth.getInstance().getCurrentUser();
                    if(user==null){
                        Intent intent=new Intent(SplashScreenActivity.this, PreHomeScreenActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Intent intent=new Intent(SplashScreenActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }


    }
}