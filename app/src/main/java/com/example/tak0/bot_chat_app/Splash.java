package com.example.tak0.bot_chat_app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Splash extends AppCompatActivity {

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
            Intent intent = new Intent(Splash.this, UserList.class);
            startActivity(intent);
            Splash.this.finish();
        }
    }
}
