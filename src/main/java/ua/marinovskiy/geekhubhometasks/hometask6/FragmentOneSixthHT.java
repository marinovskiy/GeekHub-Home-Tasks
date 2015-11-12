package ua.marinovskiy.geekhubhometasks.hometask6;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.Arrays;
import java.util.List;

import ua.marinovskiy.geekhubhometasks.MyListViewAdapter;
import ua.marinovskiy.geekhubhometasks.R;

public class FragmentOneSixthHT extends ListFragment {

    List<String> catsList = Arrays.asList("Number one", "Number two", "Number three", "Number four",
            "Number five", "Number six");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one_sixth_ht, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyListViewAdapter myListViewAdapter = new MyListViewAdapter(getActivity().getApplicationContext(),
                catsList);
        setListAdapter(myListViewAdapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onItemSelected(position);
            }
        });
    }

    public void onItemSelected(int position) {
        FragmentTwoSixthHT fragmentTwoSixthHT = (FragmentTwoSixthHT) getFragmentManager().
                findFragmentById(R.id.sixth_ht_fragment_two);
        if (fragmentTwoSixthHT == null) {
            Intent intent = new Intent(getActivity().getApplicationContext(), SixthHomeTaskViewActivity.class);
            intent.putExtra("position", position);
            startActivity(intent);
        } else {
            fragmentTwoSixthHT.updateContent(position);
        }
    }
}
