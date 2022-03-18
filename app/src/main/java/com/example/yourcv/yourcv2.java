package com.example.yourcv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yourcv2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourcv2);

        TextView nameinfo= findViewById(R.id.namedetale);
        TextView jobinfo= findViewById(R.id.jobdetail);
        TextView ageinfo= findViewById(R.id.agedetail);
        TextView phoneinfo= findViewById(R.id.phonedetail);
        TextView emailinfo= findViewById(R.id.emaildetail);
        Button gmail= findViewById(R.id.gmail);
        Button phoneapp= findViewById(R.id.phone);

        Bundle bundle= getIntent().getExtras();
        String name2= bundle.getString("name");
        String job2= bundle. getString("job");
        String age2= bundle.getString("age");
        String phone2= bundle.getString("phone");
        String email2= bundle.getString("email");
        nameinfo.setText(name2);
        jobinfo.setText(job2);
        ageinfo.setText(age2);
        phoneinfo.setText(phone2);
        emailinfo.setText(email2);

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mailClient = new Intent(Intent.ACTION_VIEW, Uri.parse("com.google.android.gm"));
                startActivity(mailClient);
            }
        });
        phoneapp. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:123456789"));
                startActivity(callIntent);
            }
        });
    }
}