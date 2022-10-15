package com.rb.rbbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.activity_main_web);
        EditText urlET = findViewById(R.id.activity_main_url_et);
        Button goBT = findViewById(R.id.activity_main_go_bt);

        webView.loadUrl("https://www.google.com/");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        goBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlContent = urlET.getText().toString();
                if(!TextUtils.isEmpty(urlContent)){
                    String googleSearchURL = "https://www.google.com/search?q=" + urlContent;
                    webView.loadUrl(googleSearchURL);
                }
            }
        });
    }
}