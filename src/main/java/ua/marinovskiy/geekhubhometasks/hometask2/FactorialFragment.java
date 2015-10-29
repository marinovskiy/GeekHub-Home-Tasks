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

    EditText et_number;
    Button btn_calculate;
    TextView tv_result;

    String result;
    long number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_factorial, container, false);

        et_number = (EditText) view.findViewById(R.id.edit_text_factorial);
        btn_calculate = (Button) view.findViewById(R.id.btn_frag_factorial);
        tv_result = (TextView) view.findViewById(R.id.tv_factorial_result);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_number.getText().toString().equals("")) {
                    Toast.makeText(getActivity().getApplicationContext(), "You didn't input number", Toast.LENGTH_SHORT).show();
                } else {
                    number = Integer.parseInt(et_number.getText().toString());
                    if (number > 25) {
                        Toast.makeText(getActivity().getApplicationContext(), "You input too large number", Toast.LENGTH_SHORT).show();
                    } else {
                        result = String.valueOf(Calculation.factorial(number));
                        tv_result.setText(String.format("Factorial of %s = %s", number, result));
                    }
                }
            }
        });

        return view;
    }
}