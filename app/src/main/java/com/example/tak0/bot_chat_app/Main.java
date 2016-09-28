package com.example.tak0.bot_chat_app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.widget.TabHost;


public class Main extends FragmentActivity {

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.main);

        FragmentTabHost tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.container);

        TabHost.TabSpec user, talk, setting;

        user = tabHost.newTabSpec("user")
                .setIndicator("user");
        tabHost.addTab(user, UserList.class, null);

        talk = tabHost.newTabSpec("talk")
                .setIndicator("talk");
        tabHost.addTab(talk, TalkList.class, null);

        setting = tabHost.newTabSpec("setting")
                .setIndicator("setting");
        tabHost.addTab(setting, SettingList.class, null);



    }

}
