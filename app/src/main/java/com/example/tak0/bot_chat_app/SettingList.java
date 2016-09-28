package com.example.tak0.bot_chat_app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tak0 on 2016/09/20.
 */
public class SettingList extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        View view = inflater.inflate(R.layout.setting_list, group, false);
        return view;
    }

}
