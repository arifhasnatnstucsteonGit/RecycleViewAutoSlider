package com.arifhasnat.recyclerviewslider.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.arifhasnat.recyclerviewslider.R;
import com.arifhasnat.recyclerviewslider.adapter.ProductsAdapter;
import com.arifhasnat.recyclerviewslider.model.ProductModel;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.os.Handler;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView productRecycler;
    private ProductsAdapter productsAdapter;
    private RecyclerView.LayoutManager recyclerViewLayoutManager;

    private ArrayList<ProductModel> productModelArrayList;
    Timer timer;
    public int position = 0;

    public int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        productRecycler = findViewById(R.id.recycler_view);
        productModelArrayList = new ArrayList<>();

        productRecycler.setHasFixedSize(true);
        recyclerViewLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        productRecycler.setLayoutManager(recyclerViewLayoutManager);

        productModelArrayList.add(new ProductModel("Image one",R.drawable.image1));
        productModelArrayList.add(new ProductModel("Image two",R.drawable.image2));
        productModelArrayList.add(new ProductModel("Image three",R.drawable.image3));
        productModelArrayList.add(new ProductModel("Image four",R.drawable.image4));
        productModelArrayList.add(new ProductModel("Image five",R.drawable.image5));
        productModelArrayList.add(new ProductModel("Image six",R.drawable.image6));

        Handler handler1 = new Handler();


            for (a = 0; a <= productModelArrayList.size(); a++) {
                final int finalA = a;
                handler1.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        productRecycler.getLayoutManager().scrollToPosition(finalA);
                        productRecycler.smoothScrollToPosition(finalA);
                        }

                }, 3000 * a);


            }
            productsAdapter = new ProductsAdapter(productModelArrayList);
            productRecycler.setAdapter(productsAdapter);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


//    @Override
//    public void run() {
//        runOnUiThread(new Runnable() {
//
//
//            public void run() {
//
//                if (position == productModelArrayList.size()){
//                    position =0;
//                    position++;
//                    }else {
//                    position++;
//
//                }
//                productRecycler.getLayoutManager().scrollToPosition(position);
//                productRecycler.smoothScrollToPosition(position);
//
//            }
//        });
//
//    }
}



