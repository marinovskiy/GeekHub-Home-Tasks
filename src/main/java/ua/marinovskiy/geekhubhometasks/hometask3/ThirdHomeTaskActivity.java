package ua.marinovskiy.geekhubhometasks.hometask3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import ua.marinovskiy.geekhubhometasks.R;

public class ThirdHomeTaskActivity extends AppCompatActivity {

    private String[] mValues = new String[]{"Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_ht);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activity_third);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        createAndShowNumbers();

        findViewById(R.id.button_1).setOnClickListener(clickListener);
        findViewById(R.id.button_2).setOnClickListener(clickListener);
        findViewById(R.id.button_3).setOnClickListener(clickListener);
        findViewById(R.id.button_4).setOnClickListener(clickListener);
    }

    private void createAndShowNumbers() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < mValues.length; i++) {
            list.add(mValues[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text1 = (TextView) findViewById(R.id.text_1);
        text1.setText(strings);
    }

    private void reverseOrder() {
        List<String> list = new ArrayList<>();
        for (int i = mValues.length - 1; i >= 0; i--) {
            list.add(mValues[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text2 = (TextView) findViewById(R.id.text_2);
        text2.setText(strings);
    }

    private void removeEveryThird() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < mValues.length; i++) {
            if ((i + 1) % 3 != 0) {
                list.add(mValues[i]);
            }
        }

        String strings = TextUtils.join(", ", list);

        TextView text2 = (TextView) findViewById(R.id.text_2);
        text2.setText(strings);
    }

    private void removeDuplicates() {
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < mValues.length; i++) {
            set.add(mValues[i]);
        }

        String strings = TextUtils.join(", ", set);

        TextView text2 = (TextView) findViewById(R.id.text_2);
        text2.setText(strings);
    }

    private void sortValues() {
        Arrays.sort(mValues);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < mValues.length; i++) {
            list.add(mValues[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text2 = (TextView) findViewById(R.id.text_2);
        text2.setText(strings);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_1:
                    reverseOrder();
                    break;
                case R.id.button_2:
                    removeEveryThird();
                    break;
                case R.id.button_3:
                    removeDuplicates();
                    break;
                case R.id.button_4:
                    sortValues();
                    break;
            }
        }
    };

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