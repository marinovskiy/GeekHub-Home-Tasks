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

public class MyFragment extends Fragment {

    FragmentManager mFragmentManager;
    MyInterface myInterface;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_show_next).setOnClickListener(clickListener);
        view.findViewById(R.id.btn_show_previous).setOnClickListener(clickListener);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mFragmentManager = getActivity().getSupportFragmentManager();
        myInterface = new MyInterface() {
            @Override
            public void showNext() {
                mFragmentManager.beginTransaction().replace(R.id.second_fragment_container, new FragmentNext()).addToBackStack("").commit();
            }

            @Override
            public void showPrevious() {
                mFragmentManager.beginTransaction().replace(R.id.second_fragment_container, new FragmentPrevious()).addToBackStack("").commit();
            }
        };
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_show_next:
                    myInterface.showNext();
                    break;
                case R.id.btn_show_previous:
                    myInterface.showPrevious();
                    break;
            }
        }
    };

}
