package com.example.appsteam.mybookstore;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapterclass extends RecyclerView.Adapter<Adapterclass.MyViewHolder>{
    private List<Modelclass> modelclassList;

    public Adapterclass(List<Modelclass> modelclassList) {
        this.modelclassList = modelclassList;
    }



    @NonNull
    @Override
    public Adapterclass.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singlefiction, parent, false);

        return   new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapterclass.MyViewHolder holder, int position) {
        Modelclass m=modelclassList.get(position);
        holder.bookimage_id.setImageResource(m.getBookimage_id());
        holder.wishlist_id.setImageResource(m.getWishlist_id());
        holder.bookname_id.setText(m.getBookname_id());
        holder.authername_id.setText(m.getAuthername_id());
        holder.rate_id.setText(m.getRate_id());


    }

    @Override
    public int getItemCount() {

            return modelclassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView bookimage_id,wishlist_id;
        private TextView bookname_id,authername_id,rate_id;
        public MyViewHolder(View itemView) {
            super(itemView);

            bookimage_id=(ImageView)itemView.findViewById(R.id.bookimage_id);
            wishlist_id=(ImageView)itemView.findViewById(R.id.wishlist_id);
            bookname_id=(TextView) itemView.findViewById(R.id.bookname_id);
            authername_id=(TextView) itemView.findViewById(R.id.authername_id);
            rate_id=(TextView) itemView.findViewById(R.id.rate_id);

        }
    }
}
