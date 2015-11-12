package ua.marinovskiy.geekhubhometasks.hometask4.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import ua.marinovskiy.geekhubhometasks.R;
import ua.marinovskiy.geekhubhometasks.hometask4.fragments.MainFragmentFourthHT;

public class FourthHomeTaskActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_activity_base);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean isAddFragment() {
        return true;
    }

    @Override
    public void addFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.main_fragment_container, new MainFragmentFourthHT()).commit();
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
}
