package com.example.companyform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText customername;
    private EditText mobilenumber;
    private EditText emailid;
    private EditText address;
    private EditText manufufactureCompany;
    private EditText taxid;
    private EditText comapanyId;
    private EditText orignizationName;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customername = findViewById(R.id.customer);
        mobilenumber = findViewById(R.id.mobile);
        emailid = findViewById(R.id.email);
        address = findViewById(R.id.address);
        manufufactureCompany = findViewById(R.id.manufacturer);
        taxid = findViewById(R.id.tax);
        orignizationName=findViewById(R.id.origanizationname);
        comapanyId=findViewById(R.id.companyid);
        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("orignization","Glimray");
                intent.putExtra("name","Akshay Chaturvedi");
                intent.putExtra("mobile",886038348);
                intent.putExtra("mail","akshay@glimray.com");
                intent.putExtra("address","#17,JSSATE-STEP C-20/1,Sector 62 Noida");
                intent.putExtra("manu","Demochan");
                intent.putExtra("ta",1029);
                intent.putExtra("com",4291);
                startActivity(intent);
            }
        });


    }
}