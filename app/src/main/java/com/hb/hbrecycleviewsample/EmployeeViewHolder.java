package com.hb.hbrecycleviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hb on 5/11/16.
 */

public class EmployeeViewHolder extends RecyclerView.ViewHolder {

    private TextView txt_empName;

    public EmployeeViewHolder(View itemView) {
        super(itemView);
        txt_empName = (TextView) itemView.findViewById(R.id.title);
    }

    public void setEmployeeName(String employeeName){
      txt_empName.setText(employeeName);
    }
}
