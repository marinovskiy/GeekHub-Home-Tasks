package ua.marinovskiy.geekhubfirsthometask;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        editText = (EditText) view.findViewById(R.id.et);
        button = (Button) view.findViewById(R.id.btn_frag_one);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                ((TextView) getActivity().findViewById(R.id.tv)).setText(text);
            }
        });

        return view;
    }
}
