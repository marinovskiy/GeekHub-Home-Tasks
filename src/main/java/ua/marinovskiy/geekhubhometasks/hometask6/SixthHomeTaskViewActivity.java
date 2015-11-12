package ua.marinovskiy.geekhubhometasks.hometask6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import ua.marinovskiy.geekhubhometasks.R;

public class SixthHomeTaskViewActivity extends AppCompatActivity {

    Bundle bundle;
    int position;
    Intent intent;
    FragmentTwoSixthHT fragmentTwoSixthHT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_ht_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activity_sixth);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        intent = getIntent();
        position = intent.getIntExtra("position", 0);
        fragmentTwoSixthHT = new FragmentTwoSixthHT();
        bundle = new Bundle();
        bundle.putInt("position", position);
        fragmentTwoSixthHT.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.sixth_ht_frame_layout, fragmentTwoSixthHT).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
