package com.example.a15764.chaoreader;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mainPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPage = (DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView menuView = (NavigationView)findViewById(R.id.menu_view);
        Toolbar bookshelfTitle = (Toolbar)findViewById(R.id.bookshelf_title);

        setSupportActionBar(bookshelfTitle);

        ActionBar  actionBar= getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_face_white_24dp);
        }
        menuView.setCheckedItem(R.id.shezhi);
        menuView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                mainPage.closeDrawers();
                return true;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bookshell_title,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mainPage.openDrawer(GravityCompat.START);
                break;
            case R.id.search:
                break;
            case R.id.mode_liebiao:
                break;
            case R.id.mode_bookshell:
                break;
            default:
                break;
        }
        return true;
    }
}
