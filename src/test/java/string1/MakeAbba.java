package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeAbba {

    @Test
    public void make_abba_v01(){
        Solution solution = new Solution();
        assertEquals("HiByeByeHi", solution.makeAbba("Hi", "Bye"));
    }

    @Test
    public void make_abba_v02(){
        Solution solution = new Solution();
        assertEquals("YoAliceAliceYo", solution.makeAbba("Yo", "Alice"));
    }

    @Test
    public void make_abba_v03(){
        Solution solution = new Solution();
        assertEquals("WhatUpUpWhat", solution.makeAbba("What", "Up"));
    }

    @Test
    public void make_abba_v04(){
        Solution solution = new Solution();
        assertEquals("aaabbbbbbaaa", solution.makeAbba("aaa", "bbb"));
    }

    @Test
    public void make_abba_v05(){
        Solution solution = new Solution();
        assertEquals("xyyx", solution.makeAbba("x", "y"));
    }

    @Test
    public void make_abba_v06(){
        Solution solution = new Solution();
        assertEquals("xx", solution.makeAbba("x", ""));
    }

    @Test
    public void make_abba_v07(){
        Solution solution = new Solution();
        assertEquals("yy", solution.makeAbba("", "y"));
    }

    @Test
    public void make_abba_v08(){
        Solution solution = new Solution();
        assertEquals("BoYaYaBo", solution.makeAbba("Bo", "Ya"));
    }

    @Test
    public void make_abba_v09(){
        Solution solution = new Solution();
        assertEquals("YaYaYaYa", solution.makeAbba("Ya", "Ya"));
    }
}
