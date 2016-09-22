package com.example.tak0.bot_chat_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tak0 on 2016/09/19.
 */
public class UserList extends Activity {

    String[] groupText = {"me", "group", "friend"};

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.user_list);

        ImageView imageView = (ImageView)findViewById(R.id.talkButton);
        imageView.setImageResource(R.drawable.default_img);
        imageView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(UserList.this, TalkList.class);
                startActivity(intent);
            }
        });
    }

}