package com.example.statepersonalcontrolapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.statepersonalcontrolapp.adapter.EmployeeAdapter;
import com.example.statepersonalcontrolapp.model.Employee;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<Employee> employeeLinkedList = new LinkedList<>();
    int[] employeeImages = {R.drawable.ic_baseline_account_circle_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.employee_list);
        setUpEmployee();
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(this, employeeLinkedList);
        recyclerView.setAdapter(employeeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpEmployee(){
        String employeeList[] = getResources().getStringArray(R.array.employeeList);

        for(int i = 0; i<employeeList.length;i++){
            employeeLinkedList.add(new Employee(employeeList[i], R.drawable.ic_baseline_account_circle_24));
        }
    }
}