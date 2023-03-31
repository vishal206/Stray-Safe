package com.example.straysafe.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.straysafe.R;

import java.util.List;

public class MyOrdersActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MyOrdersActivity.this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(linearLayoutManager);
        rv.setHasFixedSize(true);
        initializeView();
    }

    private void initializeView() {
        rv=findViewById(R.id.myorders_rv);
    }
}