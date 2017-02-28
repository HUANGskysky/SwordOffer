package com.ryan.offer.Problem41;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hztaoran on 2016/8/1.
 */
public class FindNumbersWithSumTest {

    private FindNumbersWithSum test;

    @Before
    public void setUp() throws Exception {
        test = new FindNumbersWithSum();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void find() throws Exception {
        int[] a = new int[]{1, 2, 4, 7, 11, 15};
        assertArrayEquals(new int[]{4, 11}, test.find(a, 15));
    }

}