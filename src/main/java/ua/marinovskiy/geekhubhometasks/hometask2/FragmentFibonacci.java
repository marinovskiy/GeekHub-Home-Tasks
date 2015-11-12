package ua.marinovskiy.geekhubhometasks.hometask2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ua.marinovskiy.geekhubhometasks.R;

public class FragmentFibonacci extends Fragment {

    EditText mEt_number;
    Button mBtn_calculate;
    TextView mTv_result;

    String mResult;
    long mNumber;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fibonacci_second_ht, container, false);

        mEt_number = (EditText) view.findViewById(R.id.edit_text_fibonacci);
        mBtn_calculate = (Button) view.findViewById(R.id.btn_frag_fibonacci);
        mTv_result = (TextView) view.findViewById(R.id.tv_fibonacci_result);

        mBtn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEt_number.getText().toString().equals("")) {
                    Toast.makeText(getActivity().getApplicationContext(), "You didn't input mNumber", Toast.LENGTH_SHORT).show();
                } else {
                    mNumber = Integer.parseInt(mEt_number.getText().toString());
                    if (mNumber < 1) {
                        Toast.makeText(getActivity().getApplicationContext(), "That mNumber is missing in Fibonacci sequence",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        mResult = String.valueOf(Calculation.fibonacci(mNumber));
                        mTv_result.setText(String.format("%sth mNumber of Fibonacci sequence = %s", mNumber, mResult));
                    }
                }
            }
        });

        return view;
    }
}
