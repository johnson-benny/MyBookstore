package com.example.appsteam.mybookstore;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapterclasscheck extends RecyclerView.Adapter<Adapterclasscheck.MyViewHolder> {
    private List<Modelclasscheck> modelclasscheckList;

    public Adapterclasscheck(List<Modelclasscheck> modelclasscheckList) {
        this.modelclasscheckList = modelclasscheckList;
    }

    @NonNull
    @Override
    public Adapterclasscheck.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singlecheckout, parent, false);

        return   new Adapterclasscheck.MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapterclasscheck.MyViewHolder holder, int position) {
        Modelclasscheck m=modelclasscheckList.get(position);
        holder.checkoutimage_id.setImageResource(m.getCheckoutimage_id());

        holder.booknamec_id.setText(m.getBooknamec_id());
        holder.authernamec_id.setText(m.getAuthernamec_id());
        holder.Qty_id.setText(m.getQty_id());
        holder.ratec_id.setText(m.getRatec_id());
    }

    @Override
    public int getItemCount() {
        return modelclasscheckList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView checkoutimage_id;
        private TextView booknamec_id,authernamec_id,Qty_id,ratec_id;
        public MyViewHolder(View itemView) {
            super(itemView);
            checkoutimage_id=(ImageView)itemView.findViewById(R.id.checkoutimage_id);

            booknamec_id=(TextView) itemView.findViewById(R.id.booknamec_id);
            authernamec_id=(TextView) itemView.findViewById(R.id.authernamec_id);
            Qty_id=(TextView) itemView.findViewById(R.id.Qty_id);

            ratec_id=(TextView) itemView.findViewById(R.id.ratec_id);
        }
    }
}
