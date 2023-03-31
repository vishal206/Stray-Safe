package com.example.straysafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.straysafe.home.HomeFragment;
import com.example.straysafe.profile.ProfileFragment;
import com.example.straysafe.store.StoreFragment;
import com.example.straysafe.wallet.WalletFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    private void initializeView() {
        bottomNavigationView=findViewById(R.id.bottom_navigation);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main, new HomeFragment()).commit();
                return true;
            case R.id.store:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main, new StoreFragment()).commit();
                return true;
            case R.id.add:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main, new AddPostFragment()).commit();
                return true;
            case R.id.wallet:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main, new WalletFragment()).commit();
                return true;
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main, new ProfileFragment()).commit();
                return true;
        }
        return false;
    }
}