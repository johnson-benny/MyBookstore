package com.example.appsteam.mybookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Uploadbookphoto extends AppCompatActivity {
    private Spinner yearpurchased_id,covertype_id,shippingcity_id,shippindstate_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploadbookphoto);
        yearpurchased_id = (Spinner) findViewById(R.id.yearpurchased_id);

        covertype_id = (Spinner) findViewById(R.id.covertype_id);

        shippingcity_id = (Spinner) findViewById(R.id.shippingcity_id);

        shippindstate_id = (Spinner) findViewById(R.id.shippindstate_id);
        String[] test1=new String[]{"Year Purchased","2010","2011","2012"};

        ArrayAdapter<String> gameKindArray1= new ArrayAdapter<String>(Uploadbookphoto.this,android.R.layout.simple_spinner_item, test1);
        gameKindArray1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearpurchased_id.setAdapter(gameKindArray1);


        String[] test2=new String[]{"Cover Type","Black","Yellow","Green"};

        ArrayAdapter<String> gameKindArray2= new ArrayAdapter<String>(Uploadbookphoto.this,android.R.layout.simple_spinner_item, test2);
        gameKindArray2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        covertype_id.setAdapter(gameKindArray2);




        String[] test3=new String[]{"City","Thodupuzha","Ernakulam","Udumbannoor"};

        ArrayAdapter<String> gameKindArray3= new ArrayAdapter<String>(Uploadbookphoto.this,android.R.layout.simple_spinner_item, test3);
        gameKindArray3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shippingcity_id.setAdapter(gameKindArray3);

        String[] test4=new String[]{"State","","Kerala","Tamilnadu"};

        ArrayAdapter<String> gameKindArray4= new ArrayAdapter<String>(Uploadbookphoto.this,android.R.layout.simple_spinner_item, test4);
        gameKindArray4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shippindstate_id.setAdapter(gameKindArray4);
    }
    }


