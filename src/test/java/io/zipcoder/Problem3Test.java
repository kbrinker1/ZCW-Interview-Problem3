package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void testWu(){
        //given
        Integer n = 9;

        //when
        String actual = Problem3.methodMan(n);
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu";
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTang(){
        //given
        Integer n = 20;

        //when
        String actual = Problem3.methodMan(n);
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, 16, 17, Wu, 19, Tang";
        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testWuTang(){
        //given
        Integer n = 30;

        //when
        String actual = Problem3.methodMan(n);
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, 16, 17, Wu, 19, Tang, Wu, 22, 23, Wu, Tang, 26, Wu, 28, 29, WuTang";
        //then
        Assert.assertEquals(actual, expected);


    }
}
