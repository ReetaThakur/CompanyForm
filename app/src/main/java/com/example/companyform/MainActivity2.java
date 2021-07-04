package com.example.companyform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText orig;
    private EditText cus;
    private EditText mob;
    private EditText gmail;
    private EditText add;
    private EditText manu;
    private EditText tax;
    private EditText comId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        orig=findViewById(R.id.origanizationname1);
        cus=findViewById(R.id.customer1);
        mob=findViewById(R.id.mobile1);
        orig=findViewById(R.id.origanizationname1);
        gmail=findViewById(R.id.email);
        add=findViewById(R.id.address1);
        manu=findViewById(R.id.manufacturer1);
        tax=findViewById(R.id.tax1);
        comId=findViewById(R.id.companyid1);

        Intent intent=getIntent();
        String orignazationName=intent.getStringExtra("orignization");
        orig.setText(orignazationName);
        String name=intent.getStringExtra("name");
        cus.setText(name);
        int mobile=intent.getIntExtra("mobile",3);
        mob.setText(mobile);
        String id=intent.getStringExtra("mail");
        gmail.setText(id);
        String address=intent.getStringExtra("address");
        add.setText(address);
        String manufacture=intent.getStringExtra("manu");
        manu.setText(manufacture);
        int taxid=intent.getIntExtra("ta",7);
        tax.setText(taxid);
        int com=intent.getIntExtra("com",8);
    }
}