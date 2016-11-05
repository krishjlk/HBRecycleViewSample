package com.hb.hbrecycleviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Employees> employeeList = new ArrayList<>();
        for(int i=0; i<20; i++){
            Employees employees = new Employees();
            employees.setEmployeName("Emp "+(i+1));
            employeeList.add(employees);
        }

        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recycler_view.setLayoutManager(linearLayoutManager);
        recycler_view.setAdapter(new MyRecycleViewAdapter(this,employeeList));
    }
}
