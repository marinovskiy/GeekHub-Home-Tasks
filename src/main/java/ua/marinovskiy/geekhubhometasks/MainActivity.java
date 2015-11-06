package ua.marinovskiy.geekhubhometasks;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import ua.marinovskiy.geekhubhometasks.hometask1.FirstHomeTask;
import ua.marinovskiy.geekhubhometasks.hometask2.SecondHomeTask;
import ua.marinovskiy.geekhubhometasks.hometask3.ThirdHomeTask;
import ua.marinovskiy.geekhubhometasks.hometask4.activities.FourthHomeTask;
import ua.marinovskiy.geekhubhometasks.hometask5.FifthHomeTask;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    int s;
    ImageView imageViewAndroid, imageViewIOS, imageViewGameDev;
    TextView clickMe;

    Animation imageAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        clickMe = (TextView) findViewById(R.id.tv_geekhub);

        imageViewAndroid = (ImageView) findViewById(R.id.iv_android);
        imageViewIOS = (ImageView) findViewById(R.id.iv_ios);
        imageViewGameDev = (ImageView) findViewById(R.id.iv_gamedev);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s++;
                switch (s) {
                    case 1:
                        clickMe.setText("One more time");
                        imageAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_image_anim);
                        imageViewAndroid.setVisibility(View.VISIBLE);
                        imageViewAndroid.startAnimation(imageAnimation);
                        break;
                    case 2:
                        clickMe.setText("And one more time");
                        imageAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_image);
                        imageViewIOS.setVisibility(View.VISIBLE);
                        imageViewIOS.startAnimation(imageAnimation);
                        break;
                    case 3:
                        clickMe.setText("Great job");
                        imageAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_image);
                        imageViewGameDev.setVisibility(View.VISIBLE);
                        imageViewGameDev.startAnimation(imageAnimation);
                        break;
                    case 4:
                        s = 0;
                        clickMe.setText("Click me");
                        imageViewAndroid.setVisibility(View.INVISIBLE);
                        imageViewIOS.setVisibility(View.INVISIBLE);
                        imageViewGameDev.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Intent intent;

        switch (id) {
            case R.id.first_home_task:
                drawerLayout.closeDrawer(GravityCompat.START);
                intent = new Intent(MainActivity.this, FirstHomeTask.class);
                startActivity(intent);
                break;
            case R.id.second_home_task:
                drawerLayout.closeDrawer(GravityCompat.START);
                intent = new Intent(MainActivity.this, SecondHomeTask.class);
                startActivity(intent);
                break;
            case R.id.third_home_task:
                drawerLayout.closeDrawer(GravityCompat.START);
                intent = new Intent(MainActivity.this, ThirdHomeTask.class);
                startActivity(intent);
                break;
            case R.id.fourth_home_task:
                drawerLayout.closeDrawer(GravityCompat.START);
                intent = new Intent(MainActivity.this, FourthHomeTask.class);
                startActivity(intent);
                break;
            case R.id.fifth_home_task:
                drawerLayout.closeDrawer(GravityCompat.START);
                intent = new Intent(MainActivity.this, FifthHomeTask.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}
