package com.example.appsteam.mybookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Fiction extends AppCompatActivity {
    private TextView Fiction_id;
    private ImageView grid_id,filter_id;
    private RecyclerView fictionrv_id;
    private List<Modelclass>modelclassList;
    private Adapterclass adapterclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction);
        Fiction_id=(TextView)findViewById(R.id.Fiction_id);
        grid_id=(ImageView)findViewById(R.id.grid_id);
        filter_id=(ImageView)findViewById(R.id.filter_id);
        fictionrv_id=(RecyclerView)findViewById(R.id.fictionrv_id);
        modelclassList=new ArrayList<>();
        preparedata();
        adapterclass=new Adapterclass(modelclassList);
        fictionrv_id.setAdapter(adapterclass);
        fictionrv_id.setLayoutManager(new GridLayoutManager(this,2));

    }

    private void preparedata() {
        Modelclass mod=new Modelclass("A Tail Of Two Cities","by Charles Dicknes","$ 240",R.drawable.book1,R.drawable.wishlist);
        modelclassList.add(mod);
        mod=new Modelclass("Pride and Prejudic","by Jane Austen","$ 240",R.drawable.book2,R.drawable.wishlist);
        modelclassList.add(mod);
        mod=new Modelclass("Scion of Ikshvaku","by Amish Tripathi","$ 240",R.drawable.book3,R.drawable.wishlist);
        modelclassList.add(mod);
        Modelclass mod2=new Modelclass("A Tail Of Two Cities","by Charles Dicknes","$ 240",R.drawable.book1,R.drawable.wishlist);
        modelclassList.add(mod2);

    }
}
