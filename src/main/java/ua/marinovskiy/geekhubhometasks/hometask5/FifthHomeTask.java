package ua.marinovskiy.geekhubhometasks.hometask5;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import ua.marinovskiy.geekhubhometasks.R;

public class FifthHomeTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_ht);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        findViewById(R.id.btn_list).setOnClickListener(clickListener);
        findViewById(R.id.btn_animations).setOnClickListener(clickListener);
    }

    @Override
     public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            switch (v.getId()) {
                case R.id.btn_list:
                    fragmentManager.beginTransaction().replace(R.id.five_frame_layout, new FragmentList()).addToBackStack("").commit();
                    break;
                case R.id.btn_animations:
                    fragmentManager.beginTransaction().replace(R.id.five_frame_layout, new FragmentAnimation()).addToBackStack("").commit();
                    break;
            }
        }
    };
}
