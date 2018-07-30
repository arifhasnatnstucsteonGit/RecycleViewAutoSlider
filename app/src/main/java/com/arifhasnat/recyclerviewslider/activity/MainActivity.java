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

        productModelArrayList.add(new ProductModel("name 1"));
        productModelArrayList.add(new ProductModel("name 2"));
        productModelArrayList.add(new ProductModel("name 3"));
        productModelArrayList.add(new ProductModel("name 4"));
        productModelArrayList.add(new ProductModel("name 5"));
        productModelArrayList.add(new ProductModel("name 6"));


//        for (int i = 0; i < productModelArrayList.size(); i++) {
//            final Handler handler = new Handler();
//
//            Runnable runnableCode = new Runnable() {
//                @Override
//                public void run() {
//
//
//                    position++;
//
//                    productRecycler.getLayoutManager().scrollToPosition(position);
//                    productRecycler.smoothScrollToPosition(position);
//
////                if (position == productModelArrayList.size()){
////                    position =0;
////                    position++;
////                    }else {
////                    position++;
////
////                }
//
//
//                    // productRecycler.getLayoutManager().scrollToPosition(position);
////                productRecycler.smoothScrollToPosition(position);
//                }
//
//
//            };
//            handler.postDelayed(runnableCode, 2000);
//        }
//
//
//        //handler.post(runnableCode);
//




        int a=0;
        Handler handler1 = new Handler();
        for ( a = 0; a<=productModelArrayList.size() ;a++) {


            final int finalA = a;
            handler1.postDelayed(new Runnable() {

                @Override
                public void run() {
                    productRecycler.getLayoutManager().scrollToPosition(finalA);
                    productRecycler.smoothScrollToPosition(finalA);


                }



            }, 3000 * a);


//            if (a == productModelArrayList.size()){
//                a = 0;
//            }

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



