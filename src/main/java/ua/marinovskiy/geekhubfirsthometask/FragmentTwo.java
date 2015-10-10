package ua.marinovskiy.geekhubfirsthometask;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    Spinner spinner;
    Button button;
    String name, surname = "Simpson ";
    String data[] = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        spinner = (Spinner) view.findViewById(R.id.spinner);
        button = (Button) view.findViewById(R.id.btn_frag_two);

        ArrayAdapter<?> adapter = new ArrayAdapter<>(getActivity().getApplicationContext(),
                R.layout.spinner_item, data);
        adapter.setDropDownViewResource(R.layout.spinner_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                name = data[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                name = "no name";
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = ((TextView) getActivity().findViewById(R.id.tv));
                tv.setText(surname + name);
            }
        });

        return view;
    }
}
