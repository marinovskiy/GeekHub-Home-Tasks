package ua.marinovskiy.geekhubhometasks.hometask4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.marinovskiy.geekhubhometasks.R;
import ua.marinovskiy.geekhubhometasks.hometask4.interfaces.MyInterface;

public class MainFragmentFourthHT extends Fragment {

    FragmentManager mFragmentManager;
    MyInterface myInterface;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_fourth_ht, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.fourth_ht_btn_next).setOnClickListener(clickListener);
        view.findViewById(R.id.fourth_ht_btn_previous).setOnClickListener(clickListener);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mFragmentManager = getActivity().getSupportFragmentManager();
        myInterface = new MyInterface() {
            @Override
            public void showNext() {
                mFragmentManager.beginTransaction().replace(R.id.next_previous_fragment_container, new FragmentNextFourthHT()).addToBackStack("").commit();
            }

            @Override
            public void showPrevious() {
                mFragmentManager.beginTransaction().replace(R.id.next_previous_fragment_container, new FragmentPreviousFourthHT()).addToBackStack("").commit();
            }
        };
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fourth_ht_btn_next:
                    myInterface.showNext();
                    break;
                case R.id.fourth_ht_btn_previous:
                    myInterface.showPrevious();
                    break;
            }
        }
    };

}
