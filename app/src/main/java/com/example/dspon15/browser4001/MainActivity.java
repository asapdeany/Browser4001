package com.example.dspon15.browser4001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button go_button = null;
    WebView web_view = null;
    TextView url_field = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go_button = (Button) findViewById(R.id.go_button);
        web_view = (WebView) findViewById(R.id.web_view);
        url_field = (TextView) findViewById(R.id.url_field);

        go_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = url_field.getText().toString();
                //Do lots of error checking on the url_field
                web_view.getSettings().setJavaScriptEnabled(true);
                web_view.setWebViewClient(new WebViewClient());
                web_view.loadUrl(url);
            }
        });
    }
}
