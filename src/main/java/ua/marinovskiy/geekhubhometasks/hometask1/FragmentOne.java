package ua.marinovskiy.geekhubhometasks.hometask1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ua.marinovskiy.geekhubhometasks.R;

public class FragmentOne extends Fragment {

    EditText mEditText;
    Button mButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        mEditText = (EditText) view.findViewById(R.id.edit_text_fht);
        mButton = (Button) view.findViewById(R.id.btn_frag_one);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEditText.getText().toString();
                ((TextView) getActivity().findViewById(R.id.text_view_fht)).setText(text);
            }
        });

        return view;
    }
}
