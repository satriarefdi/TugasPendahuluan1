package com.example.root.satria_1202150011_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private static final android.R.attr R = ;
    TextView tvRestaurant, tvMenu, tvPortion, tvprice;
    String restaurant, menu;
    int portion, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvRestaurant = (TextView)findViewById(R.id.tvRestaurant);
        tvMenu = (TextView)findViewById(R.id.tvMenu);
        tvPortion = (TextView)findViewById(R.id.tvPortion);
        tvprice = (TextView)findViewById(R.id.tvprice);
        Intent intent = getIntent();


        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion", 0);
        price = intent.getIntExtra("price", 0);


        tvRestaurant.setText(restaurant);
        tvMenu.setText(menu);
        tvprice.setText(""+price);
        tvPortion.setText(""+portion);

        Toast toast = null;
        if(price < 65000){
            toast = Toast.makeText(getApplicationContext(),"Makan Disini lebih Murah", 200);
        }else{
            toast = Toast.makeText(getApplicationContext(),"Jangan makan di sini mahal", 200);
        }
        toast.show();

    }

}
