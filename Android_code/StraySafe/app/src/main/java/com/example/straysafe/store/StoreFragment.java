package com.example.straysafe.store;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.straysafe.R;


public class StoreFragment extends Fragment {

    View view;
    Button food1,food2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_store, container, false);
        initializeView();

        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),BuyActivity.class);
                i.putExtra("food_btn",1);
                startActivity(i);
            }
        });
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(),BuyActivity.class);
                i2.putExtra("food_btn",2);
                startActivity(i2);
            }
        });

        return view;
    }

    private void initializeView() {
        food1 = view.findViewById(R.id.food1);
        food2 = view.findViewById(R.id.food2);
    }
}