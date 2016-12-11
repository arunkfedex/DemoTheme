package com.androidtuts4u.arun.demotheme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Demo toolbar");
        toolbar.setSubtitle("created");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String msg="";

                switch (item.getItemId()){
                    case R.id.delete:
                        msg = "delete";
                        break;
                    case R.id.add:
                        msg = "add";
                        break;
                    case R.id.settings:
                        msg = "settings";
                        break;
                    case R.id.help:
                        msg = "help";
                        break;
                    case R.id.exit:
                        msg = "exit";
                        break;


                }
                Toast.makeText(MainActivity.this,msg+" clicked",Toast.LENGTH_SHORT).show();

                return true;
            }
        });




    }
    //toolbar as actionBar
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg="";

        switch (item.getItemId()){
            case R.id.delete:
                msg = "delete";
                break;
            case R.id.add:
                msg = "add";
                break;
            case R.id.settings:
                msg = "settings";
                break;
            case R.id.help:
                msg = "help";
                break;
            case R.id.exit:
                msg = "exit";
                break;


        }
        Toast.makeText(this,msg+" clicked",Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }*/
}