package com.hb.hbrecycleviewsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb on 5/11/16.
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<EmployeeViewHolder> {

    private List<Employees> employeesList = new ArrayList<>();
    private Context context;

    public MyRecycleViewAdapter(Context context,ArrayList<Employees> employeesList){
        this.context = context;
        this.employeesList = new ArrayList<>(employeesList);
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowItemView = LayoutInflater.from(context).inflate(R.layout.layout_relative, null);
        EmployeeViewHolder employeeViewHolder = new EmployeeViewHolder(rowItemView);
        return employeeViewHolder;
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.setEmployeeName(employeesList.get(position).getEmployeName());
    }

    @Override
    public int getItemCount() {
        return employeesList.size();
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void updateEmployeeList(List<Employees> employeesList){
        this.employeesList = new ArrayList<>(employeesList);
        notifyDataSetChanged();
    }
}
