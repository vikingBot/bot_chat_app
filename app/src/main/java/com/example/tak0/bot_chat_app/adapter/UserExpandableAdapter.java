package com.example.tak0.bot_chat_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tak0.bot_chat_app.ListItem;
import com.example.tak0.bot_chat_app.Main;
import com.example.tak0.bot_chat_app.R;

import java.util.List;

/**
 * Created by tak0 on 2016/09/27.
 */
public class UserExpandableAdapter extends BaseExpandableListAdapter {

    private LayoutInflater inflater;
    private List<String> group;
    private List<List<ListItem>> children;
    private Context context;

    public UserExpandableAdapter(Main m, List<String> group, List<List<ListItem>> children){
        inflater =(LayoutInflater) m.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.group = group;
        this.children = children;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition){
        return children.get(groupPosition).get(childPosition);
    }

    @Override
    public int getGroupCount() {
        return children.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return group.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }


    @Override
    public int getChildrenCount(int groupPosition) {
        return children.get(groupPosition).size();
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent){
        // インフレータでレイアウトの複製
        LinearLayout parentLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.group_text, null);
        // 住所用テキストビューの取得
        TextView text = (TextView) parentLayout.findViewById(R.id.group_text);
        // 親クラスリストからデータを取得し、セット
        text.setText(group.get(groupPosition));

        return parentLayout;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent){
        // インフレータでレイアウトの複製
        LinearLayout childLayout = (LinearLayout) LayoutInflater.from(context).inflate(
                R.layout.list_info, null);
        // 年齢用テキストビューの取得
        TextView mainText = (TextView) childLayout.findViewById(R.id.list_main_text);
        // 名前用テキストビューの取得
        TextView subText = (TextView) childLayout.findViewById(R.id.list_sub_text);

        // 子クラスリストからデータを取得し、セット
        mainText.setText(String.valueOf(children.get(groupPosition).get(childPosition).getMainText()));
        subText.setText(children.get(groupPosition).get(childPosition).getSubText());

        return childLayout;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition){
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition){
        return true;
    }

}
