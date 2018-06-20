package com.example.appsteam.mybookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class checkout extends AppCompatActivity {
    private Button checkoutbutton_id;
    private TextView total_id,totalrate_id;
    private RecyclerView checkoutrv_id;
    private List<Modelclasscheck> modelclasscheckList;
    private Adapterclasscheck adapterclasscheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        checkoutbutton_id=(Button)findViewById(R.id.checkoutbutton_id);
        total_id=(TextView) findViewById(R.id.total_id);
        totalrate_id=(TextView) findViewById(R.id.totalrate_id);
        checkoutrv_id=(RecyclerView)findViewById(R.id.checkoutrv_id);
        modelclasscheckList=new ArrayList<>();
        preparedata();
        adapterclasscheck=new Adapterclasscheck(modelclasscheckList);
        checkoutrv_id.setAdapter(adapterclasscheck);
        checkoutrv_id.setLayoutManager(new LinearLayoutManager(this));

    }

    private void preparedata() {
        Modelclasscheck mod=new Modelclasscheck("A Tail Of Two Cities","by Charles Dickness","1","$240",R.drawable.book1);
        modelclasscheckList.add(mod);

        mod=new Modelclasscheck("Scion of Ikshvaku","by Amish Tripathi","1","$240",R.drawable.book3);
        modelclasscheckList.add(mod);
    }
}
