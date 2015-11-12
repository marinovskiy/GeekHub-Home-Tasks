package ua.marinovskiy.geekhubhometasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ua.marinovskiy.geekhubhometasks.R;

public class MyListViewAdapter extends BaseAdapter {

    List<String> home_tasks;
    Context context;
    LayoutInflater layoutInflater;

    public MyListViewAdapter(Context context, List<String> home_tasks) {
        this.home_tasks = home_tasks;
        this.context = context;
        layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return home_tasks.size();
    }

    @Override
    public Object getItem(int position) {
        return home_tasks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item, parent, false);
        }

        String title = (String) getItem(position);

        TextView tv_title = (TextView) convertView.findViewById(R.id.text_view_title);
        tv_title.setText(title);

        return convertView;
    }
}
