package com.example.yourcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        EditText name= findViewById(R.id.name);
        EditText age= findViewById(R.id.age);
        EditText job= findViewById(R.id.job);
        EditText phone= findViewById(R.id.phone);
        EditText email= findViewById(R.id.email);
        Button next= findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(name.getText().toString().isEmpty()){
                    name.setError("Enter your name");
                }
                else if(age.getText().toString().isEmpty()){
                    age.setError("Enter your age");
                }
                else if(job.getText().toString().isEmpty()){
                    job.setError("Enter your job");
                }
                else if(phone.getText().toString().isEmpty()){
                    phone.setError("Enter your phone number");
                }
                else if(phone.length()==0 || phone.length()>8 || phone.length()<8){
                    phone.setError("Please re-enter your Phone Number");
                }
                else if(email.getText().toString().isEmpty()){
                    email.setError("Enter your email address");
                }
                else{
                    Intent intent= new Intent(MainActivity.this, yourcv2.class);
                    String namedata=name.getText().toString();
                    String agedata= age.getText().toString();
                    String jobdata= job.getText().toString();
                    String phonedata= phone.getText().toString();
                    String emaildata= email.getText().toString();
                    intent.putExtra("name", namedata);
                    intent.putExtra("age", agedata);
                    intent.putExtra("job", jobdata);
                    intent.putExtra("phone", phonedata);
                    intent.putExtra("email", emaildata);
                    startActivity(intent);

                }
            }
        });
    }
}