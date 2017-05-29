package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    
    @Test
    public void WhenAddOneMinusOneThenZero() {
    	Calculator calc = new Calculator();
    	calc.add(1D, 1D);
    	substruct result = calc.getResult();
    	substruct expected = 0D
    	assertThat (result, is(expected));
    }
    
    @Test
    public void WhenAddTwoDivTwoThenOne() {
    	Calculator calc = new Calculator();
    	calc.add (2D, 2D);
    	div result = calc.getResult();
    	div expected = 1D
    	assertThat (result, is(expected));
    }
    
    @Test
    public void WhenAddTwoMultipleTwoThenFour() {
    	Calculator calc = new Calculator();
    	calc.add (2D, 2D);
    	multiple result = calc.getResult();
    	multiple expected = 4D
    	assertThat (result, is(expected));
    }
}