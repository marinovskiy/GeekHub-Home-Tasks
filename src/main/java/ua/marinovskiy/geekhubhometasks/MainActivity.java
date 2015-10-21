package ua.marinovskiy.geekhubhometasks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import ua.marinovskiy.geekhubhometasks.hometask1.FirstHomeTask;
import ua.marinovskiy.geekhubhometasks.hometask2.SecondHomeTask;
import ua.marinovskiy.geekhubhometasks.hometask3.ThirdHomeTask;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ListView listView;
    MenuAdapter menuAdapter;

    ArrayList<String> home_task_titles = new ArrayList<>();
    ArrayList<Class> home_tasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initList();

        menuAdapter = new MenuAdapter(this, home_task_titles);

        listView = (ListView) findViewById(R.id.list_view_menu);
        listView.setAdapter(menuAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(MainActivity.this, home_tasks.get(position));
                startActivity(intent);
            }
        });
    }

    public void initList() {
        home_tasks.add(FirstHomeTask.class);
        home_tasks.add(SecondHomeTask.class);
        home_tasks.add(ThirdHomeTask.class);

        home_task_titles.add(FirstHomeTask.class.getSimpleName());
        home_task_titles.add(SecondHomeTask.class.getSimpleName());
        home_task_titles.add(ThirdHomeTask.class.getSimpleName());
    }
}
