package ua.marinovskiy.geekhubhometasks.hometask1;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ua.marinovskiy.geekhubhometasks.R;

public class FirstHomeTask extends AppCompatActivity {

    FragmentOne mFragmentOne;
    FragmentTwo mFragmentTwo;
    FragmentTransaction mFragmentTransaction;

    TextView mTextView;
    Button mBtn_f_frag, mBtn_s_frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ht);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mTextView = (TextView) findViewById(R.id.text_view_fht);
        mBtn_f_frag = (Button) findViewById(R.id.btn_f_frag);
        mBtn_s_frag = (Button) findViewById(R.id.btn_s_frag);

        mFragmentOne = new FragmentOne();
        mFragmentTwo = new FragmentTwo();

        mBtn_f_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.frame_layout_f_ht, mFragmentOne)
                        .commit();
            }
        });

        mBtn_s_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.frame_layout_f_ht, mFragmentTwo)
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
