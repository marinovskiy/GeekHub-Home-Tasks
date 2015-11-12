package ua.marinovskiy.geekhubhometasks.hometask1;

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

import ua.marinovskiy.geekhubhometasks.R;

public class FragmentTwoFirstHT extends Fragment {

    Spinner mSpinner;
    Button mButton;
    String mName, mSurname = "Simpson ";
    String mData[] = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_first_ht, container, false);

        mSpinner = (Spinner) view.findViewById(R.id.first_ht_spinner);
        mButton = (Button) view.findViewById(R.id.first_ht_set_text_2);

        ArrayAdapter<?> adapter = new ArrayAdapter<>(getActivity().getApplicationContext(),
                R.layout.spinner_item, mData);
        adapter.setDropDownViewResource(R.layout.spinner_item);

        mSpinner.setAdapter(adapter);
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mName = mData[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mName = "no mName";
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = ((TextView) getActivity().findViewById(R.id.first_ht_text_view));
                tv.setText(mSurname + mName);
            }
        });

        return view;
    }
}
