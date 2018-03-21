package com.example.josecisneros.proyecto_investigacion;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button btnchoose;
    Button btnupload;
    ImageView imgview;

    private Uri filePath;

    private final int PICK_IMAGE_REQUEST = 71;

    //firebase
    FirebaseStorage storage;
    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnchoose = findViewById(R.id.btnchoose);
        btnupload = findViewById(R.id.btnupload);
        imgview = findViewById(R.id.imgview);

        btnchoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseImg();
            }
        });
        btnupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadImg();
            }
        });

        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();

    }

    public void chooseImg(){

    }

    public void uploadImg(){

    }

    @Override
    public void onClick(View view) {

    }
}
