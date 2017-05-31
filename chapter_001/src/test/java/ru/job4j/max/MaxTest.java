package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void MaximumOfTwoNumbers() {
    	Max larger = new Max();
        int first = 4;
        int second = 2;
        int result = larger.max(first, second);
        int expected = 4;
        assertThat(result, is(expected));
    }
}