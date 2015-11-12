package ua.marinovskiy.geekhubhometasks.hometask5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import ua.marinovskiy.geekhubhometasks.R;

public class FragmentAnimationFifthHT extends Fragment {

    TextView tv_one;
    Button btn_one, btn_two, btn_three, btn_four;

    Animation myAnimation;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_animation_fifth_ht, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv_one = (TextView) view.findViewById(R.id.fifth_ht_tv_one);
        btn_one = (Button) view.findViewById(R.id.fifth_ht_btn_anim_one);
        btn_two = (Button) view.findViewById(R.id.fifth_ht_btn_anim_two);
        btn_three = (Button) view.findViewById(R.id.fifth_ht_btn_anim_three);
        btn_four = (Button) view.findViewById(R.id.fifth_ht_btn_anim_four);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.fade_in_anim);
                tv_one.setText(R.string.animation_text);
                tv_one.startAnimation(myAnimation);
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.scale_anim);
                tv_one.setText(R.string.animation_text);
                tv_one.startAnimation(myAnimation);
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.zoom_anim);
                tv_one.setText(R.string.animation_text);
                tv_one.startAnimation(myAnimation);
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.slide_anim);
                tv_one.setText(R.string.animation_text);
                tv_one.startAnimation(myAnimation);
            }
        });
    }
}
