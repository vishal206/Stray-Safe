package com.example.straysafe.wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.straysafe.R;

public class BuyCoinActivity extends AppCompatActivity {

    EditText edt_amount;
    TextView txt_balance;
    Button btn_payment;
    int balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_coin);

        initializeView();
    }

    private void initializeView() {
        edt_amount=findViewById(R.id.edt_amount);
        btn_payment=findViewById(R.id.btn_payment);
        txt_balance=findViewById(R.id.txt_balance);
    }
}