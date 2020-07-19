package com.saptarshisamanta.myapplication.subject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.data.Details;
import com.saptarshisamanta.myapplication.data.DetailsAdapter;
import com.saptarshisamanta.myapplication.databinding.ActivitySubjectBinding;

import java.util.ArrayList;

public class SubjectActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    ActivitySubjectBinding activitySubjectBinding;
    private DetailsAdapter detailsAdapter;
    private ArrayList<Details> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySubjectBinding = DataBindingUtil.setContentView(this,R.layout.activity_subject);
        list = new ArrayList<>();
        list.add(new Details("testcfjghckhgchfkckkfcxfjc",R.drawable.startupimage));
        list.add(new Details("test",R.drawable.startupimage));


        detailsAdapter = new DetailsAdapter(this,list);
        activitySubjectBinding.subjectList.setLayoutManager(new GridLayoutManager(this,2));
        activitySubjectBinding.subjectList.setAdapter(detailsAdapter);
        detailsAdapter.setOnItemClickListener(new DetailsAdapter.OnItemClickedListener() {
            @Override
            public void oItemClicked(int position) {
                String topic = list.get(position).title;
                //intent to links activity
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
