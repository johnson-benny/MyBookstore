package com.example.appsteam.mybookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ShippingActivity extends AppCompatActivity {

private android.widget.Spinner shippingcity_id,shippindstate_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping);
        shippingcity_id=(Spinner)findViewById(R.id.shippingcity_id);
        shippindstate_id=(Spinner)findViewById(R.id.shippindstate_id);

        String[] test=new String[]{"City","Thodupuzha","Ernakulam","Udumbannoor"};

        ArrayAdapter<String> gameKindArray= new ArrayAdapter<String>(ShippingActivity.this,android.R.layout.simple_spinner_item, test);
        gameKindArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       shippingcity_id.setAdapter(gameKindArray);

        String[] test1=new String[]{"State","","Kerala","Tamilnadu"};

        ArrayAdapter<String> gameKindArray1= new ArrayAdapter<String>(ShippingActivity.this,android.R.layout.simple_spinner_item, test1);
        gameKindArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shippindstate_id.setAdapter(gameKindArray1);
    }
}
