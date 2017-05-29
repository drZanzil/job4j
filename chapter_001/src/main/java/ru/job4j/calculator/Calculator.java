package ru.job4j.Calculator;

public class Calculator {
    private double result;
    
    public void add(double first, double second) {
        this.result = first + second;
    }
    
    public double getResult() {
        return this.result;
    }
    
    private substruct result;
    
    public void add(substruct firs, substruct second) {
    	this.result = first - second;
    }
    
    public substruct getResult() {
    	return this.result;
    }
    
    private div result;
    
    public void add(div first, div second) {
    	this.result = first / second;
    }
    
    public div getResult() {
    	return this.result;
    }
    
    public multiple result;
    
    public void add(multiple first, multiple second) {
    	this.result = first * second;
    }
    
    public multiple getResult() {
    	return this.result;
    }
}
