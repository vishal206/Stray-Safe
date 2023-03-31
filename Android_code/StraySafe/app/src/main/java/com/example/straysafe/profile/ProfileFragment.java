package com.example.straysafe.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.straysafe.R;


public class ProfileFragment extends Fragment {


    TextView nameText,emailText,phoneText,logout,received_don,donated;
    Button my_uploads,orders;
    int dr;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_profile, container, false);
        initializeView();

        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),MyOrdersActivity.class));
            }
        });

        my_uploads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MyUploadsActivity.class));
            }
        });



        return view;
    }

    private void initializeView() {
        nameText = view.findViewById(R.id.name_text);
        orders = view.findViewById(R.id.order_btn);
        emailText = view.findViewById(R.id.email_text);
        phoneText = view.findViewById(R.id.phone_text);
        logout = view.findViewById(R.id.logout);
        donated = view.findViewById(R.id.donated_btn);
        received_don = view.findViewById(R.id.recieved_btn);
        my_uploads = view.findViewById(R.id.my_animals);
    }
}