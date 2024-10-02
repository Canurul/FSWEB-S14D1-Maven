package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public long getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setId(long id){

        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){

        this.salary = salary;
    }
    public void Work(){

        System.out.println("Employee started working");
    }
}
