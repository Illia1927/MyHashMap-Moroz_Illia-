package com.practice.myHashMap;


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
}
