package com.example.straysafe.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.straysafe.R;

public class MyUploadsActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_uploads);

        initializeViews();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MyUploadsActivity.this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(linearLayoutManager);
        rv.setHasFixedSize(true);
    }

    private void initializeViews() {
        rv=findViewById(R.id.rv_profile_myUploads);
    }
}