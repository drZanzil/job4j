package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
	@Test
	public void DotOnFunction() {
	Point pointa = new Point(0, 0);
	Point pointb = new Point(0, 5);
	double result = pointa.distanceTo(pointb);
	double expect = 5D;
	assertThat(result, is(expect));
	}
	
	@Test
	public void FubctionTest() {
	int a = 5;
	int b = 7;
	Point pointx = new Point(0, 1);
	boolean result = pointx.is(5, 7);
	boolean expect = false;
	assertThat(result, is(expect));
	}
}
	