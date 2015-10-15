package ua.marinovskiy.geekhubhometasks.hometask2;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import ua.marinovskiy.geekhubhometasks.R;

public class SecondHomeTask extends AppCompatActivity {

    FibonacciFragment fibonacciFragment;
    FactorialFragment factorialFragment;
    FragmentTransaction fragmentTransaction;

    Button btn_fibonacci, btn_factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ht);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_fibonacci = (Button) findViewById(R.id.btn_fibonacci);
        btn_factorial = (Button) findViewById(R.id.btn_factorial);

        fibonacciFragment = new FibonacciFragment();
        factorialFragment = new FactorialFragment();

        btn_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout_s_ht, fibonacciFragment)
                        .commit();
            }
        });

        btn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout_s_ht, factorialFragment)
                        .commit();
            }
        });
    }
}
