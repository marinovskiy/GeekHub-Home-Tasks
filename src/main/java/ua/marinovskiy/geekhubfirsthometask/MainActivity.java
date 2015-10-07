package ua.marinovskiy.geekhubfirsthometask;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;
    FragmentTransaction fragmentTransaction;

    TextView textView;
    Button btn_f_frag, btn_s_frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.tv);
        btn_f_frag = (Button) findViewById(R.id.btn_f_frag);
        btn_s_frag = (Button) findViewById(R.id.btn_s_frag);

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();

        btn_f_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fl, fragmentOne)
                        .commit();
            }
        });

        btn_s_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fl, fragmentTwo)
                        .commit();
            }
        });

    }
}
