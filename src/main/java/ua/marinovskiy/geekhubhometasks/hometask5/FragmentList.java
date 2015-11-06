package ua.marinovskiy.geekhubhometasks.hometask5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import ua.marinovskiy.geekhubhometasks.R;

public class FragmentList extends Fragment {

    List<String> list;
    ListView listView;
    MyAdapter myAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list = Arrays.asList("John", "Jim", "Jimbo", "Jack", "Jackob");

        myAdapter = new MyAdapter(getActivity().getApplicationContext(), list);

        listView = (ListView) view.findViewById(R.id.list_view_demo);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(), String.format("%s", list.get(position)), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
