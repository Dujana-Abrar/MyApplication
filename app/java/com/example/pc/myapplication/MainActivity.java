package com.example.pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view)
    {
        String Username = "GCI";
        String Password = "1234";

        Intent intent = new Intent(this, DisplayCoffeeVariety.class);
        EditText email =  findViewById(R.id.editText);
        EditText password =  findViewById(R.id.editText2);



        // 4. Check if fields are null
        if(email.getText() != null && password.getText() != null)
        {
            // 4.a check if username and password are OK
            if(email.getText().toString().equals(Username) &&
                    password.getText().toString().equals(Password) )
            {
                startActivity(intent);
            } else
            {
             Toast toast = Toast.makeText(this, "Wrong id or Password", Toast.LENGTH_SHORT);
             toast.show();
            }
        }

        else
        {
            Toast toast = Toast.makeText(this, "All fields are mandatory", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

}
