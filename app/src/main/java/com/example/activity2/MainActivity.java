package com.example.activity2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
public class MainActivity extends AppCompatActivity {
    private MaterialButton Login;
    private EditText password;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        Login =   findViewById(R.id.Login_btn);



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    private  void login(){
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            //correct
            Intent intent = new Intent(this,Activity3Library.class);
            startActivity(intent);//it starts new activity
        } else {
            loginFailed();//this calls faild login message method
        }
    }

    private void loginFailed(){ //login fails this error message shows next to the password field.
        password.setError("Password or Username didn't match");
    }

}