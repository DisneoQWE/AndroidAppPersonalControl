package com.example.statepersonalcontrolapp.model;

public class Employee {
    private Integer view;
    private String name;
    private Integer id;
    private Integer lowPressure;
    private Integer topPressure;
    private Integer pulse;
    private String report;
    private String alcohol;
    private Double temperature;

    public Employee(String name, Integer view, Integer id, Integer lowPressure, Integer topPressure, Integer pulse, String report, String alcohol, Double temperature) {
        this.view = view;
        this.name = name;
        this.id = id;
        this.lowPressure = lowPressure;
        this.topPressure = topPressure;
        this.pulse = pulse;
        this.report = report;
        this.alcohol = alcohol;
        this.temperature = temperature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(Integer lowPressure) {
        this.lowPressure = lowPressure;
    }

    public Integer getTopPressure() {
        return topPressure;
    }

    public void setTopPressure(Integer topPressure) {
        this.topPressure = topPressure;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }


    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }
}
