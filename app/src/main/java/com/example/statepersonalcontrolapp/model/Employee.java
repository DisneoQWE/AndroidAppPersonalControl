package com.example.statepersonalcontrolapp.model;

public class Employee {
    private Integer view;
    private String name;

    public Employee(String name, Integer view) {
        this.view = view;
        this.name = name;
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
//    private Boolean report;
//    private Integer lowPressure;
//    private Integer topPressure;
//    private Integer temperature;
//    private Boolean alcohol;
//
//    public Employee(Integer id, String name, Boolean report, Integer lowPressure,
//                    Integer topPressure, Integer temperature, Boolean alcohol,
//                    String date, Integer pulse) {
//        this.id = id;
//        this.name = name;
//        this.report = report;
//        this.lowPressure = lowPressure;
//        this.topPressure = topPressure;
//        this.temperature = temperature;
//        this.alcohol = alcohol;
//        this.date = date;
//        this.pulse = pulse;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Boolean getReport() {
//        return report;
//    }
//
//    public void setReport(Boolean report) {
//        this.report = report;
//    }
//
//    public Integer getLowPressure() {
//        return lowPressure;
//    }
//
//    public void setLowPressure(Integer lowPressure) {
//        this.lowPressure = lowPressure;
//    }
//
//    public Integer getTopPressure() {
//        return topPressure;
//    }
//
//    public void setTopPressure(Integer topPressure) {
//        this.topPressure = topPressure;
//    }
//
//    public Integer getTemperature() {
//        return temperature;
//    }
//
//    public void setTemperature(Integer temperature) {
//        this.temperature = temperature;
//    }
//
//    public Boolean getAlcohol() {
//        return alcohol;
//    }
//
//    public void setAlcohol(Boolean alcohol) {
//        this.alcohol = alcohol;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public Integer getPulse() {
//        return pulse;
//    }
//
//    public void setPulse(Integer pulse) {
//        this.pulse = pulse;
//    }
//
//    private String date;
//    private Integer pulse;

    public Employee() {
    }
}
