package ua.marinovskiy.geekhubhometasks.hometask2;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import ua.marinovskiy.geekhubhometasks.R;

public class SecondHomeTask extends AppCompatActivity {

    FibonacciFragment mFibonacciFragment;
    FactorialFragment mFactorialFragment;
    FragmentTransaction mFragmentTransaction;

    Button mBtn_fibonacci, mBtn_factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ht);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mBtn_fibonacci = (Button) findViewById(R.id.btn_fibonacci);
        mBtn_factorial = (Button) findViewById(R.id.btn_factorial);

        mFibonacciFragment = new FibonacciFragment();
        mFactorialFragment = new FactorialFragment();

        mBtn_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.frame_layout_s_ht, mFibonacciFragment)
                        .commit();
            }
        });

        mBtn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.frame_layout_s_ht, mFactorialFragment)
                        .commit();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
