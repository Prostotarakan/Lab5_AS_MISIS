package com.example.lab5_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickIt(View view) {
        TextInputLayout txtt = (TextInputLayout) findViewById(R.id.addr);
        EditText txtt1 = (EditText) txtt.getEditText();
        Editable txtt2 = (Editable)  txtt.getEditText().getText();

        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra("res", txtt2.toString());
        startActivity(intent);
    }
}