package com.example.straysafe.wallet;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.straysafe.R;


public class WalletFragment extends Fragment {

    View view;
    public Button btn_buyCoin;
    public TextView txt_wallet_balance;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_wallet, container, false);

        initializeView();
        btn_buyCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BuyCoinActivity.class));

            }
        });

        return view;
    }

    private void initializeView() {
        btn_buyCoin=view.findViewById(R.id.btn_buyCoin);
        txt_wallet_balance=view.findViewById(R.id.txt_wallet_balance);
    }
}