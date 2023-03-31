package com.example.straysafe;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.ByteArrayOutputStream;


public class AddPostFragment extends Fragment {

    View view;
    ImageView camera;
    Button open_camera,upload;
    EditText editAddress, editDesc;
    ActivityResultLauncher<Intent> activityResultLauncher;
    Boolean state=false;
    ProgressBar progressBar;
    byte bb[];

    String name="",phone="",email="";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_add_post, container, false);
        initializeViews();

        progressBar.setVisibility(View.INVISIBLE);
        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK) {
                    onCaptureImageResult(result.getData());

                }
            }
        });
        open_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                captureImage();
            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                upload_details_Firebase(bb);
                progressBar.setVisibility(View.VISIBLE);
            }

        });

        return view;
    }

    public void captureImage() {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(cameraIntent, 101);
        activityResultLauncher.launch(cameraIntent);
    }

    void onCaptureImageResult(Intent data){
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        thumbnail.compress(Bitmap.CompressFormat.JPEG,90,bytes);
        bb= bytes.toByteArray();
        String file = Base64.encodeToString(bb,Base64.DEFAULT);
        camera.setImageBitmap(thumbnail);

    }

    private void initializeViews() {
        open_camera = view.findViewById(R.id.button);
        progressBar=view.findViewById(R.id.progressBar);
        editDesc =view.findViewById(R.id.editTextDesc);
        editAddress = view.findViewById(R.id.editTextAddress);
        camera = view.findViewById(R.id.imageView);
        upload = view.findViewById(R.id.button_upload);
    }
}