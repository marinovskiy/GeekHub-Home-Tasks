package ua.marinovskiy.geekhubhometasks.hometask4.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ua.marinovskiy.geekhubhometasks.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContent();

        if (isAddFragment()) {
            addFragment();
        }
    }

    public abstract boolean isAddFragment();

    public void setContent() {
        setContentView(R.layout.activity_base);
    }

    public abstract void addFragment();
}
