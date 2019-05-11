package com.example.appos;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drwlayout;
    private NavigationView nvgtview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inicializando a toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //inicializando o drawer layout
        drwlayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        //toggle
        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle
                (this, drwlayout, toolbar, R.string.abrir_drawer, R.string.fechar_drawer);
        drwlayout.addDrawerListener(toogle);

        toogle.syncState();

        //click do navigation
        nvgtview = (NavigationView) findViewById(R.id.navigationView);
        nvgtview.setNavigationItemSelectedListener(this);
    }
    //botão voltar
    @Override
    public void onBackPressed() {
        if (drwlayout.isDrawerOpen(GravityCompat.START)){
            drwlayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.item1: {
                Toast.makeText(this, "Menu 1", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item2: {
                Toast.makeText(this, "Menu 2", Toast.LENGTH_SHORT).show();
                break;
            }
            default: {
                Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
            }
        }
            drwlayout.closeDrawer(GravityCompat.START);
            return true;

        }}


