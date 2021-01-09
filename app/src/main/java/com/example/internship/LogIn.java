package com.example.internship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    EditText username,password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_log_in);


        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        submit=findViewById(R.id.submit);
        Bundle bundle=new Bundle();
     //   String s1="User Admin 1";

        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name=username.getText().toString();
                String pass=password.getText().toString();

                if(user_name.equals("dastrade1") && pass.equals("123456X")){

//                    bundle.putString("name",s1);
//                    bundle.putString("position","Manager");
//                    bundle.putString("mobile","123456789");
//                    bundle.putString("email","useradmin1@outlook.com");
//                    bundle.putString("address","West Bengal,pin-7000XX, India");
//                    ProfileFragment fragment=new ProfileFragment();
//                    fragment.setArguments(bundle);

                    Toast.makeText(LogIn.this,"Welcome",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("vikash","vikash");
                    startActivity(intent);
                }

                else if (user_name.equals("dastrade2") && pass.equals("123456Y")){
                    Toast.makeText(LogIn.this,"Welcome",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("vikash","vikku");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LogIn.this,"Invalid Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}