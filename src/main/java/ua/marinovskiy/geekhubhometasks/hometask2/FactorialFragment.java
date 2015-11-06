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

public class FactorialFragment extends Fragment {

    EditText mEt_number;
    Button mBtn_calculate;
    TextView mTv_result;

    String mResult;
    long mNumber;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_factorial, container, false);

        mEt_number = (EditText) view.findViewById(R.id.edit_text_factorial);
        mBtn_calculate = (Button) view.findViewById(R.id.btn_frag_factorial);
        mTv_result = (TextView) view.findViewById(R.id.tv_factorial_result);

        mBtn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEt_number.getText().toString().equals("")) {
                    Toast.makeText(getActivity().getApplicationContext(), "You didn't input mNumber", Toast.LENGTH_SHORT).show();
                } else {
                    mNumber = Integer.parseInt(mEt_number.getText().toString());
                    if (mNumber > 25) {
                        Toast.makeText(getActivity().getApplicationContext(), "You input too large mNumber", Toast.LENGTH_SHORT).show();
                    } else {
                        mResult = String.valueOf(Calculation.factorial(mNumber));
                        mTv_result.setText(String.format("Factorial of %s = %s", mNumber, mResult));
                    }
                }
            }
        });

        return view;
    }
}