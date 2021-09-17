package com.example.pmu1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void max_A_Lesser_B() {
        assertEquals(MainActivity.max(-5, 5), 5);
    }

    @Test
    public void max_A_Biggest_B() {
        assertEquals(MainActivity.max(3, 0), 3);
    }

    @Test
    public void max_A_Equal_B() {
        assertEquals(MainActivity.max(0, 0), 0);
    }

    @Test
    public void max_A_and_B_negative() {
        assertEquals(MainActivity.min(-5, -3), -5);
    }

    @Test
    public void min_A_Lesser_B() {
        assertEquals(MainActivity.min(-5, 5), -5);
    }

    @Test
    public void min_A_Biggest_B() {
        assertEquals(MainActivity.min(3, 0), 0);
    }

    @Test
    public void min_A_Equal_B() {
        assertEquals(MainActivity.min(0, 0), 0);
    }

    @Test
    public void min_A_and_B_negative() {
        assertEquals(MainActivity.min(-5, -3), -5);
    }
}