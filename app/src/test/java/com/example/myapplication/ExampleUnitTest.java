package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

import Ut.tcounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


        @Test
        public void Test01GetCharsCount() {
            String inputString = "abc";
            int expectedValue = 3;
            String actualValue = tcounter.charcount(inputString);
            assertEquals(expectedValue, actualValue);
        }

    public void Test02GetCharsCountO() {
            String inputString = null;
            int expectedValue = - -1;
            String actualValue = tcounter.charcount(inputString);
            assertEquals(expectedValue, actualValue);
        }

    @Test
    public void Test03GetWordsCount() {
        String inputstring="   ";

        int expectedValue =0;
        String actualValue=tcounter.wordcount(inputstring);
        assertEquals(expectedValue, actualValue);
    }
        @Test
        public void Test04GetWordsCount() {
            String inputstring=" .     , ";
            int expectedValue = 0;
            String actualValue = tcounter.wordcount(inputstring);
            assertEquals(expectedValue,actualValue);
        }
            @Test
            public void Test05GetWordsCount() {
                String inputstring = ",   .   ";
                int expectedValue = 0;
                String actualValue =tcounter.wordcount(inputstring);
                assertEquals(expectedValue, actualValue);
            }


        }

