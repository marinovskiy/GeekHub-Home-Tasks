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

import ua.marinovskiy.geekhubhometasks.MyListViewAdapter;
import ua.marinovskiy.geekhubhometasks.R;

public class FragmentListFifthHT extends Fragment {

    List<String> list;
    ListView listView;
    MyListViewAdapter myListViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_fifth_ht, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = (ListView) view.findViewById(R.id.fifth_ht_list_view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = Arrays.asList("John", "Jim", "Jimbo", "Jack", "Jackob");
        myListViewAdapter = new MyListViewAdapter(getActivity().getApplicationContext(), list);
        listView.setAdapter(myListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(), String.format("%s", list.get(position)), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
