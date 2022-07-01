package com.example.statepersonalcontrolapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.statepersonalcontrolapp.adapter.EmployeeAdapter;
import com.example.statepersonalcontrolapp.model.Employee;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{
    LinkedList<Employee> employeeLinkedList = new LinkedList<>();
    int[] employeeImages = {R.drawable.ic_baseline_account_circle_24};
    Button addButton;
    Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.employee_list);
        setUpEmployee();
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(this, employeeLinkedList, this);
        recyclerView.setAdapter(employeeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddItem.class);
                startActivity(intent);
            }
        });
        searchButton = findViewById(R.id.seachButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpEmployee(){
        /**TODO: Добавить нормальную базу данных по типу Posgres и с помощью JDBC брать оттуда данные*/
        String[] employeeList = getResources().getStringArray(R.array.employeeList);
        System.out.println("employeeList length: "+ employeeList.length);
        String[] idList = getResources().getStringArray(R.array.idList);
        System.out.println("id list : "+ idList.length);
        String[] reportList = getResources().getStringArray(R.array.reportList);
        System.out.println(reportList.length);
        String[] lowPressureList = getResources().getStringArray(R.array.lowPressureList);
        System.out.println(lowPressureList.length);
        String[] topPressureList = getResources().getStringArray(R.array.topPressureList);
        System.out.println(topPressureList.length);
        String[] pulseList = getResources().getStringArray(R.array.pulseList);
        System.out.println(pulseList.length);
        String[] alcoholList = getResources().getStringArray(R.array.alcoholList);
        System.out.println(alcoholList.length);
        String[] tempature = getResources().getStringArray(R.array.temperatureList);
        System.out.println(tempature.length);

        for(int i = 0; i<employeeList.length;i++){
            employeeLinkedList.add(new Employee(employeeList[i], R.drawable.ic_baseline_account_circle_24,
                    Integer.parseInt(idList[i]), Integer.parseInt(lowPressureList[i]),
                    Integer.parseInt(topPressureList[i]), Integer.parseInt(pulseList[i]),
                    reportList[i], alcoholList[i], Double.parseDouble(tempature[i])));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent  = new Intent(this, ItemActivity.class);

        intent.putExtra("NAME", employeeLinkedList.get(position).getName());
        intent.putExtra("ID", employeeLinkedList.get(position).getId());
        intent.putExtra("LOW_PRESSURE", employeeLinkedList.get(position).getLowPressure());
        intent.putExtra("TOP_PRESSURE", employeeLinkedList.get(position).getTopPressure());
        intent.putExtra("PULSE", employeeLinkedList.get(position).getPulse());
        intent.putExtra("REPORT", employeeLinkedList.get(position).getReport());
        intent.putExtra("ALCOHOL", employeeLinkedList.get(position).getAlcohol());
        intent.putExtra("TEMPERATURE", employeeLinkedList.get(position).getTemperature());

        startActivity(intent);
    }
}