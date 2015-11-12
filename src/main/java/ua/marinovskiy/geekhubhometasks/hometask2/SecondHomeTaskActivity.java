package ua.marinovskiy.geekhubhometasks.hometask2;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import ua.marinovskiy.geekhubhometasks.R;

public class SecondHomeTaskActivity extends AppCompatActivity {

    FragmentFibonacci mFragmentFibonacci;
    FragmentFactorial mFragmentFactorial;
    FragmentTransaction mFragmentTransaction;

    Button mBtn_fibonacci, mBtn_factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ht);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activity_second);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mBtn_fibonacci = (Button) findViewById(R.id.second_ht_btn_fibonacci);
        mBtn_factorial = (Button) findViewById(R.id.second_ht_btn_factorial);

        mFragmentFibonacci = new FragmentFibonacci();
        mFragmentFactorial = new FragmentFactorial();

        mBtn_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.second_ht_fragment_container, mFragmentFibonacci)
                        .commit();
            }
        });

        mBtn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.second_ht_fragment_container, mFragmentFactorial)
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
