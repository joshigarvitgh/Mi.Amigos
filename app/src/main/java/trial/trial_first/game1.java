package trial.trial_first;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Garvit Joshi on 17-07-2017.
 */

public class game1 extends Activity {
    int level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(level==1)
        {
        setContentView(R.layout.game1);
        WebView myWebView = (WebView) findViewById(R.id.game1);
        myWebView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://miamigoic.azurewebsites.net/Game1/");
        }
        else if (level==2) {

            setContentView(R.layout.game1lv2);
            WebView myWebView = (WebView) findViewById(R.id.game1lv2);
            myWebView.setWebViewClient(new WebViewClient());

            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.loadUrl("http://miamigoic.azurewebsites.net/Game1/index2.html");
        }
        else {
            setContentView(R.layout.game1lv3);
            WebView myWebView = (WebView) findViewById(R.id.game1lv3);
            myWebView.setWebViewClient(new WebViewClient());

            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.loadUrl("http://miamigoic.azurewebsites.net/Game1/index3.html");
        }
        }


     }

