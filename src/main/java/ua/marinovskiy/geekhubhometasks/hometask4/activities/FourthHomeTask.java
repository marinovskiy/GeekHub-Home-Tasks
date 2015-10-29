package ua.marinovskiy.geekhubhometasks.hometask4.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import ua.marinovskiy.geekhubhometasks.R;
import ua.marinovskiy.geekhubhometasks.hometask4.fragments.MyFragment;

public class FourthHomeTask extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean isAddFragment() {
        return true;
    }

    @Override
    public void addFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.first_fragment_container, new MyFragment()).commit();
    }
}
