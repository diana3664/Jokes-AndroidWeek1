
package com.moringaschool.joke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView (R.id.signUpButton) Button msignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        msignUpButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        //Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);

    }

}