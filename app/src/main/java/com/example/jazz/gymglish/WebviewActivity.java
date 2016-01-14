package com.example.jazz.gymglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {


    private WebView mwebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        mwebView = (WebView) findViewById(R.id.webView1);
        mwebView.getSettings().setJavaScriptEnabled(true);

        switch (MainActivity.itemPosition){


            case 0:mwebView.loadUrl("http://www.gymglish.com/fr");
                break;
            case 1:mwebView.loadUrl("www.frantastique.com");
                break;
            case 2:mwebView.loadUrl("www.vatefaireconjuguer.com");
                break;
            case 3:mwebView.loadUrl("www.delavignecorp.com");
                break;
            case 4:mwebView.loadUrl("http://www.thewordofthemonth.com/fr/word/cop");
                break;
            case 5:mwebView.loadUrl("https://www.richmorning.com/fr");
                break;
            case 6:mwebView.loadUrl("https://play.google.com/store/apps/details?id=com.jmorstudios.bubblehero&hl=fr");
                break;
        }

    }
}
