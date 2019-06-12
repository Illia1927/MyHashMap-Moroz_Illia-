package com.practice.myHashMap;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyHashMapImplTest {

    @Test
    public void testAssertMap() {
        MyHashMap<Integer, Long> myHashMap = new MyHashMapImpl<>();
        myHashMap.put(1, 10L);
        myHashMap.put(2, 14L);
        myHashMap.put(3, 20L);

        MyHashMap<Integer, Long> expected = new MyHashMapImpl<>();
        expected.put(1, 10L);
        expected.put(2, 14L);
        expected.put(3, 20L);

        //1. Test equal
        assertThat(myHashMap, is(expected));

        //2. Test size
        assertThat(myHashMap.size(), is(3));

        //3. Test equal for getting value
        assertThat(myHashMap.get(2), is(expected.get(2)));
    }

    MyHashMap<Integer, Long> expectedTestMap = new MyHashMapImpl<>();
    MyHashMap<Integer, Long> actualTestMap;

    @Before
    public void initialization() {
        expectedTestMap.put(1, 50L);
    }

    @Test
    public void putTest() {
        actualTestMap = new MyHashMapImpl<>();
        actualTestMap.put(1, 50L);

        Integer expected = 50;
        Integer actual = Math.toIntExact(actualTestMap.get(1));

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void getTest() {
        Integer actual = Math.toIntExact(expectedTestMap.get(1));
        Integer expected = 50;

        Assert.assertEquals(expected, actual);
        expectedTestMap.get(49);
    }

    @Test
    public void size() {
        Assert.assertEquals(1, expectedTestMap.size());
    }
}
