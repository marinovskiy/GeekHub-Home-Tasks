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

public class FibonacciFragment extends Fragment {

    EditText et_number;
    Button btn_calculate;
    TextView tv_result;

    String result;
    long number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fibonacci, container, false);

        et_number = (EditText) view.findViewById(R.id.edit_text_fibonacci);
        btn_calculate = (Button) view.findViewById(R.id.btn_frag_fibonacci);
        tv_result = (TextView) view.findViewById(R.id.tv_fibonacci_result);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_number.getText().toString().equals("")) {
                    Toast.makeText(getActivity().getApplicationContext(), "You didn't input number", Toast.LENGTH_SHORT).show();
                } else {
                    number = Integer.parseInt(et_number.getText().toString());
                    if (number < 1) {
                        Toast.makeText(getActivity().getApplicationContext(), "That number is missing in Fibonacci sequence",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        result = String.valueOf(Calculation.fibonacci(number));
                        tv_result.setText(String.format("%sth number of Fibonacci sequence = %s", number, result));
                    }
                }
            }
        });

        return view;
    }
}
