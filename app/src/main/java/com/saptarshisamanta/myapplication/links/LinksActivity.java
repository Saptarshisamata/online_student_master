package com.saptarshisamanta.myapplication.links;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.navigation.NavigationView;
import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.data.Links;
import com.saptarshisamanta.myapplication.data.LinksAdapter;
import com.saptarshisamanta.myapplication.databinding.ActivityLinksBinding;

import java.util.ArrayList;

public class LinksActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ActivityLinksBinding activityLinksBinding;
    private LinksActivityViewModel linksActivityViewModel;
    public LinksAdapter linksAdapter;
    private ArrayList<Links> linksList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLinksBinding = DataBindingUtil.setContentView(this, R.layout.activity_links);

        linksActivityViewModel = new ViewModelProvider(this).get(LinksActivityViewModel.class);

        buildRecyclerView();
        buildNavigationDrawer();
    }

    public void buildRecyclerView() {
        linksAdapter = new LinksAdapter(linksList);
        activityLinksBinding.linkList.setLayoutManager(new LinearLayoutManager(this));
        activityLinksBinding.linkList.setAdapter(linksAdapter);
        linksAdapter.setOnItemClickedListener(new LinksAdapter.OnItemClickedListener() {
            @Override
            public void OnItemClicked(int position) {
                //open the link
            }
        });
    }

    public void buildNavigationDrawer() {
        activityLinksBinding.navigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(activityLinksBinding.toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, activityLinksBinding.drawer, activityLinksBinding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        activityLinksBinding.drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.exit) {
            finish();
            System.exit(0);
        } else if (item.getItemId() == R.id.wiki) {
            Toast.makeText(this, "done", Toast.LENGTH_SHORT).show();
        }
        activityLinksBinding.drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
