package com.spring.bean.Scope;



public class Employee {
	private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}