package com.example.tak0.bot_chat_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserList extends Fragment {

    String[] groupName = {"info", "group", "friend"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        View view = inflater.inflate(R.layout.user_list, group, false);

        ExpandableListView listView = (ExpandableListView) view.findViewById(R.id.expandableListView);

        List<String> parent = new ArrayList<String>();
        for(String name: groupName){
            parent.add(name);
        }



        List<Map<String, String>> groupList = new ArrayList<Map<String, String>>();
        List<List<Map<String, String>>> childList = new ArrayList<List<Map<String,String>>>();


        for (String name: groupName) {
            // Group（親）のリスト
            Map<String, String> groupElement = new HashMap<String, String>();
            groupElement.put("GROUP_TITLE", name);
            groupList.add(groupElement);
            // Childのリスト
            List<Map<String, String>> childElements = new ArrayList<Map<String, String>>();
            for (int j = 0; j < 5; j++) {
                Map<String, String> child = new HashMap<String, String>();
                child.put("CHILD_TITLE", "Child " + j);
                child.put("SUMMARY", "Summary " + j);
                childElements.add(child);
            }
            childList.add(childElements);
        }

        SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(
                getContext(),
                // Group(親)のリスト
                groupList,
                // Group(親)のレイアウト
                R.layout.group_text,
                // Group(親)のリストで表示するMapのキー
                new String []{"GROUP_TITLE"},
                // Group(親)のレイアウト内での文字を表示するTextViewのID
                new int []{R.id.group_text},
                // Child(子)のリスト
                childList,
                // Child(子)のレイアウト
                R.layout.list_info,
                // Child(子)のリストで表示するMapのキー
                new String []{"CHILD_TITLE", "SUMMARY"},
                // Child(子)のレイアウト内での文字を表示するTextViewのID
                new int []{android.R.id.text1, android.R.id.text2}
        );

        listView.setAdapter(adapter);


        return view;
    }

}