package com.arifhasnat.recyclerviewslider.adapter;


import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.arifhasnat.recyclerviewslider.R;
import com.arifhasnat.recyclerviewslider.model.ProductModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder> {

    private ArrayList<ProductModel> productModels;

    public ProductsAdapter(ArrayList<ProductModel> productModels) {
        this.productModels = productModels;
    }

    @Override
    public ProductsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_adapter, parent,false);
        ProductsViewHolder viewHolder = new ProductsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProductsViewHolder holder, int position) {

        holder.nameText.setText(productModels.get(position).getName().toString());
        Picasso.get().load(productModels.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return productModels.size();
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder {
        private TextView nameText;
        public ImageView imageView;
        public ProductsViewHolder(View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.image);

        }
    }
}
