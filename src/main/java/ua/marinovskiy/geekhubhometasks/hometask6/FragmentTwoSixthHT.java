package ua.marinovskiy.geekhubhometasks.hometask6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ua.marinovskiy.geekhubhometasks.R;

public class FragmentTwoSixthHT extends Fragment {

    ImageView imageView;
    TextView textView;
    int catsImages[] = {R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4,
            R.drawable.cat5, R.drawable.cat6};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two_sixth_ht, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = (ImageView) view.findViewById(R.id.sixth_ht_image_view);
        textView = (TextView) view.findViewById(R.id.sixth_ht_description);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof SixthHomeTaskViewActivity) {
            Bundle bundle = getArguments();
            int position = bundle.getInt("position");
            updateContent(position);
        }
    }

    public void updateContent(int position) {
        imageView.setImageResource(catsImages[position]);
    }
}
