package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeAbba {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_abba_v01() {
        assertEquals("HiByeByeHi", solution.makeAbba("Hi", "Bye"));
    }

    @Test
    public void make_abba_v02() {
        assertEquals("YoAliceAliceYo", solution.makeAbba("Yo", "Alice"));
    }

    @Test
    public void make_abba_v03() {
        assertEquals("WhatUpUpWhat", solution.makeAbba("What", "Up"));
    }

    @Test
    public void make_abba_v04() {
        assertEquals("aaabbbbbbaaa", solution.makeAbba("aaa", "bbb"));
    }

    @Test
    public void make_abba_v05() {
        assertEquals("xyyx", solution.makeAbba("x", "y"));
    }

    @Test
    public void make_abba_v06() {
        assertEquals("xx", solution.makeAbba("x", ""));
    }

    @Test
    public void make_abba_v07() {
        assertEquals("yy", solution.makeAbba("", "y"));
    }

    @Test
    public void make_abba_v08() {
        assertEquals("BoYaYaBo", solution.makeAbba("Bo", "Ya"));
    }

    @Test
    public void make_abba_v09() {
        assertEquals("YaYaYaYa", solution.makeAbba("Ya", "Ya"));
    }
}
