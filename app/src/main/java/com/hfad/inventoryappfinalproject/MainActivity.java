package com.hfad.inventoryappfinalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private Button signInButton;
    private Button signUpButton;
    private EditText editUsername;
    private EditText editPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInButton = findViewById(R.id.signin_button);
        signUpButton = findViewById(R.id.signup_button);

        editUsername = findViewById(R.id.usernameBox);
        editPassword = findViewById(R.id.passwordBox);

        final DatabaseHelper dbHelper = new DatabaseHelper(this);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!emptyValidation()) {
                    dbHelper.addUser(new Employees(editUsername.getText().toString(), editPassword.getText().toString()));
                    Toast.makeText(MainActivity.this, "Great! You have been successfully registered.", Toast.LENGTH_SHORT).show();
                    editUsername.setText("");
                    editPassword.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!emptyValidation()) {
                    Employees employees = dbHelper.queryUser(editUsername.getText().toString(), editPassword.getText().toString());
                    if (employees != null) {
                        Bundle mBundle = new Bundle();
                        mBundle.putString("employees", employees.getUsername());
                        Intent intent = new Intent(MainActivity.this, HomePageActivity.class); //can later change this to the homescreen activity
                        intent.putExtras(mBundle);
                        startActivity(intent);

                        Toast.makeText(MainActivity.this, "Welcome " + employees.getUsername(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "User not found. Please sign up as a new user or try again.", Toast.LENGTH_SHORT).show();
                        editPassword.setText("");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void onSubmitClick(View view) {
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
    }

    private boolean emptyValidation() {
        if (TextUtils.isEmpty(editUsername.getText().toString()) || TextUtils.isEmpty(editPassword.getText().toString())) {
            return true;
        }else {
            return false;
        }
    }
}
