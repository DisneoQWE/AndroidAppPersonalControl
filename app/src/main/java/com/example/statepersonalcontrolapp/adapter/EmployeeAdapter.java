package com.example.statepersonalcontrolapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.statepersonalcontrolapp.R;
import com.example.statepersonalcontrolapp.model.Employee;

import java.util.LinkedList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {
    Context context;
    LinkedList<Employee> employeeLinkedList;

    public EmployeeAdapter(Context context, LinkedList<Employee> employeeLinkedList) {
        this.context = context;
        this.employeeLinkedList = employeeLinkedList;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new EmployeeAdapter.EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        holder.employeeName.setText(employeeLinkedList.get(position).getName());
        holder.imageView.setImageResource(employeeLinkedList.get(position).getView());
    }

    @Override
    public int getItemCount() {
        return employeeLinkedList.size();
    }

    public static class EmployeeViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView employeeName;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            employeeName = itemView.findViewById(R.id.textView);
        }
    }
}
