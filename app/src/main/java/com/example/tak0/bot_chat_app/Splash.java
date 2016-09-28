package com.example.tak0.bot_chat_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        Handler handler = new Handler();
        handler.postDelayed(new splashHandler(), 1000);
    }

    class splashHandler implements Runnable {

        @Override
        public void run(){
            Intent intent = new Intent(Splash.this, Main.class);
            startActivity(intent);
            Splash.this.finish();
        }
    }
}
