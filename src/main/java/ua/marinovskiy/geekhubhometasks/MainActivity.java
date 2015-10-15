package ua.marinovskiy.geekhubhometasks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import ua.marinovskiy.geekhubhometasks.hometask1.FirstHomeTask;
import ua.marinovskiy.geekhubhometasks.hometask2.SecondHomeTask;

public class MainActivity extends AppCompatActivity {

    Button btn_first_ht, btn_second_ht;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_first_ht = (Button) findViewById(R.id.btn_first_ht);
        btn_second_ht = (Button) findViewById(R.id.btn_second_ht);

        btn_first_ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, FirstHomeTask.class);
                startActivity(intent);
            }
        });

        btn_second_ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SecondHomeTask.class);
                startActivity(intent);
            }
        });

    }
}
