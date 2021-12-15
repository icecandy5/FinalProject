package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button EnterNewProduct = findViewById(R.id.NewButton);
        Button ViewProduct = findViewById(R.id.ViewButton);

        EnterNewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {OpenEnterNewProduct();}
        });

        ViewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {OpenViewProduct();};
        });
    }
    public void OpenEnterNewProduct() {
        Intent EnterNewProduct = new Intent(this, com.example.finalproject.EnterNewProduct.class);
        startActivity(EnterNewProduct);
    }

    public void OpenViewProduct() {
        Intent ViewProduct = new Intent(this, com.example.finalproject.ViewProduct.class);
        startActivity(ViewProduct);
    }
}