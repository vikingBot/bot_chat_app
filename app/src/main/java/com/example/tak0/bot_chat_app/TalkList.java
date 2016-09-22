package com.example.tak0.bot_chat_app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TalkList extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.talk_list);

        List<ListItem> list = new ArrayList<ListItem>();

        for(int i = 1; i < 15; i++){
            ListItem item = new ListItem();
            item.setImageID(R.drawable.default_img)
                    .setText("num"+i);
            list.add(item);
        }

        ImageArrayAdapter adapter = new ImageArrayAdapter(this, R.layout.list_info, list);

        listView = (ListView)findViewById(R.id.talk_list_view);
        listView.setAdapter(adapter);

    }
}
