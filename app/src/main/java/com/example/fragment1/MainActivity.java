package com.example.fragment1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tlMain;
    ViewPager vpMain;

    ChatFragment chatFragment;
    StatusFragment statusFragment;
    CallFragment callFragment;

    AdapterHome adapterHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tlMain = findViewById(R.id.tlMain);
        vpMain = findViewById(R.id.vpMain);

        chatFragment = new ChatFragment();
        statusFragment = new StatusFragment();
        callFragment = new CallFragment();
        callFragment = new ExploreFragment();

        adapterHome = new AdapterHome(getSupportFragmentManager());
        adapterHome.addItem(chatFragment, "Chat");
        adapterHome.addItem(callFragment, "Call");
        adapterHome.addItem(callFragment, "explore");
        adapterHome.addItem(statusFragment, "Status");

        vpMain.setAdapter(adapterHome);
        tlMain.setupWithViewPager(vpMain, true);

    }
}
